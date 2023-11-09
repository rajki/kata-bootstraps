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
        var cellState = LIVE
        cellState = DEAD
        assertEquals(cellState, DEAD)
    }

    @Test
    fun testCellChangeState_DeadLive() {
        var cellState = DEAD
        cellState = LIVE
        assertEquals(cellState, LIVE)
    }
}
