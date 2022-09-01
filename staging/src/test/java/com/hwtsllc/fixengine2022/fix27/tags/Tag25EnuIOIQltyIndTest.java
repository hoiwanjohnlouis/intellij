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

import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag25EnuIOIQltyIndTest {
    Tag25EnuIOIQltyInd tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( "FIX25_ENU_IOI_QLTY_IND", tagData.toFIXLabelString());
            assertEquals( "IOI_QLTY_IND", tagData.toFIXNameString());
            assertEquals( "25", tagData.toFIXIDString());
            assertEquals( "IOIQltyInd", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  25
         *  <p>    H - High
         *  <p>    L - Low
         *  <p>    M - Medium
         */
        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.HIGH);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.MEDIUM);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.LOW);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( "Tag25EnuIOIQltyInd\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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