/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.staging2022.views;

import com.hwtsllc.staging2022.fields.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PriceView {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final Tag55Symbol tag55Symbol;
    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag32LastQty tag32LastQty;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final Tag60TransactTime tag60TransactTime;

    //
    private PriceView(PriceViewBuilder priceViewBuilder) {
        this.tag35MsgType = priceViewBuilder.tag35MsgType;
        this.tag55Symbol = priceViewBuilder.tag55Symbol;
        this.lastTradeOpeningPrice = priceViewBuilder.lastTradeOpeningPrice;
        this.tag32LastQty = priceViewBuilder.tag32LastQty;
        this.lastTradeDateStamp = priceViewBuilder.lastTradeDateStamp;
        this.tag60TransactTime = priceViewBuilder.tag60TransactTime;
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

    public Tag60TransactTime getLastTradeTimeStamp() {
        return tag60TransactTime;
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
        stringBuilder.append(tag60TransactTime);

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
        private Tag60TransactTime tag60TransactTime;

        //
        public PriceViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            this.tag55Symbol = new Tag55Symbol();
            this.lastTradeOpeningPrice = new OpeningPrice();
            this.tag32LastQty = new Tag32LastQty();
            this.lastTradeDateStamp = new LastTradeDateStamp();
            this.tag60TransactTime = new Tag60TransactTime();
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

        public PriceViewBuilder buildTradeTimeStamp(Tag60TransactTime tag60TransactTime) {
            this.tag60TransactTime = tag60TransactTime;
            return this;
        }

        public PriceView build() {
            return new PriceView(this);
        }
    }

}
