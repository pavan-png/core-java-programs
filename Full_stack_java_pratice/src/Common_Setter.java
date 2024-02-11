class Studen2{
    private String namee;
    private int  age ;
    private String city;

    public void setData(String namee ,int age , String city){
        this.namee = namee;
        this.age = age;
        this.city = city;
    }

    public String getNamee() {
        return namee;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
public class Common_Setter {
    public static void main(String[] args) {
        Studen2 obj = new Studen2();
        obj.setData("pavan", 24,"vijayawada");
        System.out.println(obj.getNamee());
        System.out.println(obj.getAge());
        System.out.println(obj.getCity());
    }


}
