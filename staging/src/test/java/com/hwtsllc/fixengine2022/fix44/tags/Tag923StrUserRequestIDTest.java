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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  923
 *  UserRequestID
 *  String
 *  <p></p>
 *  Unique identifier for a User Request.
 */
class Tag923StrUserRequestIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX923_STR_USER_REQUEST_ID;
        assertEquals( "923", fixData.toFIXIDString());
        assertEquals( "USER_REQUEST_ID", fixData.toFIXNameString());
        assertEquals( "UserRequestID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0923Test() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTA_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "923", fixData.toFIXIDString());
        assertEquals( "USER_REQUEST_ID", fixData.toFIXNameString());
        assertEquals( "UserRequestID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        oneElement = Tag923StrUserRequestID.TESTB_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTA_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag923StrUserRequestID.TESTB_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTB_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTB_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTB_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag923StrUserRequestID tagData;
        String oneElement;

        oneElement = Tag923StrUserRequestID.TESTA_STR_USER_REQUEST_ID;
        tagData = new Tag923StrUserRequestID( new MyStringType( oneElement ) );
        assertEquals( "Tag923StrUserRequestID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}