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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.enums.fix43.Enum658QuoteRequestRejectReason;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  658
 *  QuoteRequestRejectReason
 *  int
 *  <p></p>
 *  Reason Quote was rejected:
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Unknown Symbol (Security)
 *  <p>    2 - Exchange (Security) Closed
 *  <p>    3 - Quote Request Exceeds Limit
 *  <p>    4 - Too Late to enter
 *  <p>    5 - Invalid Price
 *  <p></p>
 *  <p>    6 - Not Authorized To Request Quote
 *  <p>    7 - No Match For Inquiry
 *  <p>    8 - No Market For Instrument
 *  <p>    9 - No Inventory
 *  <p>    10 - Pass
 *  <p></p>
 *  <p>    11 - Insufficient credit
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag658EnuQuoteRequestRejectReason extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum658QuoteRequestRejectReason dataValue;

    public final static Enum658QuoteRequestRejectReason TESTA_ENU_QUOTE_REQUEST_REJECT_REASON
            = Enum658QuoteRequestRejectReason.QUOTE_EXCEEDS_LIMIT;
    public final static Enum658QuoteRequestRejectReason TESTB_ENU_QUOTE_REQUEST_REJECT_REASON
            = Enum658QuoteRequestRejectReason.NO_MATCH_FOR_INQUIRY;

    public Tag658EnuQuoteRequestRejectReason(Enum658QuoteRequestRejectReason dataValue) {
        setFixType(FIX43.FIX658_ENU_QUOTE_REQUEST_REJECT_REASON);
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
        Tag658EnuQuoteRequestRejectReason tagData;

        tagData = new Tag658EnuQuoteRequestRejectReason(TESTA_ENU_QUOTE_REQUEST_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag658EnuQuoteRequestRejectReason(TESTB_ENU_QUOTE_REQUEST_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            System.out.println( new Tag658EnuQuoteRequestRejectReason(oneEnum).toVerboseString() );
        }
    }
}
