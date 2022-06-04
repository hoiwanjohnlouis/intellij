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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  586
 *  OrigOrdModTime
 *  UTCTimestamp
 *  <p>
 *  The most recent (or current) modification TransactTime (tag 60) reported
 *  on an Execution Report for the order.
 *  <p>
 *  The OrigOrdModTime is provided as an optional field on Order Cancel Request
 *  and Order Cancel Replace Requests to identify that the state of the order has
 *  not changed since the request was issued.
 *  <p>
 *  This is provided to support markets similar to Eurex and A/C/E.
 */
public class Tag586UtcOrigOrdModTime extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_ORIG_ORD_MOD_TIME
            = "18991231-23:59:59.999";
    public final static String TESTB_UTC_ORIG_ORD_MOD_TIME
            = "19001231-23:59:59.999";

    public Tag586UtcOrigOrdModTime(MyUTCTimestampType dataValue) {
        setFixType(FIX43.FIX586_UTC_ORIG_ORD_MOD_TIME);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag586UtcOrigOrdModTime tagData;

        tagData = new Tag586UtcOrigOrdModTime(new MyUTCTimestampType(TESTA_UTC_ORIG_ORD_MOD_TIME) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag586UtcOrigOrdModTime(new MyUTCTimestampType(TESTB_UTC_ORIG_ORD_MOD_TIME) );
        System.out.println(tagData.toVerboseString());
    }
}
