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
import com.hwtsllc.fixengine2022.fix44.enums.Enum751TradeReportRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  751
 *  TradeReportRejectReason
 *  Reason Trade Capture Request was rejected.
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid party information
 *      2 - Unknown instrument
 *      3 - Unauthorized to report trades
 *      4 - Invalid trade type
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
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

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.getID();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.getName();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.getDescription();
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
        Tag751EnuTradeReportRejectReason tagData;

        tagData = new Tag751EnuTradeReportRejectReason(TESTA_ENU_TRADE_REPORT_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag751EnuTradeReportRejectReason(TESTB_ENU_TRADE_REPORT_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
