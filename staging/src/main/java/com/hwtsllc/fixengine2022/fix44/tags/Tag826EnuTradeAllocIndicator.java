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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum826TradeAllocIndicator;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  826
 *  TradeAllocIndicator
 *  int
 *  Identifies how the trade is to be allocated
 *  Valid values:
 *      0 - Allocation not required
 *      1 - Allocation required (give-up trade) allocation information not provided (incomplete)
 *      2 - Use allocation provided with the trade
 *      3 - Allocation give-up executor
 *      4 - Allocation from executor
 *      5 - Allocation to claim account
 */
public class Tag826EnuTradeAllocIndicator extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum826TradeAllocIndicator dataValue;

    public final static Enum826TradeAllocIndicator TESTA_ENU_TRADE_ALLOC_INDICATOR
            = Enum826TradeAllocIndicator.CLAIM_ACCOUNT;
    public final static Enum826TradeAllocIndicator TESTB_ENU_TRADE_ALLOC_INDICATOR
            = Enum826TradeAllocIndicator.FROM_EXECUTOR;

    public Tag826EnuTradeAllocIndicator(Enum826TradeAllocIndicator dataValue) {
        setFixType(FIX44.FIX826_ENU_TRADE_ALLOC_INDICATOR);
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
        Tag826EnuTradeAllocIndicator tagData;

        tagData = new Tag826EnuTradeAllocIndicator(TESTA_ENU_TRADE_ALLOC_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag826EnuTradeAllocIndicator(TESTB_ENU_TRADE_ALLOC_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
