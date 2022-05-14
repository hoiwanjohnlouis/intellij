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
import com.hwtsllc.fixengine2022.fix42.enums.Enum300QuoteRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  300
 *  QuoteRejectReason
 *
 *      1-9, 99 msg types
 *      UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL", "1 - Unknown Symbol (security)" ),
 *      EXCHANGE_SECURITY_CLOSED( "2", "EXCHANGE_SECURITY_CLOSED", "2 - Exchange (Security) closed" ),
 *      QUOTE_REQUEST_EXCEEDS_LIMIT( "3", "QUOTE_REQUEST_EXCEEDS_LIMIT", "3 - Quote Request exceeds limit" ),
 *      TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER", "4 - Too late to enter" ),
 *      UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE", "5 - Unknown Quote" ),
 *      DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE", "6 - Duplicate Quote" ),
 *      INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD", "7 - Invalid bid/ask spread" ),
 *      INVALID_PRICE( "8", "INVALID_PRICE", "8 - Invalid price" ),
 *      NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
 *                      "9 - Not authorized to quote security" ),
 *      OTHER( "99", "OTHER", "99 - Other" ),
 */
public class Tag300EnuQuoteRejectReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum300QuoteRejectReason dataValue;

    public final static Enum300QuoteRejectReason TESTA_ENU_QUOTE_REJECT_REASON
            = Enum300QuoteRejectReason.INVALID_PRICE;
    public final static Enum300QuoteRejectReason TESTB_ENU_QUOTE_REJECT_REASON
            = Enum300QuoteRejectReason.OTHER;

    public Tag300EnuQuoteRejectReason(Enum300QuoteRejectReason dataValue) {
        setFixType(FIX42.FIX300_ENU_QUOTE_REJECT_REASON);
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
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag300EnuQuoteRejectReason tagData;

        tagData = new Tag300EnuQuoteRejectReason(TESTA_ENU_QUOTE_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag300EnuQuoteRejectReason(TESTB_ENU_QUOTE_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}
