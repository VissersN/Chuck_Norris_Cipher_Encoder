//package chucknorris
//
//import java.lang.StringBuilder
//
//fun decimalToBinary(decimal: Int): String {
//    return String.format("%7s", Integer.toBinaryString(decimal)).replace(' ', '0')
//}
//
//fun main() {
//    println("Input String:")
//    val input = readln()
//    println("The result:")
//    val listBits = mutableListOf<Char>()
//    for (char in input) {
//        val charInt: Int = char.code
//        val intBin = decimalToBinary(charInt)
//        for (char in intBin) {
//            listBits.add(char)
//        }
//    }
//    listBits.add('2')
//    var repeated = 1
//    var firstBlock = "0"
//    var result = StringBuilder()
//    for (i in 0 until (listBits.size- 1)) {
//        if (listBits[i] == listBits[i + 1]) {
//            repeated++
//        } else {
//            firstBlock = if (listBits[i] == '1') "0" else "00"
//            result.append(firstBlock)
//            result.append(" ")
//            repeat(repeated) {
//                result.append('0')
//            }
//            result.append(" ")
//            repeated = 1
//        }
//    }
//    println("$result")
//}