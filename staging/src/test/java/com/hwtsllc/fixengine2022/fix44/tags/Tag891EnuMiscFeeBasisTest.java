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
import com.hwtsllc.fixengine2022.fix44.enums.Enum891MiscFeeBasis;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  891
 *  MiscFeeBasis
 *  int
 *  <p></p>
 *  Defines the unit for a miscellaneous fee.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Absolute
 *  <p>    1 - Per Unit
 *  <p>    2 - Percentage
 */
class Tag891EnuMiscFeeBasisTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX891_ENU_MISC_FEE_BASIS;
        assertEquals( "891", fixData.toEnumIDString());
        assertEquals( "MISC_FEE_BASIS", fixData.toEnumNameString());
        assertEquals( "MiscFeeBasis", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0891Test() {
        Tag891EnuMiscFeeBasis tagData;
        Enum891MiscFeeBasis oneElement;

        oneElement = Enum891MiscFeeBasis.ABSOLUTE;
        tagData = new Tag891EnuMiscFeeBasis( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "891", tagData.toEnumIDString());
        assertEquals( "MISC_FEE_BASIS", tagData.toEnumNameString());
        assertEquals( "MiscFeeBasis", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PER_UNIT );
        assertEquals( Enum891MiscFeeBasis.PER_UNIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PERCENTAGE );
        assertEquals( Enum891MiscFeeBasis.PERCENTAGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag891EnuMiscFeeBasis tagData;

        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag891EnuMiscFeeBasis tagData;

        // loop around the ENUM and process
        for (Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag891EnuMiscFeeBasis tagData;

        // loop around the ENUM and process
        for (Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag891EnuMiscFeeBasis tagData;

        // loop around the ENUM and process
        for (Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag891EnuMiscFeeBasis tagData;

        // loop around the ENUM and process
        for (Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( "Tag891EnuMiscFeeBasis\n" +
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