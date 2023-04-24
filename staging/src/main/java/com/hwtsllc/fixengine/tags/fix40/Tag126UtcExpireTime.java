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

package com.hwtsllc.fixengine.tags.fix40;

import com.hwtsllc.fixengine.datatypes.FIX40;
import com.hwtsllc.fixengine.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  126
 *  ExpireTime
 *  UTCTimestamp
 *  <p></p>
 *  Time/Date of order expiration
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *  <p></p>
 *      The meaning of expiration is specific to the context where the field is used.
 *  <p></p>
 *      For Orders,
 *          this is the expiration time of a Good Til Date TimeInForce.
 *  <p></p>
 *      For Quotes,
 *          this is the expiration of the quote.
 *  <p></p>
 *      Expiration time is provided across the quote message dialog
 *      to control the length of time of the overall quoting process.
 *  <p></p>
 *      For collateral requests,
 *          this is the time by which collateral must be assigned.
 *  <p></p>
 *      For collateral assignments,
 *          this is the time by which a response to the assignment is expected.
 */
public class Tag126UtcExpireTime extends FIX40Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_EXPIRE_TIME
            = "18991231-23:59:59.126";
    public final static String TESTB_UTC_EXPIRE_TIME
            = "19001231-23:59:59.126";

    public Tag126UtcExpireTime(MyUTCTimestampType dataValue) {
        setFixType(FIX40.FIX126_UTC_EXPIRE_TIME);
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
        System.out.println( new Tag126UtcExpireTime(new MyUTCTimestampType(TESTA_UTC_EXPIRE_TIME)).toVerboseString() );
        System.out.println( new Tag126UtcExpireTime(new MyUTCTimestampType(TESTB_UTC_EXPIRE_TIME)).toVerboseString() );
    }
}
