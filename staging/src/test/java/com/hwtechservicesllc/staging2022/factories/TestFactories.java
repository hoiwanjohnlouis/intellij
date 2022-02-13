package com.hwtechservicesllc.staging2022.factories;


import com.hwtechservicesllc.staging2022.fields.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.CompanyName;
import com.hwtechservicesllc.staging2022.fields.Tag55Symbol;
import com.hwtechservicesllc.staging2022.views.TradeView;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestFactories {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public static void main (String[] args) {

        //  testing ticker record construction
        CompanyName companyName = new CompanyName();
        Tag55Symbol tag55Symbol = new Tag55Symbol();
        TradeView testView =
                new TradeView.TradeViewBuilder(Tag35MsgType.EXECUTION_REPORT).
                        buildCompanyName(companyName).
                        buildTickerSymbol(tag55Symbol).
                        build();
        System.out.println(testView);

    }

}
