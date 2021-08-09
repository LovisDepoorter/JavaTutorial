package org.vis;

public class Test {

    public static void main(String[] args) {

        //Ganzzahl datentyp
        //byte
        //short
        //int
        //long
        long zahl1 = 10;
        long zahl2 = 50;


        zahl1  +=5;




        //Kommazahl datentyp
        //float
        //double
        double d= 5.0;






        //boolean
        //true=1 false=0
        boolean b = true;

        //Zeichen
        char c = 'c';


        //Zeichenkette
        String s ="hallo";





        //Kontrollstrukturen
        //schleife 0-10 check num ger odr ungerade
        double ergebnis=0;

        for (int u = 0; u<10;u++) {

            ergebnis =u % 2;
            if (ergebnis== 0) {
                System.out.println(u + "=gerade");

            }
            else {System.out.println(u + "=ungerade");}
        }

        //system.out.print führt aus in nächst möglichem platz
        //system.out.println führt in nächster zeile aus

        int tp =6;

        for (int p = 0; p<tp; ++p) {
            for (int z = 1; z <= p; ++z) {
                System.out.print("#");
            }
            System.out.println();
        }



        System.out.println();




        //while()wenn es so ist, wird es ausgeführt

        //do
        //
        // while code wird zunächst ausgeführt dann auf while gecheckt
    }
}
