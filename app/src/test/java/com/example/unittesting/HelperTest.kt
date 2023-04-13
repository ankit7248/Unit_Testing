package com.example.unittesting
import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

// COVERAGE -> it is use to check code is how much percent accurate and its show percentage and also its show line red colour line for not gone otherwise it's gone.

lateinit var helper : Helper
class HelperTest {
    @Before
    fun tearDown(){
        // Arrange
        helper = Helper()  // Helper Class
        println("Before Every Test Case")
    }
    @After
    fun tearUp(){
        println("After Every Test Case")
    }
    @Test // Its Test method
    fun isPalindrome() {
        // Arrange

        // Act
        val result = helper.isPalindrome("level")  // Logic
        //Assert
        assertEquals(true,result) // we put the Boolean string to check our fact which I put in assertEquals
    }

    @Test // Its Test method
    fun isPalindrome_inputString_level_expectedTrue() {

        // Act
        val result = helper.isPalindrome("ankit")  // Logic
        //Assert
        assertEquals(false, result) // we put the Boolean string to check our fact which I put in assertEquals
    }

}