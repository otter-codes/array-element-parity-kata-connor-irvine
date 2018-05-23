import org.scalatest._

class ArrayElementSpec extends WordSpec with MustMatchers {

  "stripper" must {

    "when given a single input return the input as an output" in {
      ArrayElement.Stripper(List(1)) mustEqual 1
    }
    "when given a multiple +/- inputs return the only (+) unique input" in {
      ArrayElement.Stripper(List(-1, 1, 2)) mustEqual 2
    }
    "when given a multiple +/- inputs return the only (-) unique input" in {
      ArrayElement.Stripper(List(-2, 2, -3)) mustEqual -3
    }
    "when given a long list of multiple +/- inputs return the only unique input" in {
      ArrayElement.Stripper(List(1, -1, -2, 3, -4, 4, 5, -3, 2)) mustEqual 5
    }
  }
}