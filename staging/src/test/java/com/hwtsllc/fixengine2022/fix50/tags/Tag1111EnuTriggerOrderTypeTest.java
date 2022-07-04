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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1111TriggerOrderType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1111
 *  TriggerOrderType
 *  char
 *  <p>
 *  The OrdType the order should have after the trigger has hit.
 *  <p>
 *  Required to express orders that change from Limit to Market.
 *  <p>
 *  Other values from OrdType (40) may be used if appropriate and bilaterally agreed upon.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Market
 *  <p>    2 - Limit
 */
class Tag1111EnuTriggerOrderTypeTest {
    @Test
    void FIX1111Test() {
        FIX50 fixData = FIX50.FIX1111_ENU_TRIGGER_ORDER_TYPE;
        assertEquals( "1111", fixData.toEnumIDString());
        assertEquals( "TRIGGER_ORDER_TYPE", fixData.toEnumNameString());
        assertEquals( "TriggerOrderType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1111Test() {
        Tag1111EnuTriggerOrderType tagData;

        tagData = new Tag1111EnuTriggerOrderType( Enum1111TriggerOrderType.MARKET );
        assertEquals( Enum1111TriggerOrderType.MARKET.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1111EnuTriggerOrderType( Enum1111TriggerOrderType.LIMIT );
        assertEquals( Enum1111TriggerOrderType.LIMIT.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1111EnuTriggerOrderType tagData;

        // loop around the ENUM and process
        for ( Enum1111TriggerOrderType oneEnum : Enum1111TriggerOrderType.values()) {
            tagData = new Tag1111EnuTriggerOrderType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1111EnuTriggerOrderType tagData;

        // loop around the ENUM and process
        for (Enum1111TriggerOrderType oneEnum : Enum1111TriggerOrderType.values()) {
            tagData = new Tag1111EnuTriggerOrderType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1111EnuTriggerOrderType tagData;

        // loop around the ENUM and process
        for (Enum1111TriggerOrderType oneEnum : Enum1111TriggerOrderType.values()) {
            tagData = new Tag1111EnuTriggerOrderType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1111EnuTriggerOrderType tagData;

        // loop around the ENUM and process
        for (Enum1111TriggerOrderType oneEnum : Enum1111TriggerOrderType.values()) {
            tagData = new Tag1111EnuTriggerOrderType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1111EnuTriggerOrderType tagData;

        // loop around the ENUM and process
        for (Enum1111TriggerOrderType oneEnum : Enum1111TriggerOrderType.values()) {
            tagData = new Tag1111EnuTriggerOrderType(oneEnum);
            assertEquals( "Tag1111EnuTriggerOrderType\n" +
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