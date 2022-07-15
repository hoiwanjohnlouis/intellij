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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  199
 *  NoIOIQualifiers
 *  NumInGroup
 *  <p></p>
 *  Number of repeating groups of IOIQualifiers (04).
 */
class Tag199NumNoIOIQualifiersTest {
    @Test
    void PrintTest() {
        Tag199NumNoIOIQualifiers tagData;
        int oneElement;

        oneElement = Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS;
        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS;
        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag199NumNoIOIQualifiers tagData;
        int oneElement;

        oneElement = Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS;
        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS;
        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag199NumNoIOIQualifiers tagData ) {
        assertEquals( "FIX199_NUM_NO_IOI_QUALIFIERS", tagData.toEnumLabelString());
        assertEquals( "199", tagData.toEnumIDString());
        assertEquals( "NO_IOI_QUALIFIERS", tagData.toEnumNameString());
        assertEquals( "NoIOIQualifiers", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag199NumNoIOIQualifiers tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag199NumNoIOIQualifiers tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag199NumNoIOIQualifiers tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag199NumNoIOIQualifiers tagData ) {
        assertEquals( "Tag199NumNoIOIQualifiers\n" +
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