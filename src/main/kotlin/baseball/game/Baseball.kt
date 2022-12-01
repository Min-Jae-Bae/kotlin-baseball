package baseball.game

import baseball.game.service.Game
import baseball.model.AnswerBoard
import baseball.model.Computer
import baseball.view.User

class Baseball(
    private val user: User,
    private val computer: Computer,
    private val answerBoard: AnswerBoard
) : Game {
    private var gameState = 1
    private var answer = computer.createAnswer()

    override fun play() {
        println("숫자 야구 게임을 시작합니다.")
        process()
    }

    // 게임 진행
    override fun process() {
        do {
            /* 정답과 사용자 입력을 받아서 결과를 출력한다*/
            val userNumber = user.createNumber()

            finish()
        } while (isPlaying())
    }

    private fun isPlaying(): Boolean = gameState != 2

    override fun quit() {
        gameState = 2
    }

    // 제거하고 다시 시작
    override fun retry() {
        TODO("Not yet implemented")
    }

    // 3개 다 맞췄을 때 끝
    private fun finish() {
        /*스트라이크가 3일 때*/

        if (/*스트라이크가 3일 때*/TODO()) {
            println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
            println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")

            // TODO: 1, 2이외의 숫자 예외처리
            when (readLine()) {
                "1" -> retry()
                "2" -> quit()
            }
        }
    }

}

