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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum281MDReqRejReason;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  281
 *  MDReqRejReason
 *
 *      0-9 msg types
 *      "0 - Unknown Symbol"
 *      "1 - Duplicate MDReqID"
 *      "2 - Insufficient Bandwidth"
 *      "3 - Insufficient Permissions"
 *      "4 - Unsupported SubscriptionRequestType"
 *      "5 - Unsupported MarketDepth"
 *      "6 - Unsupported MDUpdateType"
 *      "7 - Unsupported AggregatedBook"
 *      "8 - Unsupported MDEntryType";
 *      "9 - Unsupported TradingSessionID";
 *
 *      A-D msg types
 *      "A - Unsupported Scope";
 *      "B - Unsupported OpenCloseSettleFlag";
 *      "C - Unsupported MDImplicitDelete"
 *      "D - Insufficient credit";
 */
public class Tag281EnuMDReqRejReason extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final Enum281MDReqRejReason dataValue;

    public final static Enum281MDReqRejReason TESTA_ENU_MD_REQ_REJ_REASON = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
    public final static Enum281MDReqRejReason TESTB_ENU_MD_REQ_REJ_REASON = Enum281MDReqRejReason.DUPLICATE_MDREQID;

    public Tag281EnuMDReqRejReason(Enum281MDReqRejReason dataValue) {
        setFixType(FIX42.FIX281_ENU_MD_REQ_REJ_REASON);
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
        Tag281EnuMDReqRejReason tagData;

        tagData = new Tag281EnuMDReqRejReason(TESTA_ENU_MD_REQ_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag281EnuMDReqRejReason(TESTB_ENU_MD_REQ_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
