package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadString
{
    private int num1;
    private int num2;
    private char oper;

    public void transfer() throws InterruptedException {

        String[] rimskiye = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        Thread.sleep(1000);
        System.out.println("Введите выражение, содержащее либо римские, либо арабские цифры от 1 до 10 с оператором +-/* между ними. выражение заканчивается знаком =");
        Scanner scanner = new Scanner(System.in);
        String strokaVvoda = scanner.nextLine();
        char[] MassivDevided = new char[8];

        for (int i = 0; i < strokaVvoda.length(); i++) {
            MassivDevided[i] = strokaVvoda.charAt(i);
            if (MassivDevided[i] == '+') {
                oper = '+';
            }
            if (MassivDevided[i] == '-') {
                oper = '-';
            }
            if (MassivDevided[i] == '*') {
                oper = '*';
            }
            if (MassivDevided[i] == '/') {
                oper = '/';
            }
        }
        String StringAgain = String.valueOf(MassivDevided);
        StringAgain = StringAgain.substring(0, strokaVvoda.length() - 1);
        String[] blocks;

            blocks = StringAgain.split("[+-/*]", 2);


        try{
            boolean flag = false;
            for (int i = 0; i < rimskiye.length; i++){
                if (rimskiye[i].equals(blocks[0]) || rimskiye[i].equals(blocks[1])){
                    flag = true;
                }
                if(flag){
                    num1 = RomToNum(blocks[0]);
                    num2 = RomToNum(blocks[1]);
                    oper = strokaVvoda.charAt(blocks[0].length());

                    if ((num1 <num2 )&& (oper == '-')) {
                        System.out.println("Не существует отрицательных римских чисел");
                        throw new IllegalArgumentException();
                    }
                }
                else {
                    num1 = Integer.parseInt(blocks[0]);
                    num2 = Integer.parseInt(blocks[1]);
                    oper = strokaVvoda.charAt(blocks[0].length());
                }
            }
            if ((num1 > 10 || num1 < 0) || (num2 > 10 || num2 < 0)) {
                System.out.println("Вы вышли из допустимого диапозона ввода: числа от 0 до 10 ");
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Общее: ошибка ввода данных");
        }
    }

    private  int RomToNum(String rom) {

        if (rom.equals("I")) {
            return 1;
        } else if (rom.equals("II")) {
            return 2;
        } else if (rom.equals("III")) {
            return 3;
        } else if (rom.equals("IV")) {
            return 4;
        } else if (rom.equals("V")) {
            return 5;
        } else if (rom.equals("VI")) {
            return 6;
        } else if (rom.equals("VII")) {
            return 7;
        } else if (rom.equals("VIII")) {
            return 8;
        } else if (rom.equals("IX")) {
            return 9;
        } else if (rom.equals("X")) {
            return 10;
        }
        return -1;
    }

    public   String NumToRom (int arab) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        try {
            if (arab == 1) {
                return "I";
            } else if (arab==2) {
                return "II";
            } else if (arab==3) {
                return "III";
            } else if (arab==4) {
                return "IV";
            } else if (arab==5) {
                return "V";
            } else if (arab==6) {
                return "VI";
            } else if (arab==7) {
                return "VII";
            } else if (arab==8) {
                return "VIII";
            } else if (arab==9) {
                return "IX";
            } else if (arab==10) {
                return "X";
            }
            if (arab == 11) {
                return "XI";
            } else if (arab==12) {
                return "XII";
            } else if (arab==13) {
                return "XIII";
            } else if (arab==14) {
                return "XIV";
            } else if (arab==15) {
                return "XV";
            } else if (arab==16) {
                return "XVI";
            } else if (arab==17) {
                return "XVII";
            } else if (arab==18) {
                return "XVIII";
            } else if (arab==19) {
                return "IXX";
            } else if (arab==20) {
                return "XX";
            }
            else if (arab<=0) {
                return "римских цифр не существует в отрицательном диапозоне";
            }
            else if (arab>20) {
                return "римское число больше 20";
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка с форматом данных при переводе в римские цифры");
            throw new InputMismatchException();
        }

        final String s = roman[arab];
        return s;
    }


    public char getOper () {
        return oper;
    }
    public int getNum1 () {
        return num1;
    }
    public int getNum2 () {
        return num2;
    }
}