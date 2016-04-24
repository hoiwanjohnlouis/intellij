package com.hwtechservicesllc.staging2016.views;

import com.hwtechservicesllc.staging2016.enums.MsgType;
import com.hwtechservicesllc.staging2016.fields.CompanyName;
import com.hwtechservicesllc.staging2016.fields.TickerSymbol;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Copyright 01/17/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TestViews {

    private final static Logger logger = LogManager.getRootLogger();

    public static void main (String[] args) {


        CompanyName companyName = new CompanyName();
        TickerSymbol tickerSymbol = new TickerSymbol();
        TradeView testView =
                new TradeView.TradeViewBuilder(MsgType.EXECUTION_REPORT).
                        buildCompanyName(companyName).
                        buildTickerSymbol(tickerSymbol).
                        build();
        System.out.println(testView);
        logger.info("%s",testView);

        PriceView priceView =
                new PriceView.PriceViewBuilder(MsgType.EXECUTION_REPORT).
                        buildTickerSymbol(tickerSymbol).
                        build();
        System.out.println(priceView);

    }
}
