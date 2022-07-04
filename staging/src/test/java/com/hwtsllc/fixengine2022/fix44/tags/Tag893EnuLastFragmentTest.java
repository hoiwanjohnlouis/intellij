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
import com.hwtsllc.fixengine2022.fix44.enums.Enum893LastFragment;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  893
 *  LastFragment
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is the last in a sequence of messages
 *  for those messages that support fragmentation, such as Allocation Instruction,
 *  Mass Quote, Security List, Derivative Security List
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Last Fragment
 *  <p>    Y - Last Fragment
 */
class Tag893EnuLastFragmentTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX893_ENU_LAST_FRAGMENT;
        assertEquals( "893", fixData.toEnumIDString());
        assertEquals( "LAST_FRAGMENT", fixData.toEnumNameString());
        assertEquals( "LastFragment", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0893Test() {
        Tag893EnuLastFragment tagData;
        Enum893LastFragment oneElement;

        oneElement = Enum893LastFragment.NO;
        tagData = new Tag893EnuLastFragment( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "893", tagData.toEnumIDString());
        assertEquals( "LAST_FRAGMENT", tagData.toEnumNameString());
        assertEquals( "LastFragment", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag893EnuLastFragment( Enum893LastFragment.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag893EnuLastFragment tagData;

        // loop around the ENUM and process
        for ( Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            tagData = new Tag893EnuLastFragment(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag893EnuLastFragment tagData;

        // loop around the ENUM and process
        for (Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            tagData = new Tag893EnuLastFragment(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag893EnuLastFragment tagData;

        // loop around the ENUM and process
        for (Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            tagData = new Tag893EnuLastFragment(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag893EnuLastFragment tagData;

        // loop around the ENUM and process
        for (Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            tagData = new Tag893EnuLastFragment(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag893EnuLastFragment tagData;

        // loop around the ENUM and process
        for (Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            tagData = new Tag893EnuLastFragment(oneEnum);
            assertEquals( "Tag893EnuLastFragment\n" +
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