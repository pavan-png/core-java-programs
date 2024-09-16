import java.util.ArrayList;

public class ArrayList_Eg1 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList(); // al1
        al1.add(10); // 10 is an object which is added in the collection al1
        al1.add(20); // to add objects in the ArrayList we use add() method
        al1.add(30);

        // homogenous data
        System.out.println("array list1 data is : "+al1);

        ArrayList al2 = new ArrayList();
        al2.add("pavan");
        al2.add(25);
        al2.add('b');
        al2.add(18.5);

        //heterogenous data
        System.out.println("array list 2 data is is : "+al2);

        // we can add entire collection to another collection
        ArrayList al3 = new ArrayList();
        // to add one entire collection to another collection in the ArrayList we use a method addAll()
        al3.addAll(al2);
        System.out.println("the array list 3 data  is : "+al3);


        ArrayList al4 = new ArrayList();
        al4.add(11);
        al4.add(22);
        al4.add(33);
        al4.add(44);
        System.out.println("existing data is on array list 4 is : "+al4);

      // adding object at specified index
        al4.add(2,28);

        System.out.println("after adding object 28 at index 2 "+al4);

        al4.add(0,23);
        System.out.println("after adding object 23 at index 1 "+al4);

        //adding object at rear end
        al4.add(45);
        System.out.println("after adding 45 :" +al4);

        // duplicates are allowed
        al4.add(45);
        System.out.println(al4);




   }
}
