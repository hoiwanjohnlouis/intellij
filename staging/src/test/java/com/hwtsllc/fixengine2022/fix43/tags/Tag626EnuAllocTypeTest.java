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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum626AllocType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  626
 *  AllocType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation message
 *  (i.e. "Buyside Calculated")
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See 'Replaced Features and Supported Approach' ***
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Calculated (includes MiscFees and NetMoney)
 *  <p>    2 - Preliminary (without MiscFees and NetMoney)
 *  <p>    3 - Sellside Calculated Using Preliminary
 *              (includes MiscFees and NetMoney) (Replaced)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *              (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)
 *  <p>    5 - Ready-To-Book - Single Order
 *  <p></p>
 *  <p>    6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)
 *  <p>    7 - Warehouse Instruction
 *  <p>    8 - Request to Intermediary
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p></p>
 *  <p>    11 - Accept Pending
 *  <p>    12 - Incomplete Group
 *  <p>    13 - Complete Group
 *  <p>    14 - Reversal Pending
 */
class Tag626EnuAllocTypeTest {
    @Test
    void FIX0626Test() {
        FIX43 fixData = FIX43.FIX626_ENU_ALLOC_TYPE;
        assertEquals( "626", fixData.toFIXIDString());
        assertEquals( "ALLOC_TYPE", fixData.toFIXNameString());
        assertEquals( "AllocType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0626Test() {
        Tag626EnuAllocType tagData;

        /*
         *  1-14 types
         */
        tagData = new Tag626EnuAllocType( Enum626AllocType.CALCULATED_INCLUDES_MISCFEES_NETMONEY );
        assertEquals( Enum626AllocType.CALCULATED_INCLUDES_MISCFEES_NETMONEY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY );
        assertEquals( Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.SELLSIDE_USING_PRELIMINARY );
        assertEquals( Enum626AllocType.SELLSIDE_USING_PRELIMINARY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY );
        assertEquals( Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER );
        assertEquals( Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag626EnuAllocType( Enum626AllocType.BUYSIDE_READY_TO_BOOK );
        assertEquals( Enum626AllocType.BUYSIDE_READY_TO_BOOK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.WAREHOUSE_INSTRUCTION );
        assertEquals( Enum626AllocType.WAREHOUSE_INSTRUCTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REQUEST_INTERMEDIARY );
        assertEquals( Enum626AllocType.REQUEST_INTERMEDIARY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.ACCEPT );
        assertEquals( Enum626AllocType.ACCEPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REJECT );
        assertEquals( Enum626AllocType.REJECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag626EnuAllocType( Enum626AllocType.ACCEPT_PENDING );
        assertEquals( Enum626AllocType.ACCEPT_PENDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.INCOMPLETE_GROUP );
        assertEquals( Enum626AllocType.INCOMPLETE_GROUP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.COMPLETE_GROUP );
        assertEquals( Enum626AllocType.COMPLETE_GROUP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag626EnuAllocType( Enum626AllocType.REVERSAL_PENDING );
        assertEquals( Enum626AllocType.REVERSAL_PENDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag626EnuAllocType tagData;

        // loop around the ENUM and process
        for ( Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag626EnuAllocType tagData;

        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag626EnuAllocType tagData;

        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag626EnuAllocType tagData;

        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag626EnuAllocType tagData;

        // loop around the ENUM and process
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            tagData = new Tag626EnuAllocType(oneEnum);
            assertEquals( "Tag626EnuAllocType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}