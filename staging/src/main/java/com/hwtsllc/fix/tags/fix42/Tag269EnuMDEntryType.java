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
import com.hwtsllc.fix.enums.fix42.Enum269MDEntryType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  269
 *  MDEntryType
 *  char
 *  <p></p>
 *  Type  Market Data entry.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  0-9 msg types
 *  <p>    "0 - Bid"
 *  <p>    "1 - Offer"
 *  <p>    "2 - Trade"
 *  <p>    "3 - Index Value"
 *  <p>    "4 - Opening Price"
 *  <p></p>
 *  <p>    "5 - Closing Price"
 *  <p>    "6 - Settlement Price"
 *  <p>    "7 - Trading Session High Price"
 *  <p>    "8 - Trading Session Low Price"
 *  <p>    "9 - Trading Session VWAP Price"
 *  <p></p>
 *  A-Q msg types
 *  <p>    "A - Imbalance"
 *  <p>    "B - Trade Volume"
 *  <p>    "C - Open Interest"
 *  <p>    "D - Composite Underlying Price"
 *  <p>    "E - Simulated Sell Price"
 *  <p></p>
 *  <p>    "F - Simulated Buy Price"
 *  <p>    "G - Margin Rate"
 *  <p>    "H - Mid Price"
 *  <p>    "J - Empty Book"
 *  <p>    "K - Settle High Price"
 *  <p></p>
 *  <p>    "L - Settle Low Price"
 *  <p>    "M - Prior Settle Price"
 *  <p>    "N - Session High Bid"
 *  <p>    "O - Session Low Offer"
 *  <p>    "P - Early Prices"
 *  <p></p>
 *  <p>    "Q - Auction Clearing Price"
 */
public class Tag269EnuMDEntryType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum269MDEntryType dataValue;

    public final static Enum269MDEntryType TESTA_ENU_MD_ENTRY_TYPE
            = Enum269MDEntryType.BID;
    public final static Enum269MDEntryType TESTB_ENU_MD_ENTRY_TYPE
            = Enum269MDEntryType.AUCTION_CLEARING_PRICE;

    public Tag269EnuMDEntryType(Enum269MDEntryType dataValue) {
        setFixType(FIX42.FIX269_ENU_MD_ENTRY_TYPE);
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
        Tag269EnuMDEntryType tagData;

        tagData = new Tag269EnuMDEntryType(TESTA_ENU_MD_ENTRY_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag269EnuMDEntryType(TESTB_ENU_MD_ENTRY_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            System.out.println( new Tag269EnuMDEntryType(oneEnum).toVerboseString() );
        }
    }
}
