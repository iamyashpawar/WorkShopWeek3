package com.bridgelabz;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListMain {

    public static void main(String[] args) throws Exception {

        Linkedlist<Integer> linkedlist1 = new Linkedlist<>();


        for (int i = 2 ; i<=1000;i++)
        {
            boolean isPrime = true;
            for( int j = 2; j<i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }



            if (isPrime){
                linkedlist1.push(i);
                Thread.sleep(2000);
                linkedlist1.display();
            }

        }



    }



}
