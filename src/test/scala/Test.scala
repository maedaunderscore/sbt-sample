import org.scalatest._

class MySpec extends FunSuite {
  test("add") {
    assert(Main.func(3, 7) == 10)
  }

  test("add2") {
    assert(Main.func(3, 8) == 12)
  }
}
