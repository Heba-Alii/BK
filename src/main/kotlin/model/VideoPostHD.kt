package model

import interfaces.EditablePost

class VideoPostHD(userName: String, content: String) : VideoPosts(userName, content) {
    var videoLink720: String = ""
    var videoLink1080: String = ""

    //    override fun editPost() {
//        super.editPost()
//        println("please upload a new video HD")
//    }
    //Protected
    fun foo() {
        videoLink360 = "2222"
    }

    override fun edit() {
        super.edit()
    }
}