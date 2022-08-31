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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  824
 *  TradeLegRefID
 *  String
 *  <p></p>
 *  Reference to the leg of a multileg instrument to which this trade refers
 */
public class Tag824StrTradeLegRefID extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRADE_LEG_REF_ID
            = "BeverlySills-Tag824StrTradeLegRefID";
    public final static String TESTB_STR_TRADE_LEG_REF_ID
            = "SondraRadvanovsky-Tag824StrTradeLegRefID";

    public Tag824StrTradeLegRefID(MyStringType dataValue) {
        setFixType( FIX44.FIX824_STR_TRADE_LEG_REF_ID );
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag824StrTradeLegRefID tagData;

        tagData = new Tag824StrTradeLegRefID(new MyStringType( TESTA_STR_TRADE_LEG_REF_ID ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag824StrTradeLegRefID(new MyStringType( TESTB_STR_TRADE_LEG_REF_ID ) );
        System.out.println(tagData.toVerboseString());
    }
}
