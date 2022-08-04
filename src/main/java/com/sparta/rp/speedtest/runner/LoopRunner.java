package com.sparta.rp.speedtest.runner;

import com.sparta.rp.speedtest.loops.Loopabale;

public class LoopRunner {
    //Dependancy injection
    //when calling the method we can use any class that uses Loopable
    public void runLoops(Loopabale loop, int maxValue){
        double start = System.nanoTime();
        loop.runLoop(maxValue);// Liskov children implement runLoop
        double finish = System.nanoTime();
        double totalTime = finish - start;
        System.out.println("Time in milliseconds: " + totalTime/ 1000000);

    }
}
