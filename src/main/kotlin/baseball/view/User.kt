package baseball.view

import baseball.game.InputValidator

class User {
    // TODO: 다른 입력 예외처리
    fun createNumber(): String {
        return InputValidator.validateNumberSize(readLine()!!)
    }
}