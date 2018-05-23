import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec  extends WordSpec with MustMatchers {

  "calculator" must {

    "when given a single input return the input as an output" in {
      SumOfSingles.Calculator(List(1)) mustEqual 1
    }

  }
}