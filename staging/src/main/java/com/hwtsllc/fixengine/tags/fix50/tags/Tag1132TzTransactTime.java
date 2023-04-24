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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.*;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1132
 *  TZTransactTime
 *  TZTimestamp
 *  <p>
 *  Transact time in the local date-time stamp with a TZ offset to UTC identified
 */
public class Tag1132TzTransactTime extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyTZTimestampType dataValue;

    public final static String TESTA_TZ_TRANSACT_TIME
            = "18991231-23:59:59.999";
    public final static String TESTB_TZ_TRANSACT_TIME
            = "19001231-23:59:59.999";

    public Tag1132TzTransactTime( MyTZTimestampType dataValue) {
        setFixType( FIX50.FIX1132_TZ_TRANSACT_TIME );
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1132TzTransactTime tagData;

        tagData = new Tag1132TzTransactTime(new MyTZTimestampType( TESTA_TZ_TRANSACT_TIME ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1132TzTransactTime(new MyTZTimestampType( TESTB_TZ_TRANSACT_TIME ) );
        System.out.println(tagData.toVerboseString());
    }
}
