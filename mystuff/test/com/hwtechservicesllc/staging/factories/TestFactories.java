package com.hwtechservicesllc.staging.factories;

import com.hwtechservicesllc.staging.enums.EFieldType;
import com.hwtechservicesllc.staging.enums.EMsgType;
import com.hwtechservicesllc.staging.fields.CompanyName;
import com.hwtechservicesllc.staging.fields.TickerSymbol;
import com.hwtechservicesllc.staging.views.TradeView;
import org.apache.log4j.Logger;

public class TestFactories {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    public static void main (String[] args) {

        //  testing ticker record construction
        CompanyName companyName = new CompanyName(EFieldType.COMPANY_NAME, "Wigets, Inc.");
        TickerSymbol tickerSymbol = new TickerSymbol(EFieldType.TICKER_SYMBOL, "WIDG");
        TradeView testView = new TradeView.TradeViewBuilder(EMsgType.EXECUTION_REPORT, companyName, tickerSymbol).build();
        System.out.println(testView);

    }

}