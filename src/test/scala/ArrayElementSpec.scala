import org.scalatest._

class ArrayElementSpec extends WordSpec with MustMatchers {

  "stripper" must {

    "when given a single input return the input as an output" in {
      ArrayElement.Stripper(List(1)) mustEqual 1
    }
    "when given a multiple +/- inputs return the only unique input" in {
      ArrayElement.Stripper(List(-1, 1, 2)) mustEqual 2
    }
  }
}