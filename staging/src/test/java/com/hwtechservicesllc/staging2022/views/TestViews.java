package com.hwtechservicesllc.staging2022.views;

import com.hwtechservicesllc.staging2022.fields.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.CompanyName;
import com.hwtechservicesllc.staging2022.fields.Tag55Symbol;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/17/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TestViews {

    private static final String DEBUG_TAG = TestViews.class.getSimpleName();
    //    private static final Logger logger = Logger.getLogger(DEBUG_TAG);
    private static final Logger logger = LogManager.getRootLogger();

    public static void main (String[] args) {

        CompanyName companyName = new CompanyName();
        Tag55Symbol tag55Symbol = new Tag55Symbol();
        TradeView testView =
                new TradeView.TradeViewBuilder(Tag35MsgType.EXECUTION_REPORT).
                        buildCompanyName(companyName).
                        buildTickerSymbol(tag55Symbol).
                        build();
        System.out.println(testView);
        logger.info(testView);

        PriceView priceView =
                new PriceView.PriceViewBuilder(Tag35MsgType.EXECUTION_REPORT).
                        buildTickerSymbol(tag55Symbol).
                        build();
        System.out.println(priceView);

    }
}