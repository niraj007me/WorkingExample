import org.apache.spark.sql.SparkSession

object readFile{
 def main (args: Array[String]): Unit={

   val spark =SparkSession.builder().master("local[1]").appName("readFile").
     config("spark.testing.memory", "2147480000").getOrCreate()
   spark.sparkContext.setLogLevel("ERROR")
   System.setProperty("hadoop.home.dir", "C:\\app");

   val rdd = spark.sparkContext.textFile("C:\\Users\\ninirajk\\Documents\\OtherDoc\\Data\\Data\\Inputs\\Sales_Landing\\SalesDump_18072020")
   rdd.foreach(f=>{
     println(f)
   })

 }
}