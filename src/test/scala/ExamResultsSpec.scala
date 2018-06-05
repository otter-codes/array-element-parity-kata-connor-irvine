import org.scalatest.{MustMatchers, WordSpec}

class ExamResultsSpec extends WordSpec with MustMatchers {

  "Scorer" must {

    "when given a list of one correct answer and only one question then return a score of 4 points" in {
      ExamResults.Scorer(List("c"), List("c")) mustEqual 4

    }

    "when given a list of one incorrect answer with only one question then return a score of -1 points" in {
      ExamResults.Scorer(List("a"), List("c")) mustEqual -1

    }

    "when given an empty list answer with only one question then return a score of 0 points" in {
      ExamResults.Scorer(List(""), List("c")) mustEqual 0

    }

    "when given the correct answers to the test for all four questions then return full marks of 16 points" in {
      ExamResults.Scorer(List("c", "d", "a", "b"), List("c", "d", "a", "b")) mustEqual 16

    }

    "when given the incorrect answers to the test for all four questions then return full marks of -4 points" in {
      ExamResults.Scorer(List("c", "d", "a", "b"), List("d", "b", "c", "a")) mustEqual -4

    }

    "when given two correct answers to the test and an answer for all four questions then return full marks of 6 points" in {
      ExamResults.Scorer(List("c", "d", "a", "b"), List("c", "d", "c", "d")) mustEqual 6

    }
  }

}
