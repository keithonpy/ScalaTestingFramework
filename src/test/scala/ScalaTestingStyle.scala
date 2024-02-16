import org.scalatest.funsuite.AnyFunSuite

object ScalaTestingStyle

class CalculatorSuite extends AnyFunSuite{
  val calculator = new Calculator

  test("multiplication with 0 should always give 0") {
    assert(calculator.multiply(1234, 0) == 0)
    assert(calculator.multiply(-1234, 0) == 0)
    assert(calculator.multiply(0, 0) == 0)
  }

  test("dividing by 0 should throw a math error") {
    assertThrows[ArithmeticException](calculator.divide(57238, 0))
  }

}

class Calculator {
  def add(a: Int, b: Int) = a + b
  def subtract(a: Int, b: Int) = a - b
  def multiply(a: Int, b: Int) = a * b
  def divide(a: Int, b: Int) = a / b
}