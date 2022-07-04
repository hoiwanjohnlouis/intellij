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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  300
 *  QuoteRejectReason
 *  int
 *  <p>
 *  Reason Quote was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1-9, 99 msg types
 *  <p>    "1 - Unknown Symbol (security)"
 *  <p>    "2 - Exchange (Security) closed"
 *  <p>    "3 - Quote Request exceeds limit"
 *  <p>    "4 - Too late to enter"
 *  <p>    "5 - Unknown Quote"
 *  <p></p>
 *  <p>    "6 - Duplicate Quote"
 *  <p>    "7 - Invalid bid/ask spread"
 *  <p>    "8 - Invalid price"
 *  <p>    "9 - Not authorized to quote security"
 *  <p>    "99 - Other"
 */
public class Tag300EnuQuoteRejectReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        System.out.println(tagData.toVerboseString());

        tagData = new Tag300EnuQuoteRejectReason(TESTB_ENU_QUOTE_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            System.out.println( new Tag300EnuQuoteRejectReason(oneEnum).toVerboseString() );
        }
    }
}
