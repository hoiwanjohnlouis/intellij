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

import com.hwtsllc.fixengine2022.fix42.enums.Enum281MDReqRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag281EnuMDReqRejReasonTest {
    Tag281EnuMDReqRejReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( "FIX281_ENU_MD_REQ_REJ_REASON", tagData.toEnumLabelString());
            assertEquals( "281", tagData.toEnumIDString());
            assertEquals( "MD_REQ_REJ_REASON", tagData.toEnumNameString());
            assertEquals( "MDReqRejReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  281
         *  MDReqRejReason
         *  char
         *  <p>    0-9 msg types
         *  <p>    "0 - Unknown Symbol"
         *  <p>    "1 - Duplicate MDReqID"
         *  <p>    "2 - Insufficient Bandwidth"
         *  <p>    "3 - Insufficient Permissions"
         *  <p>    "4 - Unsupported SubscriptionRequestType"
         */
        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNKNOWN_SYMBOL);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.DUPLICATE_MDREQID);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Unsupported MarketDepth"
         *  <p>    "6 - Unsupported MDUpdateType"
         *  <p>    "7 - Unsupported AggregatedBook"
         *  <p>    "8 - Unsupported MDEntryType";
         *  <p>    "9 - Unsupported TradingSessionID";
         */
        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A-D msg types
         *  <p>    "A - Unsupported Scope";
         *  <p>    "B - Unsupported OpenCloseSettleFlag";
         *  <p>    "C - Unsupported MDImplicitDelete"
         *  <p>    "D - Insufficient credit";
         */
        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SCOPE);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_CREDIT);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            tagData = new Tag281EnuMDReqRejReason(oneEnum);
            assertEquals( "Tag281EnuMDReqRejReason\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}