import org.scalatest.time.Seconds
import org.scalatest.{MustMatchers, WordSpec}

import scala.concurrent.{Await, Future}

class nThLargestSpec extends WordSpec with MustMatchers {

  "nFinder" must {

    "when given a list of '1' and a nth value of '1' then return '1'" in {
      nThLargest.nFinder(List(1), 1) mustEqual 1

    }

    "when given a list of '1, 2' and a nth value of '1' then return '2'" in {
      nThLargest.nFinder(List(1, 2), 1) mustEqual 2

    }

    "when given a list of '1, 2' and a nth value of '2' then return '1'" in {
      nThLargest.nFinder(List(1, 2), 2) mustEqual 1

    }

    "when given a list of '1, 2, 3' and a nth value of '2' then return '2'" in {
      nThLargest.nFinder(List(1, 2, 3), 2) mustEqual 2

    }

    "when given a list of '1, 2, 3' and a nth value of '1' then return '3'" in {
      nThLargest.nFinder(List(1, 2, 3), 1) mustEqual 3

    }

    "when given a list of '3, 3, 4, 4, 5, 5' and a nth value of '3' then return '3'" in {
      nThLargest.nFinder(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3

    }

    "when given a list of '1, 2' and a nth value of '3' then return 'error'" in {

      val result = nThLargest.nFinder(List(1, 2), 5)
      result mustBe "error"

    }
  }
}