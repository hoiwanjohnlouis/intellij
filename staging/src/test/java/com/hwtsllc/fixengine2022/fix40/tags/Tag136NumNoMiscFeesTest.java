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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  136
 *  NoMiscFees
 *  NumInGroup
 *  <p></p>
 *  Number of repeating groups of miscellaneous fees
 */
class Tag136NumNoMiscFeesTest {
    @Test
    void PrintFIXTagTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag136NumNoMiscFees tagData ) {
        assertEquals( "FIX136_NUM_NO_MISC_FEES", tagData.toEnumLabelString());
        assertEquals( "NO_MISC_FEES", tagData.toEnumNameString());
        assertEquals( "136", tagData.toEnumIDString());
        assertEquals( "NoMiscFees", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag136NumNoMiscFees tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag136NumNoMiscFees tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag136NumNoMiscFees tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag136NumNoMiscFees tagData;
        int oneElement;

        oneElement = Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES;
        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag136NumNoMiscFees tagData ) {
        assertEquals( "Tag136NumNoMiscFees\n" +
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