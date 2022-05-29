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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumOrderSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1032 (same as 1032, 1034,)
 *  OrderHandlingInstSource
 *  int
 *  <p>
 *  Identifies the class or source of the “OrderHandlingInst” values.
 *  <p>
 *  Scope of this will apply to both CustOrderHandlingInst and DeskOrderHandlingInst fields.
 *  <p>
 *  Required if CustOrderHandlingInst and/or DeskOrderHandlingInst is specified.
 *  <p></p>
 *  1034
 *  DeskTypeSource
 *  int
 *  <p></p>
 *  Valid values:
 *  <p>    1 - NASD OATS
 */
class Tag1032EnuOrderHandlingInstSourceTest {
    @Test
    void FIX1032Test() {
        FIX50 fixData = FIX50.FIX1032_ENU_ORDER_HANDLING_INST_SOURCE;
        assertEquals( "1032", fixData.toFIXIDString());
        assertEquals( "ORDER_HANDLING_INST_SOURCE", fixData.toFIXNameString());
        assertEquals( "OrderHandlingInstSource", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1032Test() {
        Tag1032EnuOrderHandlingInstSource tagData;

        tagData = new Tag1032EnuOrderHandlingInstSource( MyEnumOrderSource.NASD_OATS );
        assertEquals( MyEnumOrderSource.NASD_OATS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1032EnuOrderHandlingInstSource tagData;

        // loop around the ENUM and process
        for ( MyEnumOrderSource oneEnum : MyEnumOrderSource.values()) {
            tagData = new Tag1032EnuOrderHandlingInstSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1032EnuOrderHandlingInstSource tagData;

        // loop around the ENUM and process
        for (MyEnumOrderSource oneEnum : MyEnumOrderSource.values()) {
            tagData = new Tag1032EnuOrderHandlingInstSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1032EnuOrderHandlingInstSource tagData;

        // loop around the ENUM and process
        for (MyEnumOrderSource oneEnum : MyEnumOrderSource.values()) {
            tagData = new Tag1032EnuOrderHandlingInstSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1032EnuOrderHandlingInstSource tagData;

        // loop around the ENUM and process
        for (MyEnumOrderSource oneEnum : MyEnumOrderSource.values()) {
            tagData = new Tag1032EnuOrderHandlingInstSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1032EnuOrderHandlingInstSource tagData;

        // loop around the ENUM and process
        for (MyEnumOrderSource oneEnum : MyEnumOrderSource.values()) {
            tagData = new Tag1032EnuOrderHandlingInstSource(oneEnum);
            assertEquals( "Tag1032EnuOrderHandlingInstSource\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}