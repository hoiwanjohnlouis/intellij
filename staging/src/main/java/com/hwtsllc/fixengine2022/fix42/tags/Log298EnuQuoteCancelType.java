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
import com.hwtsllc.fixengine2022.fix42.enums.Enum298QuoteCancelType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  298
 *  QuoteCancelType
 *
 *      1-5 msg types
 *      CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL", "1 - Cancel for Symbol(s)" ),
 *      CANCEL_FOR_SECURITY_TYPE( "2", "CANCEL_FOR_SECURITY_TYPE", "2 - Cancel for Security Type(s)" ),
 *      CANCEL_FOR_UNDERLYING_SYMBOL( "3", "CANCEL_FOR_UNDERLYING_SYMBOL", "3 - Cancel for Underlying Symbol" ),
 *      CANCEL_ALL_QUOTES( "4", "CANCEL_ALL_QUOTES", "4 - Cancel All Quotes" ),
 *      CANCEL_QUOTEID_QUOTE("5", "CANCEL_QUOTEID_QUOTE", "5 - Cancel quote specified in QuoteID" ),
 */
public class Log298EnuQuoteCancelType extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum298QuoteCancelType dataValue;

    public final static Enum298QuoteCancelType TESTA_ENU_QUOTE_CANCEL_TYPE
            = Enum298QuoteCancelType.CANCEL_FOR_SYMBOL;
    public final static Enum298QuoteCancelType TESTB_ENU_QUOTE_CANCEL_TYPE
            = Enum298QuoteCancelType.CANCEL_ALL_QUOTES;

    public Log298EnuQuoteCancelType(Enum298QuoteCancelType dataValue) {
        setFixType(FIX42.FIX298_ENU_QUOTE_CANCEL_TYPE);
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
        Log298EnuQuoteCancelType tagData;

        tagData = new Log298EnuQuoteCancelType(TESTA_ENU_QUOTE_CANCEL_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log298EnuQuoteCancelType(TESTB_ENU_QUOTE_CANCEL_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
