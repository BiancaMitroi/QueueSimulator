package model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Server implements Runnable{
    private BlockingQueue<Client> clients;
    private AtomicInteger waitingTime;
    private Thread thread = new Thread(this);

    public Server()
    {
        this.clients = new LinkedBlockingQueue<Client>();
        this.waitingTime = new AtomicInteger(0);
        thread.start();
    }

    public void addClients(Client newClient)
    {
        clients.add(newClient);
        waitingTime.set(getWaitingTime() + newClient.getService());
    }

    public BlockingQueue<Client> getClients()
    {
        return this.clients;
    }

    public int getWaitingTime()
    {
        return waitingTime.intValue();
    }

    @Override
    public void run() {
        while(true) {
            Client c = clients.peek();
            while(c != null && c.getService() != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                c.setService();
                waitingTime.set(getWaitingTime() - 1);
            }
            clients.poll();
        }

    }

}
