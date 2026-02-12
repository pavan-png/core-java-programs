public class One_One_Association_Using_Constructor {

    public static void main(String[] args) {

        Account01 account01 =
                new Account01(12345, "Pavan", "Savings");

        Employee01 employee01 =
                new Employee01("Pavan", 123, "Vijayawada", account01);

        employee01.getEmployeeDetails();
    }
}
