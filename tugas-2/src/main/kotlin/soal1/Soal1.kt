package soal1
// TODO
fun sumOfBigThree(numbers: List<Int>): Int {
    val arr = IntArray(numbers.size)

    var i = 0
    while (i < numbers.size) {
        arr[i] = numbers.get(i)
        i++
    }

    i = 0
    while (i < arr.size - 1){
        var j = 0
        while (j < arr.size - i - 1){
            if (arr[j] < arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
            j++
        }
    i++
    }

    var total = 0
    var batas = 3
    if (arr.size < 3){
        batas = arr.size
    }

    i = 0
    while (i < batas) {
        total += arr[i]
        i++
    }

    return total
}
