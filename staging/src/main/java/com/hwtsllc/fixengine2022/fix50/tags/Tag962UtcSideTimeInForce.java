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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  962
 *  SideTimeInForce
 *  UTCTimestamp
 *  <p>
 *  Indicates how long the order as specified in the side stays in effect.
 *  <p></p>
 *  SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side.
 *  Absence of this field indicates that TimeInForce should be referenced.
 *  <p></p>
 *  SideTimeInForce will override TimeInForce if both are provided.
 */
public class Tag962UtcSideTimeInForce extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_SIDE_TIME_IN_FORCE
            = "18991231-23:59:59.999";
    public final static String TESTB_UTC_SIDE_TIME_IN_FORCE
            = "19001231-23:59:59.999";

    public Tag962UtcSideTimeInForce(MyUTCTimestampType dataValue) {
        setFixType(FIX50.FIX962_UTC_SIDE_TIME_IN_FORCE);
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
        return toEnumIDString()
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
        Tag962UtcSideTimeInForce tagData;

        tagData = new Tag962UtcSideTimeInForce(new MyUTCTimestampType(TESTA_UTC_SIDE_TIME_IN_FORCE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag962UtcSideTimeInForce(new MyUTCTimestampType(TESTB_UTC_SIDE_TIME_IN_FORCE) );
        System.out.println(tagData.toVerboseString());
    }
}
