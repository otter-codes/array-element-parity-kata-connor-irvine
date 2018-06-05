object ExamResults {


  def Scorer(userAnswers : List[String], correctScores: List[String]) : Int = {

    val answerCheck: List[(String, String)] = userAnswers.zip(correctScores)
    val result: List[Int] = answerCheck.map(userAnswers => {
      if (userAnswers._1 == "") 0
      else if (userAnswers._1 == userAnswers._2) 4
      else -1
    })

    result.sum

    }
}
