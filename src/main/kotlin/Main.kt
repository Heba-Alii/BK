import interfaces.EditablePost
import interfaces.Listener
import javafx.geometry.Pos
import model.*
import problemSolving.ProblemSolvingExamples
import java.security.Key
import java.util.Date
import javax.jws.soap.SOAPBinding.Use
import kotlin.random.Random

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

    var statues = listOf<Int>(6, 2, 3, 8)
    var problem = ProblemSolvingExamples()
    println("Function(Statues)${problem.statues(statues)}")
    println("Lambda Function ${myFunction(2, 6)}")
    println("Lambda Function 2=${myFunction2(5, 5)}")
    myFuction3()
    //val finalResult = doOperation(5, 5, { no1: Int, no2: Int -> no1 * no2 })
    val finalResult = doOperation(5, 5, ::sum)
    println(finalResult)
    var solution = mutableListOf<Int>(1, 2, 3, 2, 2)
    val re = sequences(solution)
    println(re)
    var myPost = Post("Heba", "Hello World")
    var postOfMyFriend = Post("Heba", "Hello World")
    println("my Post Likes =${myPost.likesCount} && my Friend Post Likes = ${postOfMyFriend.likesCount}")
    myPost.likes()
    myPost.likes()
    postOfMyFriend.likes()
    println("my Post Likes =${myPost.likesCount} && my Friend Post Likes = ${postOfMyFriend.likesCount}")
    var firstUser = User(yearOfBirth = 1997, userName = "Heba", city = "Alexandria")
    var secondUser = User(yearOfBirth = 1994, userName = "Ahmed", city = "Alexandria")
    //firstUser.age=3000
    println("Total Users  =${User.totaluserCount}")
    println("Your Current Age = ${firstUser.age}")
    println("Your Name = ${firstUser.userName}}")
    //لا احتاج الي انشاء اوبجكت من نوع Settings لانه Singleton
    println(Settings.language)
    Settings.changeLanguageToEnglish()
    println(Settings.language)
    Settings.logOut(secondUser)

    var posts = ImagePosts("Heba", "Hello World")
    posts.likes()
    posts.likes()
    posts.imageLink = "Heba Ali"
    // posts.editPost()
    posts.printImageLink()
    println("you hava ${posts.likesCount} Likes")

    var newPost = Post("Heba", "Hello World")
    newPost.addComment("What")
    newPost.addComment("Wow")
    newPost.addComment("ok")
    println("You Have ${newPost.commentsCount} Comment")
    newPost.editPost()

    var postThree = VideoPostHD("heba", "Hello")
    postThree.toString()
    var myName: String = "Heba Ali"
    myName.printTriple()
    //postThree.editPost()
    //The Beautiful of Polymorphism
    var post1: ImagePosts = ImagePosts("Heba", "HelloWorld")
    var post2: VideoPostHD = VideoPostHD("Ali", "Watch this")
    printPostsDetails(post1)
    printPostsDetails(post2)
    var listsOfPost = mutableListOf<BasePost>()
    listsOfPost.add(post1)
    listsOfPost.add(post2)
    println(listsOfPost.size)
    //Type casting
    var post_1: ImagePosts = ImagePosts("Heba", "Hello")
    var post_2: Post = Post("Heba", "Hello")
    post_1.imageLink = "WWW.heba.com"
    post_2.likesCount
    printImageLink(post_1)
    printImageLink(post_2)
    //interface
    editPosts(post_2)

    //Anonymous Object
