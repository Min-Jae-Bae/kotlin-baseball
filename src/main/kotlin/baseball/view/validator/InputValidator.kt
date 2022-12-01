package baseball.view.validator

import baseball.util.*

object InputValidator {

    fun validateUserNumber(userNumber: String): String {
        require(userNumber.length == MAX_SIZE) { ERROR_INVALID_INPUT_MESSAGE }
        return userNumber
    }

    fun validateUserCommand(command: String): String {
        require(command == RETRY_COMMAND && command == QUIT_COMMAND) { ERROR_INVALID_COMMAND_MESSAGE }
        return command
    }
}

