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
import com.hwtsllc.fixengine2022.fix27.enums.Enum94EmailType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  94
 *  EmailType
 *  char
 *  Email message type.
 *  Valid values:
 *      0 - New
 *      1 - Reply
 *      2 - Admin Reply
 */
class Tag94EnuEmailTypeTest {
    @Test
    void FIX0094Test() {
        FIX27 fixData = FIX27.FIX94_ENU_EMAIL_TYPE;
        assertEquals( "EMAIL_TYPE", fixData.toFIXNameString());
        assertEquals( "94", fixData.toFIXIDString());
        assertEquals( "EmailType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0094Test() {
        Tag94EnuEmailType tagData;

        /*
         * 0-2 email types
         */
        tagData = new Tag94EnuEmailType(Enum94EmailType.NEW);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag94EnuEmailType(Enum94EmailType.REPLY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag94EnuEmailType(Enum94EmailType.ADMIN_REPLY);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag94EnuEmailType tagData;

        // loop around the ENUM and process
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            tagData = new Tag94EnuEmailType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag94EnuEmailType tagData;

        // loop around the ENUM and process
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            tagData = new Tag94EnuEmailType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag94EnuEmailType tagData;

        // loop around the ENUM and process
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            tagData = new Tag94EnuEmailType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag94EnuEmailType tagData;

        // loop around the ENUM and process
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            tagData = new Tag94EnuEmailType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag94EnuEmailType tagData;

        // loop around the ENUM and process
        for (Enum94EmailType oneEnum : Enum94EmailType.values()) {
            tagData = new Tag94EnuEmailType(oneEnum);
            assertEquals( "Tag94EnuEmailType\n" +
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