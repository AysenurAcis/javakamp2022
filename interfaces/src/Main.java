public class Main {
    public static void main(String[] args) {
       // ICustomerDal customerDal = new OracleCustomerDal(); //implemente eden class'ın referansını tutabilir, polimorphism
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}