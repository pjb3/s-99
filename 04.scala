//P04 (*) Find the number of elements of a list.

//the real way
//def length(l:List[Any]) = l size

//This is very imperative :(
def length(l:List[Any]) : Int = {
  var len = 0
  for(i <- l) { len += 1 }
  len
}

println(length(List(1, 1, 2, 3, 5, 8)))
