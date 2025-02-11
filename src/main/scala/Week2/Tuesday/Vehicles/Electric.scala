package Week2.Tuesday.Vehicles

trait Electric {
  val timeToCharge: Int //abstract field - must declare it sub-class level (as soon as i extend)
  def charge: String = s"Charge me for $timeToCharge hours"

}
