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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyUTCTimestampType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  779
 *  LastUpdateTime
 *  UTCTimestamp
 *  <p></p>
 *  Timestamp of last update to data item
 *  (or creation if no updates made since creation).
 */
public class Tag779UtcLastUpdateTime extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_LAST_UPDATE_TIME
            = "16991231-23:59:59.999";
    public final static String TESTB_UTC_LAST_UPDATE_TIME
            = "17001231-23:59:59.999";

    public Tag779UtcLastUpdateTime(MyUTCTimestampType dataValue) {
        setFixType( FIX44.FIX779_UTC_LAST_UPDATE_TIME );
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
        Tag779UtcLastUpdateTime tagData;

        tagData = new Tag779UtcLastUpdateTime(new MyUTCTimestampType( TESTA_UTC_LAST_UPDATE_TIME ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag779UtcLastUpdateTime(new MyUTCTimestampType( TESTB_UTC_LAST_UPDATE_TIME ) );
        System.out.println(tagData.toVerboseString());
    }
}