//    object:EditablePost{
//        override fun edit() {
//        }
//    }
    val myEditableObject = object : EditablePost {
        override fun edit() {
        }
    }
    //OR
    editPosts(myEditableObject)
    editPosts(object : EditablePost {
        override fun edit() {
        }
    })
    //data class
    //تصنع override لل fun مباشرة
    var user1 = User("Heba", 1997, "Alex")
    var user2 = User("Ahmed", 2003, "Alex")
    var user3 = User("Heba", 1997, "Alex")
    println(user1.toString())
    println(user1.equals(user3))
    //Sealed Class
    var myStatus = Success(listOf(post1))
    getStatusType(myStatus)
    //Inner class
    var outerPost = Post("Heba", "Hello Outer class")
    println(outerPost.postHeader)
    outerPost.InnerPost().innerPostFun()
    println(outerPost.postHeader)
    //Use Java In Kotlin
    val date = Date()
    println(date)
    val test = JavaTest("Heba")
    println(test.name)
    //SAM
    //First Way
    val image = Image()
    val control = Controller()
    image.setOnTouch(control)
    //second Way
    //Anonymous object
    image.setOnTouch(object : Listener {
        override fun onTouch() {
            TODO("Not yet implemented")
        }
    })
    //Third Way (Single Abstract Method)SAM
    //Lambda and higher order function
    image.setOnTouch {
        //ImplementFunction
    }
    //Generic Functions<T>
    printTwice<Int>(5)
    printTwice<String>("Hello")
    //OR
    printTwice(8)
    printTwice("Hello")
    println(pickRandom("Heba", 5, 5.55))
    //Multi Types in generic function
    foo("Heba", 9)
    //Generic Class
    val myAttachment = GenericAttachment<BaseFile>(BaseFile("Heba"))
    myAttachment.uploadAttachment(BaseFile("aaaa"))
    myAttachment.downloadAttachment()
    //Bounded Generic
    val videoAttachment = GenericAttachment<VideoFile>(VideoFile("video"))
    val pdfAttachment = GenericAttachment<PdfFile>(PdfFile("pdf"))
    //videoAttachment.file.playVideo()
    //Polymerphism
    val myAttachmentTwo = AttachmentTwo(VideoFile("heba video"))
    (myAttachmentTwo.file as VideoFile).playVideo()
    val myAttachmentTwoPdf = AttachmentTwo(PdfFile("heba pdf"))
    //لازم اعمل casting
    (myAttachmentTwoPdf.file as PdfFile).gotoPage(3)
    //Generic out keyword
    //بسبب كلمة out قدرت امرر ال attach للفانكشن doSomeThing رغم انها بتاخد BaseFile
    val attach = GenericAttachment<VideoFile>(VideoFile("My File"));
    val myVideo: BaseFile = VideoFile("name")
    doSomething(myVideo)
    doSomeThing(attach)
    //Generic in keyword
    //val inAttachment: GenericAttachment<VideoFile> = GenericAttachment<BaseFile>(BaseFile("file"))
    //inDoSOmeThing(inAttachment)


    //Standard Library Scope Function(Apply)
    var comment = Comment().apply {
        likeCount
        disLikeCount
        time = 5
        like()
        disLike()
    }
    //let scope function
    val mComment2 = Comment().let {
        it.likeCount++
        it.content = "me"
        it.like()
    }
