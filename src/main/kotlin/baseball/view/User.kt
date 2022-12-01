package baseball.view

import baseball.view.validator.InputValidator

class User {
    // TODO: 다른 입력 예외처리
    fun createNumber(): String {
        print("숫자를 입력해주세요: ")
        val userNumber = readLine()!!
        return InputValidator.validateNumberSize(userNumber)
    }
}