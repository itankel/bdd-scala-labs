package com.ifat.bdd.scala.labs.hero.data

import com.ifat.bdd.scala.labs.hero.data

class Elf(override var power: Int = 10, override var hitPoint: Int = 10) extends data.Character {
  println(s"Elf power is ${this.power} , and hitPoint of ${this.hitPoint}")

  override def kick(otherCharacter: data.Character): Unit = {
    println(s"Elf kicks $otherCharacter")
    println(s"Elf power is ${this.power} , enemy power is ${otherCharacter.power}")
    if (otherCharacter.power < this.power) {
      println(s"Elf won $otherCharacter lost his life")
      otherCharacter.die
    } else {
      println(s"Elf not strong enough managed to reduce only one power")
      otherCharacter.reducePower(1)
    }
  }
}
