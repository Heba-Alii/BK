fun main() {
    var likeCount = 0
    var like: Float = 5.2f
    like++
    println(like)
    //------------------------------
    var isFollowing: Boolean = true
    var isFollowingText: String = isFollowing.toString()
    println(isFollowingText)
    //--------------------------------
    var friendCount: String = "317"
    var friendNum: Int = friendCount.toInt()
    friendNum++
    println(friendNum)
    println(friendCount.toInt() + 1)
    //---------------------------------
    println(220 > 120)
    println(100 + 220)
    //-------------------------------
    var length = 120
    println(length.minus(5))
    println(length.plus(5))
    //---------------------------------
    var userAge: Int = 19
    var userInfo = "User Age =${userAge + 1}"
    println(userInfo)
    //--------------------------------
    println("Enter Your Age Please!!")
    var userAger: Int = readln()!!.toInt()
    var userInfor: String = "User Age = ${userAger + 1}"
    println(userInfor)
    //---------------------------------------
    //Null Safety
    val accountId: String? = null
    println(accountId?.length)
    // ?. -> if varaiable in null print null if variable is value print this value
    // !! -> i'm sure that this vaariable contain a value not null
    // ? -> (after data type) this varible possible contain null or contain value
    //------------------------------------------
    var name: String = "heba ali ali"
    val secondWord = name.indexOf('l')
    println(name.substring(secondWord))
    //-------------------------------------------
    var userName = " heba ali ali"
    println(userName.isBlank())
    //isBlank = true if the variable is empty and return false if variable is not empty
    //--------------------------------------------
    //Conditions
    val isUserBlocked = false
    val followerCount = 320000
    if (isUserBlocked) {
        println("User Is Blocked")
    } else
        println("User is not Blocked")
    //--------------------------
    if (4 < 2) {
        println("true")
    } else {
        println("false")
    }
    //--------------------
    if (followerCount < 1000) {
        println(followerCount)
    } else if (followerCount < 1000000) {
        println("${followerCount / 1000}k")
    } else {
        println("${followerCount / 1000000}M")
    }
    //-----------------------------
    val numberOne = 200
    val numberTwo = 500
    val max = if (numberOne > numberTwo) numberOne else numberTwo
    println("Max : $max")
    //-------------------------------
    //Ranges
    val friendsCount: Int = 20
    if (friendsCount in 0..20) {
        println("lonely")
    } else if (friendsCount in 20..100) {
        println("family & friends")

    } else if (friendsCount in 100..500) {
        println("Social Person")
    } else if (friendsCount in 500..2000) {
        println("famous")
    }
    //---------------------------------------
    val myRange = 0.rangeTo(20)
    println("please enter your number !!")
    val yourNumber: Int = readln()!!.toInt()
    if (yourNumber in myRange) {
        println("$yourNumber in Range")
    } else {
        println("$yourNumber is not in range")
    }
//------------------------------------
    var wordRanges = 'a'.rangeTo('m')
    //or a..m
    println("please enter your word")
    var yourWord = readln()!!.toCharArray()[0]
    if (yourWord in wordRanges) {
        println("$yourWord is in range")
    } else {
        println("$yourWord is not in range")
    }
    //-----------------------------------
    var numbers = 0..100 step (5)
    println("Enter Number from 0 to 100")
    var youNumber = readln()!!.toInt()
    if (youNumber in numbers) {
        println("$youNumber in Range")
    } else
        println("$youNumber is not in range")
    //------------------------------------
    //When Statement
    println("Emter any number from 0 to100")
    var frientCount: Int = readln()!!.toInt()
    when (frientCount) {
        in 0..20 -> {
            println("Lonely")
        }

        in 20..50 -> {
            println("Fmily & Friends")
        }

        in 50..70 -> {
            println("Social Person")
        }

        in 70..100 -> {
            println("Famous Person")
        }
    }
    //----------------------------
    println("Enter number one or two")
    var myNumber: Int = readln().toInt()
    when (myNumber) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Your Number is $myNumber")
    }
    //----------------------------
    println("Enter any num fron 0 to 999")
    var anyNumber: Int? = readln().toInt()
    val digitCounts = when (anyNumber) {
        !in 20..40 -> "someNumbers"
        in 1..9 -> "One"
        in 10..99 -> "Two"
        in 100..999 -> "Three"
        else -> null
    }
    println(digitCounts)
    //------------------------------------
    //List
    //ListOf --> Immutable
    //mutableListOf --> Mutable List
    val friendNameList = mutableListOf("Ahmed", "Ali", "Heba")
    friendNameList[0] = "saif"
    friendNameList.add(1, "zein")
    println(friendNameList)
    //--------------------------------------
    //for loop
    for (i in 0..10) {
        println(i)
    }
    //---------------------------
    for (i in 10.downTo(0) step 2) {
        println(i)
    }
    //-------------------
    for (i in 0.rangeTo(10) step 3) {
        println(i)
    }
    for (i in 0 until friendNameList.size) {
        println(friendNameList[i])
    }
    //------------------------------
    for (element in friendNameList)
        println(element)
    //------------------------------
    friendNameList.forEach {
        println(it)
    }
    //------------------------------
    //While Statement
    var myNum = 2084
    while (myNum > 2) {
        println(myNum)
        myNum /= 2
    }
    //----------------------------
    do {
        println(myNum)
        myNum /= 2
    } while (myNum > 2)
    //---------------------------
    //Breaking Loops
    loop1@ for (i in 1..5) {
        loop2@ for (j in 1..10) {
            if (i == 2) break@loop2
            print("${i * j}\t")
        }
        print("\n")
    }
    //----------------------------
    //functions
    showLikes(likeCount)
    likeCount = like(likeCount)
    showLikes(likeCount)
    likeCount = like(likeCount)
    showLikes(likeCount)
    likeCount = disLike(likeCount)
    showLikes(likeCount)
    likeCount = like(likeCount)
    showLikes(likeCount)
    //-----------------------
    println("Function (if Even) ${ifEven(5)}")
    println("Enter Your Age :")
    println("Function (get Age State) is ${getAgeState(readln().toInt())}")
    isYounger(22, 28)
    println("Function (ifYounger) ${ifYounger(22, 28)}")
    println("Function (Say Hello): ${sayHello("Heba")}")
    println("Function (To Power): ${toPower(4, 2)}")
    println("Function(Calculate Sum)${calculateSum(1, 2)}")
    println("Function(Calculate Sum)${calculateSum(1, 2, 3)}")
    println("Function(Calculate Sum)${calculateSum("1", 2)}")
    // createUser(1, "Heba", 25, "Egypt", "Alexandria")
    createUser(
        userAge = 25,
        userName = "Heba",
        country = null,
        city = "Alex",
        userId = 5
    )
    println("Function ( palindrome)${isPalindrome("aabAA")}")
    var myFriends = listOf<String>("Heba", "Ahmed", "Ali", "Samia", "Amira")
    println("Function(get Friends Details , ${getFriendsDetails(myFriends)}")
    println("Function (getFriendsNameStartWithA${getFriendsNameStartWithA(myFriends, 'A')}")
    var products = listOf<Int>(5, 4, -3, 9, 2, 1)
    println("Function (solution)${solution(products)}")
}
//---------------------------------
//Compact Function
//fun like() {
//    likeCount++
//}
//fun like() = likeCount++
//
////fun disLike() {
////    likeCount--
////}
//fun disLike() = likeCount--
////fun getLikeDetails(): String {
////    return "like= $likeCount"
////}
//fun showLikes() {
//    println(getLikeDetails())
//}

