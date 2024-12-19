package org;

import java.util.ArrayList;

public class Executor {
    ICPU cpu;


    Executor(ICPU i) {
        cpu = i;
    }

    void run(ArrayList<Command> prog){
        for(Command i: prog){
            cpu.exec(i);
        }
    }
}