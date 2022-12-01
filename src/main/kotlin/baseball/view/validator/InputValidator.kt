package baseball.view.validator

import baseball.util.ERROR_INVALID_INPUT_MESSAGE

object InputValidator {

    fun validateNumberSize(userNumber: String): String {
        require(userNumber.length < 4) { ERROR_INVALID_INPUT_MESSAGE }
        return userNumber
    }
}

