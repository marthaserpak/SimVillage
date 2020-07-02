fun main() {
    /*val greetingFunction = { playerName: String, numBuildings: Int ->*/
    runSimulation("Adler") { playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses.")
        "Welcome to SimVillage, $playerName" +
                " (copyright $currentYear)"
    }

    /*runSimulation("Adler", greetingFunction)*/
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..9).shuffled().last() //случайно выберет 1,2...9
    println(greetingFunction(playerName,numBuildings))

}