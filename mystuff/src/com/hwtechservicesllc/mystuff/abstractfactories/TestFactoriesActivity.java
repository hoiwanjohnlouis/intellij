package com.hwtechservicesllc.mystuff.abstractfactories;


import com.hwtechservicesllc.mystuff.abstractfactories.factories.Record;
import com.hwtechservicesllc.mystuff.abstractfactories.factories.RecordBuilding;
import com.hwtechservicesllc.mystuff.abstractfactories.factories.TradeBuilding;
import com.hwtechservicesllc.mystuff.abstractfactories.fields.ERecordType;

public class TestFactoriesActivity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    public static void main (String[] args) {

        //  testing ticker record construction
        RecordBuilding createTrade = new TradeBuilding();
        Record record = createTrade.orderRecord(ERecordType.TRADE_RECORD);
        System.out.println(record + "\n");


    }

}
