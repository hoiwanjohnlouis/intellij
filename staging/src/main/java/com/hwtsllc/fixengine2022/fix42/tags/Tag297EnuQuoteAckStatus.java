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
import com.hwtsllc.fixengine2022.fix42.enums.Enum297QuoteStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  297
 *  QuoteAckStatus
 *  int
 *  <p>
 *  Identifies the status of the quote acknowledgement.
 *  <p></p>
 *  Valid values:
 *  <p>    0-15 msg types
 *  <p>    "0 - Accepted"
 *  <p>    "1 - Cancel for Symbol(s)"
 *  <p>    "2 - Canceled for Security Type(s)"
 *  <p>    "3 - Canceled for Underlying"
 *  <p>    "4 - Canceled All"
 *  <p></p>
 *  <p>    "5 - Rejected"
 *  <p>    "6 - Removed from Market"
 *  <p>    "7 - Expired"
 *  <p>    "8 - Query"
 *  <p>    "9 - Quote Not Found",
 *  <p></p>
 *  <p>    "10 - Pending"
 *  <p>    "11 - Pass"
 *  <p>    "12 - Locked Market Warning"
 *  <p>    "13 - Cross Market Warning"
 *  <p>    "14 - Canceled Due To Lock Market"
 *  <p></p>
 *  <p>    "15 - Canceled Due To Cross Market"
 */
public class Tag297EnuQuoteAckStatus extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum297QuoteStatus dataValue;

    public final static Enum297QuoteStatus TESTA_ENU_QUOTE_ACK_STATUS
            = Enum297QuoteStatus.QUOTE_NOT_FOUND;
    public final static Enum297QuoteStatus TESTB_ENU_QUOTE_ACK_STATUS
            = Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET;

    public Tag297EnuQuoteAckStatus(Enum297QuoteStatus dataValue) {
        setFixType(FIX42.FIX297_ENU_QUOTE_ACK_STATUS);
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
        Tag297EnuQuoteAckStatus tagData;

        tagData = new Tag297EnuQuoteAckStatus(TESTA_ENU_QUOTE_ACK_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag297EnuQuoteAckStatus(TESTB_ENU_QUOTE_ACK_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            System.out.println( new Tag297EnuQuoteAckStatus(oneEnum).toVerboseString() );
        }
    }
}
