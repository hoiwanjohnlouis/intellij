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
 *  267
 *  NoMDEntryTypes
 *  NumInGroup
 *  <p></p>
 *  Number of MDEntryType (269) fields requested.
 */
class Tag267NumNoMDEntryTypesTest {
    @Test
    void PrintTest() {
        Tag267NumNoMDEntryTypes tagData;
        int oneElement;

        oneElement = Tag267NumNoMDEntryTypes.TESTA_NUM_NO_MD_ENTRY_TYPES;
        tagData = new Tag267NumNoMDEntryTypes( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag267NumNoMDEntryTypes.TESTB_NUM_NO_MD_ENTRY_TYPES;
        tagData = new Tag267NumNoMDEntryTypes( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag267NumNoMDEntryTypes tagData;
        int oneElement;

        oneElement = Tag267NumNoMDEntryTypes.TESTA_NUM_NO_MD_ENTRY_TYPES;
        tagData = new Tag267NumNoMDEntryTypes( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag267NumNoMDEntryTypes.TESTB_NUM_NO_MD_ENTRY_TYPES;
        tagData = new Tag267NumNoMDEntryTypes( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag267NumNoMDEntryTypes tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag267NumNoMDEntryTypes tagData ) {
        assertEquals( "FIX267_NUM_NO_MD_ENTRY_TYPES", tagData.toEnumLabelString());
        assertEquals( "267", tagData.toEnumIDString());
        assertEquals( "NO_MD_ENTRY_TYPES", tagData.toEnumNameString());
        assertEquals( "NoMDEntryTypes", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag267NumNoMDEntryTypes tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag267NumNoMDEntryTypes tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag267NumNoMDEntryTypes tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag267NumNoMDEntryTypes tagData ) {
        assertEquals( "Tag267NumNoMDEntryTypes\n" +
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