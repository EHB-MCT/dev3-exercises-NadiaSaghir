class Duolingo {
    val words = mutableListOf<Word>(
        Word("nain de jardin", "tuinkabouter", "fr"),
        Word("canette", "blikje", "fr")
    )

    fun play() {
        val currentWords = words.shuffled().take(5).toMutableSet()
        println(currentWords.count())

        while (currentWords.isNotEmpty()) {
            val selectWords = currentWords.random()
            println("what's the translation of ${selectWords.original}")
            val userAnswer = readLine()

            if (selectWords.translated == userAnswer) {
                currentWords.remove(selectWords)
            }

            println(currentWords.count())
        }
    }
}