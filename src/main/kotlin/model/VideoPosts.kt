package model

import interfaces.EditablePost

//Pass data to super Constructor
open class VideoPosts(user: String, content: String) : BasePost(user, content), EditablePost {
    protected var videoLink360: String = ""

//    override fun editPost() {
//        super.editPost()
//        println("Please upload a new video")
//    }

    override fun edit() {
        TODO("Not yet implemented")
    }
}