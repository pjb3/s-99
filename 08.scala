// P08 (**) Eliminate consecutive duplicates of list elements.
// If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
import scala.collection.mutable.ListBuffer

// Imperative Way :(
// def compress(l: List[Any]) : List[Any] = {
//   var prevElem: Any = null
//   var newList = new ListBuffer[Any]
//   l.foreach((e: Any) => {
//     if(e != prevElem) {
//       newList += e
//     }
//     prevElem = e
//   })
//   newList.toList
// }

// Functional Way !
def compress(l: List[Any]) : List[Any] = l match {
  case Nil => Nil
  case h :: Nil => List(h)
  case h :: t => if(h == t.head) compress(t) else h :: compress(t)
}

println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)