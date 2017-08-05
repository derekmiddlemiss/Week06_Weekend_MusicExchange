package music_exchange_management;
import behaviours.*;

public abstract class Instrument extends Product implements Playable{

  protected String material;
  protected String colour;
  protected InstrumentType type; 
  protected String noise;

  public Instrument( double buyPrice, double sellPrice, String identifier, String material, String colour, InstrumentType type, String noise ){
    super( buyPrice, sellPrice, identifier );
    this.material = material;
    this.colour = colour;
    this.type = type;
    this.noise = noise;

  }

  public String play(){
    return this.noise;
  }

  public String getMaterial(){
    return this.material;
  }

  public String getColour(){
    return this.colour;
  }

  public String getType(){
    return this.type.toString();
  }

}