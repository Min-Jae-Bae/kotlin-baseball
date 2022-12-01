package baseball.game

import baseball.game.service.Game
import baseball.model.AnswerBoard
import baseball.model.Computer
import baseball.util.*
import baseball.view.User
import baseball.view.validator.InputValidator

class Baseball(
    private val user: User,
    private val computer: Computer,
    private val answerBoard: AnswerBoard,
) : Game {
    private var gameState = PLAYING_CODE
    private var answer = computer.createAnswer()

    override fun play() {
        println(START_GAME_MASSAGE)
        process()
    }

    // 게임 진행
    override fun process() {
        do {
            val userNumber = user.createNumber()

            answerBoard.createResult(answer, userNumber)
            println(answerBoard.printResult())

            finish()
        } while (isPlaying())
    }

    private fun isPlaying(): Boolean = gameState != END_CODE

    override fun quit() {
        gameState = END_CODE
    }

    override fun retry() {
        answer = computer.createAnswer()
        answerBoard.clearState()
    }

    private fun printFinishMessage() = println(QUIT_GAME_MASSAGE + "\n" + SELECT_COMMAND_MESSAGE)

    private fun finish() {
        if (answerBoard.isThreeStrike()) {
            printFinishMessage()
            when (InputValidator.validateUserCommand(readLine()!!)) {
                RETRY_COMMAND -> retry()
                QUIT_COMMAND -> quit()
            }
        }
    }

}

