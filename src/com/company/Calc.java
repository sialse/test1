package com.company;

public class Calc {
    private int A=0;
    private int B=0;
    private int result;


    public Calc(String str){

        if(str.contains("*")){
            String[] lines = str.split("\\*");
            if (lines.length!=2) throw new UnsupportedOperationException("Error");
            if((isInt(lines[0]))&(!isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            if((!isInt(lines[0]))&(isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            A=ConvertStringToInt(lines[0]);
            B=ConvertStringToInt(lines[1]);
            result=A*B;
        }
        else if(str.contains("-")){
            String[] lines = str.split("\\-");
            if (lines.length!=2) throw new UnsupportedOperationException("Error");
            if((isInt(lines[0]))&(!isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            if((!isInt(lines[0]))&(isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            A=ConvertStringToInt(lines[0]);
            B=ConvertStringToInt(lines[1]);
            result=A-B;
        }
        else if(str.contains("+")){
            String[] lines = str.split("\\+");
            if (lines.length!=2) throw new UnsupportedOperationException("Error");
            if((isInt(lines[0]))&(!isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            if((!isInt(lines[0]))&(isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            A=ConvertStringToInt(lines[0]);
            B=ConvertStringToInt(lines[1]);
            result=A+B;
        }
        else if(str.contains("/")){
            String[] lines = str.split("\\/");
            if (lines.length!=2) throw new UnsupportedOperationException("Error");
            if((isInt(lines[0]))&(!isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            if((!isInt(lines[0]))&(isInt(lines[1]))) throw new UnsupportedOperationException("Error");
            A=ConvertStringToInt(lines[0]);
            B=ConvertStringToInt(lines[1]);
            result=A/B;
        }
        else{
            throw new UnsupportedOperationException("Error");
        }
    }

    boolean isInt(String s){
        int x =-1;
        try {
            x = Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    private int ConvertStringToInt(String s){
        int num = 0;

        if((s.equals("10"))||(s.equals("X"))){
            return 10;
        }
        else if((s.equals("9"))||(s.equals("IX"))){
            return 9;
        }
        else if((s.equals("8"))||(s.equals("VIII"))){
            return 8;
        }
        else if((s.equals("7"))||(s.equals("VII"))){
            return 7;
        }
        else if((s.equals("6"))||(s.equals("VI"))){
            return 6;
        }
        else if((s.equals("5"))||(s.equals("V"))){
            return 5;
        }
        else if((s.equals("4"))||(s.equals("IV"))){
            return 4;
        }
        else if((s.equals("3"))||(s.equals("III"))){
            return 3;
        }
        else if((s.equals("2"))||(s.equals("II"))){
            return 2;
        }
        else if((s.equals("1"))||(s.equals("I"))){
            return 1;
        }

        else{
            throw new UnsupportedOperationException("Error");
        }

    }
    public int calculate(){
        return result;
    }
    //public int Calculate(int a, int b);
}
