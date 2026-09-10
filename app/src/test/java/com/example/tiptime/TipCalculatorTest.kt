package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTest {
    @Test
    fun calculateTip_withoutRounding_returnsExactValue() {
        assertEquals(15.0, calculateTip(100.0, 15.0, false), 0.001)
    }

    @Test
    fun calculateTip_withRounding_roundsUp() {
        assertEquals(11.0, calculateTip(57.25, 18.0, true), 0.001)
    }

    @Test
    fun calculateTip_withZeroAmount_returnsZero() {
        assertEquals(0.0, calculateTip(0.0, 20.0, true), 0.001)
    }
}
