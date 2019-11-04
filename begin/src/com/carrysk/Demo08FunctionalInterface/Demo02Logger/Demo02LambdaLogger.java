package com.carrysk.Demo08FunctionalInterface.Demo02Logger;

/**
 * 使用lambda 优化logger
 */
public class Demo02LambdaLogger {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "!!!";

        /*show01(1, new MessageBuilder() {
            @Override
            public String printMessage() {
                System.out.println("level == 1");
                return msg1 + msg2 + msg3;
            }
        });*/

        show01(1, () -> {
            System.out.println("level == 1");
            return msg1 + msg2 + msg3;
        });

        /**
         * 使用lambda 延迟执行的特点-》》
         *   只有满足条件 lambda才会执行
         *     不满足条件lambda不会执行
         */

    }

    private static void show01(int level, MessageBuilder msg) {
        if (level == 1)
            System.out.println(msg.printMessage());
    }
}
