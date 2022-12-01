package baseball

import baseball.view.validator.InputValidator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InputTest {
    @Test
    fun `입력 길이가 3보다 클때`() {
        assertThrows<IllegalArgumentException> { InputValidator.validateUserNumber("1234") }
    }

    @Test
    fun `입력 1, 2가 아닐때 예외`() {
        assertThrows<IllegalArgumentException> { InputValidator.validateUserCommand("3") }
    }
}