//package Week1.Friday
//
///** Pure and Impure Functions */
////Pure: Given the same input(s) the output will always be the same.
////Impure: Given the same input(s) the output will be different if passed in multiple times.
////Bit of a spot the difference - val/var.
//
////Pure: Given the same input(s) the output will always be the same.
////Impure: Given the same input(s) the output will be different if passed in multiple times.
//
/////**Example of pure: */
//val sentence: String = ""
//
//def append(sentence:String, word: String): String =
//  sentence + " " + word.trim()
//
//val a = append(sentence, "Allo") // "Allo"
//val b = append(sentence, "Allo") // "Allo"
//
///** Example of impure: */
//var sentence: String = ""
//
//def append(word: String): String = {
//  sentence = sentence + " " + word
//  sentence.trim()
//}
//
//val a = append("Allo") // "Allo"
//val b = append("Allo") // "Allo Allo"
//
//////WHY? val and var. Immutable vs mutable.
////// passing in empty string as sentence for the pure.
////// Aim for pure! We want safe code!