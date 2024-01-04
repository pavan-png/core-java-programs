 class Employer  {
    String name ;
    int ph_no ;
}
class Intilization_Through_Reference{
    public static void main(String[] args) {
        Employer obj = new Employer();
        obj.name = "pavan_kalyan";
        obj.ph_no = 9642141;
        System.out.println(obj.name);
        System.out.println(obj.ph_no);
    }

}
