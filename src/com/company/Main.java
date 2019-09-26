package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws  java.io.IOException{
	// write your code here
    for (int i=0; i<5;i++){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Calc calculator = new Calc(line);
        System.out.println(calculator.calculate());
    }
}}
