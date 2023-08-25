package model

//Pass data to super Constructor
class ImagePosts(user: String, content: String) : Post(user, content) {
    var imageLink: String = ""
    override fun editPost() {
        super.editPost()
        println("Please upload a new image")
    }

    override fun edit() {
        TODO("Not yet implemented")
    }
}