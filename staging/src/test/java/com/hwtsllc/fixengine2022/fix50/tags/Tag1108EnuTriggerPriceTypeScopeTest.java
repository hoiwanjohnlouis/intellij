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
import com.hwtsllc.fixengine2022.datatypes.MyEnumPriceScope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1092 (same as 1092, 1108,)
 *  PriceProtectionScope
 *  char
 *  <p>
 *  Defines the type of price protection the customer requires on their order.
 *  <p></p>
 *  1108
 *  TriggerPriceTypeScope
 *  char
 *  <p>
 *  Defines the type of price protection the customer requires on their order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National (Across all national markets)
 *  <p>    3 - Global (Across all markets)
 */
class Tag1108EnuTriggerPriceTypeScopeTest {
    @Test
    void FIX1108Test() {
        FIX50 fixData = FIX50.FIX1108_ENU_TRIGGER_PRICE_TYPE_SCOPE;
        assertEquals( "1108", fixData.toEnumIDString());
        assertEquals( "TRIGGER_PRICE_TYPE_SCOPE", fixData.toEnumNameString());
        assertEquals( "TriggerPriceTypeScope", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1108Test() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.NONE );
        assertEquals( MyEnumPriceScope.NONE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.LOCAL );
        assertEquals( MyEnumPriceScope.LOCAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.NATIONAL );
        assertEquals( MyEnumPriceScope.NATIONAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.GLOBAL );
        assertEquals( MyEnumPriceScope.GLOBAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        // loop around the ENUM and process
        for (MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        // loop around the ENUM and process
        for (MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        // loop around the ENUM and process
        for (MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1108EnuTriggerPriceTypeScope tagData;

        // loop around the ENUM and process
        for (MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( "Tag1108EnuTriggerPriceTypeScope\n" +
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