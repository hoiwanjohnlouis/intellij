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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumCoveredOrUncovered;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  203 (same as 203, 565,)
 *  CoveredOrUncovered
 *  int
 *  <p>
 *  Used for derivative products, such as options
 *  <p></p>
 *  565
 *  LegCoveredOrUncovered
 *  int
 *  <p>
 *  CoveredOrUncovered for leg of a multileg
 *  <p>
 *  See CoveredOrUncovered (203) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Covered
 *  <p>    1 - Uncovered
 */
class Tag203EnuCoveredOrUncoveredTest {
    @Test
    void PrintFIXTagTest() {
        Tag203EnuCoveredOrUncovered tagData;

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag203EnuCoveredOrUncovered tagData;

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            assertEquals( "FIX203_ENU_COVERED_OR_UNCOVERED", tagData.toEnumLabelString());
            assertEquals( "203", tagData.toEnumIDString());
            assertEquals( "COVERED_OR_UNCOVERED", tagData.toEnumNameString());
            assertEquals( "CoveredOrUncovered", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag203EnuCoveredOrUncovered tagData;

        tagData = new Tag203EnuCoveredOrUncovered(MyEnumCoveredOrUncovered.COVERED);
        assertEquals( MyEnumCoveredOrUncovered.COVERED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag203EnuCoveredOrUncovered(MyEnumCoveredOrUncovered.UNCOVERED);
        assertEquals( MyEnumCoveredOrUncovered.UNCOVERED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag203EnuCoveredOrUncovered tagData;

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag203EnuCoveredOrUncovered tagData;

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag203EnuCoveredOrUncovered tagData;

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag203EnuCoveredOrUncovered(oneEnum);
            assertEquals( "Tag203EnuCoveredOrUncovered\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}