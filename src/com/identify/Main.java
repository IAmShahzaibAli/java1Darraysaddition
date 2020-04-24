package com.identify;

import java.io.FileOutputStream;

public class Main {


    public static void main(String[] args) {



           int Ramadan = 1;
           String Eid = "Coming";
           System.out.println("Ramadan Mubarak");
           while (Ramadan <= 30 )
           {
               System.out.println("Ramadan_DAY:"+Ramadan);
               if (Ramadan == 30)
               {
                   Eid = "Happening";
               }

               Ramadan++;
           }
           System.out.println(Eid + "Eid Mubarak");







    }








}
