package src.main


import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait Context {
  private lazy val sparkConf = new SparkConf()
    .setAppName("smb-cohort")
    .setMaster("local[*]")
    .set("spark.cores.max", "6")
    .set("spark.executor.memory", "1g")
    .set("spark.logConf", "true")

  lazy val spark: SparkSession = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()
}