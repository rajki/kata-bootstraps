package com.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameOfLifeTest {
    @Test
    fun testCellState_Live() {
        val cellState = "LIVE"
        assertEquals(cellState, "LIVE")
    }

    @Test
    fun testCellState_Dead() {
        val cellState = "DEAD"
        assertEquals(cellState, "DEAD")
    }

    @Test
    fun testCellChangeState_LiveDead() {
        var cellState = "LIVE"
        cellState = "DEAD"
        assertEquals(cellState, "DEAD")
    }

    @Test
    fun testCellChangeState_DeadLive() {
        var cellState = "DEAD"
        cellState = "LIVE"
        assertEquals(cellState, "LIVE")
    }
}
