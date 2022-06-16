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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAllocRejCode;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  <p>
 *  Identifies reason for rejection.
 *  <p></p>
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  int
 *  <p>
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *  <p>
 *  Same values as  AllocRejCode (88)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown account(s)
 *  <p>    1 - Incorrect quantity
 *  <p>    2 - Incorrect averageg price
 *  <p>    3 - Unknown executing broker mnemonic
 *  <p>    4 - Commission difference
 *  <p>    5 - Unknown OrderID (37)
 *  <p>    6 - Unknown ListID (66)
 *  <p>    7 - Other (further in Text (58))
 *  <p>    8 - Incorrect allocated quantity
 *  <p>    9 - Calculation difference
 *  <p>    10 - Unknown or stale ExecID
 *  <p>    11 - Mismatched data
 *  <p>    12 - Unknown ClOrdID
 *  <p>    13 - Warehouse request rejected
 */
class Tag776EnuIndividualAllocRejCodeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX776_ENU_INDIVIDUAL_ALLOC_REJ_CODE;
        assertEquals( "776", fixData.toFIXIDString());
        assertEquals( "INDIVIDUAL_ALLOC_REJ_CODE", fixData.toFIXNameString());
        assertEquals( "IndividualAllocRejCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0776Test() {
        Tag776EnuIndividualAllocRejCode tagData;
        Enum665ConfirmStatus oneElement;

        /*
         * 0-13 AllocRejCode types
         */
        tagData = new Tag776EnuIndividualAllocRejCode(MyEnumAllocRejCode.UNKNOWN_ACCOUNT);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "776", fixData.toFIXIDString());
        assertEquals( "INDIVIDUAL_ALLOC_REJ_CODE", fixData.toFIXNameString());
        assertEquals( "IndividualAllocRejCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

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
    }
    @Test
    void PrintFIXTagTest() {
        Tag776EnuIndividualAllocRejCode tagData;

        // loop around the ENUM and process
        for ( MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag776EnuIndividualAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag776EnuIndividualAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag776EnuIndividualAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag776EnuIndividualAllocRejCode tagData;

        // loop around the ENUM and process
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            tagData = new Tag776EnuIndividualAllocRejCode(oneEnum);
            assertEquals( "Tag776EnuIndividualAllocRejCode\n" +
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