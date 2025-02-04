package org.example.lesson_23

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.math.floor
import kotlin.random.Random

// (здесь код функции generateGame, generateStamp и getScore из предыдущей задачи)

class GetScoreTest {

    @Test
    fun `getScore returns initial score when offset is 0`() {
        val gameStamps = generateGame()
        assertEquals(Score(0, 0), getScore(gameStamps, 0))
    }

    @Test
    fun `getScore returns correct score for a valid offset`() {
        val gameStamps = arrayOf(
            Stamp(10, Score(1, 0)),
            Stamp(20, Score(2, 1)),
            Stamp(30, Score(3, 2))
        )
        assertEquals(Score(1, 0), getScore(gameStamps, 15))
        assertEquals(Score(2, 1), getScore(gameStamps, 20))
        assertEquals(Score(3, 2), getScore(gameStamps, 30))
    }


    @Test
    fun `getScore returns correct score for offset larger than last offset`() {
        val gameStamps = arrayOf(
            Stamp(10, Score(1, 0)),
            Stamp(20, Score(2, 1)),
            Stamp(30, Score(3, 2))
        )
        assertEquals(Score(3, 2), getScore(gameStamps, 100))
    }

    @Test
    fun `getScore returns initial score when offset is smaller than the first offset`() {
        val gameStamps = arrayOf(
            Stamp(10, Score(1, 0)),
            Stamp(20, Score(2, 1)),
            Stamp(30, Score(3, 2))
        )
        assertEquals(Score(0, 0), getScore(gameStamps, 5))
    }

    @Test
    fun `getScore handles empty gameStamps array`() {
        val gameStamps = emptyArray<Stamp>()
        assertEquals(Score(0, 0), getScore(gameStamps, 5))
    }

    @Test
    fun `getScore handles gameStamps with only one element`() {
        val gameStamps = arrayOf(Stamp(10, Score(1, 1)))
        assertEquals(Score(1, 1), getScore(gameStamps, 10))
        assertEquals(Score(0, 0), getScore(gameStamps, 5))
        assertEquals(Score(1,1), getScore(gameStamps, 100))
    }
}