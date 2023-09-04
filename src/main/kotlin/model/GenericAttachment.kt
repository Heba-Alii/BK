package model

//Generic Class
class GenericAttachment<T>(var file: T) {
    fun uploadAttachment(file: T) {
        println(file)
    }

    fun downloadAttachment(): T {
        return file
    }
}