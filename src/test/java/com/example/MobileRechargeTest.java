package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MobileRechargeTest {

    @Test
    void testValidMobileNumber() {
        assertTrue(
            MobileRecharge.validateMobileNumber("9876543210")
        );
    }

    @Test
    void testInvalidMobileNumber() {
        assertFalse(
            MobileRecharge.validateMobileNumber("12345")
        );
    }

    @Test
    void testAnotherInvalidMobileNumber() {
        assertFalse(
            MobileRecharge.validateMobileNumber("987654321")
        );
    }

    @Test
    void testPlan199() {
        assertEquals(
            199.0,
            MobileRecharge.getRechargeAmount(1)
        );
    }

    @Test
    void testPlan299() {
        assertEquals(
            299.0,
            MobileRecharge.getRechargeAmount(2)
        );
    }

    @Test
    void testPlan499() {
        assertEquals(
            499.0,
            MobileRecharge.getRechargeAmount(3)
        );
    }

    @Test
    void testInvalidPlan() {
        assertEquals(
            -1,
            MobileRecharge.getRechargeAmount(10)
        );
    }
}