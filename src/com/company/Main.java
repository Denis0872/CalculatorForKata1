package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rome;
        int arab;
        boolean Flag;
        ReadString reader = new ReadString();
       //Flag= reader.transfer();
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
           //if (Flag)
           //{
            try{
                System.out.println("В арабских:"+" " +arab);
               System.out.println("В римских:"+" " +rome);
            }
            catch (Exception e){
                System.out.println("Ошибка вывода  ");
            }

             // }
           // else{

           // System.out.println("Флаг"+" " +Flag);
          // }
        }
    }
}