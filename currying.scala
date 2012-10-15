def add(x: Int, y: Int) = {
  x + y
}

def add(x: Int) = (y: Int) => x + y

def addTwo = add(2)

var result = add(1,2)
println(result)

result = add(1)(2)
println(result)

result = addTwo(1)
println(result)



