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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum368QuoteEntryRejectReason;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  368
 *  Enu
 *  QuoteEntryRejectReason
 *  int
 *  <p>
 *  Reason Quote Entry was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1-9, 99 msg types
 *  <p>    "1 - Unknown symbol (security)"
 *  <p>    "2 - Exchange (security) closed"
 *  <p>    "3 - Quote exceeds limit"
 *  <p>    "4 - Too late to enter"
 *  <p>    "5 - Unknown quote"
 *  <p></p>
 *  <p>    "6 - Duplicate quote"
 *  <p>    "7 - Invalid bid/ask spread"
 *  <p>    "8 - Invalid price"
 *  <p>    "9 - Not authorized to quote security"
 *  <p>    "99 - Other"
 */
public class Tag368EnuQuoteEntryRejectReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum368QuoteEntryRejectReason dataValue;

    public final static Enum368QuoteEntryRejectReason TESTA_ENU_QUOTE_ENTRY_REJECT_REASON
            = Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
    public final static Enum368QuoteEntryRejectReason TESTB_ENU_QUOTE_ENTRY_REJECT_REASON
            = Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT;

    public Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason dataValue) {
        setFixType(FIX42.FIX368_ENU_QUOTE_ENTRY_REJECT_REASON);
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
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
        Tag368EnuQuoteEntryRejectReason tagData;

        tagData = new Tag368EnuQuoteEntryRejectReason(TESTA_ENU_QUOTE_ENTRY_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag368EnuQuoteEntryRejectReason(TESTB_ENU_QUOTE_ENTRY_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum368QuoteEntryRejectReason oneEnum : Enum368QuoteEntryRejectReason.values()) {
            System.out.println( new Tag368EnuQuoteEntryRejectReason(oneEnum).toVerboseString() );
        }
    }
}
