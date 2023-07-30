fun main() {
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
}