public class Without_This_Keyword {
    String name;
    int roll_No;
    int id;
    Without_This_Keyword(String n,int r,int i){
        name = n;
        roll_No = r;
        id = i;
    }
    void display(){
        System.out.println("name is " +name +" " + "roll no is " + roll_No +" " +"id is " + id);
    }

    public static void main(String[] args) {
        Without_This_Keyword obj = new Without_This_Keyword("pavan",123,89);
        obj.display();
    }
}
