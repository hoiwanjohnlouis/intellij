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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  142
 *  SenderLocationID
 *  String
 *  <p></p>
 *  Assigned value used to identify specific message originator’s location
 *  (i.e. geographic location and/or desk, trader)
 */
class Tag142StrSenderLocationIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag142StrSenderLocationID tagData ) {
        assertEquals( "FIX142_STR_SENDER_LOCATION_ID", tagData.toEnumLabelString());
        assertEquals( "142", tagData.toEnumIDString());
        assertEquals( "SENDER_LOCATION_ID", tagData.toEnumNameString());
        assertEquals( "SenderLocationID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        VerifyDataValue( tagData, oneElement );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        VerifyDataValue( tagData, oneElement );
    }

    private void VerifyDataValue( final Tag142StrSenderLocationID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag142StrSenderLocationID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag142StrSenderLocationID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag142StrSenderLocationID tagData;
        String oneElement;

        oneElement = Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID;
        tagData = new Tag142StrSenderLocationID(new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag142StrSenderLocationID tagData ) {
        assertEquals( "Tag142StrSenderLocationID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}