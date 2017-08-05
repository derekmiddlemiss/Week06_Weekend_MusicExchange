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

  public void removeFromStock( Sellable item ){
    int index = this.stock.indexOf( item );
    this.stock.remove( index );
  }

  public int stockCount(){
    return this.stock.size();
  }

}