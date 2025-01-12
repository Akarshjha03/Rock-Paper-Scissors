fun main() {
    println("Rock, Paper & Scissors Game!")
    println("Enter your choice: Rock, Paper, or Scissors")

    // Taking user input and ensuring it's valid
    val validChoices = listOf("Rock", "Paper", "Scissors")
    val playerChoice = readlnOrNull()?.capitalize() // Capitalize first letter for uniformity

    if (playerChoice == null || playerChoice !in validChoices) {
        println("Invalid choice! Please enter Rock, Paper, or Scissors.")
        return
    }

    // Computer's random choice
    val computerChoice = when ((1..3).random()) {
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissors"
    }

    println("Player chose: $playerChoice")
    println("Computer chose: $computerChoice")

    // Game logic to determine the winner
    when {
        playerChoice == computerChoice -> {
            println("It's a tie!")
        }
        (playerChoice == "Rock" && computerChoice == "Scissors") ||
        (playerChoice == "Paper" && computerChoice == "Rock") ||
        (playerChoice == "Scissors" && computerChoice == "Paper") -> {
            println("You win!")
        }
        else -> {
            println("You lose!")
        }
    }
}
