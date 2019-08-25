package com.train

import java.util.*

fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)

    do {
        print("Please enter number of tickets: ")
         var totalTickets = scanner.nextInt()
        if (totalTickets != -1){
            print("How many round-trip tickets: ")
            var roundTrip = scanner.nextInt()

            var ticket = Ticket_kt(totalTickets, roundTrip)
            var total_price = ticket.getTicket()+ticket.getRoundTrip()

            ticket.print(totalTickets,roundTrip,total_price)
        }
    }while (totalTickets != -1)
    print("Finish")








}


