package com.kata

import com.kata.CellState.DEAD
import com.kata.CellState.LIVE


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
