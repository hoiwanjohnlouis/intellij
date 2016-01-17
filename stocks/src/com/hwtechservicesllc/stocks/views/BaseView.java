package com.hwtechservicesllc.stocks.views;
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

import com.hwtechservicesllc.stocks.enums.MsgType;
import com.hwtechservicesllc.stocks.fields.*;

public abstract class BaseView {

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

    // no one can call default constructor
    private BaseView() {}

    public BaseView(final MsgType msgType, final CompanyName companyName, final TickerSymbol tickerSymbol) {
        this.msgType = msgType;
        this.companyName = companyName;
        this.tickerSymbol = tickerSymbol;
    }

    // concrete definition is by whom inherits this class
    public abstract void prepare();

    public MsgType getMsgType() {
        return msgType;
    }
    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }
    public void setTickerSymbol(TickerSymbol tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

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

        if (null != openingPrice) {
            stringBuilder.append(openingPrice);
        }
        if (null != previousDaysClosingPrice) {
            stringBuilder.append(previousDaysClosingPrice);
        }
        if (null != lastTradePrice) {
            stringBuilder.append(lastTradePrice);
        }
        if (null != lastTradeQuantity) {
            stringBuilder.append(lastTradeQuantity);
        }
        if (null != lastTradeDateStamp) {
            stringBuilder.append(lastTradeDateStamp);
        }
        if (null != lastTradeTimeStamp) {
            stringBuilder.append(lastTradeTimeStamp);
        }

        return stringBuilder.toString();
    }
}
