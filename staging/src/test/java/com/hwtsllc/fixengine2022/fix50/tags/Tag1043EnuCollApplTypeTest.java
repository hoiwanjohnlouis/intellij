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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1043CollApplType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1043
 *  CollApplType
 *  int
 *  <p>
 *  conveys how the collateral should be/has been applied
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Specific Deposit
 *  <p>    1 - General
 */
class Tag1043EnuCollApplTypeTest {
    @Test
    void FIX1043Test() {
        FIX50 fixData = FIX50.FIX1043_ENU_COLL_APPL_TYPE;
        assertEquals( "1043", fixData.toEnumIDString());
        assertEquals( "COLL_APPL_TYPE", fixData.toEnumNameString());
        assertEquals( "CollApplType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1043Test() {
        Tag1043EnuCollApplType tagData;

        tagData = new Tag1043EnuCollApplType( Enum1043CollApplType.SPECIFIC_DEPOSIT );
        assertEquals( Enum1043CollApplType.SPECIFIC_DEPOSIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1043EnuCollApplType( Enum1043CollApplType.GENERAL );
        assertEquals( Enum1043CollApplType.GENERAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1043EnuCollApplType tagData;

        // loop around the ENUM and process
        for ( Enum1043CollApplType oneEnum : Enum1043CollApplType.values()) {
            tagData = new Tag1043EnuCollApplType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1043EnuCollApplType tagData;

        // loop around the ENUM and process
        for (Enum1043CollApplType oneEnum : Enum1043CollApplType.values()) {
            tagData = new Tag1043EnuCollApplType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1043EnuCollApplType tagData;

        // loop around the ENUM and process
        for (Enum1043CollApplType oneEnum : Enum1043CollApplType.values()) {
            tagData = new Tag1043EnuCollApplType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1043EnuCollApplType tagData;

        // loop around the ENUM and process
        for (Enum1043CollApplType oneEnum : Enum1043CollApplType.values()) {
            tagData = new Tag1043EnuCollApplType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1043EnuCollApplType tagData;

        // loop around the ENUM and process
        for (Enum1043CollApplType oneEnum : Enum1043CollApplType.values()) {
            tagData = new Tag1043EnuCollApplType(oneEnum);
            assertEquals( "Tag1043EnuCollApplType\n" +
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