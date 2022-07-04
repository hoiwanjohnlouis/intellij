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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  749
 *  TradeRequestResult
 *  int
 *  <p></p>
 *  Result of Trade Request
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid or unknown instrument
 *  <p>    2 - Invalid type of trade requested
 *  <p>    3 - Invalid parties
 *  <p>    4 - Invalid transport type requested
 *  <p></p>
 *  <p>    5 - Invalid destination requested
 *  <p>    8 - TradeRequestType not supported
 *  <p>    9 - Unauthorized for Trade Capture Report Request
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag749EnuTradeRequestResult extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
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
        System.out.println(tagData.toVerboseString());

        tagData = new Tag749EnuTradeRequestResult(TESTB_ENU_TRADE_REQUEST_RESULT);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            System.out.println( new Tag749EnuTradeRequestResult(oneEnum).toVerboseString() );
        }
    }
}
