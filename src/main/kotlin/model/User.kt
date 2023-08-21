package model

import CURRENT_YEAR

//Constructor
//class User(userName: String, age: Int, yearOfBirth: Int) {
//    var userName: String = userName
//    var age: Int = age
//    var yearOfBirth: Int = yearOfBirth
//    var city: String? = null
//}
//--------------------------------------------------
//class User(var userName: String, var age: Int, var yearOfBirth: Int) {
//    fun printAge() = println(age)
//}
//------------------------------------------------
//لكي اعمل اكشن معين اثناء انشاء الاوبجكت هستخدم هذا ال constructor
//class User {
//    var userName: String
//    var age: Int
//    var yearOfBirth: Int
//    var city: String? = null
//
//    constructor(userName: String, yearOfBirth: Int) {
//        this.userName = userName
//        this.yearOfBirth = yearOfBirth
//        age = CURRENT_YEAR - yearOfBirth
//    }
//}
class User(var userName: String, var yearOfBirth: Int) {
    var age: Int
    var city: String? = null

    init {
        age = CURRENT_YEAR - yearOfBirth
    }
}
