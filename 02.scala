//P02 (*) Find the last but one element of a list.

//the real way
//def penultimate(l:List[Any]) = l takeRight 2 head

def penultimate(l:List[Any]) : Any = l match {
  case h :: (_ :: Nil) => h
  case h :: t => penultimate(t)
  case _ => throw new NoSuchElementException
}

println(penultimate(List(1, 1, 2, 3, 5, 8)))