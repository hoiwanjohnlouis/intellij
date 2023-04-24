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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1041
 *  FirmTradeID
 *  String
 *  <p>
 *  The ID assigned to a trade by the Firm to track a trade within the Firm's system.
 *  <p></p>
 *  This ID can be assigned either before or after submission to the exchange or central counterpary
 */
public class Tag1041StrFirmTradeID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_FIRM_TRADE_ID
            = "LeeRemick-Tag1041StrFirmTradeID";
    public final static String TESTB_STR_FIRM_TRADE_ID
            = "LeeAnnRemick-Tag1041StrFirmTradeID";

    public Tag1041StrFirmTradeID(MyStringType dataValue) {
        setFixType(FIX50.FIX1041_STR_FIRM_TRADE_ID);
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
        Tag1041StrFirmTradeID tagData;

        tagData = new Tag1041StrFirmTradeID(new MyStringType(TESTA_STR_FIRM_TRADE_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1041StrFirmTradeID(new MyStringType(TESTB_STR_FIRM_TRADE_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
