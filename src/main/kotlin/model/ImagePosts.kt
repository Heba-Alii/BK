package model
//Pass data to super Constructor
class ImagePosts(user: String, content: String) : Post(user, content) {
    var imageLink: String = ""
}