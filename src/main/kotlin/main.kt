fun main(args: Array<String>) {
    val sentence = "The economy is in shambles."
    val rev = reverse(sentence)
    println("The reversed sentence is: $rev")
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring(1)) + sentence[0]
}