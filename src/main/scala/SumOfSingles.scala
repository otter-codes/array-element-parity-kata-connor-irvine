object SumOfSingles extends App {

  def Calculator(admission: List[Int]): Int = {
    val distinctSum = admission.distinct.sum
    val totals = admission.sum
    val doubles = distinctSum*2
    val result = doubles-totals

    result

  }
}