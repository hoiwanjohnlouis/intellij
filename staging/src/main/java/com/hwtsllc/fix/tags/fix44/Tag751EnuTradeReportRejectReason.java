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
import com.hwtsllc.fix.enums.fix44.Enum751TradeReportRejectReason;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  751
 *  TradeReportRejectReason
 *  int
 *  <p></p>
 *  Reason Trade Capture Request was rejected.
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid party information
 *  <p>    2 - Unknown instrument
 *  <p>    3 - Unauthorized to report trades
 *  <p>    4 - Invalid trade type
 *  <p></p>
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag751EnuTradeReportRejectReason extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum751TradeReportRejectReason dataValue;

    public final static Enum751TradeReportRejectReason TESTA_ENU_TRADE_REPORT_REJECT_REASON
            = Enum751TradeReportRejectReason.INVALID_TRADE_TYPE;
    public final static Enum751TradeReportRejectReason TESTB_ENU_TRADE_REPORT_REJECT_REASON
            = Enum751TradeReportRejectReason.SUCCESSFUL;

    public Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason dataValue) {
        setFixType(FIX44.FIX751_ENU_TRADE_REPORT_REJECT_REASON);
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
        Tag751EnuTradeReportRejectReason tagData;

        tagData = new Tag751EnuTradeReportRejectReason(TESTA_ENU_TRADE_REPORT_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag751EnuTradeReportRejectReason(TESTB_ENU_TRADE_REPORT_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            System.out.println( new Tag751EnuTradeReportRejectReason(oneEnum).toVerboseString() );
        }
    }
}
