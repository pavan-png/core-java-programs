public class Instance_Acessor_Mutator {
    private int balance = 50;
    //if get keyword is used automatically private variable method is created
    public int getBalance(){

        return balance;
    }
    public void setBalance( int a){
        balance = balance + a;
    }

    public static void main(String[] args) {
        Instance_Acessor_Mutator obj  = new Instance_Acessor_Mutator();
        obj.setBalance(50);
        System.out.println(" your balance is " + obj.getBalance());
    }

}
