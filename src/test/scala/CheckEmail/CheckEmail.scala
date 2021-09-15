

package CheckEmail
import org.scalatest.funsuite.AnyFunSuite

class CheckEmail extends AnyFunSuite {

  val email = new Email
  test("Check Recipient's Name that it does not contain i "){

    val expectedValue = true
    val resultingValue = email.recipientName("shashkant15@gmail.com")
    assert(resultingValue == expectedValue)

    //assert in place of intercept
  }

  test("Recipient's Name with Special Characters throw  Exception"){

    intercept[IllegalArgumentException]{
      email.recipientName("shashkant15$@gmail.com")
    }
  }


  test("Check '@' Symbol is present in the Email address"){

    val expectedValue= true
    val resultingValue = email.checkSymbol("shashkant15@gmail.com")
    assert(resultingValue == expectedValue)
  }


  test("Email address without '@' throws  Exception"){

    intercept[IllegalArgumentException]{
      email.checkSymbol("shashkant15gmail.com")
    }
  }


  test("Check that Domain Name does not contain special characters"){

    val expectedOutcome= true
    val result = email.checkDomain("shashkant15@gmail.com")
    assert(result == expectedOutcome)
  }


  test("Domain Name with Special Characters throws  Exception"){

    intercept[IllegalArgumentException]{
      email.checkDomain("shashkant15@gmail*com")
    }
  }


  test("Check Top Level Domains "){

    val expectedResult= true
    val finalOutcome = email.topLevelDomain("shashkant15@gmail.com")
    assert(expectedResult == finalOutcome)
  }

  test("If Top Level Domain is not .net/.org/.com it throws Exception"){

    intercept[IllegalArgumentException]{
      email.topLevelDomain("shashkant15@gmail.edu")
    }
  }
}
