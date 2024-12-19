package org;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        ArrayList<Command> program = new ArrayList(Arrays.asList(
                new Command("init", "10", "20"),
                new Command("init", "11", "25"),
                new Command("ld", "a", "10"),
                new Command("ld", "b", "11"),
                new Command("st", "c", "13"),
                new Command("init", "110", "35"),
                new Command("add"),
                new Command("print"),
                new Command("mv", "a", "d"),
                new Command("mv", "b", "c"),
                new Command("div"),
                new Command("print"),
                new Command("init", "171", "65"),
                new Command("sub"),
                new Command("print"),
                new Command("mult"),
                new Command("init", "345", "95"),
                new Command("print")
        ));
        ICPU CPU = BCPU.build();
        Executor executor = new Executor(CPU);
        executor.run(program);
    }

}