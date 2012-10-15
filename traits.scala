trait Say {
  def say: String
  def hungry: Boolean = {
    true
  }
}

class Person extends Say{
  def say = {
    "What's for lunch?"
  }
}

def talk(talkable: Say) {
  println(talkable.say)
  println(talkable.hungry)
}

val person = new Person

talk(person)

class Cat {
  def say = {
    "meow"
  }
}

def talking(sayable: {def say: String}) {
  println(sayable.say)
}

val cat = new Cat

talking(cat)
