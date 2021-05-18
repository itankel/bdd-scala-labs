package com.ifat.bdd.scala.labs.hero.data

trait Character {

  var power: Int
  var hitPoint: Int

  def kick(character: Character): Unit

  def isAlive: Boolean = {
    hitPoint > 0
  }

  def die: Unit = {
    hitPoint = 0
  }

  def reducePower(i: Int): Unit = {
    println(s"current  Power $power to be reduced by $i")
    power -= i
    println(s"Power is now $power")
  }

  def reduceHitPoints(i: Int): Unit = {
    println(s"current  hitPoint are $hitPoint to be reduced by $i")
    hitPoint -= i
    println(s"hitPoint are now $hitPoint")
  }
}
