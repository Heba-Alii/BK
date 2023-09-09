package model

//Standard Library Scope Function(Apply)
class Comment {
    var content: String? = null
    var time: Int? = 0
    var likeCount: Int = 0
    var disLikeCount: Int = 0
    fun like() {
        likeCount++
        println(" Like Count:$likeCount")
    }

    fun disLike() {
        disLikeCount++
        println("disLike Count:$disLikeCount")
    }

    override fun toString(): String {
        return "$content,$likeCount,$disLikeCount"
    }
}
