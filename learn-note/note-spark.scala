各种环境变量在SparkExample中的bin/commonrc中有记录

Spark 是一个 RDD，弹性分布式数据集， 可以从Hadoop输入框架中创建， 也可以通过别的
Hadoop的是HDFs文件。

val textFile = sc.textFile("README.md")

textFile.count() //说是item的个数 其实就是有几行

textFile.first() //第一行的 也是第一个item

val linesWithSpark = textFile.filter(line => line.contains("Spark"))
//利用了filter转换器 将含有Spark字符的行返回到了 linesWithSpark

textFile.filter(line => line.contains("Spark")).count()
//含有 Spark字符的行 有几个

textFile.map(line => line.split(" ").size).reduce((a, b) => if (a > b) a else b)
//通俗的讲就是看那一行的单词多 执行时是先用split分开每行的单词 算了下size 就是个数 
//做了个映射map 第几行有几个单词 接下来又做了reduce 找到最大的那个单词个数 返回

import java.lang.Math
import java.lang.Math
textFile.map(line => line.split(" ").size).reduce((a, b) => Math.max(a, b))
//和上面的执行功能是一样的 但是这里利用了java中math的函数 然后后面取max就可以用了 看起来更清晰 简洁
//有空可以查查java.lang.Math中的内容是否有帮助

val wordCounts = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
// 这里是计算了一下各个单词的个数 先是split 拆分单词 然后做个映射 先是每个单词个数都是1 然后reduceByKey 的功能是合并同类项 就得到单词个数了

wordCounts.collect()
//列出单词及其个数

flatMap 
//把数据拍平 可以将RDD[Array(string, Int)] => RDD[(string, Int)]

Array().mkString(",")
//可以变成String字符串 然后方便打印

.filter(_._1 != "")

.sortWith{ case (x1, x2) => x1._2 > x2._2 }

.dropRight(phoneType.length - 10)

    tuple
    array.mkstring("\t")
    tuple.productIterator.mkString("\t")

.groupByKey 

.reduceByKey

.join

.zip

.fill

.















