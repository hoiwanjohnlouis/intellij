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
import com.hwtsllc.fixengine2022.fix44.enums.Enum856TradeReportType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  856
 *  TradeReportType
 *  int
 *  Type of Trade Report
 *  Valid values:
 *      0 - Submit
 *      1 - Alleged
 *      2 - Accept
 *      3 - Decline
 *      4 - Addendum
 *      5 - No/Was
 *      6 - Trade Report Cancel
 *      7 - (Locked-In) Trade Break
 *      8 - Defaulted
 *      9 - Invalid CMTA
 *      10 - Pended
 *      11 - Alleged New
 *      12 - Alleged Addendum
 *      13 - Alleged No/Was
 *      14 - Alleged Trade Report Cancel
 *      15 - Alleged (Locked-In) Trade Break
 */
public class Tag856EnuTradeReportType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum856TradeReportType dataValue;

    public final static Enum856TradeReportType TESTA_ENU_TRADE_REPORT_TYPE
            = Enum856TradeReportType.TRADE_REPORT_CANCEL;
    public final static Enum856TradeReportType TESTB_ENU_TRADE_REPORT_TYPE
            = Enum856TradeReportType.ALLEGED_ADDENDUM;

    public Tag856EnuTradeReportType(Enum856TradeReportType dataValue) {
        setFixType(FIX44.FIX856_ENU_TRADE_REPORT_TYPE);
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
        Tag856EnuTradeReportType tagData;

        tagData = new Tag856EnuTradeReportType(TESTA_ENU_TRADE_REPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag856EnuTradeReportType(TESTB_ENU_TRADE_REPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
