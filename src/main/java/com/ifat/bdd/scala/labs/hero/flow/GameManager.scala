package com.ifat.bdd.scala.labs.hero.flow

import com.ifat.bdd.scala.labs.hero.data

class GameManager {

  def fight(character1: data.Character, character2: data.Character): Unit = {
    println(s"start fight between $character1 and $character2")
    while (character1.isAlive && character2.isAlive) {
      character1.kick(character2)
      character1.kick(character2)
      println(s" end round between $character1 and $character2")
    }
    if (character1.isAlive) {
      println(character1.getClass.getName + " won")
    } else {
      println(character2.getClass.getName + " won")
    }
  }
}
