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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  Identifies reason for rejection.
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *        Same values as  AllocRejCode (88)
 *  Valid values:
 *      0 - Unknown account(s)
 *      1 - Incorrect quantity
 *      2 - Incorrect averageg price
 *      3 - Unknown executing broker mnemonic
 *      4 - Commission difference
 *      5 - Unknown OrderID (37)
 *      6 - Unknown ListID (66)
 *      7 - Other (further in Text (58))
 *      8 - Incorrect allocated quantity
 *      9 - Calculation difference
 *      10 - Unknown or stale ExecID
 *      11 - Mismatched data
 *      12 - Unknown ClOrdID
 *      13 - Warehouse request rejected
 */
class Tag88EnuAllocRejCodeTest {
    @Test
    void FIX0088Test() {
        FIX27 fixData = FIX27.FIX88_ENU_ALLOC_REJ_CODE;
        assertEquals( "ALLOC_REJ_CODE", fixData.toFIXNameString());
        assertEquals( "88", fixData.toFIXIDString());
        assertEquals( "AllocRejCode", fixData.toFIXDescriptionString());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( FIX27.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( FIX27.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0088Test() {
        Tag88EnuAllocRejCode tagData;

        /*
         * 0-13 AllocRejCode types
         */
        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ACCOUNT);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_QUANTITY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_AVERAGE_PRICE);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.COMMISSION_DIFFERENCE);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ORDERID);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_LISTID);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.OTHER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.CALCULATION_DIFFERENCE);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_OR_STALE_EXECID);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.MISMATCHED_DATA);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_CLORDID);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.WAREHOUSE_REQUEST_REJECTED);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag88EnuAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag88EnuAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag88EnuAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag88EnuAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag88EnuAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( "Tag88EnuAllocRejCode\n" +
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