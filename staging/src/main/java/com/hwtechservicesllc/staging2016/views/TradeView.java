package com.hwtechservicesllc.staging2016.views;

import com.hwtechservicesllc.staging2016.enums.MsgType;
import com.hwtechservicesllc.staging2016.fields.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TradeView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final MsgType msgType;
    private final CompanyName companyName;
    private final TickerSymbol tickerSymbol;
    private final Price openingPrice;
    private final Price previousDaysClosingPrice;
    private final Price lastTradePrice;
    private final Quantity lastTradeQuantity;
    private final DateStamp lastTradeDateStamp;
    private final TimeStamp lastTradeTimeStamp;
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        this.msgType = tradeViewBuilder.msgType;
        this.companyName = tradeViewBuilder.companyName;
        this.tickerSymbol = tradeViewBuilder.tickerSymbol;
        this.openingPrice = tradeViewBuilder.openingPrice;
        this.previousDaysClosingPrice = tradeViewBuilder.previousDaysClosingPrice;
        this.lastTradePrice = tradeViewBuilder.lastTradePrice;
        this.lastTradeQuantity = tradeViewBuilder.lastTradeQuantity;
        this.lastTradeDateStamp = tradeViewBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = tradeViewBuilder.lastTradeTimeStamp;
    }

    @Override
    public String toString(){
        stringBuilder.setLength(0);
        stringBuilder.append(msgType);
        stringBuilder.append("\n");
        stringBuilder.append(companyName);
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol);
        stringBuilder.append("\n");
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradePrice);
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

        private MsgType msgType;
        private CompanyName companyName;
        private TickerSymbol tickerSymbol;
        private Price openingPrice;
        private Price previousDaysClosingPrice;
        private Price lastTradePrice;
        private Quantity lastTradeQuantity;
        private DateStamp lastTradeDateStamp;
        private TimeStamp lastTradeTimeStamp;

        // static helper class to build object
        public TradeViewBuilder(MsgType msgType) {
            this.msgType = msgType;
            this.companyName = new CompanyName();
            this.tickerSymbol = new TickerSymbol();
            this.openingPrice = new Price();
            this.previousDaysClosingPrice = new Price();
            this.lastTradePrice = new Price();
            this.lastTradeQuantity = new Quantity();
            this.lastTradeDateStamp = new DateStamp();
            this.lastTradeTimeStamp = new TimeStamp();
        }

        public TradeViewBuilder buildCompanyName(CompanyName companyName) {
            this.companyName = companyName;
            return this;
        }

        public TradeViewBuilder buildTickerSymbol(TickerSymbol tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
            return this;
        }

        public TradeViewBuilder buildOpeningPrice(Price openingPrice) {
            this.openingPrice = openingPrice;
            return this;
        }

        public TradeViewBuilder buildPreviousDaysClosingPrice(Price previousDaysClosingPrice) {
            this.previousDaysClosingPrice = previousDaysClosingPrice;
            return this;
        }

        public TradeViewBuilder buildTradePrice(Price lastTradePrice) {
            this.lastTradePrice = lastTradePrice;
            return this;
        }

        public TradeViewBuilder buildTradeQuantity(Quantity lastTradeQuantity) {
            this.lastTradeQuantity = lastTradeQuantity;
            return this;
        }

        public TradeViewBuilder buildTradeDateStamp(DateStamp lastTradeDateStamp) {
            this.lastTradeDateStamp = lastTradeDateStamp;
            return this;
        }

        public TradeViewBuilder buildTradeTimeStamp(TimeStamp lastTradeTimeStamp) {
            this.lastTradeTimeStamp = lastTradeTimeStamp;
            return this;
        }

        public TradeView build() {
            return new TradeView(this);
        }
    }

}
