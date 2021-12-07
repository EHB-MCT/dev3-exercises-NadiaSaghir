class WordDeck {
    val originalWords = mutableSetOf<Word>(
        FrenchWord("nain de jardin", "tuinkabouter"  ),
        FrenchWord("canette", "blikje"),
        FrenchWord("veste", "jas"),
        FrenchWord("bouteille", "fles"),
        FrenchWord("bonnet", "muts"),
        FrenchWord("bague", "ring")
    )

    var words = originalWords

    fun filterByLanguage(language: String){
        words = words.filter { it.language == language }.toMutableSet()
    }

    fun reset() {
        words = originalWords
    }
}