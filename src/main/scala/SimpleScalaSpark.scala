import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

  /**
    * Created by mamasaid on sysdate.
    */
  object SimpleScalaSpark {

    def main(args: Array[String]) {
      val logFile = "./resources/info.log" // Should be some file on your system
      val conf = new SparkConf().setAppName("Simple Application").setMaster("local[*]")
      val sc = new SparkContext(conf)
      val logData = sc.textFile(logFile, 2).cache()
      val numAs = logData.filter(line => line.contains("a")).count()
      val numBs = logData.filter(line => line.contains("b")).count()
      val numSelects = logData.filter(line => line.contains("select")).count()



      while(true){
            //For looking Spark UI
      }

      println("Lines with a: %s, Lines with b: %s, Lines with 'select': %s".format(numAs, numBs, numSelects))

      println("Mamasaid");
    }
  }


