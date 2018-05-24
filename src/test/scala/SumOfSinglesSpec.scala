import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec  extends WordSpec with MustMatchers {

  "calculator" must {

    "when given a single input return the input as an output" in {
      SumOfSingles.Calculator(List(1)) mustEqual 1
    }
    "when given a two unique input return the sum of the inputs" in {
      SumOfSingles.Calculator(List(1, 2)) mustEqual 3
    }
    "when given an input return with a matching pair eliminate them and leave the unique element" in {
      SumOfSingles.Calculator(List(1, 2, 2)) mustEqual 1
    }
  }
}