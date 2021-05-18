package com.ifat.bdd.scala.labs.quotes_lab.main

import com.ifat.bdd.scala.labs.quotes_lab.control.QuoterAggregator
import com.ifat.bdd.scala.labs.quotes_lab.data.{MessageQuoter, RandomQuoter, ShakespearQuoter}

object Main {

  def main(args: Array[String]): Unit = {

    val aggregatorQuoter = new QuoterAggregator()
    aggregatorQuoter.add(new ShakespearQuoter("......This is the question"))
    aggregatorQuoter.add(new ShakespearQuoter())
    aggregatorQuoter.add(MessageQuoter("This is the message quoter mandatory input sentence"))
    aggregatorQuoter.add(RandomQuoter)
    println("Printing all I have aggregated in ===>>>>>> ")
    aggregatorQuoter.printAll()
  }
}
