package com.ifat.bdd.scala.labs.quotes_lab.control

import com.ifat.bdd.scala.labs.quotes_lab.data.Quoter

import scala.collection.mutable.ListBuffer

class QuoterAggregator {
  var quoterCache = new ListBuffer[Quoter]()

  def add(quoter: Quoter):Unit = {
    quoterCache.addOne(quoter)
    //println("added to cache now quoter size "+quoterCache.size)
  }
  def printAll() : Unit = {
    quoterCache.foreach(_.printMessage())
  }
}
