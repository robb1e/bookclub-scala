implicit val value = "Foo"

def bar(baz: String)(implicit foo: String) {
  println("%s %s".format(foo, baz))
}

bar("bar")

