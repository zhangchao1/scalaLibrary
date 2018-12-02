package string

class StrOperate(val str: String) {
  def strReverse(): Unit = {
    println(str.reverse)
  }

  def strToUpper(): Unit = {
    println(str.map(_.toUpper))
  }

  def strSice(): Unit ={
    //第一种方式只能从前向后截取
    println(str drop 3)
    //截取其中的一段
    println(str.slice(0,3))
  }

  def strSplit(): Array[String] ={
    var arr = new Array[String](3)
    arr = str.split(" ")
    return arr
  }

  def strToChar():Seq[Char]={
    var strChar :Seq[Char] = str
    return strChar
  }

}
