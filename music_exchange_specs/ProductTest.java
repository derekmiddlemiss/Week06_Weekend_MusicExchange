import static org.junit.Assert.*;
import org.junit.*;
import music_exchange_management.*;

public class ProductTest{

  Product drumSticks;

  @Before
  public void before(){
    drumSticks = new Product( 8.00, 11.99, "Yamaha ES209 Drumsticks" );
  }

  @Test
  public void testGetBuyPrice(){
    assertEquals( 8.00, drumSticks.getBuyPrice() );
  } 

}