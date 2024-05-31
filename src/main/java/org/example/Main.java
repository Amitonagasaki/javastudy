package org.example;

class calculator{
    public int add(int a, int b){
        int r = a+b;
        return r;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        calculator e1 = new calculator();
        int add = e1.add(a,b);
        System.out.println(add);

    }

}


