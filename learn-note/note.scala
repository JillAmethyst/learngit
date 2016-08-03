

//example**********************************
object test extends App {
  def printArgs(args: Array[String]): Unit = {
    val a: Array[Unit] = args.map(println)
    val b: Unit = args.foreach(println)
  }

  val haha = Array("heihei", "hoho")
  printArgs(haha)
}
在这部分代码中输出的结果是
heihei
hoho
heihei
hoho
目前感觉上是执行完a之后才去执行b的，而不是交叉输出

4.5 Application的特质
在2.11.6版本中Application被简化成了App,如下面的代码：
import ChecksumAccumulator.calculate
object FallWinterSpringSummer extends App{
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))
}

Application的功能就是像main一样

5 章 
scala的基本类型 String 
        值类型 Int Long Short Byte Float Double Char Boolean

5.2 

字串文本
println("""beautiful girl.""")
println("""hello, pool guy!
          |you look so tired.""")
下一句中在2.11.6中不用添入
println("""|hello, pool guy!
           |you look so tired.""".stripMargin)
这些stripMargin之类的东西，也可以打出好格式

6.3
重载toString的方法
使用override

7 
内建控制
7.4

7.8 
重构指令式代码
主要是 把结果弄成一个字符串 一起输出 会方便检查


question:









