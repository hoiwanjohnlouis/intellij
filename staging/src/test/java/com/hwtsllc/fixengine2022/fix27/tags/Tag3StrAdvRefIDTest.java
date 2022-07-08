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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  3
 *  AdvRefID
 *  String
 *  <p></p>
 *  Reference identifier used with CANCEL and REPLACE transaction types.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag3StrAdvRefIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag3StrAdvRefID tagData ) {
        assertEquals( "FIX3_STR_ADV_REF_ID", tagData.toEnumLabelString());
        assertEquals( "ADV_REF_ID", tagData.toEnumNameString());
        assertEquals( "3", tagData.toEnumIDString());
        assertEquals( "AdvRefID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag3StrAdvRefID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag3StrAdvRefID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag3StrAdvRefID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag3StrAdvRefID tagData;
        String oneElement;

        oneElement = Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID;
        tagData = new Tag3StrAdvRefID(new MyStringType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag3StrAdvRefID tagData, final String oneElement ) {
        assertEquals( "Tag3StrAdvRefID\n" +
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