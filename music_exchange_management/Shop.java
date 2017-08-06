package music_exchange_management;
import behaviours.*;
import java.util.*;

public class Shop{

  private ArrayList<Sellable> stock;

  public Shop(){
    this.stock = new ArrayList<Sellable>();
  }

  public void addToStock( Sellable item ){
    this.stock.add( item );
  }

  public boolean removeFromStock( Sellable item ){
    try {

      int index = this.stock.indexOf( item );
      this.stock.remove( index );
      return true;

    } catch ( ArrayIndexOutOfBoundsException e ) {

      return false;

    }
  }

  public int stockCount(){
    return this.stock.size();
  }

  public double calculateMaxProfit(){
    double maxProfit = 0.0;
    for( Sellable item : this.stock ){
      maxProfit += item.calculateMarkup();
    }
    return maxProfit;
  }

}