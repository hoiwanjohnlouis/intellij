package com.hwtechservicesllc.stocks.factories;

/*
    Copyright (c) 2014  HW Tech Services, Inc., LLC
 
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

import com.hwtechservicesllc.stocks.enums.FieldType;
import com.hwtechservicesllc.stocks.fields.*;
import com.hwtechservicesllc.stocks.interfaces.*;


public class ViewFactory implements com.hwtechservicesllc.stocks.interfaces.ViewFactory {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();


    @Override
    public CompanyName addCompanyName(FieldType fieldType, String companyName) {
        return null;
    }

    @Override
    public TickerSymbol addTickerSymbol(FieldType fieldType, String tickerSymbol) {
        return null;
    }

    @Override
    public Price addOpeningPrice(FieldType fieldType, double openingPrice) {
        return null;
    }

    @Override
    public Price addPreviousDaysClosingPrice(FieldType fieldType, String companyName) {
        return null;
    }

    @Override
    public Price addTradePrice(FieldType fieldType, double tradePrice) {
        return null;
    }

    @Override
    public Quantity addTradeQuantity(FieldType fieldType, double tradeQuantity) {
        return null;
    }

    @Override
    public DateStamp addTradeDateStamp(FieldType fieldType, String tradeDateStamp) {
        return null;
    }

    @Override
    public TimeStamp addTradeTimeStamp(FieldType fieldType, String tradeTimeStamp) {
        return null;
    }
}
