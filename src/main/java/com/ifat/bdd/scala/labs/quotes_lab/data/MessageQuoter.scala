package com.ifat.bdd.scala.labs.quotes_lab.data

case class MessageQuoter(message: String) extends Quoter {
  override def printMessage(): Unit = println(s"MessageQuoter : $message")
}
