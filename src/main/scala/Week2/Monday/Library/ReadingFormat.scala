package Week2.Monday.Library

class ReadingFormat
trait AudioBook extends ReadingFormat //extending a class using the keyword extends. We can only extend 1 class prt 'thing'(object, trait, class).
trait DigitalBook extends ReadingFormat
trait PhysicalBook extends ReadingFormat

//By having each format extending the superclass/parent 'ReadingFormat' we are grouping these together and giving each trait access to any methods in the parent class.
