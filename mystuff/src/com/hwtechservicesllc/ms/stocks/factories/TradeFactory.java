package com.hwtechservicesllc.ms.stocks.factories;

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


import com.hwtechservicesllc.ms.stocks.fields.DateStamp;
import com.hwtechservicesllc.ms.stocks.fields.Price;
import com.hwtechservicesllc.ms.stocks.fields.Quantity;
import com.hwtechservicesllc.ms.stocks.fields.TimeStamp;

public class TradeFactory implements IRecordFactory {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    @Override
    public ICompany addCompany() {
        return new Company();
    }

    @Override
    public ISymbol addSymbol() {
        return new Symbol();
    }

    @Override
    public IPrice addOpeningPrice() {
        return new Price();
    }

    @Override
    public IPrice addPreviousDaysClosingPrice() {
        return new Price();
    }

    @Override
    public IPrice addTradePrice() {
        return new Price();
    }

    @Override
    public IQuantity addTradeQuantity() {
        return new Quantity();
    }

    @Override
    public IDateStamp addTradeDateStamp() {
        return new DateStamp();
    }

    @Override
    public ITimeStamp addTradeTimeStamp() {
        return new TimeStamp();
    }
}
