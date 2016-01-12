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

import com.hwtechservicesllc.stocks.enums.RecordType;
import com.hwtechservicesllc.stocks.fields.*;

public abstract class BaseRecord {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private StringBuilder stringBuilder = new StringBuilder();

    protected RecordType recordType;
    protected Company company;
    protected Price openingPrice;
    protected Price previousDaysClosingPrice;
    protected Price lastTradePrice;
    protected Quantity lastTradeQuantity;
    protected DateStamp lastTradeDateStamp;
    protected TimeStamp lastTradeTimeStamp;

    // no one can call default constructor
    private BaseRecord() {}

    public BaseRecord(final Company company) {
        this.company = company;
    }

    // concrete definition is by whom inherits this class
    abstract void prepare();

    // If any EnemyShip object is printed to screen this shows up
    public String toString(){

        // clean up the buffer before using.
        stringBuilder.delete(0,stringBuilder.length());

        stringBuilder.append(recordType);
        stringBuilder.append("\n");
        stringBuilder.append("LongName");
        stringBuilder.append(":");
        stringBuilder.append(company.getLongName());
        stringBuilder.append(",\n");
        stringBuilder.append("TickerSymbol");
        stringBuilder.append(":");
        stringBuilder.append(company.getTickerSymbol());
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
