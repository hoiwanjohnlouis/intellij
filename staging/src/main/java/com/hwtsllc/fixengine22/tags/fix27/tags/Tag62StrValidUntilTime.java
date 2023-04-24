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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  62
 *  ValidUntilTime
 *  UTCTimestamp
 *  <p></p>
 *  Indicates expiration time of indication message
 *  <p></p>
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 */
public class Tag62StrValidUntilTime extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_VALID_UNTIL_TIME
            = "JoanBlondell-Tag62StrValidUntilTime";
    public final static String TESTB_STR_VALID_UNTIL_TIME
            = "KayFrances-Tag62StrValidUntilTime";

    public Tag62StrValidUntilTime(MyStringType dataValue) {
        setFixType(FIX27.FIX62_STR_VALID_UNTIL_TIME);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag62StrValidUntilTime(new MyStringType(TESTA_STR_VALID_UNTIL_TIME)).toVerboseString() );
        System.out.println( new Tag62StrValidUntilTime(new MyStringType(TESTB_STR_VALID_UNTIL_TIME)).toVerboseString() );
    }
}