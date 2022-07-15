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
 *  147
 *  Subject
 *  String
 *  <p></p>
 *  The subject of an Email message
 */
class Tag147StrSubjectTest {
    @Test
    void PrintFIXTagTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag147StrSubject tagData ) {
        assertEquals( "FIX147_STR_SUBJECT", tagData.toEnumLabelString());
        assertEquals( "147", tagData.toEnumIDString());
        assertEquals( "SUBJECT", tagData.toEnumNameString());
        assertEquals( "Subject", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag147StrSubject tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag147StrSubject tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag147StrSubject tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag147StrSubject tagData;
        String oneElement;

        oneElement = Tag147StrSubject.TESTA_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag147StrSubject.TESTB_STR_SUBJECT;
        tagData = new Tag147StrSubject(new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag147StrSubject tagData ) {
        assertEquals( "Tag147StrSubject\n" +
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