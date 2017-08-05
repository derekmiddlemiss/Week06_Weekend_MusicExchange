package music_exchange_management;

public class Guitar extends Instrument{

  private int numStrings;

  public Guitar( double buyPrice, double sellPrice, String identifier, String material, String colour, InstrumentType type, String noise, int numStrings ){
    super( buyPrice, sellPrice, identifier, material, colour, type, noise );
    this.numStrings = numStrings;
  }

  public int getNumStrings(){
    return this.numStrings;
  }



}