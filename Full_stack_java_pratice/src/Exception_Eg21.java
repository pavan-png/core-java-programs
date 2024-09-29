
 interface C0 {
    void m1() throws java.io.IOException;
}

class c11 implements C0{
        public void m1(){}
}
class c12 implements C0 {
    public void m1() throws java.io.FileNotFoundException {
    }
}

 class c13 implements C0 {
     public void m1() throws java.io.IOException {
     }
 }

/*
class Exception_Eg21 implements C0{
    public void m1()throws Exception{}
}
*/



