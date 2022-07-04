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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  335
 *  TradSesReqID
 *  String
 *  <p>
 *  Unique ID of a Trading Session Status message.
 */
public class Tag335StrTradSesReqID extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TRAD_SES_REQ_ID
            = "BilboBaggins-Tag335StrTradSesReqID";
    public final static String TESTB_STR_TRAD_SES_REQ_ID
            = "Gandalf-Tag335StrTradSesReqID";

    public Tag335StrTradSesReqID(MyStringType dataValue) {
        setFixType(FIX42.FIX335_STR_TRAD_SES_REQ_ID);
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
        Tag335StrTradSesReqID tagData;

        tagData = new Tag335StrTradSesReqID(new MyStringType(TESTA_STR_TRAD_SES_REQ_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag335StrTradSesReqID(new MyStringType(TESTB_STR_TRAD_SES_REQ_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
