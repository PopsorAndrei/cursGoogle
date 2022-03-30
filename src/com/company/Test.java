package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static File folder = new File("/home/andrei_popsor/Desktop/workspace/LOCAL_BUCKET/");
    public static File readFile = new File("/home/andrei_popsor/Desktop/workspace/LOCAL_BUCKET/generation/countries.json");
    Test() throws FileNotFoundException {
        readFile();
    }

    public void getChildOfChild(String name){
        File file = new File(folder.getPath()+"/"+name+"/shops");

        for(File files : file.listFiles())
            System.out.println(files.getName());
    }



    public void play() throws FileNotFoundException {
        readFile();
    }

    public void getChildrenOff(String name){
        System.out.println(folder.getAbsolutePath().concat("/"+name+"/"));
        File file = new File(folder.getAbsolutePath().concat("/"+name));



        for(File children : file.listFiles()){
            System.out.println(children.getName());
        }
    }

    public void readFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(readFile);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }


    }
}

