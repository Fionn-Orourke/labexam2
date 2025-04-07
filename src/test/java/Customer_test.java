import org.example.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Customer_test {
    public String fname = "fionn";
    public String lname = "Orourke";
    public Customer customer = new Customer();
    @BeforeAll
    static void setup(){
        Customer customer = new Customer();
        customer.setFirstName("fionn");
        customer.setLastName("Orourke");
        customer.setCustomerID("12345678");
        customer.setAdress("1234567890");
        //return 0;
    }



    @Test
    void testSetFirstName(){

        customer.setFirstName(fname);
        Assertions.assertTrue(customer.getFirstName().length()>=3);
       // assertThrows(assertThrows());



    }

    @Test
    void testSetID(){
        customer.setLastName(lname);

            Assertions.assertTrue(customer.getLastName().length()>=3);



    }
    @Test

    void testAddress(){
        try {
            customer.setAdress("1234567890");
            Assertions.assertTrue(customer.getAdress().length()>=10 && customer.getAdress().length()<=40);

        }catch ()
            Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
            throw new Exception("e")



    }
}
