package com.hwtechservicesllc.stocks.views;

/*
    Copyright (c) 2015  HW Tech Services, Inc., LLC
 
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

//import android.util.Log;

import com.hwtechservicesllc.stocks.enums.FieldType;
import com.hwtechservicesllc.stocks.interfaces.RecordFactory;


public class TradeRecord extends BaseRecord {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    // We define the type of record we want to create
    // by stating the factory to build trades

    RecordFactory recordFactory;

    // The trade factory is sent to this method.
    // The factory will specifies what fields to populate

    public TradeRecord(RecordFactory RecordFactory) {
        //Log.v(DEBUG_TAG, "in TradeRecord constructor");

        this.recordFactory = recordFactory;

    }

    public void prepare() {
        //Log.v(DEBUG_TAG, "in prepare");

        // The fields needed were passed in the factory

        company = IRecordFactory.addCompany();
        company.setFieldType(EDescription.COMPANY);
        company.setLongName("");

        symbol = IRecordFactory.addSymbol();
        symbol.setDescription(EDescription.SYMBOL);
        symbol.setSymbol("");

        openingPrice = IRecordFactory.addOpeningPrice();
        openingPrice.setFieldType(EDescription.OPENING_PRICE);
        openingPrice.setPrice(0.00);

        previousDaysClosingPrice = IRecordFactory.addPreviousDaysClosingPrice();
        previousDaysClosingPrice.setFieldType(EDescription.PREVIOUS_DAYS_CLOSING_PRICE);
        previousDaysClosingPrice.setPrice(0.00);

        lastTradePrice = IRecordFactory.addTradePrice();
        lastTradePrice.setFieldType(EDescription.TRADE_PRICE);
        lastTradePrice.setPrice(0.00);

        lastTradeQuantity = IRecordFactory.addTradeQuantity();
        lastTradeQuantity.setDescription(EDescription.TRADE_QUANTITY);
        lastTradeQuantity.setQuantity(0.00);

        lastTradeDateStamp = IRecordFactory.addTradeDateStamp();
        lastTradeDateStamp.setFieldType(EDescription.TRADE_DATE_STAMP);
        lastTradeDateStamp.setDateStamp("");

        lastTradeTimeStamp = IRecordFactory.addTradeTimeStamp();
        lastTradeTimeStamp.setDescription(EDescription.TRADE_TIME_STAMP);
        lastTradeTimeStamp.setTimeStamp("");


    }


}
