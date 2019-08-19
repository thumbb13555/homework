package com.train

import java.util.*

fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var total_tickets = scanner.nextInt()

    print("How many round-trip tickets: ")
    var round_trip = scanner.nextInt()

    var ticket = Ticket_kt(total_tickets, round_trip)
    var total_price = ticket.get_ticket()+ticket.getRound_trip()

    ticket.print(total_tickets,round_trip,total_price)





}


