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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag88EnuAllocRejCodeTest {
    Tag88EnuAllocRejCode tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( "FIX88_ENU_ALLOC_REJ_CODE", tagData.toFIXLabelString());
            assertEquals( "ALLOC_REJ_CODE", tagData.toFIXNameString());
            assertEquals( "88", tagData.toFIXIDString());
            assertEquals( "AllocRejCode", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  88 (same as 88, 776)
         *  <p>    0 - Unknown account(s)
         *  <p>    1 - Incorrect quantity
         *  <p>    2 - Incorrect average price
         *  <p>    3 - Unknown executing broker mnemonic
         *  <p>    4 - Commission difference
         */
        tagData = new Tag88EnuAllocRejCode( MyEnumAllocRejCode.UNKNOWN_ACCOUNT );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_QUANTITY);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_AVERAGE_PRICE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.COMMISSION_DIFFERENCE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Unknown OrderID (37)
         *  <p>    6 - Unknown ListID (66)
         *  <p>    7 - Other (further in Text (58))
         *  <p>    8 - Incorrect allocated quantity
         *  <p>    9 - Calculation difference
         */
        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ORDERID);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_LISTID);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.OTHER);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.CALCULATION_DIFFERENCE);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Unknown or stale ExecID
         *  <p>    11 - Mismatched data
         *  <p>    12 - Unknown ClOrdID
         *  <p>    13 - Warehouse request rejected
         */
        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_OR_STALE_EXECID);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.MISMATCHED_DATA);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.UNKNOWN_CLORDID);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag88EnuAllocRejCode(MyEnumAllocRejCode.WAREHOUSE_REQUEST_REJECTED);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag88EnuAllocRejCode(oneEnum);
            assertEquals( "Tag88EnuAllocRejCode\n" +
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