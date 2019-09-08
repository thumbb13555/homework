package com.postbox

import java.util.*

fun main() {

    var mLength:Float
    var mWidth :Float
    var mHeight:Int

    var sc = Scanner(System.`in`)
    println("Please enter object's length: ")
    mLength = sc.nextFloat()
    println("Please enter object's width: ")
    mWidth  = sc.nextFloat()
    println("Please enter object's height: ")
    mHeight = sc.nextInt()
    var box3 = Box3kt(23f,14f,13)
    var box5 = Box5kt(39.5f,27.5f,23)

    if (box3.validate(mLength,mWidth,mHeight)){
        println("Box3")
    }else if(box5.validate(mLength,mWidth,mHeight)){
        println("Box5")
    }


}
class Box5kt(inLength: Float,inWidth:Float,inHeight:Int):Box(inLength,inWidth,inHeight){}
class Box3kt(inLength: Float,inWidth:Float,inHeight:Int):Box(inLength,inWidth,inHeight){}

open class Box(val inLength: Float,val inWidth:Float,val inHeight:Int){
    open fun validate(length : Float, width : Float, height : Int)
            =(inLength>=length && inWidth >=width && inHeight >= height)
}