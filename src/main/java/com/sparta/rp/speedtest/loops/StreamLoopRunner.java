package com.sparta.rp.speedtest.loops;

import java.util.stream.IntStream;

public class StreamLoopRunner  implements Loopabale{


    @Override
    public void runLoop(int maxValue) {
        int total = IntStream.rangeClosed(0, maxValue).sum();
        System.out.print("Total for Stream Loop " + total + ", ");


    }
}
