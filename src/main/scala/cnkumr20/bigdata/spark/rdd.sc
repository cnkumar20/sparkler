import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

val conf = new SparkConf().setAppName("test").setMaster("local")
val sc = new SparkContext(conf)


val data = Array(1, 2, 3, 4, 5)
val distData = sc.parallelize(data)

val data1 = sc.textFile("/Users/nchandregowda/IdeaProjects/sparkler/src/main/scala/cnkumr20/bigdata/spark/test.txt")
val a = data1.map(x => x.length)
a.collect().foreach(println)




