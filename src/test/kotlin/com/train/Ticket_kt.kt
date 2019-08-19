package com.train

class Ticket_kt(var total_tickets: Int,var round: Int) {
    init{
        println(total_tickets)
    }
    fun get_ticket():Int{
        val sign_Tickets = total_tickets - round
        var sign_tickets_price = sign_Tickets*1000
        return sign_tickets_price
    }
    fun getRound_trip():Int{
        val round_trip_price = round*2000*9/10
        return round_trip_price
    }


    fun print(total_tickets:Int, round_trip:Int,total:Int){
        println("Total tickets: $total_tickets")
        println("Round-trip:  $round_trip")
        println("Total: $total")
    }
}