package model

//Constructor
//class User(userName: String, age: Int, yearOfBirth: Int) {
//    var userName: String = userName
//    var age: Int = age
//    var yearOfBirth: Int = yearOfBirth
//    var city: String? = null
//}
class User(var userName: String, var age: Int, var yearOfBirth: Int) {
    fun printAge() = println(age)
}