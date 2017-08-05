package music_exchange_management;
import behaviours.*;


public class Product implements Sellable{

  protected double buyPrice;
  protected double sellPrice;
  protected String identifier;

  public Product( double buyPrice, double sellPrice, String identifier ){
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.identifier = identifier;
  }

  public double calculateMarkup(){
    return this.sellPrice - this.buyPrice;
  }

  public double getBuyPrice(){
    return this.buyPrice;
  }

  public double getSellPrice(){
    return this.sellPrice;
  }

  public String getIdentifier(){
    return this.identifier;
  }

  public void setSellPrice( double sellPrice ){
    this.sellPrice = sellPrice;
  }

  public void setIdentifier( String identifier ){
    this.identifier = identifier;
  }

}