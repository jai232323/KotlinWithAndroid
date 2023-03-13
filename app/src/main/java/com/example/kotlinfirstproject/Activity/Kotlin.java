package com.example.kotlinfirstproject.Activity;

public class Kotlin {

//    /*
//    import java.util.*
//import kotlin.collections.ArrayList
//import kotlin.collections.HashMap
//
//fun main() {
//   // println("Welcome To Kotlin")
//
//
//    dataStrutures()
//
//
//
//    //variable()
//   // functions()
//    //lists()
//   // oops()
//   // collectionsKotlin()
////    datatype()
////    operator()
////    strings()
////      con_statement()
//
////    array()
////    classAndObjects()
//
////    for (chars in 3..23) {
////        println(chars)
////    }
//
////    class Car
////    {
////        var brand = "Audi"
////        var model = 2022
////        var year = 2023
////    }
////
////    var car1 = Car()
////    car1.brand
////    car1.model
////    car1.year
////
////
////    class Car1(var brand : String , var model : Int , var year : Int)
////    {
////        var c1 = Car1("yellow",2022,2022)
////
////    }
////    println(car1.brand)
//
//
//
//}
//
//fun dataStrutures() {
//    println("Data Struture")
//
//    arrayList()
//  //  arrayMethod()
//    //stack()
//    //queue()
//   // linkedList()
////    var mutableMapNames = mutableMapOf<Int,String>(1 to "Jai" , 2 to "Brindha")
////    mutableMapNames.put(3 , "Jk")
////    mutableMapNames.put(1,"JoyfulJai")
////    mutableMapNames.put(4,"JB")
////    mutableMapNames.replace(1,"Jaiii")
////    println("Remove : "+mutableMapNames.remove(3))
////    println("Contains : "+mutableMapNames.contains(1))
////
////    for (i in mutableMapNames.values)
////    {
////        println("Name is : "+i)
////    }
//
//
//}
//
//fun arrayList() {
//
//    val arrayList = ArrayList<String>()
//    arrayList.addAll(listOf("1","2","3","4","5"))
//
//    arrayList.add("6")
//    arrayList.remove("2")
//    arrayList.removeAll(arrayList)
//    arrayList.distinct()
//
//    val queueNames = LinkedList<String>()
//    queueNames.addAll(listOf("Jai","Vikey","Udhai"))
//
//
//    queueNames.pop()
//    queueNames.peek()
//    queueNames.peekLast()
//    queueNames.peekFirst()
//    queueNames.contains("1")
//    println("Distinct : "+queueNames.distinct())
//    queueNames[0] = "Jk"
//    for (i in queueNames)
//    {
//        println("Name is : "+i)
//    }
//
//
//}
//
//fun linkedList() {
//
//    /*
//    LinkedList provides a doubly linked list data structure implementation.
//    It implements both the List and Deque interface. It belongs to the
//    Java collections framework. Benefit of linked list is that it is faster
//    to insert and delete an element from LinkedList,
//    it doesn't need rearrangement of entire underlying array.
//     */
//
//
//    val planets = LinkedList<String>()
//
//    planets.addAll(listOf("Earth","Venus","Mars"))
//
//    println("Planets = "+planets)
//
//    println("First Planet : "+planets.first)
//
//    println("Last Planet : "+planets.last)
//
//    planets.addFirst("Mercury")
//    println("Planets = "+planets)
//
//    planets.addLast("Pluto")
//    println("Planets = "+planets)
//
//    planets.removeFirst()
//    println("Planets = "+planets)
//
//    planets.removeLast()
//    println("Planets = "+planets)
//
//
//
//    planets.addAll(listOf("Jupiter","Saturn"))
//
//            for (planet in planets)
//    {
//        println(planet)
//    }
//
//    planets.add(2,"Jupiter2")
//
//            for (planet in planets)
//    {
//        println(planet)
//    }
//
//    if (planets.contains("Jupiter2"))
//    {
//        println("Jupiter2 is a planet")
//    }else
//    {
//        println("Jupiter2 is not a planet")
//    }
//
//    planets.remove()
//            planets.removeFirst()
//            planets.removeLast()
//
//            for (plant in planets)
//    {
//        println(plant)
//    }
//    planets.removeAll(listOf("Earth","Venus","Mars"))
//
//            for (plant1 in planets)
//    {
//        println(plant1)
//    }
//    planets.min()
//            planets.max()
//
//
//
//
//
//
//}
//
//    fun queue() {
//
//        val namesOfVideoGames = LinkedList<String>()
//
//        namesOfVideoGames.addAll(listOf("CarromBoard","Cricket","Vollyball"))
//        namesOfVideoGames.add("tennis")
//        namesOfVideoGames.addLast("Tv gaming")
//
//        println("peek : "+namesOfVideoGames.peek())
//        println("peekFirst : "+namesOfVideoGames.peekFirst())
//        println("peekLast : "+namesOfVideoGames.peekLast())
//        println("contains : "+namesOfVideoGames.contains("CarromBoard"))
//        println(namesOfVideoGames.size)
//
//        //namesOfVideoGames.removeAll(namesOfVideoGames)
//        println("pollFirst : "+namesOfVideoGames.pollFirst())
//        println("pollLast : "+namesOfVideoGames.pollLast())
//
//        for (games in namesOfVideoGames)
//        {
//            println(games)
//        }
//
//
//    }
//
//    fun stack() {
//
//        //Stack is a LIFO
//
//        val stack = Stack<String>()
//        stack.push("1")
//        stack.push("2")
//        stack.push("3")
//        println(stack)
//
//        println("Remove : "+stack.pop())
//        println(stack)
//
//        println("View : "+stack.peek())
//        println(stack)
//
//        println("Contains : "+stack.contains("1"))
//        println(stack)
//
//        println("Check stack is empty or not : "+stack.empty())
//        println(stack)
//
//        println("Search : "+stack.search(1))
//        println("Capacity : "+stack.capacity())
//        println(""+stack)
//
//        val clone = stack.clone()
//
//        for (i in clone.toString())
//        {
//            println(i)
//        }
//
//        println("Clone : "+clone)
//
//
//        println("REmoveAll : "+stack.removeAll(stack))
//        println(stack)
//
//        println("Check stack is empty or not : "+stack.empty())
//        println(stack)
//
//    }
//
//    fun arrayMethod() {
//
//
//        val array = arrayOf<Int>(1,2,3,4,5,)
//        array[0] = 23
//        array[1] = 3
//        println("")
//        println(array[0])
//        array.all {
//            it.equals(1)
//
//        }
//        for (i in 0..array.size)
//        {
//            println("Array of : "+i)
//        }
//
//        val arrayList = ArrayList<String>()
//        arrayList.add(1,"Jk")
//        arrayList.add(2,"KJ")
//        arrayList[1] = "Jai"
//
//
//    }
//
//    fun collectionsKotlin() {
//
//
//    /*
//    Collections
//    Collection there are two type
//    1.ImmutableList
//    2.mutableList
//     */
//    /*
//    1.ImmutableList - we can't add
//
//        *List -> listOf() and listOf<T>()
//        * Set -> setOf()
//        * Map -> mapOf()
//
//
//     */
//
//
//        //Stack
//        val planets = Stack<String>()
//        planets.addAll(mutableListOf("Mercury","Venus","Earth","Jupiter"))
//        println("Peek(View)  : "+planets.peek())
//        // println("Pop : "+planets.pop())
//        println("Contains(Stored or Not Stored) : "+planets.contains("Mercury"))
//        println(planets+" "+planets.size)
//
//        val planets1 = LinkedList<String>()
//        planets1.addAll(mutableListOf("Mercury","Venus","Earth","Jupiter"))
////    println("Deque : "+planets1.pop())
////    println("Deque : "+planets1.pop())
//        println("Get : "+planets1.get(1))
//        println("pollFirst : "+planets1.pollFirst())
//        println("pollFirst : "+planets1.pollFirst())
//        //   println("removeAll : "+planets1.removeAll(planets1))
//        println("planets1 : "+planets1)
//        planets1.forEach {
//            it in planets1
//            println(it)
//        }
//
//
//
//
//
////    val immutableListNames = listOf("Jai","Praveen","Boobalan","Loki","Prakash")
////
////    for (items in immutableListNames)
////    {
////        println("Name is $items")
////    }
////    val immutableSetNames = setOf(1,2,3,4,"Jai","Praveen","Boobalan","Loki","Prakash")
////
////    println("-------------")
////    for (items in immutableSetNames)
////    {
////        println("Name is $items")
////    }
////    val immutableMapNames = mapOf("name" to "Jai","name1" to "Brindha")
////
////    println("-------------")
////    for (items1 in immutableMapNames)
////    {
////        println(immutableListNames[items1])
////    }
//
//
//    }
//
//
//
//    fun oops() {
//
//
//
//
//    }
//
//    fun lists() {
//
//        //listOf is standard kotlin library functions
//
//        val fruits : List<String> = listOf("Apple","Banana","Cherry")
//        fruits.lastIndexOf("Orange")
//        println("Size of the fruits is ${fruits.size}")
//
//        fruits.forEach {
//            i->println("This is $i")
//        }
//
//
//        //MutableList
//        val fruits1 : MutableList<String> = mutableListOf("Apple","Banana","Cherry")
//        println("Size of the fruits is ${fruits.size}")
//        fruits1.add("Orange")
//
//        fruits1.forEach {
//            i->println("This is $i")
//        }
//        println(fruits1.size)
//
//
//    }
//
//    fun functions() {
//        val total = getAddition(23,3)
//        println("Total is $total")
//
//        //Overloaded functions
//        overloadedfunctions()
//
//
////
//        println("Total is ${getAddition(23,3)}")
//        showGreeting()
//        showThanks()
//    }
//
//    fun overloadedfunctions() {
//
//        showGreeting1()
//        showGreeting1("Jai",23,"Vaniyambadi")
//        showGreeting1('m')
//
//
//    }
//    fun showGreeting1()
//    {
//        println("Welcome!!!")
//    }
//    fun showGreeting1(name : String,age:Int,city:String="Ambur")
//    {
//        println("Name is $name Age is $age and City is $city")
//    }
//    fun showGreeting1(gender : Char)
//    {
//        print("Gender is $gender")
//    }
//
//    fun getAddition(num1: Int, num2: Int) = num1 + num2
//
////fun getAddition(num1: Int, num2: Int) :Int{
////    return num1+num2
////
////}
////This is the formal way
//        fun showGreeting():Unit
//        {
//        println("Welcome!")
//        }
////and this is informal way
//        fun showThanks()
//        {
//        println("Thank you")
//        }
//
//        fun classAndObjects() {
//
//
//class laptop
//{
//    var lName = ""
//    var lPrice = ""
//}
//    var laptop1 = laptop()
//    laptop1.lName = "HP Laptp"
//            print(laptop1.lName)
//
//            laptop1.lPrice = "23000"
//            print(laptop1.lPrice)
//
//            }
//
//            fun array() {
//
//
//            val array = arrayOf(1,2,3,4,5)
////    print(array[0])
////    print(array.size)
////
////
////    val array1 = Array(5) {it * 2}
////    print(array1)
//
//            for (a in array)
//            {
//            println(a)
//            }
//            }
//
//            fun con_statement() {
//
//            }
//
//            fun strings() {
//            var name1 = "Jayakumar"
//            var name2 = "Brindha"
//
//    /*variables
//    var --> value can be changed
//    val --> value cannot be changed
//
//     */
//
//            var fullName : String = "Jayakumar"
//            // fullName = "Jayakumar"
//            print(fullName)
//
//            val age1 : Int
//            age1 = 23
//            print(age1)
//
//            var input = Scanner(System.`in`)
//            var jk = input.nextInt()
//
//            var i=0
//            do {
//            print(i)
//            i++;
//            }while (i<=5)
//
//            var age : Int = 23
//            var name : String = "Name"
//
//
//
//
//
//
//
//
//
//            print(name1[0])
//            println(name2[0])
//
//            println(name1.length)
//            println(name2.length)
//            println(name1.toUpperCase())
//            println(name1.toLowerCase())
//            println(name2.toUpperCase())
//            println(name2.toLowerCase())
//            println(name1.compareTo(name2))
//            println(name1.indexOf("r"))
//            println(name1 + " " + name2)
//            println(name1.plus(" "+name2))
//
//            println("We are $name1 $name2")
//
//
//
//
//            }
//
//            fun operator() {
//            //Arithmetic Operator
//            print("Arithmetic Operator")
//            var num1 = 23
//            var num2 = 3
//            println(num1 + num2)
//            println(num1 - num2)
//            println(num1 * num2)
//            println(num1 / num2)
//            println(num1 % num2)
//            println(num1++)
//            println(num2--)
//
//            //Assignment operator
//            println("Assignment Operator")
//            var num3 = 5
//            num3 += 3
//            println(num3)
//
//            var num4 = 5
//            num4 -= 3
//            println(num4)
//
//            var num5 = 5
//            num5 -= 3
//            println(num5)
//
//            var num6 = 5
//            num6 -= 3
//            println(num6)
//
//            var num7 = 5
//            num7 -= 3
//            println(num7)
//
//            var num8 = 5
//            num8 -= 3
//            println(num8)
//
//            //Comparison Operator
//            println("Comparison Operator")
//            var x1 = 5
//            var x2 = 3
//            println(x1 == x2)
//            println(x1 != x2)
//            println(x1 > x2)
//            println(x1 < x2)
//        println(x1 >= x2)
//        println(x1 <= x2)
//
//        //Logical Operator
//        println("Logical Operator")
//        println(x1>3 && x2<4)
//        println(x1>3 || x2<2)
//
//
//
//        }
//
//        fun datatype() {
//
//        //DataType
//        print("dataType \n")
//        var myNum = 2303
//        var myDoubleNum = 23.03
//        var myLetter = 'J'
//        var myBoolean = true
//        var myText = "Hello"
//
//        print(myNum)
//        print(myDoubleNum)
//        print(myLetter)
//        print(myBoolean)
//        print(myText)
//
//        var number : Int = 23
//        print(number)
//        }
//
//        fun variable() {
//
//    /*
//
//    var = changeable
//    val = unchangeable
//
//     */
////    var age : Int
////    age=23
////    println(age)
//
//        var firstNumber = 23
//        val secondNumber = 3
//        println("First Number is $firstNumber")
//        println("Second Number is $secondNumber")
//        println("Addition of them is ${firstNumber+secondNumber}")
//        println("Subtraction of them is ${firstNumber-secondNumber}")
//        println("Multiplication of them is ${firstNumber*secondNumber}")
//        println("Division of them is ${firstNumber/secondNumber}")
//        println("Modules of them is ${firstNumber%secondNumber}")
//
//        println()
//        println("***************************")
//        firstNumber = 25
//        println("First Number is $firstNumber")
//        println("Second Number is $secondNumber")
//        println("Addition of them is ${firstNumber+secondNumber}")
//        println("Subtraction of them is ${firstNumber-secondNumber}")
//        println("Multiplication of them is ${firstNumber*secondNumber}")
//        println("Division of them is ${firstNumber/secondNumber}")
//        println("Modules of them is ${firstNumber%secondNumber}")
//
//
//
//
////    var fname : String
////    fname = "Jayakumar J"
////    println(fname)
////
////    var lastname = "Jai"
////    print(lastname)
////
////    //variable
////    var age = 22
////    var name = "Jai"
////
////    val fullname = "jayakumar"
////    println(age)
////    println(name)
////    println(fullname)
////
////    println("Name is : "+name + "\nAge is : "+age + "\nFullName is : "+fullname)
////
////    var course : String
////    course = "Kotlin"
////    println(course)
////
////
////    //Printing FullName
////    val firstname = "Jayakumar"
////    val lastName = " J"
////    val fullName = firstname + lastName
////    print(fullName)
//
//
//
//
//        }
//
//
//
//
//
//
//        */
}
