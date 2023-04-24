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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  629
 *  HopSendingTime
 *  UTCTimestamp
 *  <p></p>
 *  Time that HopCompID (628) sent the message.
 *  <p></p>
 *  It is recommended that this value be the SendingTime (52) of the message sent by the third party.
 *  <p></p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p></p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
public class Tag629UtcHopSendingTime extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_HOP_SENDING_TIME
            = "18991231-23:59:59.999";
    public final static String TESTB_UTC_HOP_SENDING_TIME
            = "19001231-23:59:59.111";

    public Tag629UtcHopSendingTime(MyUTCTimestampType dataValue) {
        setFixType(FIX43.FIX629_UTC_HOP_SENDING_TIME);
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
        Tag629UtcHopSendingTime tagData;

        tagData = new Tag629UtcHopSendingTime(new MyUTCTimestampType(TESTA_UTC_HOP_SENDING_TIME) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag629UtcHopSendingTime(new MyUTCTimestampType(TESTB_UTC_HOP_SENDING_TIME) );
        System.out.println(tagData.toVerboseString());
    }
}
