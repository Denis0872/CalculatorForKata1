package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean flag = false;
    public static void main(String[] args) {

        String rome = null;
        int arab = 0;
        ReadString reader = new ReadString();
        Calculation calc= new Calculation();
        while (true) {
            try {
                reader.transfer();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                continue;
            }

                int result = calc.calculate(reader.getNum1(), reader.getNum2(), reader.getOper());
                arab=result;
                rome=reader.NumToRom(result);

           if (flag) {
               System.out.println("В римских:" + " " + rome);
           }
            else
            {
               System.out.println("В арабских:"+" " +arab);
           }
           //System.out.println("Флаг"+" " +flag);
          }
        }
    }
