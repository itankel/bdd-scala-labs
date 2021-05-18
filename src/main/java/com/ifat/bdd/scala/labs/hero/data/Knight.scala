package com.ifat.bdd.scala.labs.hero.data

import com.ifat.bdd.scala.labs.hero.data

import scala.util.Random

class Knight(override var power: Int = Random.between(2, 13),
             override var hitPoint: Int = Random.between(2, 13)) extends data.Character {
  println(s"Knight power is ${this.power} and hitPoints ${this.hitPoint}")

  private val kickAlgo: KickAlgo = new KickLikeAKing()

  override def kick(character: data.Character): Unit = {
    println(s"Knight power is ${this.power} enemy power is ${character.power}")
    println(s"Knight is kicking $character")
    kickAlgo.kick(this, character)
  }
}
