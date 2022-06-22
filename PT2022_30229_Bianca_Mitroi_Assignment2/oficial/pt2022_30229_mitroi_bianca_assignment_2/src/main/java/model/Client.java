package model;

public class Client implements Comparable<Client>{
    private int id;
    private int arrival;
    private int service;

    public Client(int id, int arrival, int service){
        this.id = id;
        this.arrival = arrival;
        this.service = service;
    }

    public int getId(){
        return this.id;
    }

    public int getArrival(){
        return this.arrival;
    }

    public int getService(){
        return this.service;
    }

    public void setService(){
        service--;
    }

    @Override
    public int compareTo(Client o) {
        if(this.arrival == o.arrival)
            return this.service - o.service;
        return this.arrival - o.arrival;
    }

    public String toString() {
        return "" + id + " " + arrival + " " + service + " ";
    }
}
