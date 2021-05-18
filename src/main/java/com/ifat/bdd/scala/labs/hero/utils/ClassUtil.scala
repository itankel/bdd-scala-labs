package com.ifat.bdd.scala.labs.hero.utils

import java.lang.reflect.Constructor

import com.ifat.bdd.scala.labs.hero.data

object ClassUtil {

  def newInstance(cz: Class[_ <: data.Character]): data.Character = {

    val bestCtor = findNoArgOrPrimaryCtor(cz)
    val defaultValues = getCtorDefaultArgs(cz, bestCtor)

    bestCtor.newInstance(defaultValues: _*).asInstanceOf[data.Character]
  }

  private def defaultValueInitFieldName(i: Int): String = s"$$lessinit$$greater$$default$$${i + 1}"

  private def findNoArgOrPrimaryCtor(cz: Class[_]): Constructor[_] = {
    val ctors = cz.getConstructors.sortBy(_.getParameterTypes.size)

    if (ctors.head.getParameterTypes.size == 0) {
      // use no arg ctor
      ctors.head
    } else {
      // use primary ctor
      ctors.reverse.head
    }
  }

  private def getCtorDefaultArgs(cz: Class[_], ctor: Constructor[_]): Array[AnyRef] = {

    val defaultValueMethodNames = ctor.getParameterTypes.zipWithIndex.map {
      valIndex => defaultValueInitFieldName(valIndex._2)
    }

    try {
      defaultValueMethodNames.map(cz.getMethod(_).invoke(null))
    } catch {
      case ex: NoSuchMethodException =>
        throw new InstantiationException(s"$cz must have a no arg constructor or all args must be defaulted")
    }
  }
}
