public class Anonymous_Object {
void  factorial (int n){
 int fact = 1;
 for (int i =1;i<=n;i++){
     fact = fact*i;
 }
System.out.println("the factorial is  : " + fact);
}

    public static void main(String[] args) {
        new Anonymous_Object().factorial(5);
    }
}
