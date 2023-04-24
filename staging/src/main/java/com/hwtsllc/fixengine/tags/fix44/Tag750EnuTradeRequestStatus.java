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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.enums.fix44.Enum750TradeRequestStatus;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  750
 *  TradeRequestStatus
 *  int
 *  <p></p>
 *  Status of Trade Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Completed
 *  <p>    2 - Rejected
 */
public class Tag750EnuTradeRequestStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum750TradeRequestStatus dataValue;

    public final static Enum750TradeRequestStatus TESTA_ENU_TRADE_REQUEST_STATUS
            = Enum750TradeRequestStatus.ACCEPTED;
    public final static Enum750TradeRequestStatus TESTB_ENU_TRADE_REQUEST_STATUS
            = Enum750TradeRequestStatus.REJECTED;

    public Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus dataValue) {
        setFixType(FIX44.FIX750_ENU_TRADE_REQUEST_STATUS);
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
        Tag750EnuTradeRequestStatus tagData;

        tagData = new Tag750EnuTradeRequestStatus(TESTA_ENU_TRADE_REQUEST_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag750EnuTradeRequestStatus(TESTB_ENU_TRADE_REQUEST_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            System.out.println( new Tag750EnuTradeRequestStatus(oneEnum).toVerboseString() );
        }
    }
}
