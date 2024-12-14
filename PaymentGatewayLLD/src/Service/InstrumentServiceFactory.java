package Service;

import enums.IntrumentType;

public class InstrumentServiceFactory {

    public InstrumentService gInstrumentService(IntrumentType instrumentType){
        if(instrumentType == null){
            return null;
        } else if (instrumentType == IntrumentType.BANK){
            return new BankService();
        } else if (instrumentType == IntrumentType.CARD){
            return new CardService();
        }
        return null;
    }
    
}
