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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  383
 *  MaxMessageSize
 *  Length
 *  <p></p>
 *  Maximum number of bytes supported for a single message.
 */
class Tag383LenMaxMessageSizeTest {
    @Test
    void PrintTest() {
        Tag383LenMaxMessageSize tagData;
        int oneElement;

        oneElement = Tag383LenMaxMessageSize.TESTA_LEN_MAX_MESSAGE_SIZE;
        tagData = new Tag383LenMaxMessageSize( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag383LenMaxMessageSize.TESTB_LEN_MAX_MESSAGE_SIZE;
        tagData = new Tag383LenMaxMessageSize( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag383LenMaxMessageSize tagData;
        int oneElement;

        oneElement = Tag383LenMaxMessageSize.TESTA_LEN_MAX_MESSAGE_SIZE;
        tagData = new Tag383LenMaxMessageSize( new MyLengthType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag383LenMaxMessageSize.TESTB_LEN_MAX_MESSAGE_SIZE;
        tagData = new Tag383LenMaxMessageSize( new MyLengthType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag383LenMaxMessageSize tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag383LenMaxMessageSize tagData ) {
        assertEquals( "FIX383_LEN_MAX_MESSAGE_SIZE", tagData.toEnumLabelString());
        assertEquals( "383", tagData.toEnumIDString());
        assertEquals( "MAX_MESSAGE_SIZE", tagData.toEnumNameString());
        assertEquals( "MaxMessageSize", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag383LenMaxMessageSize tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag383LenMaxMessageSize tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag383LenMaxMessageSize tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag383LenMaxMessageSize tagData ) {
        assertEquals( "Tag383LenMaxMessageSize\n" +
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