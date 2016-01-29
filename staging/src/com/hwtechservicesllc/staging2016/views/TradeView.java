package com.hwtechservicesllc.staging2016.views;

import com.hwtechservicesllc.staging2016.enums.EMsgType;
import com.hwtechservicesllc.staging2016.fields.*;

import org.apache.log4j.Logger;

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

public class TradeView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    private final EMsgType msgType;
    private final CompanyName companyName;
    private final TickerSymbol tickerSymbol;
    private final Price openingPrice;
    private final Price previousDaysClosingPrice;
    private final Price lastTradePrice;
    private final Quantity lastTradeQuantity;
    private final DateStamp lastTradeDateStamp;
    private final TimeStamp lastTradeTimeStamp;

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

        private EMsgType msgType;
        private CompanyName companyName;
        private TickerSymbol tickerSymbol;
        private Price openingPrice;
        private Price previousDaysClosingPrice;
        private Price lastTradePrice;
        private Quantity lastTradeQuantity;
        private DateStamp lastTradeDateStamp;
        private TimeStamp lastTradeTimeStamp;

        // static helper class to build object
        public TradeViewBuilder(EMsgType msgType, CompanyName companyName, TickerSymbol tickerSymbol) {
            this.msgType = msgType;
            this.companyName = companyName;
            this.tickerSymbol = tickerSymbol;
            this.openingPrice = new Price();
            this.previousDaysClosingPrice = new Price();
            this.lastTradePrice = new Price();
            this.lastTradeQuantity = new Quantity();
            this.lastTradeDateStamp = new DateStamp();
            this.lastTradeTimeStamp = new TimeStamp();
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
