package baseball

import baseball.game.Baseball
import baseball.model.AnswerBoard
import baseball.model.Computer
import baseball.view.User

fun main() {

    val baseball = Baseball(User(), Computer(), AnswerBoard())
    baseball.play()
}
