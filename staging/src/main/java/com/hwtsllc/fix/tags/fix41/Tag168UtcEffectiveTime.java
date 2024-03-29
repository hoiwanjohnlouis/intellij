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

package com.hwtsllc.fix.tags.fix41;

import com.hwtsllc.fix.datatypes.FIX41;
import com.hwtsllc.fix.datatypes.FIX41Abstract;
import com.hwtsllc.fix.datatypes.MyUTCTimestampType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  168
 *  EffectiveTime
 *  UTCTimestamp
 *  <p></p>
 *  Time the details within the message should take effect (always expressed in UTC (Universal Time Coordinated),
 *  also known as "GMT")
 */
public class Tag168UtcEffectiveTime extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_EFFECTIVE_TIME
            = "18991231-23:59:59.168";
    public final static String TESTB_UTC_EFFECTIVE_TIME
            = "19001231-23:59:59.168";

    public Tag168UtcEffectiveTime(MyUTCTimestampType dataValue) {
        setFixType(FIX41.FIX168_UTC_EFFECTIVE_TIME);
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
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(TESTA_UTC_EFFECTIVE_TIME) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(TESTB_UTC_EFFECTIVE_TIME) );
        System.out.println( tagData.toVerboseString() );
    }
}
