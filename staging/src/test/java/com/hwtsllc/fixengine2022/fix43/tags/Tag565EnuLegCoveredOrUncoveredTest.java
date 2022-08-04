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

package com.hwtsllc.fixengine2022.fix43.tags;

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
class Tag565EnuLegCoveredOrUncoveredTest {
    Tag565EnuLegCoveredOrUncovered tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            assertEquals( "FIX565_ENU_LEG_COVERED_OR_UNCOVERED", tagData.toEnumLabelString());
            assertEquals( "565", tagData.toEnumIDString());
            assertEquals( "LEG_COVERED_OR_UNCOVERED", tagData.toEnumNameString());
            assertEquals( "LegCoveredOrUncovered", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0-1 types
         */
        tagData = new Tag565EnuLegCoveredOrUncovered(MyEnumCoveredOrUncovered.COVERED);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag565EnuLegCoveredOrUncovered(MyEnumCoveredOrUncovered.UNCOVERED);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumCoveredOrUncovered oneEnum : MyEnumCoveredOrUncovered.values()) {
            tagData = new Tag565EnuLegCoveredOrUncovered(oneEnum);
            assertEquals( "Tag565EnuLegCoveredOrUncovered\n" +
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