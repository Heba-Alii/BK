package model

class VideoPostHD(userName: String, content: String) : VideoPosts(userName, content) {
    var videoLink720: String = ""
    var videoLink1080: String = ""
//    override fun editPost() {
//        super.editPost()
//        println("please upload a new video HD")
//    }
}