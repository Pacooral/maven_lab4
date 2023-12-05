package org.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution10Test {

    @Test
    void fractionAddition() {
        //写个测试，用assert来判断结果是否正确
        Solution10 solution10 = new Solution10();
        String result = solution10.fractionAddition("-1/2+1/2+1/3");
        assertEquals("1/3",result);

        //再写一个
        result = solution10.fractionAddition("1/3-1/2");
        assertEquals("-1/6",result);

    }

    @Test
    void gcd() {
        //写个测试，用assert来判断结果是否正确
        Solution10 solution10 = new Solution10();
        long result = solution10.gcd(2,3);
        assertEquals(1,result);
    }
}