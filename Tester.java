package com.latihan.uts1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
      
        employee box=new employee("Susan Meyers",47899,"Accounting","Vice President");
        employee box1=new employee("Mark Jones",39199,"IT","Programmer");
        employee box2=new employee("Joy Rogers",81774,"Manufacturing","Engineer");
        
        System.out.println("__________________________________________________________________________________________");
        System.out.println(" "+box.getName()+"   "+box.getIdnumber()+"  "+box.getDepartement()+"         "+box.getPosition());
        System.out.println(" "+box1.getName()+"     "+box1.getIdnumber()+"  "+box1.getDepartement()+"                 "+box1.getPosition());
        System.out.println(" "+box2.getName()+"     "+box2.getIdnumber()+"  "+box2.getDepartement()+"      "+box2.getPosition());
        System.out.println("__________________________________________________________________________________________");
    }
}
