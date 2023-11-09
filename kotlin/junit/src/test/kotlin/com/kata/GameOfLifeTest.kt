package com.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GameOfLifeTest {
    @Test
    fun testCellState() {
        val cellState = "LIVE"
        assertEquals(cellState, "LIVE")
    }
}

