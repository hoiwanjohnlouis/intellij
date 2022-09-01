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
 *  515
 *  ExecValuationPoint
 *  UTCTimestamp
 *  <p></p>
 *  For CIV - a date and time stamp to indicate the fund valuation point with respect to which a order was priced by the fund manager.
 */
public class Tag515UtcExecValuationPoint extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_EXEC_VALUATION_POINT
            = "18991231-23:59:59.999";
    public final static String TESTB_UTC_EXEC_VALUATION_POINT
            = "19001231-23:59:59.999";

    public Tag515UtcExecValuationPoint(MyUTCTimestampType dataValue) {
        setFixType(FIX43.FIX515_UTC_EXEC_VALUATION_POINT);
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
        Tag515UtcExecValuationPoint tagData;

        tagData = new Tag515UtcExecValuationPoint(new MyUTCTimestampType(TESTA_UTC_EXEC_VALUATION_POINT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag515UtcExecValuationPoint(new MyUTCTimestampType(TESTB_UTC_EXEC_VALUATION_POINT) );
        System.out.println(tagData.toVerboseString());
    }
}
