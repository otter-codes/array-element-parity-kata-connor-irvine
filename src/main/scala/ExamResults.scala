object ExamResults {

  def Scorer(Answers : List[String]) : Int = {
   Answers match {
     case List("c") => 4
     case List("a") => -1
    }
  }

}
