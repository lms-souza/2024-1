import kotlin.random.Random


class CharGenerator (private val min: Char, private val max: Char) {
    fun generateChar(): Char {
        return Random.nextInt(min.toInt(), max.toInt() + 1).toChar()
    }
}