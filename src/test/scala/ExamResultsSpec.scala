import org.scalatest.{MustMatchers, WordSpec}

class ExamResultsSpec extends WordSpec with MustMatchers {

  "Scorer" must {

    "when given a list of one correct answer and only one question then return a score of 4 points" in {
      ExamResults.Scorer(List("c")) mustEqual 4

    }
    "when given a list of one incorrect answer with only one question then return a score of -1 points" in {
      ExamResults.Scorer(List("a")) mustEqual -1
    }
  }

}
