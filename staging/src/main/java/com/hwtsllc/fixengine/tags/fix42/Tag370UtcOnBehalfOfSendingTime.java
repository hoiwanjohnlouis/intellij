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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  370
 *  OnBehalfOfSendingTime
 *  UTCTimestamp
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Used when a message is sent via a 'hub' or 'service bureau'.
 *  <p></p>
 *  If A sends to Q (the hub), who then sends to B via a separate FIX session, then when Q sends to B,
 *  the value of this field should represent the SendingTime on the message A sent to Q.
 *  <p></p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as 'GMT')
 */
public class Tag370UtcOnBehalfOfSendingTime extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_ON_BEHALF_OF_SENDING_TIME
            = "18991231-23:59:59.370";
    public final static String TESTB_UTC_ON_BEHALF_OF_SENDING_TIME
            = "19001231-23:59:59.370";

    public Tag370UtcOnBehalfOfSendingTime(MyUTCTimestampType dataValue) {
        setFixType(FIX42.FIX370_UTC_ON_BEHALF_OF_SENDING_TIME);
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
        Tag370UtcOnBehalfOfSendingTime tagData;

        tagData = new Tag370UtcOnBehalfOfSendingTime(new MyUTCTimestampType(TESTA_UTC_ON_BEHALF_OF_SENDING_TIME) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag370UtcOnBehalfOfSendingTime(new MyUTCTimestampType(TESTB_UTC_ON_BEHALF_OF_SENDING_TIME) );
        System.out.println(tagData.toVerboseString());
    }
}
