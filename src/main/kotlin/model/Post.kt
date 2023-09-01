package model

import interfaces.EditablePost

//Inheritance
open class Post(userName: String, content: String) : BasePost(userName, content), EditablePost {

    //Override Function
    open fun editPost() = println("Please Enter a new post")
    override fun edit() {

    }

    var postHeader: String = "Header In Outer Class"

    //Nested or Inner class
    inner class InnerPost {
        fun innerPostFun() {
            println("Hello Inside")
            postHeader = "Header in inner class"
        }
    }
}