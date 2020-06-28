package com.godwije.app;

import com.godwije.algos.BasicStringSearch;
import com.godwije.algos.FastSearch;

public class Algorithms {
    public static void main(String[] args) {
        //Main code
        String test = "I am started a new project";
        BasicStringSearch sch = new BasicStringSearch();
        if(sch.findString(test, "project")){
            System.out.println("String was found");
        }
        FastSearch fs = new FastSearch();
        fs.addString(test);
        if(fs.findString("project")){
            System.out.println("String was found");
        }
    }
}
