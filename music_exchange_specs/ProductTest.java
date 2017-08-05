import static org.junit.Assert.*;
import org.junit.*;
import music_exchange_management.*;

public class ProductTest{

  DrumSticks drumSticks;

  @Before
  public void before(){
    drumSticks = new DrumSticks( 8.00, 11.99, "Yamaha ES209 Drumsticks" );
  }

  @Test
  public void testCalculateMarkup(){
    assertEquals( 3.99, drumSticks.calculateMarkup(), 0.001 );
  }

  @Test
  public void testGetBuyPrice(){
    assertEquals( 8.00, drumSticks.getBuyPrice(), 0.001 );
  } 

  @Test
  public void testGetSellPrice(){
    assertEquals( 11.99, drumSticks.getSellPrice(), 0.001 );
  }

  @Test
  public void testGetIdentifier(){
    assertEquals( "Yamaha ES209 Drumsticks", drumSticks.getIdentifier() );
  }

  @Test
  public void testSetSellPrice(){
    drumSticks.setSellPrice( 12.99 );
    assertEquals( 12.99, drumSticks.getSellPrice(), 0.001 );
  }

  @Test
  public void testSetIdentifier(){
    drumSticks.setIdentifier( "Yamaha ES209 Drumstick Set" );
    assertEquals( "Yamaha ES209 Drumstick Set", drumSticks.getIdentifier() );
  }

}