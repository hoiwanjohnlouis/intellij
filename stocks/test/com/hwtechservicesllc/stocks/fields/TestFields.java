package com.hwtechservicesllc.stocks.fields;

import com.hwtechservicesllc.stocks.enums.FieldType;

/**
 * Copyright 01/15/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.staging.fields
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

public class TestFields {

    public static void main (String[] args) {
        CompanyName companyName = new CompanyName(FieldType.COMPANY_NAME, "Widgets, Inc.");
        System.out.println(companyName);
        TickerSymbol tickerSymbol = new TickerSymbol(FieldType.TICKER_SYMBOL, "WIDG");
        System.out.println(tickerSymbol);
        Price openingPrice = new Price(FieldType.OPENING_PRICE, 98.76);
        System.out.println(openingPrice);
        Price previousDaysClosingPrice = new Price(FieldType
                                                          .PREVIOUS_DAYS_CLOSING_PRICE, 98.72);
        System.out.println(previousDaysClosingPrice);
        Price tradePrice = new Price(FieldType.TRADE_PRICE, 98.77);
        System.out.println(tradePrice);
        Quantity tradeQuantity = new Quantity(FieldType.TRADE_QUANTITY, 200.125);
        System.out.println(tradeQuantity);
        DateStamp dateStamp = new DateStamp(FieldType.TRADE_DATE_STAMP, "2016" +
                ".01.15");
        System.out.println(dateStamp);
        TimeStamp timeStamp = new TimeStamp(FieldType.TRADE_TIME_STAMP, "12:34:56");
        System.out.println(timeStamp);
    }

}
