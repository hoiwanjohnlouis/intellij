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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.enums.fix43.Enum569TradeRequestType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  569
 *  TradeRequestType
 *  int
 *  <p></p>
 *  Type of Trade Capture Report.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - All Trades
 *  <p>    1 - Matched trades matching criteria provided on request
 *              (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)
 *  <p>    2 - Unmatched trades that match criteria
 *  <p>    3 - Unreported trades that match criteria
 *  <p>    4 - Advisories that match criteria
 */
public class Tag569EnuTradeRequestType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum569TradeRequestType dataValue;

    public final static Enum569TradeRequestType TESTA_ENU_TRADE_REQUEST_TYPE
            = Enum569TradeRequestType.ALL_TRADES;
    public final static Enum569TradeRequestType TESTB_ENU_TRADE_REQUEST_TYPE
            = Enum569TradeRequestType.MATCHED_TRADES;

    public Tag569EnuTradeRequestType(Enum569TradeRequestType dataValue) {
        setFixType(FIX43.FIX569_ENU_TRADE_REQUEST_TYPE);
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
        Tag569EnuTradeRequestType tagData;

        tagData = new Tag569EnuTradeRequestType(TESTA_ENU_TRADE_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag569EnuTradeRequestType(TESTB_ENU_TRADE_REQUEST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            System.out.println( new Tag569EnuTradeRequestType(oneEnum).toVerboseString() );
        }
    }
}
