// P09 (**) Pack consecutive duplicates of list elements into sublists.
// If a list contains repeated elements they should be placed in separate sublists.
    
def pack(l : List[Symbol]) : List[List[Symbol]] = l match {
  case Nil => List(List())
  case h :: t => {
    val (packed, next) = l.span(_ == l.head)
    if(next == Nil) List(packed)
    else packed :: pack(next)
  }
}

println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
//List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))