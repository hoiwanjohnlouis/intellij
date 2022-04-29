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
import com.hwtsllc.fixengine2022.fix42.enums.Enum269MDEntryType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  269
 *  MDEntryType
 *
 *  0-9 msg types
 *      "0 - Bid"
 *      "1 - Offer"
 *      "2 - Trade"
 *      "3 - Index Value"
 *      "4 - Opening Price"
 *      "5 - Closing Price"
 *      "6 - Settlement Price"
 *      "7 - Trading Session High Price"
 *      "8 - Trading Session Low Price"
 *      "9 - Trading Session VWAP Price"
 *
 *  A-Q msg types
 *      "A - Imbalance"
 *      "B - Trade Volume"
 *      "C - Open Interest"
 *      "D - Composite Underlying Price"
 *      "E - Simulated Sell Price"
 *      "F - Simulated Buy Price"
 *      "G - Margin Rate"
 *      "H - Mid Price"
 *      "J - Empty Book"
 *      "K - Settle High Price"
 *      "L - Settle Low Price"
 *      "M - Prior Settle Price"
 *      "N - Session High Bid"
 *      "O - Session Low Offer"
 *      "P - Early Prices"
 *      "Q - Auction Clearing Price"
 */
public class Tag269EnuMDEntryType extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum269MDEntryType dataValue;

    public final static Enum269MDEntryType TESTA_ENU_MD_ENTRY_TYPE = Enum269MDEntryType.BID;
    public final static Enum269MDEntryType TESTB_ENU_MD_ENTRY_TYPE = Enum269MDEntryType.AUCTION_CLEARING_PRICE;

    public Tag269EnuMDEntryType(Enum269MDEntryType dataValue) {
        setFixType(FIX42.FIX269_ENU_MD_ENTRY_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag269EnuMDEntryType tagData;

        tagData = new Tag269EnuMDEntryType(TESTA_ENU_MD_ENTRY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag269EnuMDEntryType(TESTB_ENU_MD_ENTRY_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
