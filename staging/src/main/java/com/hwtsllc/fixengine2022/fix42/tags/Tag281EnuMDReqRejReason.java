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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  281
 *  MDReqRejReason
 *  char
 *  <p>
 *  Reason for the rejection of a Market Data request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-9 msg types
 *  <p>    "0 - Unknown Symbol"
 *  <p>    "1 - Duplicate MDReqID"
 *  <p>    "2 - Insufficient Bandwidth"
 *  <p>    "3 - Insufficient Permissions"
 *  <p>    "4 - Unsupported SubscriptionRequestType"
 *  <p></p>
 *  <p>    "5 - Unsupported MarketDepth"
 *  <p>    "6 - Unsupported MDUpdateType"
 *  <p>    "7 - Unsupported AggregatedBook"
 *  <p>    "8 - Unsupported MDEntryType";
 *  <p>    "9 - Unsupported TradingSessionID";
 *  <p></p>
 *  <p>    A-D msg types
 *  <p>    "A - Unsupported Scope";
 *  <p>    "B - Unsupported OpenCloseSettleFlag";
 *  <p>    "C - Unsupported MDImplicitDelete"
 *  <p>    "D - Insufficient credit";
 */
public class Tag281EnuMDReqRejReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum281MDReqRejReason dataValue;

    public final static Enum281MDReqRejReason TESTA_ENU_MD_REQ_REJ_REASON
            = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
    public final static Enum281MDReqRejReason TESTB_ENU_MD_REQ_REJ_REASON
            = Enum281MDReqRejReason.DUPLICATE_MDREQID;

    public Tag281EnuMDReqRejReason(Enum281MDReqRejReason dataValue) {
        setFixType(FIX42.FIX281_ENU_MD_REQ_REJ_REASON);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag281EnuMDReqRejReason tagData;

        tagData = new Tag281EnuMDReqRejReason(TESTA_ENU_MD_REQ_REJ_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag281EnuMDReqRejReason(TESTB_ENU_MD_REQ_REJ_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            System.out.println( new Tag281EnuMDReqRejReason(oneEnum).toVerboseString() );
        }
    }
}
