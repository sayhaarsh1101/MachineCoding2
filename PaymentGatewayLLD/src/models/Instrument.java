package models;

import enums.IntrumentType;

public abstract class Instrument {
    String instrumentId;
    String userId;
    IntrumentType instrumentType;

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId){
        this.instrumentId = instrumentId;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public IntrumentType getInstrumentType(){
        return instrumentType;
    }

    public void setInstrumentType(IntrumentType instrumentType){
        this.instrumentType = instrumentType;
    }
}
