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

public class PriceView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final TickerSymbol tickerSymbol;
    private final OpeningPrice lastTradeOpeningPrice;
    private final LastTradeQuantity lastTradeQuantity;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;

    //
    private PriceView(PriceViewBuilder priceViewBuilder) {
        this.tag35MsgType = priceViewBuilder.tag35MsgType;
        this.tickerSymbol = priceViewBuilder.tickerSymbol;
        this.lastTradeOpeningPrice = priceViewBuilder.lastTradeOpeningPrice;
        this.lastTradeQuantity = priceViewBuilder.lastTradeQuantity;
        this.lastTradeDateStamp = priceViewBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = priceViewBuilder.lastTradeTimeStamp;
    }

    public Tag35MsgType getMsgType() {
        return tag35MsgType;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }

    public OpeningPrice getLastTradePrice() {
        return lastTradeOpeningPrice;
    }

    public LastTradeQuantity getLastTradeQuantity() {
        return lastTradeQuantity;
    }

    public LastTradeDateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }

    public LastTradeTimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }

    //
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tag35MsgType);
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol);
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


    public static class PriceViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private Tag35MsgType tag35MsgType;
        private TickerSymbol tickerSymbol;
        private OpeningPrice lastTradeOpeningPrice;
        private LastTradeQuantity lastTradeQuantity;
        private LastTradeDateStamp lastTradeDateStamp;
        private LastTradeTimeStamp lastTradeTimeStamp;

        //
        public PriceViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            this.tickerSymbol = new TickerSymbol();
            this.lastTradeOpeningPrice = new OpeningPrice();
            this.lastTradeQuantity = new LastTradeQuantity();
            this.lastTradeDateStamp = new LastTradeDateStamp();
            this.lastTradeTimeStamp = new LastTradeTimeStamp();
        }

        public PriceViewBuilder buildTickerSymbol(TickerSymbol tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
            return this;
        }

        public PriceViewBuilder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }

        public PriceViewBuilder buildTradeQuantity(LastTradeQuantity lastTradeQuantity) {
            this.lastTradeQuantity = lastTradeQuantity;
            return this;
        }

        public PriceViewBuilder buildTradeDateStamp(LastTradeDateStamp lastTradeDateStamp) {
            this.lastTradeDateStamp = lastTradeDateStamp;
            return this;
        }

        public PriceViewBuilder buildTradeTimeStamp(LastTradeTimeStamp lastTradeTimeStamp) {
            this.lastTradeTimeStamp = lastTradeTimeStamp;
            return this;
        }

        public PriceView build() {
            return new PriceView(this);
        }
    }

}
