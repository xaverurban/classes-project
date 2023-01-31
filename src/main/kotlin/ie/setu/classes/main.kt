package ie.setu.classes

private val persons = ArrayList<Person>()
fun main (args: Array<String>){
    persons.add(Person("Mark","Roche"))
    persons.add(Person("John","Walsh"))
    persons.add(Person("Sheila","Flynn"))
   // persons.add(Person("",""))

   // for (person in persons)
  //  println(person)
for ((index, value) in persons.withIndex())
    println("$index: $value")
}

fun personInfo(){
    val person1 = Person("Joe","Roach")
    val person2 = person1.copy(firstName = "Mark")
    val person3 = person1.copy()

    println(person1)
    println(person2.toString())

    println("person1 hashcode= ${person1.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode= ${person3.hashCode()}")

    if (person1 == person2)
        println("person1 is equal to person2.")
    else
        println("person1 is not equal to person2.")

    if (person1 == person3)
        println("person1 is equal to person3.")
    else
        println("person1 is not equal to person3.")

}