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
import com.hwtsllc.fixengine2022.fix42.enums.Enum281MDReqRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag281EnuMDReqRejReasonTest {
    @Test
    void FIX0281Test() {
        FIX42 fixData = FIX42.FIX281_ENU_MD_REQ_REJ_REASON;
        assertEquals( "281", fixData.toEnumIDString());
        assertEquals( "MD_REQ_REJ_REASON", fixData.toEnumNameString());
        assertEquals( "MDReqRejReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0281Test() {
        Tag281EnuMDReqRejReason tagData;

        /*
         * 0-9 msg types
         */
        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNKNOWN_SYMBOL);
        assertEquals( Enum281MDReqRejReason.UNKNOWN_SYMBOL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.DUPLICATE_MDREQID);
        assertEquals( Enum281MDReqRejReason.DUPLICATE_MDREQID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH);
        assertEquals( Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS);
        assertEquals( Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * A-D msg types
         */
        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SCOPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_SCOPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_CREDIT);
        assertEquals( Enum281MDReqRejReason.INSUFFICIENT_CREDIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag281EnuMDReqRejReason tagData;

        // loop around the ENUM and process
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag281EnuMDReqRejReason tagData;

        // loop around the ENUM and process
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag281EnuMDReqRejReason tagData;

        // loop around the ENUM and process
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag281EnuMDReqRejReason tagData;

        // loop around the ENUM and process
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag281EnuMDReqRejReason tagData;

        // loop around the ENUM and process
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( "Tag281EnuMDReqRejReason\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}