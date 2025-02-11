package Week2.Monday.PMTask

class Mammal(val furColour: FurColour, val hasTail: HasTail)

class FurColour(val colour : String)
class HasTail(val hasTail: Boolean)
object Mammal {
  def apply(furColour: FurColour, hasTail: HasTail): Mammal = new Mammal(furColour,hasTail)
}
