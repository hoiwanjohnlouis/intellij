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

package com.hwtsllc.fix.tags.fix40;

import com.hwtsllc.fix.datatypes.FIX40;
import com.hwtsllc.fix.datatypes.FIX40Abstract;
import com.hwtsllc.fix.datatypes.MyUTCTimestampType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  122
 *  OrigSendingTime
 *  UTCTimestamp
 *  <p></p>
 *  Original time of message transmission
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *  when transmitting orders as the result of a resend request.
 */
public class Tag122UtcOrigSendingTime extends FIX40Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_ORIG_SENDING_TIME
            = "18991231-23:59:59.122";
    public final static String TESTB_UTC_ORIG_SENDING_TIME
            = "19001231-23:59:59.122";

    public Tag122UtcOrigSendingTime(MyUTCTimestampType dataValue) {
        setFixType(FIX40.FIX122_UTC_ORIG_SENDING_TIME);
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
        return String.valueOf( this.dataValue.toString() );
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag122UtcOrigSendingTime(new MyUTCTimestampType(TESTA_UTC_ORIG_SENDING_TIME)).toVerboseString() );
        System.out.println( new Tag122UtcOrigSendingTime(new MyUTCTimestampType(TESTB_UTC_ORIG_SENDING_TIME)).toVerboseString() );
    }
}
