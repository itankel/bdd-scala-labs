package com.ifat.bdd.scala.labs.hero.control

import com.ifat.bdd.scala.labs.hero.data
import com.ifat.bdd.scala.labs.hero.utils.ClassUtil
import org.reflections.Reflections

import scala.jdk.CollectionConverters.CollectionHasAsScala
import scala.util.Random

class CharacterFactory {

  private val scanner = new Reflections("com.ifat.bdd.scala.labs.hero")
  private val listAllTypes = scanner.getSubTypesOf(classOf[data.Character]).asScala.toList

  def createRandomCharacter(): data.Character = {
    val randInt = Random.between(0, listAllTypes.size )
    val con = listAllTypes(randInt)
    val active = ClassUtil.newInstance(con)
    active.asInstanceOf[data.Character]
  }

}
