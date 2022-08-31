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

import com.hwtsllc.fixengine2022.fix44.enums.Enum891MiscFeeBasis;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag891EnuMiscFeeBasisTest {
    Tag891EnuMiscFeeBasis tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( "FIX891_ENU_MISC_FEE_BASIS", tagData.toEnumLabelString());
            assertEquals( "891", tagData.toEnumIDString());
            assertEquals( "MISC_FEE_BASIS", tagData.toEnumNameString());
            assertEquals( "MiscFeeBasis", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  891
         *  MiscFeeBasis
         *  int
         *  <p>    0 - Absolute
         *  <p>    1 - Per Unit
         *  <p>    2 - Percentage
         */
        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.ABSOLUTE );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PER_UNIT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag891EnuMiscFeeBasis( Enum891MiscFeeBasis.PERCENTAGE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum891MiscFeeBasis oneEnum : Enum891MiscFeeBasis.values()) {
            tagData = new Tag891EnuMiscFeeBasis(oneEnum);
            assertEquals( "Tag891EnuMiscFeeBasis\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
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