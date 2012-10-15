def higher(f: String => String, world: String) {
  println(f(world))
}

def hello(message: String) = {
  message.toUpperCase
}

higher(hello, "hello, world")

higher((name: String) => {name.toLowerCase}, "HELLO, WORLD")
