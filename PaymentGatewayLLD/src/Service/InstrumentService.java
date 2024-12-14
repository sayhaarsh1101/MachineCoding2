package Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Instrument;

public abstract class InstrumentService {
    static Map<String, List<Instrument>> userVsInstrument = new HashMap<>();
    public  abstract Instrument addInstrument(Instrument instrument);
    public abstract List<Instrument> getInstruments ();
}
