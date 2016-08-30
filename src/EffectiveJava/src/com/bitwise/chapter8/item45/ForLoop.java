package com.bitwise.chapter8.item45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by akankshap on 8/29/2016.
 */
public class ForLoop {

     static int expensiveComputation(){
        return 5;
    }

    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        list.add("akki");
        list.add("mikki");
        list.add("tikki");

        //you should use this idiom if the loop test involves a
        //method invocation that is guaranteed to return the same result on each iteration.

        for (int i3 = 0, n = expensiveComputation(); i3 < n; i3++) {
            System.out.println(i3);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // Preferred idiom for iterating over a collection
        for(String s : list){
            System.out.println(s);
        }

        //Avoid using while loop
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Iterator<String> i2 = list.iterator();
        while (i.hasNext()) { // BUG!
            System.out.println(i2.next());
        }







    }
}
