package baseball.model

import baseball.util.*


class AnswerBoard {
    // 상태를 모두 아웃으로 초기화
    private val stateList = MutableList(MAX_SIZE) { BaseballState.OUT }


    private fun createCount(): Triple<Int, Int, Int> {
        var strikeCount = 0
        var ballCount = 0
        var outCount = 0

        stateList.forEach { state ->
            when (state) {
                BaseballState.STRIKE -> strikeCount++
                BaseballState.BALL -> ballCount++
                BaseballState.OUT -> outCount++
            }
        }
        return Triple(strikeCount, ballCount, outCount)
    }

    fun createResult(answer: String, userNumber: String) {
        answer.forEachIndexed { answerIndex, answerNumber ->
            if (answerNumber == userNumber[answerIndex]) {
                stateList[answerIndex] = BaseballState.STRIKE
            }
            if (answerNumber != userNumber[answerIndex] && answer.contains(userNumber[answerIndex])) {
                stateList[answerIndex] = BaseballState.BALL
            }
            if (answerNumber != userNumber[answerIndex] && !answer.contains(userNumber[answerIndex])) {
                stateList[answerIndex] = BaseballState.OUT
            }
        }
    }

    fun printResult(): String {
        val (strikeCount, ballCount, outCount) = createCount()
        var message = ""

        // 아웃일 때 출력
        if (outCount == stateList.size) message = "낫싱"
        // 스트라이크일때 출력
        if (ballCount == 0 && strikeCount != 0) message = PRINT_STRIKE_MESSAGE.format(strikeCount)
        // 볼일때 출력
        if (ballCount != 0 && strikeCount == 0) message = PRINT_BALL_MESSAGE.format(ballCount)
        // 스트라이크 볼일 때
        if (ballCount != 0 && strikeCount != 0) message = PRINT_STRIKE_BALL_MESSAGE.format(ballCount, strikeCount)

        return message
    }

    fun isThreeStrike(): Boolean = stateList.all { state -> state == BaseballState.STRIKE }

    fun clearState() = stateList.replaceAll { BaseballState.OUT }
}
