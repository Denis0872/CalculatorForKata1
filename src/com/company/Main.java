package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rome;
        int arab;
        ReadString reader = new ReadString();
        //boolean Flag= flag;
        Calculation calc= new Calculation();
        while (true) {
            try {
                reader.transfer();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                continue;
            }

          //  if (Flag){}
            int result = calc.calculate(reader.getNum1(), reader.getNum2(), reader.getOper());
            rome=reader.NumToRom(result);
            System.out.println("В римских"+" " +rome);
            arab=result;
            System.out.println("В арабских"+" " +arab);
        }

    }

}