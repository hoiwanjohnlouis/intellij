package com.hwtechservicesllc.staging2022.factories;

/*
    Copyright (c) 2022  HW Tech Services, Inc., LLC

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

import com.hwtechservicesllc.staging2022.fields.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.*;
import com.hwtechservicesllc.staging2022.interfaces.VerboseLogString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FIXRecord implements VerboseLogString {
    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final CompanyName companyName;
    private final Tag55Symbol tag55Symbol;
    private final OpeningPrice openingPrice;
    private final Tag140PrevClosePx tag140PrevClosePx;
    private final Tag31LastPx tag31LastPx;
    private final Tag32LastQty tag32LastQty;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;

    //
    private FIXRecord(FIXRecord.Builder builder) {
        this.tag35MsgType = builder.tag35MsgType;
        this.companyName = builder.companyName;
        this.tag55Symbol = builder.tag55Symbol;
        this.openingPrice = builder.openingPrice;
        this.tag140PrevClosePx = builder.tag140PrevClosePx;
        this.tag31LastPx = builder.tag31LastPx;
        this.tag32LastQty = builder.tag32LastQty;
        this.lastTradeDateStamp = builder.lastTradeDateStamp;
        this.lastTradeTimeStamp = builder.lastTradeTimeStamp;
    }

    public Tag35MsgType getMsgType() {
        return tag35MsgType;
    }
    public CompanyName getCompanyName() {
        return companyName;
    }
    public Tag55Symbol getTickerSymbol() {
        return tag55Symbol;
    }
    public OpeningPrice getOpeningPrice() {
        return openingPrice;
    }
    public Tag140PrevClosePx getPreviousDaysClosingPrice() {
        return tag140PrevClosePx;
    }
    public Tag31LastPx getLastTradePrice() {
        return tag31LastPx;
    }
    public Tag32LastQty getTag32LastQty() {
        return tag32LastQty;
    }
    public LastTradeDateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }
    public LastTradeTimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder.append(tag35MsgType.getTag35MsgTypeValue())
            .append("\n")
            .append(companyName.getCompanyName())
            .append("\n")
            .append(tag55Symbol.getTickerSymbol())
            .append("\n")
            .append(openingPrice.getPrice())
            .append("\n")
            .append(tag140PrevClosePx.getTag140PrevClosePxValue())
            .append("\n")
            .append(tag31LastPx.getTag31LastPxValue())
            .append("\n")
            .append(tag32LastQty.getTag32LastQtyValue())
            .append("\n")
            .append(lastTradeDateStamp.getDateStamp())
            .append("\n")
            .append(lastTradeTimeStamp.getTimeStamp());

        return stringBuilder.toString();
    }

    @Override
    public String toVerboseLogString() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder.append(tag35MsgType)
            .append("\n\t")
            .append(companyName)
            .append("\n\t")
            .append(tag55Symbol)
            .append("\n\t")
            .append(openingPrice)
            .append("\n\t")
            .append(tag140PrevClosePx)
            .append("\n\t")
            .append(tag31LastPx)
            .append("\n\t")
            .append(tag32LastQty)
            .append("\n\t")
            .append(lastTradeDateStamp)
            .append("\n\t")
            .append(lastTradeTimeStamp);

        return stringBuilder.toString();
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class
    public static class Builder {

        private final String DEBUG_TAG = this.getClass().getSimpleName();
        private final Logger logger = LogManager.getLogger(DEBUG_TAG);

        private StringBuilder stringBuilder = new StringBuilder();

        private Tag35MsgType tag35MsgType;
        private Tag53Quantity tag53Shares;
        private Tag54Side tag54Side;
        private CompanyName companyName;                // 1
        private Tag55Symbol tag55Symbol;              // 2
        private OpeningPrice openingPrice;              // 3
        private Tag140PrevClosePx tag140PrevClosePx;    // 4
        private Tag31LastPx tag31LastPx;          // 5
        private Tag32LastQty tag32LastQty;    // 6
        private LastTradeDateStamp lastTradeDateStamp;  // 7
        private LastTradeTimeStamp lastTradeTimeStamp;  // 8

        // helper class to build object
        public Builder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
        }

        public Builder buildCompanyName(String companyName) {
            this.companyName = new CompanyName(companyName);
            return this;
        }

        public Builder buildTickerSymbol(String tickerSymbol) {
            this.tag55Symbol = new Tag55Symbol(tickerSymbol);
            return this;
        }

        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
            return this;
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.tag140PrevClosePx = new Tag140PrevClosePx(previousDaysClosingPrice);
            return this;
        }

        public Builder buildLastTradePrice(double lastTradePrice) {
            this.tag31LastPx = new Tag31LastPx(lastTradePrice);
            return this;
        }

        public Builder buildLastTradeQuantity(double lastTradeQuantity) {
            this.tag32LastQty = new Tag32LastQty(lastTradeQuantity);
            return this;
        }

        public Builder buildLastTradeDateStamp(String lastTradeDateStamp) {
            this.lastTradeDateStamp = new LastTradeDateStamp(lastTradeDateStamp);
            return this;
        }

        public Builder buildLastTradeTimeStamp(String lastTradeTimeStamp) {
            this.lastTradeTimeStamp = new LastTradeTimeStamp(lastTradeTimeStamp);
            return this;
        }

        public FIXRecord build() {
            return new FIXRecord(this);
        }
    }

}

