public class This_Keyword {
    String name;
    int age;
    int roll_No;
    This_Keyword(String name,int age,int roll_No){
        // this is refering above instance variables in class
        this.name = name;
        this.age = age;
        this.roll_No = roll_No;
    }
    void display(){
        System.out.println( "name is " +name +" " + "age :" +age + " " +"roll_no" +roll_No);
    }

    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword("pavan",23,123);
        obj.display();
    }
}
