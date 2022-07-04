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
import com.hwtsllc.fixengine2022.fix44.enums.Enum794AllocReportType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  794
 *  AllocReportType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Preliminary Request to Intermediary
 *  <p>    3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *          (sent unsolicited by sellside, includes MiscFees and NetMoney)
 *  <p>    5 - Warehouse Recap
 *  <p>    8 - Request to Intermediary
 *  <p></p>
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p>    11 - Accept Pending
 *  <p>    12 - Complete
 *  <p>    14 - Reverse Pending
 */
class Tag794EnuAllocReportTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX794_ENU_ALLOC_REPORT_TYPE;
        assertEquals( "794", fixData.toEnumIDString());
        assertEquals( "ALLOC_REPORT_TYPE", fixData.toEnumNameString());
        assertEquals( "AllocReportType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0794Test() {
        Tag794EnuAllocReportType tagData;
        Enum794AllocReportType oneElement;

        oneElement = Enum794AllocReportType.PRELIMINARY_REQUEST;
        tagData = new Tag794EnuAllocReportType( oneElement );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "794", tagData.toEnumIDString());
        assertEquals( "ALLOC_REPORT_TYPE", tagData.toEnumNameString());
        assertEquals( "AllocReportType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_USING_PRELIMINARY);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_WITHOUT_PRELIMINARY);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.WAREHOUSE_RECAP);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REQUEST_TO_INTERMEDIARY);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REJECT);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT_PENDING);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.COMPLETE);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REVERSE_PENDING);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag794EnuAllocReportType tagData;

        // loop around the ENUM and process
        for ( Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag794EnuAllocReportType tagData;

        // loop around the ENUM and process
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag794EnuAllocReportType tagData;

        // loop around the ENUM and process
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag794EnuAllocReportType tagData;

        // loop around the ENUM and process
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag794EnuAllocReportType tagData;

        // loop around the ENUM and process
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            tagData = new Tag794EnuAllocReportType(oneEnum);
            assertEquals( "Tag794EnuAllocReportType\n" +
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