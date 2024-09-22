public class Exceptional_Handling_Eg16 {
    public static void main(String[] args) {

        try {
            new Exceptional_Handling_Eg16().go();
        }
        catch (Exception e) {
            /*
            here we StackOverFlowError parent of it is Error. and for Error  parent is Throwable .
            Exceptional cant handle it.
             */
            System.out.println("ouch");
        }
    }

    void go() {
        go();


    }

}
/*
 new Exceptional_Handling_Eg16().go();
// go method calls internally again .it leads to infinite , and stack will get full . leads to StackOverFlow


 try {
            new Exceptional_Handling_Eg16().go();
        }
        catch (Error e) {

           // problem occurring at memory level means it is an error. it can be catched but cant be handled
             System.out.println("ouch");
        }



 */
