package baseball

import baseball.game.InputValidator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InputTest {
    @Test
    fun `입력 길이가 3보다 클때`() {
        assertThrows<IllegalArgumentException> { InputValidator.validateNumberSize("1234") }
    }
}