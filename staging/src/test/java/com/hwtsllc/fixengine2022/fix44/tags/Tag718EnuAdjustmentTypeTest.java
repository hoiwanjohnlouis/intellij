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

import com.hwtsllc.fixengine2022.fix44.enums.Enum718AdjustmentType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  718
 *  AdjustmentType
 *  int
 *  <p></p>
 *  Type of adjustment to be applied, used for PCS and PAJ
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Process Request As Margin Disposition
 *  <p>    1 - Delta Plus
 *  <p>    2 - Delta Minus
 *  <p>    3 - Final
 */
class Tag718EnuAdjustmentTypeTest {
    Tag718EnuAdjustmentType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            assertEquals( "FIX718_ENU_ADJUSTMENT_TYPE", tagData.toEnumLabelString());
            assertEquals( "718", tagData.toEnumIDString());
            assertEquals( "ADJUSTMENT_TYPE", tagData.toEnumNameString());
            assertEquals( "AdjustmentType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Process Request As Margin Disposition
         *  <p>    1 - Delta Plus
         *  <p>    2 - Delta Minus
         *  <p>    3 - Final
         */
        tagData = new Tag718EnuAdjustmentType( Enum718AdjustmentType.MARGIN_DISPOSITION );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.DELTA_PLUS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.DELTA_MINUS);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag718EnuAdjustmentType(Enum718AdjustmentType.FINAL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum718AdjustmentType oneEnum : Enum718AdjustmentType.values()) {
            tagData = new Tag718EnuAdjustmentType(oneEnum);
            assertEquals( "Tag718EnuAdjustmentType\n" +
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