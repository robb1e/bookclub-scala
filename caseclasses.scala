case class Person(firstName: String, lastName: String)

val robbie = Person("Robbie", "Clutton")

val barker = Person(lastName = "Barker", firstName = "John")

println(robbie.firstName)
println(barker)