//    val mComment3: Comment? = null
//    mComment3?.likeCount
//    mComment3?.content = "lll"
//    mComment3?.like()

    val mComment3: Comment? = null
    mComment3?.let {
        it.likeCount++
        it.content = "comment"
        it.like()
    }
    //also scope function
    val mComment4: Comment = Comment().also {
        it.like()
    }
    println("also like count:${mComment4.likeCount}")
    //With scope function
    with(mComment4) {
        this.content = "ali"
        this.like()
        this.likeCount++
        this.like()
    }
    //run scope function
    val mComment5: Comment = Comment()
    mComment5.run {
        content = "hi"
        like()
        like()
    }
    //TakeIf
    mComment5.takeIf {
        it.likeCount > 0
    }
        ?.let { println(it) }
    //TakeUnless
    mComment4.takeUnless {
        it.likeCount > 0
    }
        ?.let { println(it) }
    //LateInit
    var content = Comment()
    content.content = "Hello"
    content.showContent()
    //Lazy Init
    val mcomment6: Comment by lazy { Comment() }
    mcomment6.content = "Hi heba"
    mcomment6.showContent()
    //EX Lazy Init
    var no = 5
    val duplicatedNumber: Int by lazy { no * 2 }
    no = 8
    println(duplicatedNumber)
    no = 2
    println(duplicatedNumber)
    //Collections(List , set , map)
    val stickerList = mutableListOf<String>("Happy", "Sad", "Smile")
    val stickerSet = mutableSetOf<String>("Happy", "Sad", "Smile", "Happy", "Sad")
    val stickerMap = mutableMapOf<String, Int>("Happy" to 1, "smile" to 2, "sad" to 3)
    stickerList.add("No_Reaction")
    stickerSet.add("No_Reaction")
    stickerMap.put("No_Reaction", 4)
    println("Sticker List :$stickerList")
    println("Sticker Set :$stickerSet")
    println("Sticker Map :$stickerMap")
    stickerSet.remove("sad")
    println(stickerSet)
    println(stickerList[2])
    println(stickerMap["smile"])
    //reversed
    val reversedStickerList = stickerList.reversed()
    println(stickerList.reversed())
    println(stickerList)
    println(reversedStickerList)
    //Traverse
    //to loap for all items
    //Step one(for)
    for (i in stickerList.indices) {
        println(stickerList[i])
    }
    //step two(forEach)
    stickerList.forEach {
        println(it)
    }
    //or(forEachIndexed )
    stickerSet.forEachIndexed { index, s ->
        println("[$index]=$s")
    }
    //Traverse Iterator(While)
    val listIterator = stickerList.iterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    val mapIterator = stickerMap.iterator()
    while (mapIterator.hasNext()) {
        println(mapIterator.next().key)
    }
    //non homogeneous
    val list = listOf("hey", 2, 5, null, 9.5, null)
    println(list)
    val set = setOf("heba", 5, 8, 5.5, 8, null, "Heba")
    println(set)
    //Multi Dimension
    val list2 = listOf<List<Int>>(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    println(list2)
    val set2 = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 10))
    println(set2)

    val stickerList2 = listOf<String>("sad", "smile", "happy", "sick", "crying", "no_reaction")
    val filterdList = startedWith(stickerList2, 's')
    println(filterdList)
    val filteredStickerList = stickerList2.filter { it[0] == 's' }
    println(filteredStickerList)
    //Filter Function
    val myFilterList = stickerList2.myFilter({ it[0] == 's' })
    println(myFilterList)
    //lambda
    println(lambdaFunction(5, 6))
    println(myLambdaFunction(6, 8))
    noReturnFunction()
    println(doOperation2(5, 8, { no1: Int, no2: Int -> no1 * no2 }))
    println(doOperation2(5, 5, ::sum2))
    //lambda function in another function called doOperation3
    val finalResult2 = doOperation3 { num1: Int, num2: Int -> num1 * num2 }
    println(finalResult2)
    println(stickerList2.myListFilter { it[0] == 'h' })
    //Filter Not
    println(stickerList2.filterNot { it[0] == 's' })
    println(stickerList2.filterNot { it.length == 5 })
    //Find
    println(stickerList2.find { it.length == 5 })
    var stickerResult = stickerList2.find { it[1] == 'a' }
    println(stickerResult)
    //Find Last
    println(stickerList2.findLast { it[it.length - 1] == 'y' })
    println(stickerList2.findLast { it.length == 4 })
    //Transformation List
    //Map
    val transformedList = stickerList2.map { it.toUpperCase() }
    println(transformedList)
    //Filter&Map
    val transformedList2 = stickerList2.map { it.toUpperCase() }.filter { it[0] == 'S' }
    println(transformedList2)
    //FlatMap (To convert list from two dimension to one list)
    val threeList = listOf<List<Int>>(listOf(1, 2, 3), listOf(4, 5, 6), listOf(8, 9, 10))
    val flatList = threeList.flatMap { it }
    println(threeList)
    println(flatList)
    //Flatten() == FlatMap{it}
    val flatList2 = threeList.flatten()
    println(flatList2)
    //Plus and minus
    val numbersList = listOf("One", "Two", "Three", "Four", "Five", "Six")
    println(numbersList + listOf("seven", "eight"))
    println(numbersList - listOf("Two", "One"))
    //Group By
    println(numbersList.groupBy { it.first().toUpperCase() })
    //slice
    println(numbersList.slice(1..5))
    println(numbersList.slice(1..5 step 2))
    //Take and drop
    println(numbersList.take(5))
    println(numbersList.takeLast(5))
    println(numbersList.drop(5))
    println(numbersList.dropLast(5))
    //Sorted by
    println(numbersList.sortedBy { it.length })
    //reversed
    println(numbersList.reversed())
    //random order
    println(numbersList.shuffled())
    //retrieve List Part
    val numbersList2 = (0..13).toList()
    println(numbersList2.subList(2, 8))
    //Linear search
    println(numbersList.indexOf("Three"))
    println(numbersList.lastIndexOf("Five"))
    //set-specific operation
    println(numbersList union setOf("Nine", "Ten"))
    println(numbersList intersect setOf("Two", "One"))
    //Map
    val mapNumbers = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3,
        "key4" to 4,
        "key5" to 5,
        "key6" to 6,
        "key7" to 7,
        "key8" to 8,
        "key9" to 9,
        "key10" to 10,
        "key11" to 11,
        "key12" to 12
    )
    println(mapNumbers.filter { (key, value) -> key.endsWith("1") && value > 10 })
    println(mapNumbers + Pair("key13", 13))
    println(mapNumbers - ("key10"))
    println(mapNumbers + mapOf("Key 14" to 14))
    //Error Handling
    //Try & Catch
    val useAge = "26"
    try {
        println("Your Birthday : ${calculateBirth(useAge.toInt())}")
    } catch (e: Exception) {
        println(e.message)
    }
    println("Program is continue")
    //Let Scope Function(To resolve errors and exceptions) to know number int or not
    //it -> refer to useAge
    useAge.toIntOrNull()?.let { println("Your Birthday is:${calculateBirth(it)}") }
    println("Program is continue")
    var problemSolving = ProblemSolvingExamples()
    println(problemSolving.solution5(123421))
    var solurion8=ProblemSolvingExamples()

    var list5= mutableListOf<Int>(50,60,60,45,70)
    println(solurion8.solution8(list5))
}
//---------------------------------
//Functions
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
//Mastering function
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

//Lambdas
//هي عباره عن فانكشن ليس لها اسم واخر سطر منها هو الreturn
val myFunction = { no1: Int, no2: Int ->
    no1 + no2
}

