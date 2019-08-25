package com.train;

public class Ticket {
    int totalTickets;
    int roundTrip;

    public Ticket(int totalTickets,int roundTrip){
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;

    }
    public int getTicket(){
        int sign_Tickets = totalTickets-roundTrip;
        int sign_tickets_price= sign_Tickets*1000;
        return sign_tickets_price;
    }
    public int getRound_trip(){
        int round_trip_price = roundTrip*2000*9/10;
        return round_trip_price;
    }


    public void sendOut(int sign_tick,int round_trip,int total){
        System.out.println("Total tickets: "+sign_tick);
        System.out.println("Round-trip: "+round_trip);
        System.out.println("Total: "+total);

    }

}
