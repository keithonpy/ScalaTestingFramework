import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.wordspec.AnyWordSpec

// class Calculator to be tested
class Calculator {
  def add(a: Int, b: Int) = a + b
  def subtract(a: Int, b: Int) = a - b
  def multiply(a: Int, b: Int) = a * b
  def divide(a: Int, b: Int) = a / b
}


// FunSuite for sample unit test

class CalculatorSuite extends AnyFunSuite{
  val calculator = new Calculator

  test("multiplication with 0 should always give 0") {
    assert(calculator.multiply(1234, 0) == 0)
    assert(calculator.multiply(-1234, 0) == 0)
    assert(calculator.multiply(0, 0) == 0)
  }

  test("dividing by 0 should throw a math error") {
    assertThrows[ArithmeticException](calculator.divide(1234, 0))
  }

}

// FunSpec used for structured, descriptive tests

class CalculatorSpec extends AnyFunSpec {
  val calculator = new Calculator

  // can nest as many levels deep as you like
  describe("multiplication") {
    it("should give back 0 if multiplying by 0") {
      assert(calculator.multiply(1234, 0) == 0)
      assert(calculator.multiply(-1234, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
    }
  }

  describe("division") {
    it("should throw a math error if dividing by 0") {
      assertThrows[ArithmeticException](calculator.divide(1234, 0))
    }
  }
}


// WordSpec test

class CalculatorWordSpec extends AnyWordSpec {
  val calculator = new Calculator

  "A calculator" should {
    "give back 0 if multiplying by 0" in {
      assert(calculator.multiply(1234, 0) == 0)
      assert(calculator.multiply(-1234, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
    }

    "throw a math error if dividing by 0" in {
      assertThrows[ArithmeticException](calculator.divide(1234, 0))
    }
  }
}