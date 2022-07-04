package com.company;
import com.company.Address;
import com.company.Customer;

public class App {
    public static void main(String[] args) {

        Address billingAddress= new Address("1675","SE street","Shoreline","WA","98004");
        Address shippingAddress = new Address("145","NW Ave","Tacoma","WA","14785");

//customer information
        Customer cch = new Customer(
          "Chengchien",
          "Huang",
          "hcc@gmail.com",
          "0952090909",
                billingAddress,
                shippingAddress,
                true

        );

        System.out.println(cch);
    }
}
