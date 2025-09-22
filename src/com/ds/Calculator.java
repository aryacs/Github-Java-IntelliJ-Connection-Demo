package com.ds;
//make a class calculator to perform add, sub, mul, div using constructors
class Cal{
    int add(int x, int y){
        return x + y;
//System.out.println("Addition is = " + result);
    }
    int sub(int a, int b){
        return a - b;
//System.out.println("Subtraction is = " + result);
    }
    int mul(int r, int s){
        return r * s;
//System.out.println("Multiplication is = " + result);
    }
    int div(int p, int q){
        return p / q;
//System.out.println("Division is = " + result);
    }
}
public class Calculator
{
    public static void main(String args[]){
        Cal c = new Cal();
        System.out.println("Addition is = " + c.add(5,9));
        System.out.println("Subtraction is = " + c.sub(15,9));
        System.out.println("Multiplication is = " + c.mul(5,9));
        System.out.println("Division is = " + c.div(27,9));
    }
}

