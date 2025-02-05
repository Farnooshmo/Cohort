//Extension
//1 Highest precedence to the lowest precedence operators
/**
 * / %
 + -
 :
 < >
= !
&
^
|
(all letters, $, _)
 */

//2

(true || false && false)
  " && has a higher precedence therefore first evaluate will be between false && false,which result in false, then it goes to the true || false which the result become true."
((true || false) && false)
  "In this case parentheses has a higher precedence, first evaluate (true || false) = true, then operate true && false, which the result is false."


(1 < 4 && 7 != 10 || 9 + 10 == 21)
  "Starts from : 9 + 10 = 19, 1 < 4 (true), 7=! 10 (true), 19 == 21 (false), then true && true || false , and the result will be true"
