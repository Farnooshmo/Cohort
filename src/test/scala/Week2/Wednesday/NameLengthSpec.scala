package Week2.Wednesday


import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class NameLengthSpec extends AnyWordSpec with Matchers {
val nameLength = new NameLength
 "NameLength"  should {
  "return the length of first name" when {
    "the firstName is longer than surname" in {
      val input = nameLength.getNameLength("Farnoosh", "Moayeri")
      val expectedResult = 8
      input shouldBe expectedResult
    }

  }
  "return the length of surname" when {
    "the surname is longer than first name" in {
      val input = nameLength.getNameLength("Far", "Moayeri")
      val expectedResult = 7
      input shouldBe expectedResult
    }

  }
  "return 0" when {
    "the length of first name and surname are equal" in {
      val input = nameLength.getNameLength("Tom", "Bob")
      val expectedResult = 0
      input shouldBe expectedResult
    }
    //Edge case
    "empty strings are entered" in {
      val input = nameLength.getNameLength("", "")
      val expectedResult = 0
      input shouldBe expectedResult
    }

  }



}
}
