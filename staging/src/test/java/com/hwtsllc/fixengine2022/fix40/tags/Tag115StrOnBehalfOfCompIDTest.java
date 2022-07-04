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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  115
 *  OnBehalfOfCompID
 *  String
 *  Assigned value used to identify firm originating message
 *  if the message was delivered by a third party
 *  i.e. the third party firm identifier would be delivered
 *  in the SenderCompID field and the firm originating the message in this field.
 */
class Tag115StrOnBehalfOfCompIDTest {
    @Test
    void FIX0115Test() {
        FIX40 fixData = FIX40.FIX115_STR_ON_BEHALF_OF_COMP_ID;
        assertEquals( "ON_BEHALF_OF_COMP_ID", fixData.toEnumNameString());
        assertEquals( "115", fixData.toEnumIDString());
        assertEquals( "OnBehalfOfCompID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0115Test() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType("Legolas-115OnBehalfOfCompID") );
        assertEquals( "Legolas-115OnBehalfOfCompID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType(Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType(Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID));
        assertEquals( Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType(Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType(Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID));
        assertEquals( Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType(Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID));
        assertEquals( "Tag115StrOnBehalfOfCompID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}