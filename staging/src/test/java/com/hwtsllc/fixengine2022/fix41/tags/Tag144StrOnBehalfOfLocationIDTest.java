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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  144
 *  OnBehalfOfLocationID
 *  String
 *  <p>
 *  Assigned value used to identify specific message originator’s location (i.e. geographic location and/or desk, trader) if the message was delivered by a third party
 */
class Tag144StrOnBehalfOfLocationIDTest {
    @Test
    void FIX0144Test() {
        FIX41 fixData = FIX41.FIX144_STR_ON_BEHALF_OF_LOCATION_ID;
        assertEquals( "144", fixData.toEnumIDString());
        assertEquals( "ON_BEHALF_OF_LOCATION_ID", fixData.toEnumNameString());
        assertEquals( "OnBehalfOfLocationID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0144Test() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                        new MyStringType(Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag144StrOnBehalfOfLocationID(
                        new MyStringType(Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                new MyStringType(Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                new MyStringType(Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                new MyStringType(Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                new MyStringType(Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( Tag144StrOnBehalfOfLocationID.TESTB_STR_ON_BEHALF_OF_LOCATION_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag144StrOnBehalfOfLocationID tagData;

        tagData = new Tag144StrOnBehalfOfLocationID(
                new MyStringType(Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID));
        assertEquals( "Tag144StrOnBehalfOfLocationID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}