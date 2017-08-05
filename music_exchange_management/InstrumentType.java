package music_exchange_management;

public enum InstrumentType{
  WIND, WOODWIND, STRING, PERCUSSION, ELECTRONIC;

  public String toString(){

      switch( this ) {
        case WIND:        return "Wind";
        case WOODWIND:    return "Woodwind";
        case STRING:      return "String";
        case PERCUSSION:  return "Percussion";
        case ELECTRONIC:  return "Electronic";
        default:          return "Unspecified";
      }

    }
}