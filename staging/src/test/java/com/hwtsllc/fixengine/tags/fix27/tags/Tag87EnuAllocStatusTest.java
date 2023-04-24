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

package com.hwtsllc.fixengine.tags.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum87AllocStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag87EnuAllocStatusTest {
    Tag87EnuAllocStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            tagData = new Tag87EnuAllocStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            tagData = new Tag87EnuAllocStatus(oneEnum);
            assertEquals( "FIX87_ENU_ALLOC_STATUS", tagData.toFIXLabelString());
            assertEquals( "ALLOC_STATUS", tagData.toFIXNameString());
            assertEquals( "87", tagData.toFIXIDString());
            assertEquals( "AllocStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            tagData = new Tag87EnuAllocStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  87
         *  <p>    0 - accepted (successfully processed)
         *  <p>    1 - block level reject
         *  <p>    2 - account level reject
         *  <p>    3 - received (received, not yet processed)
         *  <p>    4 - incomplete
         */
        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ACCEPTED);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.BLOCK_LEVEL_REJECT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ACCOUNT_LEVEL_REJECT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.RECEIVED_NOT_PROCESSED);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.INCOMPLETE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - rejected by intermediary
         *  <p>    6 - allocation pending
         *  <p>    7 - reversed
         */
        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.REJECTED_BY_INTERMEDIARY);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ALLOCATION_PENDING);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.REVERSED);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            tagData = new Tag87EnuAllocStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            tagData = new Tag87EnuAllocStatus(oneEnum);
            assertEquals( "Tag87EnuAllocStatus\n" +
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