package com.ifat.bdd.scala.labs.quotes_lab.control

import org.fluttercode.datafactory.impl.DataFactory

class QuotesDataFactory extends QuotesFactory {
  val dataFactory = new DataFactory()
  val MAX_TEXT_LEN=80
  override def getQuote: String = dataFactory.getRandomText(MAX_TEXT_LEN)
}
