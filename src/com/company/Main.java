package com.company;


import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static File folder = new File("/home/andrei_popsor/Desktop/workspace/LOCAL_BUCKET/");
    public static void main(String[] args) throws FileNotFoundException {

        Fighter f1 = new Fighter("ion",100.f,10.6f);
        Fighter f2 = new Fighter("vasile", 100.f,101.5f);

        BoxingMatch bm = new BoxingMatch(f1,f2);
        System.out.println("castigatorul este : " +bm.fight());
    }

}





