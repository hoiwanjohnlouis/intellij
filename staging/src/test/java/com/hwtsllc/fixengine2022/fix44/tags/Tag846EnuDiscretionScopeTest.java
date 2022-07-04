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
import com.hwtsllc.fixengine2022.datatypes.MyEnumDiscretionOrPegScope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  840 (same as 840, 846,)
 *  PegScope
 *  int
 *  <p>
 *  The scope of the peg
 *  <p></p>
 *  846
 *  DiscretionScope
 *  int
 *  <p>
 *  The scope of the discretion
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 *  <p>    4 - National excluding local
 */
class Tag846EnuDiscretionScopeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX846_ENU_DISCRETION_SCOPE;
        assertEquals( "846", fixData.toEnumIDString());
        assertEquals( "DISCRETION_SCOPE", fixData.toEnumNameString());
        assertEquals( "DiscretionScope", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0846Test() {
        Tag846EnuDiscretionScope tagData;
        MyEnumDiscretionOrPegScope oneElement;

        oneElement = MyEnumDiscretionOrPegScope.LOCAL;
        tagData = new Tag846EnuDiscretionScope( oneElement );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "846", tagData.toEnumIDString());
        assertEquals( "DISCRETION_SCOPE", tagData.toEnumNameString());
        assertEquals( "DiscretionScope", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.NATIONAL);
        assertEquals( MyEnumDiscretionOrPegScope.NATIONAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.GLOBAL);
        assertEquals( MyEnumDiscretionOrPegScope.GLOBAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag846EnuDiscretionScope( MyEnumDiscretionOrPegScope.NATIONAL_EXCLUDING_LOCAL);
        assertEquals( MyEnumDiscretionOrPegScope.NATIONAL_EXCLUDING_LOCAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag846EnuDiscretionScope tagData;

        // loop around the ENUM and process
        for ( MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag846EnuDiscretionScope(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag846EnuDiscretionScope tagData;

        // loop around the ENUM and process
        for (MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag846EnuDiscretionScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag846EnuDiscretionScope tagData;

        // loop around the ENUM and process
        for (MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag846EnuDiscretionScope(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag846EnuDiscretionScope tagData;

        // loop around the ENUM and process
        for (MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag846EnuDiscretionScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag846EnuDiscretionScope tagData;

        // loop around the ENUM and process
        for (MyEnumDiscretionOrPegScope oneEnum : MyEnumDiscretionOrPegScope.values()) {
            tagData = new Tag846EnuDiscretionScope(oneEnum);
            assertEquals( "Tag846EnuDiscretionScope\n" +
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