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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Bool1091PreTradeAnonymity;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1091
 *  PreTradeAnonymity
 *  Boolean
 *  <p>
 *  Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds.
 *  <p>
 *  Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds.
 *  <p>
 *  Disclosure is relevant when counterparties are not normally visible.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Trader explicitly request anonymity" ),
 *  <p> NO( "N", "NO", "N - Anonymity not required" ),
 */
public class Tag1091BoolPreTradeAnonymity extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Bool1091PreTradeAnonymity dataValue;

    public final static Bool1091PreTradeAnonymity TESTA_BOOL_PRE_TRADE_ANONYMITY
            = Bool1091PreTradeAnonymity.NO ;
    public final static Bool1091PreTradeAnonymity TESTB_BOOL_PRE_TRADE_ANONYMITY
            = Bool1091PreTradeAnonymity.YES;

    public Tag1091BoolPreTradeAnonymity(Bool1091PreTradeAnonymity dataValue) {
        setFixType(FIX50.FIX1091_BOOL_PRE_TRADE_ANONYMITY);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to format a simple Yes string describing the data
     */
    @Override
    public String toEnumString() {
        return null;
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
        Tag1091BoolPreTradeAnonymity tagData;

        tagData = new Tag1091BoolPreTradeAnonymity(TESTA_BOOL_PRE_TRADE_ANONYMITY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1091BoolPreTradeAnonymity(TESTB_BOOL_PRE_TRADE_ANONYMITY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
