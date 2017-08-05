import static org.junit.Assert.*;
import org.junit.*;
import music_exchange_management.*;

public class ShopTest{

  Shop rainbowMusic;
  Guitar fenderBender;
  DrumSticks drumSticks;

  @Before
  public void before(){
    rainbowMusic = new Shop();
    fenderBender = new Guitar( 300.00, 499.99, "Fender NoteBender21", "Beechwood", "Red", InstrumentType.STRING, "Thrum", 6 );
    drumSticks = new DrumSticks( 8.00, 11.99, "Yamaha ES209 Drumsticks" );
  }

  @Test
  public void canAddToStock(){
    rainbowMusic.addToStock( fenderBender );
    rainbowMusic.addToStock( drumSticks );
    assertEquals( 2, rainbowMusic.stockCount() );
  }

  @Test
  public void canRemoveFromStock(){
    rainbowMusic.addToStock( fenderBender );
    rainbowMusic.addToStock( drumSticks );
    rainbowMusic.removeFromStock( fenderBender );
    assertEquals( 1, rainbowMusic.stockCount() );
  }

}
