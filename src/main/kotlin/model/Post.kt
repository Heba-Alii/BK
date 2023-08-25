package model

//Inheritance
open class  Post(userName:String,content:String) :BasePost(userName,content){

//Override Function
    open fun editPost() = println("Please Enter a new post")
    override fun edit() {

    }
}