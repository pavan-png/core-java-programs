public class Float_Constructors {
    public static void main(String[] args) {
        Float f1 = new Float(10.5f);
        System.out.println(f1);
        Float f2 = new Float("10.5f");
        System.out.println(f2);
        Float f3 = new Float(10.5);
        System.out.println(f3);
        Float f4 = new Float("10.5");
        System.out.println(f4);


        // inroder to avoid the above error use this
       Float f5 =  Float.valueOf(10.5f);
        System.out.println(f5);
        Float f6 = Float.valueOf("10.5f");
        System.out.println(f6);
     //   Float f7 = Float.valueOf(10.5) ;   but valueOf() method does not accept double

    }
}
