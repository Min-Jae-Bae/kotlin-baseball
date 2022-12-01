package baseball.view.validator

object InputValidator {

    fun validateNumberSize(userNumber: String): String {
        require(userNumber.length < 4) { "잘못된 값을 입력했습니다" }
        return userNumber
    }
}