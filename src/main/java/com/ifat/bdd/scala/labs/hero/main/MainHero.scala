package com.ifat.bdd.scala.labs.hero.main

import com.ifat.bdd.scala.labs.hero.control.CharacterFactory
import com.ifat.bdd.scala.labs.hero.flow.GameManager

object MainHero {
  def main(args: Array[String]): Unit = {
    val gameManager = new GameManager()
    val factoryChar = new CharacterFactory()
    for (x <- 1 to 4) {
      println(" a new fight is stating ...........................................")
      gameManager.fight(factoryChar.createRandomCharacter(), factoryChar.createRandomCharacter())
    }

  }
}
