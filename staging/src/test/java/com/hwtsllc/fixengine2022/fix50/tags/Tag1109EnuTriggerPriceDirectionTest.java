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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1109TriggerPriceDirection;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1109
 *  TriggerPriceDirection
 *  char
 *  <p>
 *  The side from which the trigger price is reached.
 *  <p></p>
 *  Valid values:
 *  <p>    U - Trigger if the price of the specified type goes UP to or through the specified Trigger Price
 *  <p>    D - Trigger if the price of the specified type goes DOWN to or through the specified Trigger Price
 */
class Tag1109EnuTriggerPriceDirectionTest {
    @Test
    void FIX1109Test() {
        FIX50 fixData = FIX50.FIX1109_ENU_TRIGGER_PRICE_DIRECTION;
        assertEquals( "1109", fixData.toEnumIDString());
        assertEquals( "TRIGGER_PRICE_DIRECTION", fixData.toEnumNameString());
        assertEquals( "TriggerPriceDirection", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1109Test() {
        Tag1109EnuTriggerPriceDirection tagData;

        tagData = new Tag1109EnuTriggerPriceDirection( Enum1109TriggerPriceDirection.TRIGGER_UP );
        assertEquals( Enum1109TriggerPriceDirection.TRIGGER_UP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1109EnuTriggerPriceDirection( Enum1109TriggerPriceDirection.TRIGGER_DOWN );
        assertEquals( Enum1109TriggerPriceDirection.TRIGGER_DOWN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1109EnuTriggerPriceDirection tagData;

        // loop around the ENUM and process
        for ( Enum1109TriggerPriceDirection oneEnum : Enum1109TriggerPriceDirection.values()) {
            tagData = new Tag1109EnuTriggerPriceDirection(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1109EnuTriggerPriceDirection tagData;

        // loop around the ENUM and process
        for (Enum1109TriggerPriceDirection oneEnum : Enum1109TriggerPriceDirection.values()) {
            tagData = new Tag1109EnuTriggerPriceDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1109EnuTriggerPriceDirection tagData;

        // loop around the ENUM and process
        for (Enum1109TriggerPriceDirection oneEnum : Enum1109TriggerPriceDirection.values()) {
            tagData = new Tag1109EnuTriggerPriceDirection(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1109EnuTriggerPriceDirection tagData;

        // loop around the ENUM and process
        for (Enum1109TriggerPriceDirection oneEnum : Enum1109TriggerPriceDirection.values()) {
            tagData = new Tag1109EnuTriggerPriceDirection(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1109EnuTriggerPriceDirection tagData;

        // loop around the ENUM and process
        for (Enum1109TriggerPriceDirection oneEnum : Enum1109TriggerPriceDirection.values()) {
            tagData = new Tag1109EnuTriggerPriceDirection(oneEnum);
            assertEquals( "Tag1109EnuTriggerPriceDirection\n" +
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