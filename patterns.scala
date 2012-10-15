
def patterns(query: Any) {
  query match {
    case Some(query) => println("got a query: " + query)
    case head::tail => println("got head of: %s, and tail of %s".format(head, tail))
    case _ => println("got something else")
  }
}

patterns(Some("Foo"))
patterns(List(1,2,3))
patterns("Something else")
