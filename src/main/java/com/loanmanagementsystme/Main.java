package com.loanmanagementsystme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Collection c;
        c = new ArrayList();
        System.out.println(c.getClass().getName());
        for(int i= 1; i<=10;i++){
            c.add(i+"*"+i+" = "+i*i);
        }
        Iterator iter = c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}