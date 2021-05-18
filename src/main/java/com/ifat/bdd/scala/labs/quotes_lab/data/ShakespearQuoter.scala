package com.ifat.bdd.scala.labs.quotes_lab.data

class ShakespearQuoter(val message: String ="to be or not to be" ) extends Quoter {

  override def printMessage(): Unit ={
    println(s"shakespearQuoter $message")
  }
}
