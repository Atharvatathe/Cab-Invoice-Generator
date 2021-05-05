import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    InvoiceGenerator invoiceGenerator = null;
    @Before
    public void setUp() throws Exception {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator  invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare,0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
        Ride[] rides = {    new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double totalFare = invoiceGenerator.calculateFare(rides);
        Assertions.assertEquals(30,totalFare,0.0);
    }

}
