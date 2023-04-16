package com.mall.noxcommon.util;

import java.util.Random;

public class DemoUtils {

    private static Random random = new Random();

    public static int randomInt(){
        return random.nextInt();
    }
}
