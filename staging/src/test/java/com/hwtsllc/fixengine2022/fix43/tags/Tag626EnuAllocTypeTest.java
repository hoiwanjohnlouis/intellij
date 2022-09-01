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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum626AllocType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag626EnuAllocTypeTest {
    Tag626EnuAllocType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( "FIX626_ENU_ALLOC_TYPE", tagData.toFIXLabelString());
            assertEquals( "626", tagData.toFIXIDString());
            assertEquals( "ALLOC_TYPE", tagData.toFIXNameString());
            assertEquals( "AllocType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  626
         *  AllocType
         *  int
         *  <p>    1 - Calculated (includes MiscFees and NetMoney)
         *  <p>    2 - Preliminary (without MiscFees and NetMoney)
         *  <p>    3 - Sellside Calculated Using Preliminary
         *              (includes MiscFees and NetMoney) (Replaced)
         *  <p>    4 - Sellside Calculated Without Preliminary
         *              (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)
         *  <p>    5 - Ready-To-Book - Single Order
         */
        tagData = new Tag626EnuAllocType( Enum626AllocType.CALCULATED_INCLUDES_MISCFEES_NETMONEY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.SELLSIDE_USING_PRELIMINARY );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)
         *  <p>    7 - Warehouse Instruction
         *  <p>    8 - Request to Intermediary
         *  <p>    9 - Accept
         *  <p>    10 - Reject
         */
        tagData = new Tag626EnuAllocType( Enum626AllocType.BUYSIDE_READY_TO_BOOK );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.WAREHOUSE_INSTRUCTION );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REQUEST_INTERMEDIARY );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.ACCEPT );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REJECT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Accept Pending
         *  <p>    12 - Incomplete Group
         *  <p>    13 - Complete Group
         *  <p>    14 - Reversal Pending
         */
        tagData = new Tag626EnuAllocType( Enum626AllocType.ACCEPT_PENDING );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.INCOMPLETE_GROUP );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.COMPLETE_GROUP );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REVERSAL_PENDING );
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( "Tag626EnuAllocType\n" +
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