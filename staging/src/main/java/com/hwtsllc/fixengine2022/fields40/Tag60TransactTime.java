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

package com.hwtsllc.fixengine2022.fields40;

import com.hwtsllc.fixengine2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag60TransactTime {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public final static String DEFAULT_VALUE = "00:00:00";

    private final FieldType fieldType;
    private final String timeStamp;

    //
    public Tag60TransactTime() {
        this.fieldType = FieldType.DEFAULT_LAST_TRADE_TIME_STAMP;
        this.timeStamp = DEFAULT_VALUE;
    }

    public Tag60TransactTime(final String timeStamp) {
        this.fieldType = FieldType.LAST_TRADE_TIME_STAMP;
        this.timeStamp = timeStamp;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTimeStamp());
        sb.append("]");

        return sb.toString();
    }
}
