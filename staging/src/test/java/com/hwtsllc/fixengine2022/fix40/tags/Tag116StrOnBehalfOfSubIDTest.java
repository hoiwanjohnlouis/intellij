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
 *  116
 *  OnBehalfOfSubID
 *  String
 *  Assigned value used to identify specific message originator
 *  (i.e. trader) if the message was delivered by a third party
 */
class Tag116StrOnBehalfOfSubIDTest {
    @Test
    void FIX0116Test() {
        FIX40 fixData = FIX40.FIX116_STR_ON_BEHALF_OF_SUB_ID;
        assertEquals("ON_BEHALF_OF_SUB_ID", fixData.toFIXNameString());
        assertEquals("116", fixData.toFIXIDString());
        assertEquals("OnBehalfOfSubID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0116Test() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType("Gimli-116OnBehalfOfSubID") );
        assertEquals( "Gimli-116OnBehalfOfSubID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType(Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType(Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID));
        assertEquals( Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType(Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType(Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID));
        assertEquals( Tag116StrOnBehalfOfSubID.TESTB_STR_ON_BEHALF_OF_SUB_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag116StrOnBehalfOfSubID tagData;

        tagData = new Tag116StrOnBehalfOfSubID(new MyStringType(Tag116StrOnBehalfOfSubID.TESTA_STR_ON_BEHALF_OF_SUB_ID));
        assertEquals( "Tag116StrOnBehalfOfSubID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag116StrOnBehalfOfSubID.TESTA_STR_ON_BEHALF_OF_SUB_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag116StrOnBehalfOfSubID.TESTA_STR_ON_BEHALF_OF_SUB_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}