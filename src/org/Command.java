package org;

public class Command {
    String[] in = {"0", "0", "0"};
    Command(String a, String b, String c){
        in[0] = a;
        in[1] = b;
        in[2] = c;
    }
    Command(String d){
        in[0] = d;
    }
}
