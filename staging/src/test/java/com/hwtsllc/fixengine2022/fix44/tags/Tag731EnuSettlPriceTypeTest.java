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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSettlPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  731 (same as 731, 733)
 *  SettlPriceType
 *  int
 *  <p></p>
 *  Type of settlement price
 *  <p></p>
 *  733 (same as 731, 733)
 *  UnderlyingSettlPriceType
 *  int
 *  <p></p>
 *  Underlying security’s SettlPriceType.
 *  See SettlPriceType (731) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Final
 *  <p>    2 - Theoretical
 */
class Tag731EnuSettlPriceTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX731_ENU_SETTL_PRICE_TYPE;
        assertEquals( "731", fixData.toEnumIDString());
        assertEquals( "SETTL_PRICE_TYPE", fixData.toEnumNameString());
        assertEquals( "SettlPriceType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0731Test() {
        Tag731EnuSettlPriceType tagData;
        MyEnumSettlPriceType oneElement;

        oneElement = MyEnumSettlPriceType.FINAL;
        tagData = new Tag731EnuSettlPriceType( oneElement );
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "731", tagData.toEnumIDString());
        assertEquals( "SETTL_PRICE_TYPE", tagData.toEnumNameString());
        assertEquals( "SettlPriceType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag731EnuSettlPriceType( MyEnumSettlPriceType.THEORETICAL);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag731EnuSettlPriceType tagData;

        // loop around the ENUM and process
        for ( MyEnumSettlPriceType oneEnum : MyEnumSettlPriceType.values()) {
            tagData = new Tag731EnuSettlPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag731EnuSettlPriceType tagData;

        // loop around the ENUM and process
        for (MyEnumSettlPriceType oneEnum : MyEnumSettlPriceType.values()) {
            tagData = new Tag731EnuSettlPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag731EnuSettlPriceType tagData;

        // loop around the ENUM and process
        for (MyEnumSettlPriceType oneEnum : MyEnumSettlPriceType.values()) {
            tagData = new Tag731EnuSettlPriceType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag731EnuSettlPriceType tagData;

        // loop around the ENUM and process
        for (MyEnumSettlPriceType oneEnum : MyEnumSettlPriceType.values()) {
            tagData = new Tag731EnuSettlPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag731EnuSettlPriceType tagData;

        // loop around the ENUM and process
        for (MyEnumSettlPriceType oneEnum : MyEnumSettlPriceType.values()) {
            tagData = new Tag731EnuSettlPriceType(oneEnum);
            assertEquals( "Tag731EnuSettlPriceType\n" +
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