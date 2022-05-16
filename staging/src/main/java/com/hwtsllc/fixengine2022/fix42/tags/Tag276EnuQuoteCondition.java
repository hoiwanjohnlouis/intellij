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
import com.hwtsllc.fixengine2022.fix42.enums.Enum276QuoteCondition;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  276
 *  QuoteCondition
 *
 *      A-Z
 *      "A - Open/Active"
 *      "B - Closed/Inactive"
 *      "C - Exchange Best"
 *      "D - Consolidated Best"
 *      "E - Locked"
 *      "F - Crossed"
 *      "G - Depth"
 *      "H - Fast Trading"
 *      "I - Non-Firm"
 *      "J - Outright Price"
 *      "K - Implied Price"
 *      "L - Manual/Slow Quote"
 *      "M - Depth on Offer"
 *      "N - Depth on Bid"
 *      "O - Closing"
 *      "P - News Dissemination"
 *      "Q - Trading Range"
 *      "R - Order Influx"
 *      "S - Due to Related"
 *      "T - News Pending"
 *      "U - Additional Info"
 *      "V - Additional Info due to related"
 *      "W - Resume"
 *      "X - View of Common"
 *      "Y - Volume Alert"
 *      "Z - Order Imbalance"
 *
 *      a-z
 *      "a - Equipment Changeover"
 *      "b - No Open / No Resume"
 *      "c - Regular ETH"
 *      "d - Automatic Execution"
 *      "e - Automatic Execution ETH"
 *      "f - Fast Market ETH"
 *      "g - Inactive ETH"
 *      "h - Rotation"
 *      "i - Rotation ETH"
 *      "j - Halt"
 *      "k - Halt ETH"
 *      "l - Due to News Dissemination"
 *      "m - Due to News Pending"
 *      "n - Trading Resume"
 *      "o - Out of Sequence"
 *      "p - Bid Specialist"
 *      "q - Offer Specialist"
 *      "r - Bid Offer Specialist"
 *      "s - End of Day SAM"
 *      "t - Forbidden SAM"
 *      "u - Frozen SAM"
 *      "v - PreOpening SAM"
 *      "w - Opening SAM"
 *      "x - Open SAM"
 *      "y - Surveillance SAM"
 *      "z - Suspended SAM"
 *
 *      0-2
 *      "0 - Reserved SAM"
 *      "1 - No Active SAM"
 *      "2 - Restricted"
 */
public class Tag276EnuQuoteCondition extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum276QuoteCondition dataValue;

    public final static Enum276QuoteCondition TESTA_ENU_QUOTE_CONDITION
            = Enum276QuoteCondition.ADDITIONAL_INFO;
    public final static Enum276QuoteCondition TESTB_ENU_QUOTE_CONDITION
            = Enum276QuoteCondition.CLOSED_INACTIVE;

    public Tag276EnuQuoteCondition(Enum276QuoteCondition dataValue) {
        setFixType(FIX42.FIX276_ENU_QUOTE_CONDITION);
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.getID();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.getName();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
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
        Tag276EnuQuoteCondition tagData;

        tagData = new Tag276EnuQuoteCondition(TESTA_ENU_QUOTE_CONDITION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag276EnuQuoteCondition(TESTB_ENU_QUOTE_CONDITION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
