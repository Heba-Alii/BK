package model

//Inheritance
open class Post(var userName: String, var content: String) {
    var postDate: String = "18/8/2023"
    var comments = mutableListOf<String>()
    var likesCount: Int = 0
        private set
    var commentsCount: Int = 0
        private set
        get() = comments.size

    fun likes() {
        likesCount++
        println("Hava a new Like")
    }

    fun addComment(comment: String) {
        comments.add(comment)

    }
//Override Function
    open fun editPost() = println("Please Enter a new post")
}