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
import com.hwtsllc.fix.enums.fix42.Enum418BidTradeType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  418
 *  BidTradeType
 *  char
 *  <p>
 *  Code to represent the type of trade.
 *  <p>
 *  (Prior to FIX 4.4 this field was named "TradeType")
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - VWAP Guarantee
 *  <p>    J - Guaranteed Close
 *  <p>    R - Risk Trade
 */
public class Tag418EnuBidTradeType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum418BidTradeType dataValue;

    public final static Enum418BidTradeType TESTA_ENU_BID_TRADE_TYPE
            = Enum418BidTradeType.RISK_TRADE;
    public final static Enum418BidTradeType TESTB_ENU_BID_TRADE_TYPE
            = Enum418BidTradeType.GUARANTEED_CLOSE;

    public Tag418EnuBidTradeType(Enum418BidTradeType dataValue) {
        setFixType(FIX42.FIX418_ENU_BID_TRADE_TYPE);
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
        Tag418EnuBidTradeType tagData;

        tagData = new Tag418EnuBidTradeType(TESTA_ENU_BID_TRADE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag418EnuBidTradeType(TESTB_ENU_BID_TRADE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            System.out.println( new Tag418EnuBidTradeType(oneEnum).toVerboseString() );
        }
    }
}
