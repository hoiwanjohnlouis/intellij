package com.hwtechservicesllc.staging2022.views;

import com.hwtechservicesllc.staging2022.enums.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TradeView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final CompanyName companyName;
    private final TickerSymbol tickerSymbol;
    private final OpeningPrice openingPrice;
    private final OpeningPrice previousDaysClosingPrice;
    private final OpeningPrice lastTradeOpeningPrice;
    private final LastTradeQuantity lastTradeQuantity;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        this.tag35MsgType = tradeViewBuilder.tag35MsgType;
        this.companyName = tradeViewBuilder.companyName;
        this.tickerSymbol = tradeViewBuilder.tickerSymbol;
        this.openingPrice = tradeViewBuilder.openingPrice;
        this.previousDaysClosingPrice = tradeViewBuilder.previousDaysClosingPrice;
        this.lastTradeOpeningPrice = tradeViewBuilder.lastTradeOpeningPrice;
        this.lastTradeQuantity = tradeViewBuilder.lastTradeQuantity;
        this.lastTradeDateStamp = tradeViewBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = tradeViewBuilder.lastTradeTimeStamp;
    }

    @Override
    public String toString(){
        stringBuilder.setLength(0);
        stringBuilder.append(tag35MsgType);
        stringBuilder.append("\n");
        stringBuilder.append(companyName);
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol);
        stringBuilder.append("\n");
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeOpeningPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeQuantity);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeDateStamp);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeTimeStamp);

        return stringBuilder.toString();
    }


    // static helper class to build tradeview
    public static class TradeViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private Tag35MsgType tag35MsgType;
        private CompanyName companyName;
        private TickerSymbol tickerSymbol;
        private OpeningPrice openingPrice;
        private OpeningPrice previousDaysClosingPrice;
        private OpeningPrice lastTradeOpeningPrice;
        private LastTradeQuantity lastTradeQuantity;
        private LastTradeDateStamp lastTradeDateStamp;
        private LastTradeTimeStamp lastTradeTimeStamp;

        // static helper class to build object
        public TradeViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            this.companyName = new CompanyName();
            this.tickerSymbol = new TickerSymbol();
            this.openingPrice = new OpeningPrice();
            this.previousDaysClosingPrice = new OpeningPrice();
            this.lastTradeOpeningPrice = new OpeningPrice();
            this.lastTradeQuantity = new LastTradeQuantity();
            this.lastTradeDateStamp = new LastTradeDateStamp();
            this.lastTradeTimeStamp = new LastTradeTimeStamp();
        }

        public TradeViewBuilder buildCompanyName(CompanyName companyName) {
            this.companyName = companyName;
            return this;
        }

        public TradeViewBuilder buildTickerSymbol(TickerSymbol tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
            return this;
        }

        public TradeViewBuilder buildOpeningPrice(OpeningPrice openingPrice) {
            this.openingPrice = openingPrice;
            return this;
        }

        public TradeViewBuilder buildPreviousDaysClosingPrice(OpeningPrice previousDaysClosingPrice) {
            this.previousDaysClosingPrice = previousDaysClosingPrice;
            return this;
        }

        public TradeViewBuilder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }

        public TradeViewBuilder buildTradeQuantity(LastTradeQuantity lastTradeQuantity) {
            this.lastTradeQuantity = lastTradeQuantity;
            return this;
        }

        public TradeViewBuilder buildTradeDateStamp(LastTradeDateStamp lastTradeDateStamp) {
            this.lastTradeDateStamp = lastTradeDateStamp;
            return this;
        }

        public TradeViewBuilder buildTradeTimeStamp(LastTradeTimeStamp lastTradeTimeStamp) {
            this.lastTradeTimeStamp = lastTradeTimeStamp;
            return this;
        }

        public TradeView build() {
            return new TradeView(this);
        }
    }

}
