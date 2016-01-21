package com.hwtechservicesllc.ms.stocks.factories;

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

public abstract class RecordBuilder {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    //
    // todo: orderRecord should receive an update record populated with trade data which will be passed to prepare
    //
    public Record orderRecord(RecordType recordType) {

        //
        Record record = makeRecord(recordType);
        record.prepare();


        // todo: add function to update SQLite DB

        // todo: add function to update GUI related adapter


        return record;

    }

}