//or
val myFunction2: (Int, Int) -> Int = { no1, no2 ->
    no1 + no2
}

//لو مش بتاخد parameters ولا بتؤجع حاجه
//Unit معناها مش بترجع حاجه
val myFuction3: () -> Unit = {
    print("Hello Lambda")
}

//-----------------------------------
//Higher Order Function
fun doOperation(no1: Int, no2: Int, myFunction: (Int, Int) -> Int): Int {
    val result = myFunction(no1, no2)
    return result
}

fun sum(num1: Int, num2: Int) = num1 * num2

//val mutiply: (Int, Int) -> Int = { no1, no2 ->
//    no1 * no2
//}
//------------------------------------
//sequence of integers as an array
fun sequences(sequence: MutableList<Int>): Boolean {
    var count = 0

    for (i in 1 until sequence.size) {
        if (sequence[i] <= sequence[i - 1]) {
            count++
            if (count > 1) {
                return false
            }
            if (i == 1 || sequence[i] > sequence[i - 2]) {
                sequence[i - 1] = sequence[i]
            } else {
                sequence[i] = sequence[i - 1]
            }
        }
    }
    return true
}

//-----------------------------------
//Extension Function
fun String.printTriple() {
    for (i in 1..3) {
        println(this)
    }
}

fun ImagePosts.printImageLink() {
    println(this.imageLink)
}

//--------------------------------
//The Beautiful of Polymorphism
fun printPostsDetails(mPost: BasePost) {
    println(mPost.content)
}

//---------------------------------
//Type casting
fun printImageLink(mPost: BasePost) {
    when (mPost) {
        is ImagePosts -> {
            println(mPost.imageLink)
        }

        is VideoPostHD -> {
            println(mPost.videoLink1080)
        }

        is Post -> {
            println("No Link")
        }
    }
}

//------------------------------------
//Interface
fun editPosts(editablePost: EditablePost) {
    println("This post is editable")
}

//------------------------------------
//Sealed Class
fun getStatusType(status: Status): String {
    return when (status) {
        is Fail -> "fail"
        is Loading -> "Loading"
        is Success -> status.list.toString()
    }

}

//-------------------------------
//Generic Functions <T>
//fun printTwice(x: Int) {
//    for (i in 1..2) {
//        println(x)
//    }
//}
//
//fun printTwice(x: String) {
//    for (i in 1..2) {
//        println(x)
//    }
//}
fun <T> printTwice(x: T) {
    for (i in 1..2) {
        println(x)
    }
}

fun <T> pickRandom(a: T, b: T, c: T): T {
    val random = Random.nextInt(3)
    return when (random) {
        0 -> a
        1 -> b
        else -> c
    }
}

//----------------------------
//Multi Types in generic function
fun <T, V> foo(a: T, b: V) {
    println(a.toString() + b.toString())
}

//---------------------------
//Generic out keyword

fun doSomething(file: BaseFile) {

}

fun doSomeThing(attachment: GenericAttachment<BaseFile>) {

}

//Generic in keyword
fun inDoSOmeThing(inAttachment: GenericAttachment<VideoFile>) {

}

//-----------------------------------
//Filter Function(High order Function)
fun startedWith(list: List<String>, char: Char): List<String> {
    var newList = mutableListOf<String>()
    list.forEach {
        if (it[0] == char) {
            newList.add(it)
        }
    }
    return newList

}

fun <T> List<T>.myFilter(function: (s: T) -> Boolean): List<T> {
    val newList = mutableListOf<T>()
    this.forEach {
        if (function(it)) {
            newList.add(it)
        }
    }
    return newList
}

//-------------------------------------------
//Lambda or anonymous function
val myLambdaFunction =
    { no1: Int, no2: Int ->
        no1 + no2

    }

//or
val lambdaFunction: (Int, Int) -> Int = { no1, no2 ->
    no1 + no2
}
val noReturnFunction: () -> Unit = {
    println("Hello lambda")
}

//Higher order function
fun doOperation2(no1: Int, no2: Int, myFunction: (Int, Int) -> Int): Int {
    var result = myFunction(no1, no2)
    return result
}

//or
//compact function
fun sum2(num1: Int, num2: Int) =
    num1 + num2

//or
fun doOperation3(myFuction: (Int, Int) -> Int): Int {
    var result = myFuction(2, 5)
    return result
}

//-----------------------------
fun List<String>.myListFilter(function2: (s: String) -> Boolean): List<String> {
    val newList2 = mutableListOf<String>()
    this.forEach {
        if (function2(it)) {
            newList2.add(it)
        }
    }
    return newList2
}
//---------------------------------------------
//fun calculateBirth(input: Int) :Int{
//    return 2021-input
//}

//or
fun calculateBirth(input: Int) = 2021 - input

//----------------------------------------------
