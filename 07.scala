//P07 (**) Flatten a nested list structure.

// Works on a List
// def flatten(l: List[Any]) : List[Any] = l match {
//   case Nil => Nil
//   case (h: List[Any]) :: t => flatten(h) ::: flatten(t)
//   case h :: t => h :: flatten(t)
// }
// 
// println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
// res0: List[Int] = List(1, 1, 2, 3, 5, 8)

//Works with varargs
def flatten(l: Any*) : List[Any] = l.toList match {
  case (h: List[Any]) :: t => flatten(h: _*) ::: flatten(t: _*)
  case h :: t => h :: flatten(t: _*)
  case _ => Nil
}

println(flatten(List(1, 1), 2, List(3, List(5, 8))))
// res0: List[Int] = List(1, 1, 2, 3, 5, 8)
