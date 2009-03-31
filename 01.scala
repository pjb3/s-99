//P01 (*) Find the last element of a list.

//The real way
//def last(l:List[Any]) = l takeRight 1 head

def last(l:List[Any]) : Any = l match {
  case Nil => Nil
  case h :: Nil => h
  case h :: t => last(t)
}

println(last(List(1, 1, 2, 3, 5, 8)))
