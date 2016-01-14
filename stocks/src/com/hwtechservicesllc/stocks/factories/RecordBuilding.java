package com.hwtechservicesllc.stocks.factories;

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

import com.hwtechservicesllc.stocks.enums.RecordType;
import com.hwtechservicesllc.stocks.views.BaseRecord;

public abstract class RecordBuilding {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    //
    //
    //
    public abstract BaseRecord makeRecord(RecordType recordType);

    //
    // todo: orderRecord should receive an update record populated with trade data which will be passed to prepare
    //
    public BaseRecord orderRecord(RecordType recordType) {
//        Log.v(DEBUG_TAG, "in orderRecord");


        //
        BaseRecord baseRecord = makeRecord(recordType);
        baseRecord.prepare();

        // todo: add function to update SQLite DB

        // todo: add function to update GUI related adapter

        return baseRecord;
    }

}