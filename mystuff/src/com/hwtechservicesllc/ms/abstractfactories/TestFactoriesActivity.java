package com.hwtechservicesllc.ms.abstractfactories;


import com.hwtechservicesllc.ms.abstractfactories.enums.MsgType;
import com.hwtechservicesllc.ms.abstractfactories.factories.Record;
import com.hwtechservicesllc.ms.abstractfactories.factories.RecordBuilding;
import com.hwtechservicesllc.ms.abstractfactories.factories.TradeBuilding;

public class TestFactoriesActivity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    public static void main (String[] args) {

        //  testing ticker record construction
        RecordBuilding createTrade = new TradeBuilding();
        Record record = createTrade.orderRecord(MsgType.EXECUTION_REPORT);
        System.out.println(record + "\n");


    }

}
