object nThLargest {


  def nFinder(starter: List[Int], index: Int) = {
    try {
     if (index > starter.distinct.length)
      throw new Exception("error")

     val num = starter.distinct.reverse.splitAt(index - 1)
     val fin = num._2
     fin.head
    }
    catch {
      case e: Exception => e.getMessage()
    }
  }
}