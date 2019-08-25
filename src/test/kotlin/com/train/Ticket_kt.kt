package com.train

class Ticket_kt(var totalTickets: Int,var round: Int) {
    init{
//        println(totalTickets)
    }
    fun getTicket():Int{
        val signTickets = totalTickets - round
        var signTripPrice = signTickets*1000
        return signTripPrice
    }
    fun getRoundTrip():Int{
        val roundTripPrice = round*2000*9/10
        return roundTripPrice
    }


    fun print(totalTickets:Int, roundTrip:Int,total:Int){
        println("Total tickets: $totalTickets")
        println("Round-trip:  $roundTrip")
        println("Total: $total")
    }
}