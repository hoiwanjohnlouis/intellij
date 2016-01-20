package com.hwtechservicesllc.ms.abstractfactories;


import com.hwtechservicesllc.ms.stocks.enums.MsgType;
import com.hwtechservicesllc.ms.abstractfactories.factories.Record;
import com.hwtechservicesllc.ms.abstractfactories.factories.RecordBuilder;
import com.hwtechservicesllc.ms.abstractfactories.factories.TradeBuilder;

public class TestFactoriesActivity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    public static void main (String[] args) {

        //  testing ticker record construction
        RecordBuilder createTrade = new TradeBuilder();
        Record record = createTrade.orderRecord(MsgType.EXECUTION_REPORT);
        System.out.println(record + "\n");


    }

}
