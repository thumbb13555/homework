package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int total_tickets = scanner.nextInt();

        System.out.print("How many round-trip tickets: ");
        int round_trip = scanner.nextInt();

        Ticket ticket = new Ticket(total_tickets,round_trip);
        int total_price = ticket.get_ticket()+ticket.getRound_trip();
        ticket.sendOut(total_tickets,round_trip,total_price);
    }
}
