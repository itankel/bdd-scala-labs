package com.ifat.bdd.scala.labs.hero.data

import com.ifat.bdd.scala.labs.hero.data

import scala.util.Random

class KickLikeAKing extends KickAlgo {
  override def kick(character1: data.Character, character2: data.Character): Unit ={
    val lessBy = Random.between(0, character2.power + 1)
    println(s"reducing hitPoints by $lessBy")
    character2.reduceHitPoints(lessBy)
  }
}
