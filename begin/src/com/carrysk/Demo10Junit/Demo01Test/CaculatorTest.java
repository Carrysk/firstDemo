package com.carrysk.Demo10Junit.Demo01Test;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试计算器类
 */
public class CaculatorTest {

    @Test
    public void testAdd() {
        Caculator cac = new Caculator();
        int result = cac.add(1, 2);

        Assert.assertEquals(3, result);
    }
}
