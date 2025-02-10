package Week2.Monday.Family


class Adult (val forename: Forename, val surname: Surname) {
  //type safe because we are using classes ad types.
  val under18: Boolean =false
}
class Forename (val name: String)
class Surname (val surname: String) //*** if  we do not use val, this can not be accessible

object Adult {
  def apply(forename: Forename, surname: Surname) : Adult = new Adult(forename, surname)
}
