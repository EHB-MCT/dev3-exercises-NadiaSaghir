class Hero(override val name: String) :Person(name){
    fun talk(){
        println("how can i help you?")
    }
}