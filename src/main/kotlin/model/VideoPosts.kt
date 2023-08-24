package model
//Pass data to super Constructor
class VideoPosts(user: String, content: String) : Post(user, content) {
    var videoLink360: String = ""
    var videoLink720: String = ""
    var videoLink1080: String = ""
}