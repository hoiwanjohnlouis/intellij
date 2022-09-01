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

import com.hwtsllc.fixengine2022.datatypes.MyEnumDiscretionOrPegScope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag840EnuPegScopeTest {
    Tag840EnuPegScope tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag840EnuPegScope(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag840EnuPegScope(oneEnum);
            assertEquals( "FIX840_ENU_PEG_SCOPE", tagData.toFIXLabelString());
            assertEquals( "840", tagData.toEnumIDString());
            assertEquals( "PEG_SCOPE", tagData.toEnumNameString());
            assertEquals( "PegScope", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag840EnuPegScope(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  840 (same as 840, 846,)
         *  PegScope
         *  int
         *  <p>    1 - Local (Exchange, ECN, ATS)
         *  <p>    2 - National
         *  <p>    3 - Global
         *  <p>    4 - National excluding local
         */
        tagData = new Tag840EnuPegScope( MyEnumDiscretionOrPegScope.LOCAL );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag840EnuPegScope( MyEnumDiscretionOrPegScope.NATIONAL);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag840EnuPegScope( MyEnumDiscretionOrPegScope.GLOBAL);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag840EnuPegScope( MyEnumDiscretionOrPegScope.NATIONAL_EXCLUDING_LOCAL);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag840EnuPegScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag840EnuPegScope(oneEnum);
            assertEquals( "Tag840EnuPegScope\n" +
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