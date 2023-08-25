package model

//Pass data to super Constructor
open class VideoPosts(user: String, content: String) : Post(user, content) {
    var videoLink360: String = ""
    override fun editPost() {
        super.editPost()
        println("Please upload a new video")
    }
}