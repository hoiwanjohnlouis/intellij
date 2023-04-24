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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1012
 *  SideTrdRegTimestamp
 *  UTCTimestamp
 *  <p>
 *  Will be used in a multi-sided message.
 *  <p></p>
 *  Traded Regulatory timestamp value.
 *  <p></p>
 *  Use to store time information required by government regulators
 *  or self regulatory organizations such as an exchange or clearing house
 */
public class Tag1012UtcSideTrdRegTimestamp extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_SIDE_TRD_REG_TIMESTAMP
            = "18991231-23:59:59.999";
    public final static String TESTB_UTC_SIDE_TRD_REG_TIMESTAMP
            = "19001231-23:59:59.999";

    public Tag1012UtcSideTrdRegTimestamp(MyUTCTimestampType dataValue) {
        setFixType(FIX50.FIX1012_UTC_SIDE_TRD_REG_TIMESTAMP);
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
        Tag1012UtcSideTrdRegTimestamp tagData;

        tagData = new Tag1012UtcSideTrdRegTimestamp(new MyUTCTimestampType(TESTA_UTC_SIDE_TRD_REG_TIMESTAMP) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1012UtcSideTrdRegTimestamp(new MyUTCTimestampType(TESTB_UTC_SIDE_TRD_REG_TIMESTAMP) );
        System.out.println(tagData.toVerboseString());
    }
}
