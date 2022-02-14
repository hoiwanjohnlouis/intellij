package com.hwtechservicesllc.staging2022.views;

import com.hwtechservicesllc.staging2022.fields.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2022 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class TradeView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final CompanyName companyName;
    private final Tag55Symbol tag55Symbol;
    private final OpeningPrice openingPrice;
    private final OpeningPrice previousDaysClosingPrice;
    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag32LastQty tag32LastQty;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        this.tag35MsgType = tradeViewBuilder.tag35MsgType;
        this.companyName = tradeViewBuilder.companyName;
        this.tag55Symbol = tradeViewBuilder.tag55Symbol;
        this.openingPrice = tradeViewBuilder.openingPrice;
        this.previousDaysClosingPrice = tradeViewBuilder.previousDaysClosingPrice;
        this.lastTradeOpeningPrice = tradeViewBuilder.lastTradeOpeningPrice;
        this.tag32LastQty = tradeViewBuilder.tag32LastQty;
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
        stringBuilder.append(tag55Symbol);
        stringBuilder.append("\n");
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeOpeningPrice);
        stringBuilder.append("\n");
        stringBuilder.append(tag32LastQty);
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
        private Tag55Symbol tag55Symbol;
        private OpeningPrice openingPrice;
        private OpeningPrice previousDaysClosingPrice;
        private OpeningPrice lastTradeOpeningPrice;
        private Tag32LastQty tag32LastQty;
        private LastTradeDateStamp lastTradeDateStamp;
        private LastTradeTimeStamp lastTradeTimeStamp;

        // static helper class to build object
        public TradeViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            this.companyName = new CompanyName();
            this.tag55Symbol = new Tag55Symbol();
            this.openingPrice = new OpeningPrice();
            this.previousDaysClosingPrice = new OpeningPrice();
            this.lastTradeOpeningPrice = new OpeningPrice();
            this.tag32LastQty = new Tag32LastQty();
            this.lastTradeDateStamp = new LastTradeDateStamp();
            this.lastTradeTimeStamp = new LastTradeTimeStamp();
        }

        public TradeViewBuilder buildCompanyName(CompanyName companyName) {
            this.companyName = companyName;
            return this;
        }

        public TradeViewBuilder buildTickerSymbol(Tag55Symbol tag55Symbol) {
            this.tag55Symbol = tag55Symbol;
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

        public TradeViewBuilder buildTradeQuantity(Tag32LastQty tag32LastQty) {
            this.tag32LastQty = tag32LastQty;
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