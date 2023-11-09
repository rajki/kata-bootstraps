package com.kata

import com.kata.CellState.DEAD
import com.kata.CellState.LIVE
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class GameOfLifeTest {
    @Nested
    internal inner class CellTest {
        @Test
        fun testCellState_Live() {
            val cell = Cell(LIVE)
            assertEquals(cell.state, LIVE)
        }

        @Test
        fun testCellState_Dead() {
            val cell = Cell(DEAD)
            assertEquals(cell.state, DEAD)
        }
    }

    @Nested
    internal inner class CellTransitionTest {
        @Test
        fun testCellChangeState_LiveDead() {
            val cell = Cell(LIVE)
            cell.die()
            assertEquals(cell.state, DEAD)
        }

        @Test
        fun testCellChangeState_DeadLive() {
            val cell = Cell(DEAD)
            cell.comeAlive()
            assertEquals(cell.state, LIVE)
        }
    }


}
