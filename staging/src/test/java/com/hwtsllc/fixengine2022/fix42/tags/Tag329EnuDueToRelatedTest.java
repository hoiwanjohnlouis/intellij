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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum329DueToRelated;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  329
 *  DueToRelated
 *  Boolean
 *  <p>
 *  Indicates whether or not the halt was due to the Related Security being halted.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Halt was not related to a halt of the related security
 *  <p>    Y - Halt was due to related security being halted
 */
class Tag329EnuDueToRelatedTest {
    @Test
    void FIX0329Test() {
        FIX42 fixData = FIX42.FIX329_ENU_DUE_TO_RELATED;
        assertEquals( "329", fixData.toEnumIDString());
        assertEquals( "DUE_TO_RELATED", fixData.toEnumNameString());
        assertEquals( "DueToRelated", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0329Test() {
        Tag329EnuDueToRelated tagData;

        tagData = new Tag329EnuDueToRelated(Enum329DueToRelated.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag329EnuDueToRelated(Enum329DueToRelated.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag329EnuDueToRelated tagData;

        // loop around the ENUM and process
        for (Enum329DueToRelated oneEnum : Enum329DueToRelated.values()) {
            tagData = new Tag329EnuDueToRelated(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag329EnuDueToRelated tagData;

        // loop around the ENUM and process
        for (Enum329DueToRelated oneEnum : Enum329DueToRelated.values()) {
            tagData = new Tag329EnuDueToRelated(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag329EnuDueToRelated tagData;

        // loop around the ENUM and process
        for (Enum329DueToRelated oneEnum : Enum329DueToRelated.values()) {
            tagData = new Tag329EnuDueToRelated(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag329EnuDueToRelated tagData;

        // loop around the ENUM and process
        for (Enum329DueToRelated oneEnum : Enum329DueToRelated.values()) {
            tagData = new Tag329EnuDueToRelated(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag329EnuDueToRelated tagData;

        // loop around the ENUM and process
        for (Enum329DueToRelated oneEnum : Enum329DueToRelated.values()) {
            tagData = new Tag329EnuDueToRelated(oneEnum);
            assertEquals( "Tag329EnuDueToRelated\n" +
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