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

import com.hwtsllc.fixengine2022.fix27.enums.Enum71AllocTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag71EnuAllocTransTypeTest {
    Tag71EnuAllocTransType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            tagData = new Tag71EnuAllocTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            tagData = new Tag71EnuAllocTransType(oneEnum);
            assertEquals( "FIX71_ENU_ALLOC_TRANS_TYPE", tagData.toFIXLabelString());
            assertEquals( "ALLOC_TRANS_TYPE", tagData.toEnumNameString());
            assertEquals( "71", tagData.toEnumIDString());
            assertEquals( "AllocTransType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            tagData = new Tag71EnuAllocTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  71
         *  <p>    0 - New
         *  <p>    1 - Replace
         *  <p>    2 - Cancel
         *  <p>    3 - Preliminary (without MiscFees and NetMoney) (Removed/Replaced)
         *  <p>    4 - Calculated (includes MiscFees and NetMoney) (Removed/Replaced)
         */
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.NEW);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.REPLACE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CANCEL);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.PRELIMINARY_WITHOUT_MISC_FEES_AND_NETMONEY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CALCULATED_INCLUDES_MISC_FEES_AND_NETMONEY);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Calculated without Preliminary
         *          (sent unsolicited by broker, includes MiscFees and NetMoney)
         *          (Removed-Replaced)
         *  <p>    6 - Reversal
         */
        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.CALCULATED_WITHOUT_PRELIMINARY);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag71EnuAllocTransType(Enum71AllocTransType.REVERSAL);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            tagData = new Tag71EnuAllocTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum71AllocTransType oneEnum : Enum71AllocTransType.values()) {
            tagData = new Tag71EnuAllocTransType(oneEnum);
            assertEquals( "Tag71EnuAllocTransType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
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