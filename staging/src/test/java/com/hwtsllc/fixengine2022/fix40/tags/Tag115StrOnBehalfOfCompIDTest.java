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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  115
 *  OnBehalfOfCompID
 *  String
 *  <p></p>
 *  Assigned value used to identify firm originating message
 *  if the message was delivered by a third party
 *  <p></p>
 *  i.e. the third party firm identifier would be delivered
 *  in the SenderCompID field and the firm originating the message in this field.
 */
class Tag115StrOnBehalfOfCompIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag115StrOnBehalfOfCompID tagData ) {
        assertEquals( "FIX115_STR_ON_BEHALF_OF_COMP_ID", tagData.toEnumLabelString());
        assertEquals( "ON_BEHALF_OF_COMP_ID", tagData.toEnumNameString());
        assertEquals( "115", tagData.toEnumIDString());
        assertEquals( "OnBehalfOfCompID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag115StrOnBehalfOfCompID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag115StrOnBehalfOfCompID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag115StrOnBehalfOfCompID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag115StrOnBehalfOfCompID tagData;
        String oneElement;

        oneElement = Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );

        oneElement = Tag115StrOnBehalfOfCompID.TESTB_STR_ON_BEHALF_OF_COMP_ID;
        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );
    }

    private void VerifyVerboseString( final Tag115StrOnBehalfOfCompID tagData ) {
        assertEquals( "Tag115StrOnBehalfOfCompID\n" +
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