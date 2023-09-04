package model

class VideoFile(fileName: String) : BaseFile(fileName) {
    fun playVideo(){
        println("Play")
    }
}