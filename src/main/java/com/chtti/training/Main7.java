package com.chtti.training;

public class Main7 {

    public void writeSomething() {
        System.out.println("empty");
    }

    public void writeSomething(String content) {
        System.out.println("empty" + content);
    }

    public void writeSomething(String content, int times) {
        String result = "";
        for(int i = 0; i < times; i ++)
            result += content;

        System.out.println(result);
    }

    public static void main(String[] args) {
        Main7 m7 = new Main7();
        m7.writeSomething("a",3);

    }

}
