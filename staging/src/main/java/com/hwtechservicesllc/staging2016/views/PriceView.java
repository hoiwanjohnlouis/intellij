package com.hwtechservicesllc.staging2016.views;

import com.hwtechservicesllc.staging2016.enums.MsgType;
import com.hwtechservicesllc.staging2016.fields.*;
import org.apache.log4j.Level;
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

    private final MsgType msgType;
    private final TickerSymbol tickerSymbol;
    private final Price lastTradePrice;
    private final Quantity lastTradeQuantity;
    private final DateStamp lastTradeDateStamp;
    private final TimeStamp lastTradeTimeStamp;

    //
    private PriceView(PriceViewBuilder priceViewBuilder) {
        this.msgType = priceViewBuilder.msgType;
        this.tickerSymbol = priceViewBuilder.tickerSymbol;
        this.lastTradePrice = priceViewBuilder.lastTradePrice;
        this.lastTradeQuantity = priceViewBuilder.lastTradeQuantity;
        this.lastTradeDateStamp = priceViewBuilder.lastTradeDateStamp;
        this.lastTradeTimeStamp = priceViewBuilder.lastTradeTimeStamp;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }

    public Price getLastTradePrice() {
        return lastTradePrice;
    }

    public Quantity getLastTradeQuantity() {
        return lastTradeQuantity;
    }

    public DateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }

    public TimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }

    //
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(msgType);
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol);
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


    public static class PriceViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private MsgType msgType;
        private TickerSymbol tickerSymbol;
        private Price lastTradePrice;
        private Quantity lastTradeQuantity;
        private DateStamp lastTradeDateStamp;
        private TimeStamp lastTradeTimeStamp;

        //
        public PriceViewBuilder(MsgType msgType) {
            this.msgType = msgType;
            this.tickerSymbol = new TickerSymbol();
            this.lastTradePrice = new Price();
            this.lastTradeQuantity = new Quantity();
            this.lastTradeDateStamp = new DateStamp();
            this.lastTradeTimeStamp = new TimeStamp();
        }

        public PriceViewBuilder buildTickerSymbol(TickerSymbol tickerSymbol) {
            this.tickerSymbol = tickerSymbol;
            return this;
        }

        public PriceViewBuilder buildTradePrice(Price lastTradePrice) {
            this.lastTradePrice = lastTradePrice;
            return this;
        }

        public PriceViewBuilder buildTradeQuantity(Quantity lastTradeQuantity) {
            this.lastTradeQuantity = lastTradeQuantity;
            return this;
        }

        public PriceViewBuilder buildTradeDateStamp(DateStamp lastTradeDateStamp) {
            this.lastTradeDateStamp = lastTradeDateStamp;
            return this;
        }

        public PriceViewBuilder buildTradeTimeStamp(TimeStamp lastTradeTimeStamp) {
            this.lastTradeTimeStamp = lastTradeTimeStamp;
            return this;
        }

        public PriceView build() {
            return new PriceView(this);
        }
    }

}
