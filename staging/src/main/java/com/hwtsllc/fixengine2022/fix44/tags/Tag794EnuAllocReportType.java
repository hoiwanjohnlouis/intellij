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
import com.hwtsllc.fixengine2022.fix44.enums.Enum794AllocReportType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  794
 *  AllocReportType
 *  Describes the specific type or purpose of an Allocation Report message
 *  Valid values:
 *      2 - Preliminary Request to Intermediary
 *      3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
 *      4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney)
 *      5 - Warehouse Recap
 *      8 - Request to Intermediary
 *      9 - Accept
 *      10 - Reject
 *      11 - Accept Pending
 *      12 - Complete
 *      14 - Reverse Pending
 */
public class Tag794EnuAllocReportType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum794AllocReportType dataValue;

    public final static Enum794AllocReportType TESTA_ENU_ALLOC_REPORT_TYPE
            = Enum794AllocReportType.ACCEPT;
    public final static Enum794AllocReportType TESTB_ENU_ALLOC_REPORT_TYPE
            = Enum794AllocReportType.REVERSE_PENDING;

    public Tag794EnuAllocReportType(Enum794AllocReportType dataValue) {
        setFixType(FIX44.FIX794_ENU_ALLOC_REPORT_TYPE);
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
        Tag794EnuAllocReportType tagData;

        tagData = new Tag794EnuAllocReportType(TESTA_ENU_ALLOC_REPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag794EnuAllocReportType(TESTB_ENU_ALLOC_REPORT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
