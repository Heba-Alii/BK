package model

class PdfFile(fileName: String) : BaseFile(fileName) {
    fun gotoPage(page: Int) {
        println(page)
    }
}