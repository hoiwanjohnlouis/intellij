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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  966
 *  SettleOnOpenFlag
 *  String
 *  <p>
 *  Unique identifier for the Market Data Report.
 *  Indicator to determine if instrument is settle on open
 */
public class Tag966StrSettleOnOpenFlag extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SETTLE_ON_OPEN_FLAG
            = "AngieDickinson-Tag966StrSettleOnOpenFlag";
    public final static String TESTB_STR_SETTLE_ON_OPEN_FLAG
            = "JaneRussell-Tag966StrSettleOnOpenFlag";

    public Tag966StrSettleOnOpenFlag(MyStringType dataValue) {
        setFixType(FIX50.FIX966_STR_SETTLE_ON_OPEN_FLAG);
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
        Tag966StrSettleOnOpenFlag tagData;

        tagData = new Tag966StrSettleOnOpenFlag(new MyStringType(TESTA_STR_SETTLE_ON_OPEN_FLAG) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag966StrSettleOnOpenFlag(new MyStringType(TESTB_STR_SETTLE_ON_OPEN_FLAG) );
        System.out.println(tagData.toVerboseString());
    }
}