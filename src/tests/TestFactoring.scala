package tests

import org.scalatest._
import lecture.Algebra

class TestFactoring extends FunSuite {
  test("Use many test cases for each category") {
    val testCases: Map[Int, List[Int]] = Map(
      8 -> List(2,2,2),
      5 -> List(5),
      1 -> List(1),
      0 -> List(),
      -2 -> List())
    for ((input, expectedOutput) <- testCases) {
      assert(Algebra.factor(input) == expectedOutput)
    }
  }
}
