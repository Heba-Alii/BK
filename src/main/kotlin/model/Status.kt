package model

//Sealed Class
sealed class Status
class Success(var list: List<Post>) : Status()
class Loading : Status()
class Fail : Status()
