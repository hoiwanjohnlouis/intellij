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
 *
 *      0-15 msg types
 *      ACCEPTED( "0", "ACCEPTED", "0 - Accepted" ),
 *      CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL", "1 - Cancel for Symbol(s)" ),
 *      CANCELED_FOR_SECURITY_TYPE( "2", "CANCELED_FOR_SECURITY_TYPE", "2 - Canceled for Security Type(s)" ),
 *      CANCELED_FOR_UNDERLYING( "3", "CANCELED_FOR_UNDERLYING", "3 - Canceled for Underlying" ),
 *      CANCELED_ALL( "4", "CANCELED_ALL", "4 - Canceled All" ),
 *      REJECTED( "5", "REJECTED", "5 - Rejected" ),
 *      REMOVED_FROM_MARKET( "6", "REMOVED_FROM_MARKET", "6 - Removed from Market" ),
 *      EXPIRED( "7", "EXPIRED", "7 - Expired" ),
 *      QUERY( "8", "QUERY", "8 - Query" ),
 *      QUOTE_NOT_FOUND( "9", "QUOTE_NOT_FOUND", "9 - Quote Not Found" ),
 *      PENDING( "10", "PENDING", "10 - Pending" ),
 *      PASS( "11", "PASS", "11 - Pass" ),
 *      LOCKED_MARKET_WARNING( "12", "LOCKED_MARKET_WARNING", "12 - Locked Market Warning" ),
 *      CROSS_MARKET_WARNING( "13", "CROSS_MARKET_WARNING", "13 - Cross Market Warning" ),
 *      CANCELED_DUE_TO_LOCK_MARKET( "14", "CANCELED_DUE_TO_LOCK_MARKET", "14 - Canceled Due To Lock Market" ),
 *      CANCELED_DUE_TO_CROSS_MARKET( "15", "CANCELED_DUE_TO_CROSS_MARKET", "15 - Canceled Due To Cross Market" ),
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
        return this.dataValue.toFIXIDString();
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
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag297EnuQuoteAckStatus(TESTB_ENU_QUOTE_ACK_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
