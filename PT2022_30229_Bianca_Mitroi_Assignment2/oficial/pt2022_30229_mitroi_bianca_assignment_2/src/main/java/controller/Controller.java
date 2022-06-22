package controller;
import java.util.Random;

import javax.swing.JOptionPane;

import view.InputView;
import view.View;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;
//import java.util.Timer;
//import java.util.TreeSet;

import model.Client;
import model.Server;
//import test.StoreManager;
public class Controller implements Runnable{

    private InputView inputView = new InputView();
    private View view = new View();
    private ArrayList<Server> servers = new ArrayList<Server>();
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Client> served = new ArrayList<Client>();
    private int simTime;
    private Thread t = new Thread(this);
    private String results;
    private FileWriter fileWriter;
    int numberQueues;
    int numberClients;
    int BAT;
    int EAT;
    int BST;
    int EST;

    public String getResults() {
        return results;
    }
    public Thread getThread() {
        return t;
    }

    public Controller(){
        inputView.addButtonListener(new ButtonListener());
        results = "";
        try {
            fileWriter = new FileWriter("C:\\Users\\Mitroi Bianca\\OneDrive\\Desktop\\fisiere facultate anul 2 sem 2\\TPF\\salvez_proiecte_tp_in\\Magazin\\src\\test\\results.txt", false);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public int getTime(){
        return simTime;
    }

    public ArrayList<Server> getServers(){
        return servers;
    }

    public ArrayList<Client> getClients(){
        return clients;
    }

    public class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            view.setClientLabel(clients.toString());
            inputView.getFrame().setVisible(false);
            view.getFrame().setVisible(true);

//			try {
//				numberQueues = Integer.parseInt(inputView.getTextFieldText());
//				if(numberQueues <= 0 || numberQueues > 20) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Number of queues is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write a number of queues!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				numberClients = Integer.parseInt(inputView.getTextField_1Text());
//				if(numberClients <= 0 || numberClients > 1000) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Number of clients is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write a number of clients!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				simTime = Integer.parseInt(inputView.getTextField_2Text());
//				if(simTime <= 0 || simTime > 200) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Simulation time is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write a simulation time!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				BAT = Integer.parseInt(inputView.getTextField_3Text());
//				if(BAT <= 0 || BAT > simTime) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Smallest arrival time is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write the smallest arrival time!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				EAT = Integer.parseInt(inputView.getTextField_4Text());
//				if(EAT <= BAT || EAT > simTime) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Largest arrival time is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write the largest arrival time!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				BST = Integer.parseInt(inputView.getTextField_5Text());
//				if(BST <= 0 || BST > simTime) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Smallest service time is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write the smallest service time!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}
//
//			try {
//				EST = Integer.parseInt(inputView.getTextField_6Text());
//				if(EST <= 0 || EST > simTime) {
//					JOptionPane.showMessageDialog(view.getFrame(), "Largest service time is invalid!");
//					view.getFrame().setVisible(false);
//					inputView.getFrame().setVisible(true);
//				}
//			}catch(NumberFormatException ee) {
//				JOptionPane.showMessageDialog(view.getFrame(), "Please write the largest service time!");
//				view.getFrame().setVisible(false);
//				inputView.getFrame().setVisible(true);
//			}

            simTime = 60;
            numberQueues = 5;
            numberClients = 50;
            BAT = 2;
            EAT = 40;
            BST = 1;
            EST = 7;

            Random random = new Random();

            for(int i = 0; i < numberQueues; i++)
            {
                Server s = new Server();
                servers.add(s);
            }

            for(int i = 0; i < numberClients; i++)
            {
                int arrival = random.nextInt() % EAT;
                while(arrival < BAT)
                    arrival += BAT;
                int service = random.nextInt() % EST;
                while(service < BST)
                    service += BST;
                Client c = new Client(i, arrival, service);
                clients.add(c);

            }
            Collections.sort(clients);
            view.setClientLabel(clients.toString());
            t.start();

        }
    }

