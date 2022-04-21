package com.company;

public class Calculation
{

    public  int calculate(int num1, int num2, char oper){
        int result = 0;
        try {
            switch (oper){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2;break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                default: System.out.println("Введён неправильный оператор");

            }

        }
        catch (ArithmeticException  e) { System.out.println("Делить на ноль нельзя") ; }
        return result;
    }
}
