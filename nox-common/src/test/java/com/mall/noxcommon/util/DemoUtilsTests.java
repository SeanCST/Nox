package com.mall.noxcommon.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoUtilsTests {


    @Test
    public void test(){
        int anInt = DemoUtils.randomInt();
        Assertions.assertNotEquals(0, anInt, "生成了随机数0");
    }

}
