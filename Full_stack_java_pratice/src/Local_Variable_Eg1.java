class  Local_Variable_Eg1{
    public static void main(String[] args) {
        int i =0;
        for (int j =0;j<=5;j++){
            System.out.println(j);
        }
        // System.out.println(j); // shows C.E because j is local variable and it is only a prat of for loop.

        System.out.println(i); // valid 
    }

}