//--------------------------------------------
//Function Argument
fun like(oldLikeCount: Int) = oldLikeCount + 1
fun disLike(oldLikeCount: Int) = oldLikeCount - 1
fun getLikeDetails(likeCount: Int) = "like = $likeCount"
fun showLikes(likeCount: Int) = println(getLikeDetails(likeCount))

//----------------------------------------------
//Mastring function
//fun ifEven(number: Int): Boolean {
//    return if (number % 2 == 0) true else false
//}
//OR
//fun ifEven(number: Int): Boolean {
//    return number % 2 == 0
//}
//OR
fun ifEven(number: Int) = number % 2 == 0
//------------------------------------------
/**
 * get Age State Function : this fun return which age state that the person entered his/her age
 *@param age this is the age of any person and should be 0 or larger integer
 * @return a string represent the age stage of person
 * @see isYounger you can use it to compare ages
 */
fun getAgeState(age: Int) =
    when (age) {
        in -1 downTo Int.MIN_VALUE -> "ما جه الدنيا لسه"
        in 0..4 -> "Baby"
        in 5..15 -> "Child"
        in 16..20 -> "Teen"
        in 21..39 -> "Adult"
        in 40..59 -> "Middle Age Adult"
        in 60..120 -> "Old"
        in 121..Int.MAX_VALUE -> "الله يرحمه"
        else -> "Wrong Value"
    }

