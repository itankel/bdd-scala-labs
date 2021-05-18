package com.ifat.bdd.scala.labs.quotes_lab.data

import com.ifat.bdd.scala.labs.quotes_lab.control.{QuotesDataFactory, QuotesFactory}

import scala.util.Random

object RandomQuoter extends Quoter {
  private val quotesFactory :QuotesFactory  = new QuotesDataFactory()
  private val quotesRepo: List[String] = List(" 1 Love of my life, you've hurt me",
    "2 You've broken my heart, and now you leave me",
    "3  Love of my life, can't you see?",
    "4 Bring it back, bring it back",
    "5  Don't take it away from me",
    "6  Because you don't know",
    "7  What it means to me",
    "8  Love of my life, don't leave me",
    "9 You've taken my love, and now desert me",
    "10 Love of my life, can't you see?",
    "11 Bring it back, bring it back",
    "12 Don't take it away from me",
    "13 Because you don't know",
    "14 What it means to me")

  override def printMessage(): Unit = {
    val randInt= Random.between(0,quotesRepo.size)
    println("RandomQuote: " + quotesRepo(randInt) +" "+ quotesFactory.getQuote)
  }
}
