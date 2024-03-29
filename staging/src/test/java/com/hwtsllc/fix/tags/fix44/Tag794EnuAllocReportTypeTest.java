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

import com.hwtsllc.fix.enums.fix44.Enum794AllocReportType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag794EnuAllocReportTypeTest {
    Tag794EnuAllocReportType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( "FIX794_ENU_ALLOC_REPORT_TYPE", tagData.toFIXLabelString());
            assertEquals( "794", tagData.toFIXIDString());
            assertEquals( "ALLOC_REPORT_TYPE", tagData.toFIXNameString());
            assertEquals( "AllocReportType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  794
         *  AllocReportType
         *  int
         *  <p>    2 - Preliminary Request to Intermediary
         *  <p>    3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
         *  <p>    4 - Sellside Calculated Without Preliminary
         *          (sent unsolicited by sellside, includes MiscFees and NetMoney)
         *  <p>    5 - Warehouse Recap
         */
        tagData = new Tag794EnuAllocReportType( Enum794AllocReportType.PRELIMINARY_REQUEST );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_USING_PRELIMINARY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_WITHOUT_PRELIMINARY);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.WAREHOUSE_RECAP);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    8 - Request to Intermediary
         *  <p>    9 - Accept
         *  <p>    10 - Reject
         */
        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REQUEST_TO_INTERMEDIARY);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REJECT);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Accept Pending
         *  <p>    12 - Complete
         *  <p>    14 - Reverse Pending
         */
        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT_PENDING);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.COMPLETE);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REVERSE_PENDING);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( "Tag794EnuAllocReportType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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