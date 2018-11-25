package src.main

//case class Census(filePath: String)

object Census extends App with Context {
  val censusDF = spark.read
    .format("com.databricks.spark.csv")
    .option("inferSchema", "true")
    .option("header", "true")
    .option("delimiter", ";")
    .load("./data/census_final_view.csv.gz")
  censusDF.show(200)
  println(censusDF.columns.mkString(" "))
}

