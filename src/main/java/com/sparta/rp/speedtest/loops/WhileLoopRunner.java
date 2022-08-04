package com.sparta.rp.speedtest.loops;

public class WhileLoopRunner implements Loopabale{
    @Override
    public void runLoop(int maxValue) {
        int total = 0;
        int count = 0;
        while(count <= maxValue){
            total+=count;
            count++;
        }
        System.out.print("Total for While loop " + total + ", ");
    }

}
