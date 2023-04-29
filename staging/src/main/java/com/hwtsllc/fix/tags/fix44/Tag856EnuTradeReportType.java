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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum856TradeReportType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  856
 *  TradeReportType
 *  int
 *  <p></p>
 *  Type of Trade Report
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submit
 *  <p>    1 - Alleged
 *  <p>    2 - Accept
 *  <p>    3 - Decline
 *  <p>    4 - Addendum
 *  <p></p>
 *  <p>    5 - No-Was
 *  <p>    6 - Trade Report Cancel
 *  <p>    7 - (Locked-In) Trade Break
 *  <p>    8 - Defaulted
 *  <p>    9 - Invalid CMTA
 *  <p></p>
 *  <p>    10 - Pended
 *  <p>    11 - Alleged New
 *  <p>    12 - Alleged Addendum
 *  <p>    13 - Alleged No-Was
 *  <p>    14 - Alleged Trade Report Cancel
 *  <p></p>
 *  <p>    15 - Alleged (Locked-In) Trade Break
 */
public class Tag856EnuTradeReportType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum856TradeReportType dataValue;

    public final static Enum856TradeReportType TESTA_ENU_TRADE_REPORT_TYPE
            = Enum856TradeReportType.TRADE_REPORT_CANCEL;
    public final static Enum856TradeReportType TESTB_ENU_TRADE_REPORT_TYPE
            = Enum856TradeReportType.ALLEGED_ADDENDUM;

    public Tag856EnuTradeReportType(Enum856TradeReportType dataValue) {
        setFixType(FIX44.FIX856_ENU_TRADE_REPORT_TYPE);
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
        Tag856EnuTradeReportType tagData;

        tagData = new Tag856EnuTradeReportType(TESTA_ENU_TRADE_REPORT_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag856EnuTradeReportType(TESTB_ENU_TRADE_REPORT_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            System.out.println( new Tag856EnuTradeReportType(oneEnum).toVerboseString() );
        }
    }
}
