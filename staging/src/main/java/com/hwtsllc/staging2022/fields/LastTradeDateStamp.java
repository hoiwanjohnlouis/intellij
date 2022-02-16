/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.staging2022.fields;

// from FixProtocol.org website www.fixprotocol.org

import com.hwtsllc.staging2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class LastTradeDateStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String DEFAULT_VALUE = "1900.01.01";

    private final FieldType fieldType;
    private final String dateStamp;

    //
    public LastTradeDateStamp() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_DATE_STAMP;
        this.dateStamp = DEFAULT_VALUE;
    }

    //
    public LastTradeDateStamp(final String dateStamp) {
        this.fieldType = FieldType.LAST_TRADE_DATE_STAMP;
        this.dateStamp = dateStamp;
    }

    //
    public FieldType getFieldType() {
        return fieldType;
    }

    //
    public String getDateStamp() {
        return dateStamp;
    }

    //
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getDateStamp());
        sb.append("]");

        return sb.toString();
    }
}
