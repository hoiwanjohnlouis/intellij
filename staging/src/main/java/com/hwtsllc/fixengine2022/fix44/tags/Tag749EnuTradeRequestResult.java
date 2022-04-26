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
import com.hwtsllc.fixengine2022.fix44.enums.Enum749TradeRequestResult;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  749
 *  TradeRequestResult
 *  Result of Trade Request
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid or unknown instrument
 *      2 - Invalid type of trade requested
 *      3 - Invalid parties
 *      4 - Invalid transport type requested
 *      5 - Invalid destination requested
 *      8 - TradeRequestType not supported
 *      9 - Unauthorized for Trade Capture Report Request
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag749EnuTradeRequestResult extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum749TradeRequestResult dataValue;

    public final static Enum749TradeRequestResult TESTA_ENU_TRADE_REQUEST_RESULT
            = Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED;
    public final static Enum749TradeRequestResult TESTB_ENU_TRADE_REQUEST_RESULT
            = Enum749TradeRequestResult.INVALID_PARTIES;

    public Tag749EnuTradeRequestResult(Enum749TradeRequestResult dataValue) {
        setFixType(FIX44.FIX749_ENU_TRADE_REQUEST_RESULT);
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
        Tag749EnuTradeRequestResult tagData;

        tagData = new Tag749EnuTradeRequestResult(TESTA_ENU_TRADE_REQUEST_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag749EnuTradeRequestResult(TESTB_ENU_TRADE_REQUEST_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
