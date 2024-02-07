package com.example.kotlindersleri.degiskenler

fun main() {
    //tur donusumu
    //sayısal-sayısal
    val i = 42
    val d =87.92
    val sonuc1=i.toDouble()
    val sonuc2=d.toInt()
    println(sonuc1)
    println(sonuc2)
    println("hello world")

    //sayısal-metin
    val sonuc3=i.toString()
    val sonuc4=d.toString()
    println(sonuc4)
    println(sonuc3)
val yaz="58"
    val sonuc5=yaz.toIntOrNull()
    if (sonuc5!=null)
    {
        println(sonuc5)
    }
    //
    sonuc5?.let{println(yaz)}
    //else {println("hataaa")}
    println(sonuc5)
}