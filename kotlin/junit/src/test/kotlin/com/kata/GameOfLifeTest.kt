package com.kata

import com.kata.CellState.DEAD
import com.kata.CellState.LIVE
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

enum class CellState {
    LIVE, DEAD
}

internal class GameOfLifeTest {
    @Test
    fun testCellState_Live() {
        val cellState = LIVE
        assertEquals(cellState, LIVE)
    }

    @Test
    fun testCellState_Dead() {
        val cellState = DEAD
        assertEquals(cellState, DEAD)
    }

    @Test
    fun testCellChangeState_LiveDead() {
        val cellState = die()
        assertEquals(cellState, DEAD)
    }

    @Test
    fun testCellChangeState_DeadLive() {
        val cellState = comeAlive()
        assertEquals(cellState, LIVE)
    }

    fun comeAlive(): CellState {
        return LIVE
    }

    fun die(): CellState {
        return DEAD
    }
}
