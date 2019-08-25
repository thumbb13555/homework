package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int totalTickets;
        do {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            totalTickets = scanner.nextInt();
            if(totalTickets != -1){
                System.out.print("How many round-trip tickets: ");
                int roundTrip = scanner.nextInt();

                Ticket ticket = new Ticket(totalTickets,roundTrip);
                int totalPrice = ticket.getTicket()+ticket.getRound_trip();
                ticket.sendOut(totalTickets,roundTrip,totalPrice);
            }

        }

        while (totalTickets != -1);
        System.out.println("Finish.");



    }
}
