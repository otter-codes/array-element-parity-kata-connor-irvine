import org.scalatest.{MustMatchers, WordSpec}

class ScrabbleSpec extends WordSpec with MustMatchers {


    "scrabbleBoard" must {

  "when given no input to the Scrabble Board a score of 0 points should be returned" in {
    Scrabble.scrabbleBoard("") mustEqual 0
    }

  "when given an input of the letter 'a' the Scrabble Board will return a score of '1'" in {
    Scrabble.scrabbleBoard("a") mustEqual 1
    }

  "when given an input of the letter 's' the Scrabble Board will return a score of '1'" in {
    Scrabble.scrabbleBoard("s") mustEqual 1

    }

      "when given an input of the word 'hi' the Scrabble Board will return a score of '5'" in {
      Scrabble.scrabbleBoard("hi") mustEqual 5
      }

}
}