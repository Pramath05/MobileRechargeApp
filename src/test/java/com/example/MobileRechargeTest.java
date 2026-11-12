package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MobileRechargeTest {

    // ---------- MOBILE NUMBER TEST CASES ----------

    @Test
    void testValidMobileNumber() {
        assertTrue(
            MobileRecharge.validateMobileNumber("9876543210")
        );
    }

    @Test
    void testValidMobileNumberStartingWith6() {
        assertTrue(
            MobileRecharge.validateMobileNumber("6123456789")
        );
    }

    @Test
    void testInvalidMobileNumberTooShort() {
        assertFalse(
            MobileRecharge.validateMobileNumber("987654321")
        );
    }

    @Test
    void testInvalidMobileNumberTooLong() {
        assertFalse(
            MobileRecharge.validateMobileNumber("98765432101")
        );
    }

    @Test
    void testInvalidMobileNumberStartingWith5() {
        assertFalse(
            MobileRecharge.validateMobileNumber("5876543210")
        );
    }

    @Test
    void testInvalidMobileNumberWithLetters() {
        assertFalse(
            MobileRecharge.validateMobileNumber("98765ABCDE")
        );
    }

    @Test
    void testEmptyMobileNumber() {
        assertFalse(
            MobileRecharge.validateMobileNumber("")
        );
    }

    @Test
    void testNullMobileNumber() {
        assertFalse(
            MobileRecharge.validateMobileNumber(null)
        );
    }


    // ---------- RECHARGE PLAN TEST CASES ----------

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


    // ---------- INVALID PLAN TEST CASES ----------

    @Test
    void testInvalidPlanSelection() {
        assertEquals(
            -1,
            MobileRecharge.getRechargeAmount(10)
        );
    }

    @Test
    void testZeroPlanSelection() {
        assertEquals(
            -1,
            MobileRecharge.getRechargeAmount(0)
        );
    }

    @Test
    void testNegativePlanSelection() {
        assertEquals(
            -1,
            MobileRecharge.getRechargeAmount(-1)
        );
    }

    @Test
    void testInvalidLargePlanSelection() {
        assertEquals(
            -1,
            MobileRecharge.getRechargeAmount(100)
        );
    }
}