/**
*  TestSets.java
*
*  @version: Last Modified April 4, 2012
*  @author:  Henry Leitner
*/

import java.util.*;

public class TestSets
{
  static void menu()
  {
     System.out.println ();
     System.out.print ("Type 1 to CREATE SET A\n");
     System.out.print ("Type 2 to CREATE SET B\n");
     System.out.print ("Type 3 to CREATE INTERSECTION (A * B)\n");
     System.out.print ("Type 4 to CREATE UNION (A + B)\n");
     System.out.print ("Type 5 to CREATE DIFFERENCE (A - B)\n");
     System.out.print ("Type 6 to GET THE CARDINALITY OF SET A\n");
     System.out.print ("Type 7 to GET THE CARDINALITY OF SET B\n");
     System.out.print ("Type 8 to CHECK IF SET A IS A SUBSET OF SET B\n");
     System.out.print ("Type 9 to CHECK IF SET B IS A SUBSET OF SET A\n");
     System.out.print ("Type any OTHER # to EXIT PROGRAM \n\n");
     System.out.print ("Command: ");
  }
  
  public static void main (String [] args) 
  {
     Bitset setA = new Bitset (16);
     Bitset setB = new Bitset (8);
     int command;
    
     Scanner keyboard = new Scanner (System.in);
     do 
     {
         menu();
         
         switch (command = keyboard.nextInt ()) 
         {
            case 1:
              System.out.println ("Type some small integers, each < 16" 
                                 + ", and type DONE when all done!");
              setA.readSet(keyboard);
              System.out.print ("     SET A = " + setA);
              break;

            case 2:
              System.out.println ("Type some small integers, each < 8"
                                 + ", and type DONE when all done!");
              setB.readSet(keyboard);
              System.out.print ("     SET B = " + setB);
              break;

           case 3:
              System.out.print ("     Intersection (A * B) = ");
              System.out.print (setA.intersect(setB));
              break;
           
	       case 4:
              System.out.print ("     Union (A + B) = ");
              System.out.print (setA.union(setB));
              break;

           case 5:
              System.out.print ("     Difference (A - B) = ");
              System.out.print (setA.difference(setB));
              break;

            case 6:
              System.out.print ("     Cardinality SET A = " );
              System.out.print (setA.cardinality());
              break;

            case 7:
              System.out.print ("     Cardinality SET B = ");
              System.out.print (setB.cardinality());
              break;

            case 8:
              System.out.print ("     SET A subset of SET B: ");
              System.out.print (setA.isSubset(setB));
              break;

            case 9:
              System.out.print ("     SET B subset of SET A: ");
              System.out.print (setB.isSubset(setA));
              break;

           default:  System.exit(0);
        
         }
       } while (command > 0 && command < 10);
  }
}
