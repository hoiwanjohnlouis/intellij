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

import com.hwtsllc.fixengine2022.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection.
 *  <p></p>
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  int
 *  <p></p>
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *  <p></p>
 *      Same values as  AllocRejCode (88)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown account(s)
 *  <p>    1 - Incorrect quantity
 *  <p>    2 - Incorrect average price
 *  <p>    3 - Unknown executing broker mnemonic
 *  <p>    4 - Commission difference
 *  <p></p>
 *  <p>    5 - Unknown OrderID (37)
 *  <p>    6 - Unknown ListID (66)
 *  <p>    7 - Other (further in Text (58))
 *  <p>    8 - Incorrect allocated quantity
 *  <p>    9 - Calculation difference
 *  <p></p>
 *  <p>    10 - Unknown or stale ExecID
 *  <p>    11 - Mismatched data
 *  <p>    12 - Unknown ClOrdID
 *  <p>    13 - Warehouse request rejected
 */
class Tag776EnuIndividualAllocRejCodeTest {
    Tag776EnuIndividualAllocRejCode tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( "FIX776_ENU_INDIVIDUAL_ALLOC_REJ_CODE", tagData.toEnumLabelString());
            assertEquals( "776", tagData.toEnumIDString());
            assertEquals( "INDIVIDUAL_ALLOC_REJ_CODE", tagData.toEnumNameString());
            assertEquals( "IndividualAllocRejCode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Unknown account(s)
         *  <p>    1 - Incorrect quantity
         *  <p>    2 - Incorrect average price
         *  <p>    3 - Unknown executing broker mnemonic
         *  <p>    4 - Commission difference
         */
        tagData = new Tag776EnuIndividualAllocRejCode( MyEnumAllocRejCode.UNKNOWN_ACCOUNT );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_QUANTITY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_AVERAGE_PRICE);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.COMMISSION_DIFFERENCE);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - Unknown OrderID (37)
         *  <p>    6 - Unknown ListID (66)
         *  <p>    7 - Other (further in Text (58))
         *  <p>    8 - Incorrect allocated quantity
         *  <p>    9 - Calculation difference
         */
        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ORDERID);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_LISTID);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.OTHER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.INCORRECT_ALLOCATED_QUANTITY);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.CALCULATION_DIFFERENCE);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    10 - Unknown or stale ExecID
         *  <p>    11 - Mismatched data
         *  <p>    12 - Unknown ClOrdID
         *  <p>    13 - Warehouse request rejected
         */
        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_OR_STALE_EXECID);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.MISMATCHED_DATA);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_CLORDID);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.WAREHOUSE_REQUEST_REJECTED);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( "Tag776EnuIndividualAllocRejCode\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}