//P03 (*) Find the Kth element of a list.
//By convention, the first element in the list is element 0.

//the real way
//def nth(i:Int, l:List[Any]) = l(i)

def nth(n:Int, l:List[Any]) : Any = (n, l) match {
  case (0, l) => l head
  case (n, l) => nth(n - 1, l tail)
}

println(nth(2, List(1, 1, 2, 3, 5, 8)))
