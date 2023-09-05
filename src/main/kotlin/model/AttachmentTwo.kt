package model

//Not generic
class AttachmentTwo(var file: BaseFile) {
    fun uploadFile(file: BaseFile) {
    }

    fun downloadFile(): BaseFile {
        return file
    }
}