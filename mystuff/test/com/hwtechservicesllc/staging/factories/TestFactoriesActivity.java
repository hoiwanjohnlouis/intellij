package com.hwtechservicesllc.staging.factories;


import com.hwtechservicesllc.ms.factory.factories.Record;
import com.hwtechservicesllc.ms.factory.factories.RecordBuilder;
import com.hwtechservicesllc.ms.factory.factories.TradeBuilder;
import com.hwtechservicesllc.staging.enums.EMsgType;

public class TestFactoriesActivity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    public static void main (String[] args) {

        //  testing ticker record construction
        RecordBuilder createTrade = new TradeBuilder();
        Record record = createTrade.orderRecord(EMsgType.EXECUTION_REPORT);
        System.out.println(record + "\n");


    }

}
