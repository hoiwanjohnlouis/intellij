package com.hwtechservicesllc.staging2022.views;

import com.hwtechservicesllc.staging2022.fields.Tag35MsgType;
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
    private final Tag55Symbol tag55Symbol;
    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag32LastQty tag32LastQty;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;

    //
    private PriceView(PriceViewBuilder priceViewBuilder) {
        this.tag35MsgType = priceViewBuilder.tag35MsgType;
        this.tag55Symbol = priceViewBuilder.tag55Symbol;
        this.lastTradeOpeningPrice = priceViewBuilder.lastTradeOpeningPrice;
        this.tag32LastQty = priceViewBuilder.tag32LastQty;
        this.lastTradeDateStamp = priceViewBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = priceViewBuilder.lastTradeTimeStamp;
    }

    public Tag35MsgType getMsgType() {
        return tag35MsgType;
    }

    public Tag55Symbol getTickerSymbol() {
        return tag55Symbol;
    }

    public OpeningPrice getLastTradePrice() {
        return lastTradeOpeningPrice;
    }

    public Tag32LastQty getLastTradeQuantity() {
        return tag32LastQty;
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
        stringBuilder.append(tag55Symbol);
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


    public static class PriceViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private Tag35MsgType tag35MsgType;
        private Tag55Symbol tag55Symbol;
        private OpeningPrice lastTradeOpeningPrice;
        private Tag32LastQty tag32LastQty;
        private LastTradeDateStamp lastTradeDateStamp;
        private LastTradeTimeStamp lastTradeTimeStamp;

        //
        public PriceViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            this.tag55Symbol = new Tag55Symbol();
            this.lastTradeOpeningPrice = new OpeningPrice();
            this.tag32LastQty = new Tag32LastQty();
            this.lastTradeDateStamp = new LastTradeDateStamp();
            this.lastTradeTimeStamp = new LastTradeTimeStamp();
        }

        public PriceViewBuilder buildTickerSymbol(Tag55Symbol tag55Symbol) {
            this.tag55Symbol = tag55Symbol;
            return this;
        }

        public PriceViewBuilder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }

        public PriceViewBuilder buildTradeQuantity(Tag32LastQty tag32LastQty) {
            this.tag32LastQty = tag32LastQty;
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
