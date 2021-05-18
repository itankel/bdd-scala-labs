package com.ifat.bdd.scala.labs.hero.data

import com.ifat.bdd.scala.labs.hero.data

import scala.util.Random

class King(override var power: Int = Random.between(5, 16)
           , override var hitPoint: Int = Random.between(5, 16)) extends data.Character {
  println(s"King power is ${this.power} and hitPoints ${this.hitPoint}")

  private val kickAlgo: KickAlgo = new KickLikeAKing()

  override def kick(character: data.Character): Unit = {
    println(s"King power is ${this.power} enemy power is ${character.power}")
    println(s"King is kicking $character")
    kickAlgo.kick(this, character)
  }
}
