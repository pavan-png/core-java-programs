 class Main_Method_Test {
     public static void main(String[] args) {
         System.out.println("this is super class main method");

     }
 }
 // if super  class is excueted its main method is excueted
 // if normally excuetion is done without ide child  class is excueted  its main method is excueted
 // here hiding of main method takes place whenever
 public class Hiding_Of_Main_Method_5 extends Main_Method_Test{
     public static void main(String[] args) {
         System.out.println("this is child class main method");

     }
    }

