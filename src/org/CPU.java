package org;


public class CPU implements ICPU{

    int[] Memory = new int[1024];
    int[] Registrs = new int[4];
    static int maxMemory = 1025;
    static int minMemory = 0;

    @Override
    public void exec(Command c){
        switch (c.in[0]){
            case "init": init(c.in[1], c.in[2]); break;
            case "ld": ld(c.in[1], c.in[2]); break;
            case "st": st(c.in[1], c.in[2]); break;
            case "mv": mv(c.in[1], c.in[2]); break;
            case "print": print(); break;
            case "add": add(); break;
            case "sub": sub(); break;
            case "mult": mult(); break;
        }
    }

    public void ld(String r, String x){
        int b = Integer.parseInt(x);
        switch(r){
            case "a": Registrs[0] = Memory[b]; break;
            case "b": Registrs[1] = Memory[b]; break;
            case "c": Registrs[2] = Memory[b]; break;
            case "d": Registrs[3] = Memory[b]; break;
        }
    }

    public void st(String r, String x){
        int b = Integer.parseInt(x);
        switch(r){
            case "a": Memory[b] = Registrs[0]; break;
            case "b": Memory[b] = Registrs[1]; break;
            case "c": Memory[b] = Registrs[2]; break;
            case "d": Memory[b] = Registrs[3]; break;
        }
    }

    public void mv(String r1, String r2){
        r1 = r2;
    }

    public void init(String a, String b){
        int x = Integer.parseInt(a);
        if(x > maxMemory) maxMemory = x;
        if(x < minMemory) minMemory = x;
        int y = Integer.parseInt(b);
        Memory[x] = y;
    }

    public void print() {
        System.out.println("r1 = " + Registrs[0] + " r2 = " + Registrs[1] + " r3 = " + Registrs[2] + " r4 = " + Registrs[3] + '\n');
    }
    public void add(){
        Registrs[3] = Registrs[0] + Registrs[1];
    }

    public void sub(){
        Registrs[3] = Registrs[0] - Registrs[1];
    }

    public void mult(){
        Registrs[3] = Registrs[0] * Registrs[1];
    }
}
