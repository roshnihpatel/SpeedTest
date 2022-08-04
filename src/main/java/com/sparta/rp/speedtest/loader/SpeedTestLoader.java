package com.sparta.rp.speedtest.loader;

import com.sparta.rp.speedtest.loops.ForLoopRunner;
import com.sparta.rp.speedtest.loops.StreamLoopRunner;
import com.sparta.rp.speedtest.loops.WhileLoopRunner;
import com.sparta.rp.speedtest.runner.LoopRunner;

public class SpeedTestLoader {
    public static void startLoops(int maxValue){
        ForLoopRunner forLoopRunner = new ForLoopRunner();
        WhileLoopRunner whileLoopRunner = new WhileLoopRunner();
        StreamLoopRunner streamLoopRunner = new StreamLoopRunner();
        LoopRunner runner = new LoopRunner();
        runner.runLoops(forLoopRunner, maxValue);
        runner.runLoops(whileLoopRunner, maxValue);
        runner.runLoops(streamLoopRunner,maxValue);
    }

}
