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
import com.hwtsllc.fixengine2022.fix42.enums.Enum401SideValueInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  401
 *  SideValueInd
 *  int
 *  <p>
 *  Code to identify which "SideValue" the value refers to.
 *  <p>
 *  SideValue1 and SideValue2 are used as opposed to Buy or Sell
 *  so that the basket can be quoted either way as Buy or Sell.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Side Value 1
 *  <p>    2 - Side Value 2
 */
class Tag401EnuSideValueIndTest {
    @Test
    void FIX0401Test() {
        FIX42 fixData = FIX42.FIX401_ENU_SIDE_VALUE_IND;
        assertEquals( "401", fixData.toEnumIDString());
        assertEquals( "SIDE_VALUE_IND", fixData.toEnumNameString());
        assertEquals( "SideValueInd", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0401Test() {
        Tag401EnuSideValueInd tagData;

        /*
         * 1-2 msg types
         */
        tagData = new Tag401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_1);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_1.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag401EnuSideValueInd(Enum401SideValueInd.SIDE_VALUE_2);
        assertEquals( Enum401SideValueInd.SIDE_VALUE_2.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag401EnuSideValueInd tagData;

        // loop around the ENUM and process
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            tagData = new Tag401EnuSideValueInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag401EnuSideValueInd tagData;

        // loop around the ENUM and process
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            tagData = new Tag401EnuSideValueInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag401EnuSideValueInd tagData;

        // loop around the ENUM and process
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            tagData = new Tag401EnuSideValueInd(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag401EnuSideValueInd tagData;

        // loop around the ENUM and process
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            tagData = new Tag401EnuSideValueInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag401EnuSideValueInd tagData;

        // loop around the ENUM and process
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            tagData = new Tag401EnuSideValueInd(oneEnum);
            assertEquals( "Tag401EnuSideValueInd\n" +
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