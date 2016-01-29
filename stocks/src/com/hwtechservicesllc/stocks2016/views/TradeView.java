package com.hwtechservicesllc.stocks2016.views;
/*
    Copyright (c) 2014  Hoi Wan Louis
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

import com.hwtechservicesllc.stocks2016.enums.MsgType;
import com.hwtechservicesllc.stocks2016.fields.*;

public class TradeView {

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

    //
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

    // Only getters for these fields
    public MsgType getMsgType() {
        return msgType;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }


    // getters & setters for remaining fields
    public Price getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(Price openingPrice) {
        this.openingPrice = openingPrice;
    }

    public Price getPreviousDaysClosingPrice() {
        return previousDaysClosingPrice;
    }

    public void setPreviousDaysClosingPrice(Price previousDaysClosingPrice) {
        this.previousDaysClosingPrice = previousDaysClosingPrice;
    }

    public Price getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(Price lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public Quantity getLastTradeQuantity() {
        return lastTradeQuantity;
    }

    public void setLastTradeQuantity(Quantity lastTradeQuantity) {
        this.lastTradeQuantity = lastTradeQuantity;
    }

    public DateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }

    public void setLastTradeDateStamp(DateStamp lastTradeDateStamp) {
        this.lastTradeDateStamp = lastTradeDateStamp;
    }

    public TimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }

    public void setLastTradeTimeStamp(TimeStamp lastTradeTimeStamp) {
        this.lastTradeTimeStamp = lastTradeTimeStamp;
    }

    //
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
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
        public TradeViewBuilder(MsgType msgType, CompanyName companyName, TickerSymbol tickerSymbol) {
            this.msgType = msgType;
            this.companyName = companyName;
            this.tickerSymbol = tickerSymbol;
            this.openingPrice = Price.DEFAULT_PRICE_FIELD;
            this.previousDaysClosingPrice = Price.DEFAULT_PRICE_FIELD;
            this.lastTradePrice = Price.DEFAULT_PRICE_FIELD;
            this.lastTradeQuantity = Quantity.DEFAULT_QUANTITY_FIELD;
            this.lastTradeDateStamp = DateStamp.DEFAULT_DATE_STAMP_FIELD;
            this.lastTradeTimeStamp = TimeStamp.DEFAULT_TIME_STAMP_FIELD;
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
