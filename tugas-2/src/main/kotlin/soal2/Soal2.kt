package soal2

// TODO
fun minAndMax(number: Int): Int {
    var n = number
    var min = 9
    var max = 0

    while (n > 0) {
        val digit = n % 10
        if (digit < min) {
            min = digit
        } else if (digit > max) {
            max = digit
        }
        n /= 10
    }

    return min + max
}
