package model

//Generic Class
//Generic out keyword
class GenericAttachment<out T : BaseFile>(var file: BaseFile) {
    fun uploadAttachment(file: BaseFile) {
        println(file)
    }

    fun downloadAttachment(): BaseFile {
        return file
    }
}
//Generic in keyword

//class GenericAttachment<in T >(var file: BaseFile) {
//    fun uploadAttachment(file: BaseFile) {
//        println(file)
//    }
//
//    fun downloadAttachment(): BaseFile {
//        return file
//    }
//}