package soal3

// TODO
fun getMiddleCharacters(string: String): String {
    val slen = string.length
    val tengah = slen/2
    return if (slen % 2 != 0){
        string.substring(tengah, tengah+1)
    } else {
        string.substring(tengah-1, tengah+1)
    }
}