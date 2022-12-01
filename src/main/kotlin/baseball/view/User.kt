package baseball.view

import baseball.util.USER_INPUT_NUMBER_MESSAGE
import baseball.view.validator.InputValidator

class User {
    // TODO: 다른 입력 예외처리
    fun createNumber(): String {
        print(USER_INPUT_NUMBER_MESSAGE)
        val userNumber = readLine()!!
        return InputValidator.validateNumberSize(userNumber)
    }
}