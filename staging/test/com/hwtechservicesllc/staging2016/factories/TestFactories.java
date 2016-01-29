package com.hwtechservicesllc.staging2016.factories;

import com.hwtechservicesllc.staging2016.enums.EFieldType;
import com.hwtechservicesllc.staging2016.enums.EMsgType;
import com.hwtechservicesllc.staging2016.fields.CompanyName;
import com.hwtechservicesllc.staging2016.fields.TickerSymbol;
import com.hwtechservicesllc.staging2016.views.TradeView;
import org.apache.log4j.Logger;

public class TestFactories {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = Logger.getLogger("com.hwtechservicesllc.factories" +
            ".TestFactories");

    public static void main (String[] args) {

        //  testing ticker record construction
        CompanyName companyName = new CompanyName(EFieldType.COMPANY_NAME, "Wigets, Inc.");
        TickerSymbol tickerSymbol = new TickerSymbol(EFieldType.TICKER_SYMBOL, "WIDG");
        TradeView testView = new TradeView.TradeViewBuilder(EMsgType.EXECUTION_REPORT, companyName, tickerSymbol).build();
        System.out.println(testView);

    }

}
