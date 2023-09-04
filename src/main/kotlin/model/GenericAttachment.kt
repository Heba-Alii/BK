package model

//Generic Class
class GenericAttachment<T : BaseFile>(var file: T) {
    fun uploadAttachment(file: T) {
        println(file)
    }

    fun downloadAttachment(): T {
        return file
    }
}