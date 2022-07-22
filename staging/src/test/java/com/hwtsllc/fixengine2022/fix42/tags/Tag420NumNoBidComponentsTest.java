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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  420
 *  NoBidComponents
 *  NumInGroup
 *  <p></p>
 *  Indicates the number of list entries.
 */
class Tag420NumNoBidComponentsTest {
    @Test
    void PrintTest() {
        Tag420NumNoBidComponents tagData;
        int oneElement;

        oneElement = Tag420NumNoBidComponents.TESTA_NUM_NO_BID_COMPONENTS;
        tagData = new Tag420NumNoBidComponents( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag420NumNoBidComponents.TESTB_NUM_NO_BID_COMPONENTS;
        tagData = new Tag420NumNoBidComponents( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag420NumNoBidComponents tagData;
        int oneElement;

        oneElement = Tag420NumNoBidComponents.TESTA_NUM_NO_BID_COMPONENTS;
        tagData = new Tag420NumNoBidComponents( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag420NumNoBidComponents.TESTB_NUM_NO_BID_COMPONENTS;
        tagData = new Tag420NumNoBidComponents( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag420NumNoBidComponents tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag420NumNoBidComponents tagData ) {
        assertEquals( "FIX420_NUM_NO_BID_COMPONENTS", tagData.toEnumLabelString());
        assertEquals( "420", tagData.toEnumIDString());
        assertEquals( "NO_BID_COMPONENTS", tagData.toEnumNameString());
        assertEquals( "NoBidComponents", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag420NumNoBidComponents tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag420NumNoBidComponents tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag420NumNoBidComponents tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag420NumNoBidComponents tagData ) {
        assertEquals( "Tag420NumNoBidComponents\n" +
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