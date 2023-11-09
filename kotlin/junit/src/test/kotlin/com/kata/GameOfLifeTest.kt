package com.kata

import com.kata.CellState.DEAD
import com.kata.CellState.LIVE
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

enum class CellState {
    LIVE, DEAD
}

class Cell(state: CellState) {
    private var _state: CellState = state
    val state: CellState
        get() {
            return _state
        }

    fun comeAlive(): Cell {
        _state = LIVE
        return this
    }

    fun die(): Cell {
        _state = DEAD
        return this
    }
}

internal class GameOfLifeTest {
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
