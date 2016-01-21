package com.hwtechservicesllc.ms.factory.factories;

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

import com.hwtechservicesllc.ms.factory.enums.MsgType;
import com.hwtechservicesllc.ms.factory.fields.*;

public abstract class Record {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    private MsgType msgType;
    private StringBuilder stringBuilder = new StringBuilder();

    private CompanyName companyName;         // 1
    private TickerSymbol tickerSymbol;       // 2
    private Price openingPrice;              // 3
    private Price previousDaysClosingPrice;  // 4
    private Price lastTradePrice;            // 5
    private Quantity lastTradeQuantity;      // 6
    private DateStamp lastTradeDateStamp;    // 7
    private TimeStamp lastTradeTimeStamp;    // 8

    // concrete definition is by whom inherits this class
    abstract Record build();

    // If any EnemyShip object is printed to screen this shows up
    public String toString(){

        // clean up the buffer before using.
        stringBuilder.delete(0,stringBuilder.length());

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


}
