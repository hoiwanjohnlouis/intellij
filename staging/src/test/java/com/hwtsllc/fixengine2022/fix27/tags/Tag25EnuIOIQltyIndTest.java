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
import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  25
 *  IOIQltyInd
 *  char
 *  Relative quality of indication
 *  Valid values:
 *      H - High
 *      L - Low
 *      M - Medium
 */
class Tag25EnuIOIQltyIndTest {
    @Test
    void FIX0025Test() {
        FIX27 fixData = FIX27.FIX25_ENU_IOI_QLTY_IND;
        assertEquals( "IOI_QLTY_IND", fixData.toFIXNameString());
        assertEquals( "25", fixData.toFIXIDString());
        assertEquals( "IOIQltyInd", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0025Test() {
        Tag25EnuIOIQltyInd tagData;

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.HIGH);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.MEDIUM);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.LOW);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( "Tag25EnuIOIQltyInd\n" +
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