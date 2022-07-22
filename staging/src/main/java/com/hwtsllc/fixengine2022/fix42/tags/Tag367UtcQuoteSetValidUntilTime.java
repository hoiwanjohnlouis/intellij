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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  367
 *  QuoteSetValidUntilTime
 *  UTCTimestamp
 *  <p></p>
 *  Indicates expiration time of this particular QuoteSet
 *  <p></p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as "GMT")
 */
public class Tag367UtcQuoteSetValidUntilTime extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyUTCTimestampType dataValue;

    public final static String TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME
            = "18991231-23:59:59.367";
    public final static String TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME
            = "19001231-23:59:59.367";

    public Tag367UtcQuoteSetValidUntilTime(MyUTCTimestampType dataValue) {
        setFixType(FIX42.FIX367_UTC_QUOTE_SET_VALID_UNTIL_TIME);
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
        Tag367UtcQuoteSetValidUntilTime tagData;

        tagData = new Tag367UtcQuoteSetValidUntilTime(new MyUTCTimestampType(TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag367UtcQuoteSetValidUntilTime(new MyUTCTimestampType(TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME) );
        System.out.println(tagData.toVerboseString());
    }
}
