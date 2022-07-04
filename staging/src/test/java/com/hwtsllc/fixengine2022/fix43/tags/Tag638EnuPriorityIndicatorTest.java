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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum638PriorityIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  638
 *  PriorityIndicator
 *  int
 *  <p></p>
 *  Indicates if a Cancel/Replace has caused an order to lose book priority.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Priority unchanged
 *  <p>    1 - Lost Priority as result of order change
 */
class Tag638EnuPriorityIndicatorTest {
    @Test
    void FIX0638Test() {
        FIX43 fixData = FIX43.FIX638_ENU_PRIORITY_INDICATOR;
        assertEquals( "638", fixData.toEnumIDString());
        assertEquals( "PRIORITY_INDICATOR", fixData.toEnumNameString());
        assertEquals( "PriorityIndicator", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0638Test() {
        Tag638EnuPriorityIndicator tagData;

        /*
         *  0-1 types
         */
        tagData = new Tag638EnuPriorityIndicator( Enum638PriorityIndicator.PRIORITY_UNCHANGED );
        assertEquals( Enum638PriorityIndicator.PRIORITY_UNCHANGED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag638EnuPriorityIndicator( Enum638PriorityIndicator.LOST_PRIORITY );
        assertEquals( Enum638PriorityIndicator.LOST_PRIORITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag638EnuPriorityIndicator tagData;

        // loop around the ENUM and process
        for ( Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            tagData = new Tag638EnuPriorityIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag638EnuPriorityIndicator tagData;

        // loop around the ENUM and process
        for (Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            tagData = new Tag638EnuPriorityIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag638EnuPriorityIndicator tagData;

        // loop around the ENUM and process
        for (Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            tagData = new Tag638EnuPriorityIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag638EnuPriorityIndicator tagData;

        // loop around the ENUM and process
        for (Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            tagData = new Tag638EnuPriorityIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag638EnuPriorityIndicator tagData;

        // loop around the ENUM and process
        for (Enum638PriorityIndicator oneEnum : Enum638PriorityIndicator.values()) {
            tagData = new Tag638EnuPriorityIndicator(oneEnum);
            assertEquals( "Tag638EnuPriorityIndicator\n" +
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