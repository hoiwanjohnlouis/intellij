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
import com.hwtechservicesllc.stocks.enums.MsgType;
import com.hwtechservicesllc.stocks.fields.CompanyName;
import com.hwtechservicesllc.stocks.fields.TickerSymbol;
import com.hwtechservicesllc.stocks.interfaces.RecordFactory;


public class TradeRecord extends BaseRecord {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    // We define the type of record we want to create
    // by stating the factory to build trades

    // RecordFactory recordFactory;

    public TradeRecord(MsgType msgType, CompanyName companyName, TickerSymbol tickerSymbol) {
        super(msgType, companyName, tickerSymbol);
    }

    // The trade factory is sent to this method.
    // The factory will specifies what fields to populate

    public void prepare() {
        //Log.v(DEBUG_TAG, "in prepare");

        // The fields needed were passed in the factory

    }

}
