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
    override fun play() {
        println("숫자 야구 게임을 시작합니다.")
        process()
    }

    // 게임 진행
    override fun process() {
        do {
            /*
            * 사용자 입력을 받는다.
            * 정답과 사용자 입력을 받아서 결과를 출력한다
            * 정답을 맞추면 종료, 재시작을 입력 받는다.
            * */
            finish()
        } while (/* 종료 코드를 받을 때 까지 반복*/ TODO())
    }

    // 게임 종료 코드 실행
    override fun quit() {
        TODO("Not yet implemented")
    }

    // 제거하고 다시 시작
    override fun retry() {
        TODO("Not yet implemented")
    }

    // 3개 다 맞췄을 때 끝
    private fun finish() {
        /*스트라이크가 3일 때
        종료 메시지를 출력한다.
        * 사용자 입력을 받고
        * 재시작 1 = retry, 종료 2 = quit*/
    }

}

