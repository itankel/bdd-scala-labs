package com.ifat.bdd.scala.labs.hero.data

import com.ifat.bdd.scala.labs.hero.data

class Hobbit(override var power: Int=0, override var hitPoint:Int =3) extends data.Character{
  println(s"Hobbit power is ${this.power} , and hitPoint of ${this.hitPoint}")

  override def kick(character: data.Character): Unit = toCry
  private def toCry : Unit = println("Hobbit is crying......")
}
