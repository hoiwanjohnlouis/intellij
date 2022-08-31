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

import com.hwtsllc.fixengine2022.fix43.enums.Enum528OrderCapacity;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag528EnuOrderCapacityTest {
    Tag528EnuOrderCapacity tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            tagData = new Tag528EnuOrderCapacity(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            tagData = new Tag528EnuOrderCapacity(oneEnum);
            assertEquals( "FIX528_ENU_ORDER_CAPACITY", tagData.toEnumLabelString());
            assertEquals( "528", tagData.toEnumIDString());
            assertEquals( "ORDER_CAPACITY", tagData.toEnumNameString());
            assertEquals( "OrderCapacity", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            tagData = new Tag528EnuOrderCapacity(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  528
         *  OrderCapacity
         *  char
         *  <p>    A - Agency
         *  <p>    G - Proprietary
         *  <p>    I - Individual
         *  <p>    P - Principal
         *              (Note for CMS purposes, "Principal" includes "Proprietary")
         *  <p>    R - Riskless Principal
         */
        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.AGENCY );
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.PROPRIETARY );
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.INDIVIDUAL );
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.PRINCIPAL );
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.RISKLESS_PRINCIPAL );
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    W - Agent for Other Member
         */
        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.AGENT_FOR_OTHER_MEMBER );
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            tagData = new Tag528EnuOrderCapacity(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            tagData = new Tag528EnuOrderCapacity(oneEnum);
            assertEquals( "Tag528EnuOrderCapacity\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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