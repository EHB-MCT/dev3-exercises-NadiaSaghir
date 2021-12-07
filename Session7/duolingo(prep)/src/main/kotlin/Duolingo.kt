class Duolingo (val roundSize: Int = 5, val language: String = "fr"){
   val wordDeck = WordDeck()

    init {
        wordDeck.filterByLanguage(language)
    }

    fun play() {
        val currentWords = wordDeck.words.shuffled().take(roundSize).toMutableSet()
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