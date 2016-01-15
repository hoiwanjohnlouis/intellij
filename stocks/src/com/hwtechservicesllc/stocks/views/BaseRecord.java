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

public abstract class BaseRecord {

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
    private BaseRecord() {}

    public BaseRecord(final MsgType msgType, final CompanyName companyName, final TickerSymbol tickerSymbol) {
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

    // If any EnemyShip object is printed to screen this shows up
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(msgType);
        stringBuilder.append("\n");
        stringBuilder.append("CompanyName");
        stringBuilder.append(":");
        stringBuilder.append(companyName.getCompanyName());
        stringBuilder.append(",\n");
        stringBuilder.append("TickerSymbol");
        stringBuilder.append(":");
        stringBuilder.append(tickerSymbol.getTickerSymbol());
        stringBuilder.append(",\n");
        stringBuilder.append("openingPrice");
        stringBuilder.append(":");
        stringBuilder.append(openingPrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append("previousDaysClosingPrice");
        stringBuilder.append(":");
        stringBuilder.append(previousDaysClosingPrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append("lastTradePrice");
        stringBuilder.append(":");
        stringBuilder.append(lastTradePrice.getPrice());
        stringBuilder.append(",\n");
        stringBuilder.append("lastTradeQuantity");
        stringBuilder.append(":");
        stringBuilder.append(lastTradeQuantity.getQuantity());
        stringBuilder.append(",\n");
        stringBuilder.append("lastTradeDateStamp");
        stringBuilder.append(":");
        stringBuilder.append(lastTradeDateStamp.getDateStamp());
        stringBuilder.append(",\n");
        stringBuilder.append("lastTradeTimeStamp");
        stringBuilder.append(":");
        stringBuilder.append(lastTradeTimeStamp.getTimeStamp());

        return stringBuilder.toString();
    }
}
