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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.MyEnumPriceScope;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1108EnuTriggerPriceTypeScopeTest {
    Tag1108EnuTriggerPriceTypeScope tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( "FIX1108_ENU_TRIGGER_PRICE_TYPE_SCOPE", tagData.toFIXLabelString());
            assertEquals( "1108", tagData.toFIXIDString());
            assertEquals( "TRIGGER_PRICE_TYPE_SCOPE", tagData.toFIXNameString());
            assertEquals( "TriggerPriceTypeScope", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1108 (same as 1092, 1108,)
         *  TriggerPriceTypeScope
         *  char
         *  <p>    0 - None
         *  <p>    1 - Local (Exchange, ECN, ATS)
         *  <p>    2 - National (Across all national markets)
         *  <p>    3 - Global (Across all markets)
         */
        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.NONE );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.LOCAL );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.NATIONAL );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1108EnuTriggerPriceTypeScope( MyEnumPriceScope.GLOBAL );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceScope oneEnum : MyEnumPriceScope.values()) {
            tagData = new Tag1108EnuTriggerPriceTypeScope(oneEnum);
            assertEquals( "Tag1108EnuTriggerPriceTypeScope\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}