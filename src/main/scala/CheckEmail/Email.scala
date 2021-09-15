

package CheckEmail

class Email {

  def recipientName(email: String): Boolean = {
    var location = 0
    while (email.charAt(location) != '@') {
      if (email.charAt(location) == '.')

        return true

      if (!Character.isLetterOrDigit(email.charAt(location))) throw new IllegalArgumentException("Recipient Name is not alphanumerically correct")
      location = location + 1
    }
    true
  }

  def checkSymbol(email: String): Boolean={
    for(i <-0 until email.length)
      if(email.charAt(i) == '@')

        return true

    throw new IllegalArgumentException("Email don't have the @ Symbol")
  }

  def checkDomain(email: String): Boolean={

    if(! checkSymbol(email))

      return false

    var indicator = email.indexOf("@") + 1
    while (email.charAt(indicator) != '.') {
      if (!Character.isLetterOrDigit(email.charAt(indicator))) throw new IllegalArgumentException("Domain Name is not alphanumeric")
      indicator = indicator + 1
    }
    true
  }

  def topLevelDomain(email:String): Boolean={
    if(! checkSymbol(email))
      return false
    val indexAt = email.indexOf(".")
    val topLevelDomain = email.substring(indexAt)
    if (topLevelDomain.equals(".net") || topLevelDomain.equals(".org") || topLevelDomain.equals(".com"))

      return true

    throw new IllegalArgumentException("Not Applicable for Top Level Domain")
  }
}


/* Recipient name -  alphanumeric characters (both lower and upper case)
ii. @ symbol
iii. Domain name – alphanumeric (both lower and upper case)
iv. Top-level domain - .com/.net/.org
*/