    @Override
    public void run() {
        int currentTime = 0;
        int peakHourTime = 0;
        int maxLength = 0;
        int currentQueue = 0;
        int minTime;
        int i = 0;


        while(currentTime <= simTime) {

            while(i < clients.size()) {

                while(clients.get(i).getArrival() == currentTime + 1) {

                    minTime = 1000;

                    for(int j = 0; j < servers.size(); j++) {
                        if(servers.get(j).getWaitingTime() < minTime) {

                            minTime = servers.get(j).getWaitingTime();
                            currentQueue = j;
                        }
                        if(servers.get(j).getClients().size() > maxLength) {
                            maxLength = servers.get(j).getClients().size();
                            peakHourTime = currentTime ;
                        }
                    }

                    servers.get(currentQueue).addClients(clients.get(i));
                    view.setLblNewLabel(servers.get(currentQueue).getClients().toString(), currentQueue);
                    Client cl = new Client(clients.get(i).getId(), clients.get(i).getArrival(), clients.get(i).getService());
                    served.add(cl);
                    i++;
                    String c = "";
                    for(int k = i; k < clients.size(); k++)
                        c += clients.get(k).toString();
                    view.setClientLabel(c);

                    if(i == clients.size())
                        break;
                }
                String c = "";
                for(int k = i; k < clients.size(); k++)
                    c += clients.get(k).toString();
                view.setClientLabel(c);

                results += "\nCurrent time: " + Integer.toString(currentTime) + "\n";

                float averageWaitingTime = 0;
                float serviceTime = 0;
                for(int j = 0; j < servers.size(); j++) {
                    averageWaitingTime += servers.get(j).getWaitingTime();
                    serviceTime += servers.get(j).getClients().peek() == null ? 0 : servers.get(j).getClients().peek().getService();
                    view.setLblNewLabel(servers.get(j).getClients().toString(), j);
                    results += "Queue: " + j + " clients waiting: " + servers.get(j).getClients().toString() + "\n";
                }
                averageWaitingTime /= servers.size();
                serviceTime /= servers.size();
                view.setAverageServiceLabel(Float.toString(serviceTime));
                view.setAverageWaitingLabel(Float.toString(averageWaitingTime));
                results += "Average waiting time in real time: " + Float.toString(averageWaitingTime);
//				System.out.println(results);
//				try {
//					fileWriter.write(results);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
                currentTime++;
                view.setTimeLabel(Integer.toString(currentTime));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            float averageWaitingTime = 0;
            float serviceTime = 0;
            int nullServers = 0;
            results += "\nCurrent time: " + Integer.toString(currentTime) + "\n";
            for(int j = 0; j < servers.size(); j++) {
                if(servers.get(j).getClients().peek() == null)
                    nullServers++;
                averageWaitingTime += servers.get(j).getWaitingTime();
                serviceTime += servers.get(j).getClients().peek() == null ? 0 : servers.get(j).getClients().peek().getService();
                results += "Queue: " + j + " clients waiting: " + servers.get(j).getClients().toString() + "\n";

                view.setLblNewLabel(servers.get(j).getClients().toString(), j);
            }
            if(nullServers == servers.size())
                break;
            averageWaitingTime /= servers.size();
            view.setAverageWaitingLabel(Float.toString(averageWaitingTime));
            view.setAverageServiceLabel(Float.toString(serviceTime));
            results += "Average waiting time in real time: " + Float.toString(averageWaitingTime);
//			System.out.println(results);
//			try {
//				fileWriter.write(results);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

            currentTime++;
            view.setTimeLabel(Integer.toString(currentTime));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
        float service = 0;
        for(int l = 0; l < served.size(); l++)
            service += served.get(l).getService();
        service /= served.size();
        results += "\nAverage waiting time: " + service + "\n" + "Peak hour: " + peakHourTime;
        System.out.println(results);
        try {
            fileWriter.write(results);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

