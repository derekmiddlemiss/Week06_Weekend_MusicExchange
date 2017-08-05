import static org.junit.Assert.*;
import org.junit.*;
import music_exchange_management.*;

public class InstrumentTest{

  Guitar fenderBender;

  @Before
  public void before(){
    fenderBender = new Guitar( 300.00, 499.99, "Fender NoteBender21", "Beechwood", "Red", InstrumentType.STRING, "Thrum", 6 );
  }

  //Test two interface methods
  @Test
  public void testCanPlay(){
    assertEquals( "Thrum", fenderBender.play() );
  }

  @Test
  public void testCalculateMarkup(){
    assertEquals( 199.99, fenderBender.calculateMarkup(), 0.001 );
  }

  //Test method inherited from Product
  @Test
  public void testGetIdentifier(){
    assertEquals( "Fender NoteBender21", fenderBender.getIdentifier() );
  }

  @Test
  public void testGetMaterial(){
    assertEquals( "Beechwood", fenderBender.getMaterial() );
  }

  @Test
  public void testGetColour(){
    assertEquals( "Red", fenderBender.getColour() );
  }

  @Test
  public void testGetType(){
    assertEquals( "String", fenderBender.getType() );
  }

  @Test
  public void testGetNumStrings(){
    assertEquals( 6, fenderBender.getNumStrings() );
  }

}