//P05 (*) Reverse a list.

//the real way
//def reverse(l:List[Any]) = l reverse

def reverse(l:List[Any]) : List[Any] = l match {
  case h :: Nil => List(h)
  case h :: t => reverse(t) ::: List(h)
  case _ => List()
}

println(reverse(List(1, 1, 2, 3, 5, 8)))
