public class MySqlCustomerDal implements  ICustomerDal, Irepository{ //classlar birden fazla interfaceleri implemente edebilirler
    @Override
    public void Add() {
        System.out.println("MySql Eklendi");
    }
}
