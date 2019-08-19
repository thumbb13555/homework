package com.train;

public class Ticket {
    int total_tickets;
    int round_trip;

    public Ticket(int total_tickets,int round_trip){
        this.total_tickets = total_tickets;
        this.round_trip = round_trip;

    }
    public int get_ticket(){
        int sign_Tickets = total_tickets-round_trip;
        int sign_tickets_price= sign_Tickets*1000;
        return sign_tickets_price;
    }
    public int getRound_trip(){
        int round_trip_price = round_trip*2000*9/10;
        return round_trip_price;
    }


    public void sendOut(int sign_tick,int round_trip,int total){
        System.out.println("Total tickets: "+sign_tick);
        System.out.println("Round-trip: "+round_trip);
        System.out.println("Total: "+total);

    }

}
