public class Instance_Variable_This_Keyword_3{
String name ;
int age ;
Instance_Variable_This_Keyword_3(String name , int age){
    this.name = name;
    this.age = age;
}
void test(){
    // output is same whether using this keyword is called or not
    System.out.println("the name is "+this.name);
}
    public static void main(String[] args) {
    Instance_Variable_This_Keyword_3 std = new Instance_Variable_This_Keyword_3("pavan",24);
        System.out.println(std.age);
        std.test();

    }
}


