package com.hwtechservicesllc.staging2022;

import com.hwtechservicesllc.staging2022.enums.FIXTag;

import com.hwtechservicesllc.staging2022.enums.Tag35MsgType;
import com.hwtechservicesllc.staging2022.factories.FIXMessage;

public class Main {

    public static void main(String[] args) {

        double openingPrice = 0.0d;
        String companyName = "International Business Machines, Inc.";

        FIXTag tagger = FIXTag.ACCOUNT;

        FIXMessage record =
                new FIXMessage.Builder(Tag35MsgType.NEW_ORDER)
                        .buildCompanyName(companyName)
                        .buildTickerSymbol("IBM")
                        .buildOpeningPrice(12.34D)
                        .buildPreviousDaysClosingPrice(56.78D)
                        .buildLastTradePrice(90.12D)
                        .buildLastTradeQuantity(123.4D)
                        .buildLastTradeDateStamp("20220130")
                        .buildLastTradeTimeStamp("102346 EST")
                        .build();

        System.out.println(record);
    }
}