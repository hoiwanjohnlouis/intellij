package com.hwtechservicesllc.staging2016.views;

import org.apache.log4j.Logger;

import com.hwtechservicesllc.staging2016.enums.EMsgType;
import com.hwtechservicesllc.staging2016.fields.*;

/***************************************************************************
 * Copyright 01/20/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

public class PriceView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

    private final EMsgType msgType;
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

    public EMsgType getMsgType() {
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

        private EMsgType msgType;
        private TickerSymbol tickerSymbol;
        private Price lastTradePrice;
        private Quantity lastTradeQuantity;
        private DateStamp lastTradeDateStamp;
        private TimeStamp lastTradeTimeStamp;

        //
        public PriceViewBuilder(EMsgType msgType, TickerSymbol tickerSymbol) {
            this.msgType = msgType;
            this.tickerSymbol = tickerSymbol;
            this.lastTradePrice = new Price();
            this.lastTradeQuantity = new Quantity();
            this.lastTradeDateStamp = new DateStamp();
            this.lastTradeTimeStamp = new TimeStamp();
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
