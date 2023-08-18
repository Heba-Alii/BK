package model

class Post {
    var userName: String? = null
    var postDate: String = "18/8/2023"
    var likesCount: Int = 0
    fun likes() = likesCount++
}