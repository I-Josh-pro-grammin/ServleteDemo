package org.servlet.Models;

public class Calculator {
    private  int num1;
    private  int num2;
    private  String operation;

    public Calculator(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public  int add() {
        return num1+num2;
    }

    public  int divide() {
        return num1/num2;
    }

    public  int multiply() {
        return  num2*num1;
    }

    public int calculate() {
        if(operation.equals("division")) {
            return divide();
        } else if (operation.equals("product")) {
            return multiply();
        }else if(operation.equals("sum")) {
            return add();
        }else {
            return 0;
        }
    }
}
