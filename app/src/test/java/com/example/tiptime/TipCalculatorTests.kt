package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

/* Метод для проверки расчета 20% чаевых для счета в 10 долларов.
Ожидаемый результат этого расчета — 2 доллара.*/

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount,tipPercent,false)
        assertEquals(expectedTip,actualTip)
    }
}