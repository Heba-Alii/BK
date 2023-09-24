package problemSolving

class ProblemSolvingExamples {
    //Multi Dimension Example

    //After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
//
//Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
//
//Example
//
//For
//
//matrix = [[0, 1, 1, 2],
//[0, 5, 0, 0],
//[2, 0, 3, 3]]
//the output should be
//solution(matrix) = 9.
//-------------------------------------------------------
    fun solution(matrix: MutableList<MutableList<Int>>): Int {
        val rows = matrix.size
        val cols = matrix[0].size
        var totalSum = 0
        for (col in 0 until cols) {
            var hauntedEncountered = false
            for (row in 0 until rows) {
                if (hauntedEncountered) {
                    matrix[row][col] = 0
                } else {
                    totalSum += matrix[row][col]
                }
                if (matrix[row][col] == 0) {
                    hauntedEncountered = true
                }
            }
        }
        return totalSum
    }

//OR

    fun solutions(matrix: MutableList<MutableList<Int>>): Int {
        var sum = 0
        for (i in 0..matrix[0].size - 1)
            for (j in 0..matrix.size - 1)
                if (matrix[j][i] == 0)
                    break
                else
                    sum += matrix[j][i]
        return sum
    }

    //-----------------------------------
    //Longest Strings in array
    // Given an array of strings, return another array containing all of its longest strings.
    fun longestArray(inputArray: MutableList<String>): MutableList<String> {
        var maxLength = 0
        var newList = mutableListOf<String>()
        for (str in inputArray) {
            var strLength = str.length
            if (strLength > maxLength) {
                maxLength = strLength
                newList.clear()
                newList.add(str)
            } else if (strLength == maxLength) {
                newList.add(str)
            }

        }
        return newList
    }

    //----------------------------------------------------------
    //  Given two strings, find the number of common characters between them.
    fun solution(s1: String, s2: String): Int {
        var charSet1 = s1.toSet()
        var charSet2 = s2.toSet()
        var commonCharacter = charSet1.intersect(charSet2)
        return commonCharacter.size
    }

    //Or
    fun solution2(s1: String, s2: String): Int {
        var commonCharacter = mutableListOf<Char>()
        var commonCount: Int = 0


        for (char in s1) {
            if (char in s2 && char !in commonCharacter) {
                commonCount++
                commonCharacter.add(char)
            }
        }
        return commonCount
    }

    //or
    fun solution3(s1: String, s2: String): Int {
        val charCount = IntArray(26) // Assuming only lowercase letters

        // Count the characters in s1
        for (char in s1) {
            charCount[char - 'a']++
        }

        var commonCount = 0

        // Check and count the characters in s2
        for (char in s2) {
            if (charCount[char - 'a'] > 0) {
                commonCount++
                charCount[char - 'a']--
            }
        }

        return commonCount
    }
    //--------------------------------------------
}
