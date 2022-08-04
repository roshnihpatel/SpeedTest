package com.sparta.rp.speedtest.loops;

public class ForLoopRunner implements Loopabale{

    @Override
    public void runLoop(int maxValue) {
        int total = 0;
        for(int i = 0; i <= maxValue; i++){
            total+=i;
        }
        System.out.print("Total for For loop " + total + ", ");
    }
}
