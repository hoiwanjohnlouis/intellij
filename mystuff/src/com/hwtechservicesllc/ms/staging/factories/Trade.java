package com.hwtechservicesllc.ms.staging.factories;

import com.hwtechservicesllc.ms.staging.enums.FieldType;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.stocks.fields
 * Project intellijPrototyping
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
 **/

public class Trade extends Record {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    // We define the type of record we want to create
    // by stating the factory to build trades

    com.hwtechservicesllc.ms.staging.interfaces.IRecordFactory IRecordFactory;

    // The trade factory is sent to this method.
    // The factory will specifies what fields to populate

    public Trade(IRecordFactory IRecordFactory) {
        this.IRecordFactory = IRecordFactory;

    }

    public void prepare() {

        // The fields needed were passed in the factory

        company = IRecordFactory.addCompany();
        company.setDescription(EDescription.COMPANY);
        company.setLongName("");

        symbol = IRecordFactory.addSymbol();
        symbol.setDescription(EDescription.SYMBOL);
        symbol.setSymbol("");

        openingPrice = IRecordFactory.addOpeningPrice();
        openingPrice.setDescription(EDescription.OPENING_PRICE);
        openingPrice.setPrice(0.00);

        previousDaysClosingPrice = IRecordFactory.addPreviousDaysClosingPrice();
        previousDaysClosingPrice.setDescription(EDescription.PREVIOUS_DAYS_CLOSING_PRICE);
        previousDaysClosingPrice.setPrice(0.00);

        lastTradePrice = IRecordFactory.addTradePrice();
        lastTradePrice.setDescription(EDescription.TRADE_PRICE);
        lastTradePrice.setPrice(0.00);

        lastTradeQuantity = IRecordFactory.addTradeQuantity();
        lastTradeQuantity.setDescription(EDescription.TRADE_QUANTITY);
        lastTradeQuantity.setQuantity(0.00);

        lastTradeDateStamp = IRecordFactory.addTradeDateStamp();
        lastTradeDateStamp.setDescription(EDescription.TRADE_DATE_STAMP);
        lastTradeDateStamp.setDateStamp("");

        lastTradeTimeStamp = IRecordFactory.addTradeTimeStamp();
        lastTradeTimeStamp.setDescription(EDescription.TRADE_TIME_STAMP);
        lastTradeTimeStamp.setTimeStamp("");


    }


}
