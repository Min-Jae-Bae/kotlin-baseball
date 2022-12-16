package baseball.view

import baseball.util.USER_INPUT_NUMBER_MESSAGE
import baseball.view.validator.InputValidator

class User {
    fun createNumber(): String {
        print(USER_INPUT_NUMBER_MESSAGE)
        val userNumber = readLine()!!
        return InputValidator.validateUserNumber(userNumber)
    }
}