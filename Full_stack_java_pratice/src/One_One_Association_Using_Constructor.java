public class One_One_Association_Using_Constructor {
    public static void main(String[] args) {
      Account01  account01 = new Account01(12345,"pavan","savings");
        Employee01 employee01 = new Employee01("pavan",123,"vijayawada",account01);
        employee01.get_Employee_details();
    }
}
