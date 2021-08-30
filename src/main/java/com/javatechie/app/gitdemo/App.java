package com.javatechie.app.gitdemo;

import static com.javatechie.app.gitdemo.Constant.DATA_TYPE;

public class App {

    public void addData(String data){
        //System.out.println("data =" + data);

        if(data.equals(DATA_TYPE)){
            System.out.println("Welcome!!");
        }
    }


    public static void main(String[] args){
        System.out.println("Hello World!");
    }

}
