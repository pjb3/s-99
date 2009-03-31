//P06 (*) Find out whether a list is a palindrome.

//the easy way
//def isPalindrome(l:List[Any]) = l == (l reverse)

def isPalindrome(l:List[Any]) : Boolean = l match {
  case Nil => true
  case _ :: Nil => true
  case h :: t => h == t.last && isPalindrome(t.init)
}

println(isPalindrome(List(1, 2, 3, 2, 1)))
println(isPalindrome(List(1, 2, 3, 4, 1)))