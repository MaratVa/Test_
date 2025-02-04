package org.example.lesson_23

import kotlin.math.floor
import kotlin.random.Random

data class Score(val home: Int, val away: Int)
data class Stamp(val offset: Int, val score: Score)

fun generateGame(): Array<Stamp> {
    val stamps = Array(TIMESTAMPS_COUNT) { _ -> Stamp(0, Score(0, 0)) }
    var currentStamp = stamps[0]
    for (i in 1 until TIMESTAMPS_COUNT) {
        currentStamp = generateStamp(currentStamp)
        stamps[i] = currentStamp
    }
    return stamps
}

fun generateStamp(previousValue: Stamp): Stamp {
    val scoreChanged = Random.nextFloat() > 1 - PROBABILITY_SCORE_CHANGED
    val homeScoreChange = if (scoreChanged && Random.nextFloat() > 1 - PROBABILITY_HOME_SCORE) 1 else 0
    val awayScoreChange = if (scoreChanged && homeScoreChange == 0) 1 else 0
    val offsetChange = (floor(Random.nextFloat() * OFFSET_MAX_STEP) + 1).toInt()

    return Stamp(
        previousValue.offset + offsetChange,
        Score(
            previousValue.score.home + homeScoreChange,
            previousValue.score.away + awayScoreChange
        )
    )
}

fun getScore(gameStamps: Array<Stamp>, offset: Int): Score {
    for (i in gameStamps.size - 1 downTo 0) {
        if (gameStamps[i].offset <= offset) {
            return gameStamps[i].score
        }
    }
    return Score(0, 0)
}

fun main() {
    val gameStamps = generateGame()

    val offset = 1000
    val scoreAtOffset = getScore(gameStamps, offset)
    println("Счёт на смещении $offset: ${scoreAtOffset.home}:${scoreAtOffset.away}")

    val earlyOffset = 0
    val scoreAtEarlyOffset = getScore(gameStamps, earlyOffset)
    println("Счёт на смещении $earlyOffset: ${scoreAtEarlyOffset.home}:${scoreAtEarlyOffset.away}")

    val largeOffset = 100000
    val scoreAtLargeOffset = getScore(gameStamps, largeOffset)
    println("Счёт на смещении $largeOffset: ${scoreAtLargeOffset.home}:${scoreAtLargeOffset.away}")
}

const val TIMESTAMPS_COUNT = 50000
const val PROBABILITY_SCORE_CHANGED = 0.0001
const val PROBABILITY_HOME_SCORE = 0.45
const val OFFSET_MAX_STEP = 3