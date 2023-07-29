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
    var max = if (numberOne>numberTwo) numberOne else numberTwo
    println("Max : $max")
    //-------------------------------
}
