val letters = List('a', 'b', 'c', 'd')
val ints = List(0, 1, 2, 3)
val result = for {
  l <- letters
  i <- ints if i % 2 == 0
  } yield l.toString + i

println(result)

def anyFoo(something: Option[Option[String]]) = for {
  someFoo <- something
  foo <- someFoo
} yield foo

val someSomeFoo = Some(Some("Foo"))
println(anyFoo(someSomeFoo))

val someNoneFoo = None
println(anyFoo(someNoneFoo))