//--------------------------------------------
fun isYounger(ageOne: Int, ageTwo: Int) =
    if (ageOne > ageTwo) {
        println("$ageOne is Younger")
    } else if (ageOne == ageTwo) {
        println("equals")
    } else {
        println("$ageTwo is younger")
    }

//-------------------------------------
fun ifYounger(ageOne: Int, ageTwo: Int) = ageOne > ageTwo

//--------------------------------------
fun sayHello(name: String = "My Friend") = "HEllo $name"

//----------------------------------------
fun toPower(number: Int = 4, power: Int = 3): Int {
    var result = number
    for (i in 1 until power) {
        result *= number
    }
    return result
}

//--------------------------------------
//Function OverLoading
fun calculateSum(num1: Int, num2: Int) = num1 + num2
fun calculateSum(num1: Int, num2: Int, num3: Int) = num1 + num2 + num3
fun calculateSum(num1: String, num2: Int) = num1.toInt() + num2

//----------------------------------------
//Named Arguments
fun createUser(userId: Int, userName: String, userAge: Int, country: String?, city: String?) =
    displayData(userId, userName, userAge, country, city)

fun displayData(userId: Int, userName: String, userAge: Int, country: String?, city: String?) {
    println(userId)
    println(userName)
    println(userAge)
    println(country)
    println(city)
}

//-------------------------------------
//Ex --->
// palindrome.
fun isPalindrome(text: String): Boolean {
    var string = StringBuilder(text)
    var rev = string.reverse().toString()
    //var res = if (text.equals(rev)) true else false
    var res = text.equals(rev, ignoreCase = true)
    return res
}

//-------------------------------
//Function With List
//return count of friends formatted in string
fun getFriendsDetails(listOfFriends: List<String>) = "You have ${listOfFriends.size} friend"

//fun getFriendsNameStartWithA(listOfMyFriends: List<String>, firstCharacter: Char): List<String> {
//var filteredFriendsList = mutableListOf<String>()
//First Answer
//    for (i in 0 until listOfMyFriends.size) {
//        if (listOfMyFriends[i].get(0) == firstCharacter) {
//            filteredFriendsList.add(listOfMyFriends[i])
//        }
//    }
//--------------------------------------
//Second Answer
//    for (friend in listOfMyFriends) {
//        if (friend.get(0) == firstCharacter) {
//            filteredFriendsList.add(friend)
//        }
//    }
//-------------------------------------
//Third Answer(For Each)
//    listOfMyFriends.forEach {
//        if (it.get(0) == firstCharacter) {
//            filteredFriendsList.add(it)
//        }
//    }
//    return filteredFriendsList
//-------------------------------------
//Fourth Answer( Filter) :(Model Answer)
fun getFriendsNameStartWithA(listOfMyFriends: List<String>, firstCharacter: Char) =
    listOfMyFriends.filter { it.get(0) == firstCharacter }

//--------------------------------------
//EX:
//Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
fun solution(inputArray: List<Int>): Int {
    var maxProduct = Int.MIN_VALUE
    for (i in 0 until inputArray.size - 1) {
        var product = inputArray[i] * inputArray[i + 1]
        if (product > maxProduct) {
            maxProduct = product
        }
    }
    return maxProduct
}
//---------------------------------------