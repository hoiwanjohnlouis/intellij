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

import com.hwtsllc.fixengine2022.datatypes.MyUTCDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  272
 *  MDEntryDate
 *  UTCDateOnly
 *  <p></p>
 *  Date of Market Data Entry.
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag272UtcdMDEntryDateTest {
    @Test
    void PrintTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag272UtcdMDEntryDate tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag272UtcdMDEntryDate tagData ) {
        assertEquals( "FIX272_UTCD_MD_ENTRY_DATE", tagData.toEnumLabelString());
        assertEquals( "272", tagData.toEnumIDString());
        assertEquals( "MD_ENTRY_DATE", tagData.toEnumNameString());
        assertEquals( "MDEntryDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag272UtcdMDEntryDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag272UtcdMDEntryDate tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag272UtcdMDEntryDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag272UtcdMDEntryDate tagData ) {
        assertEquals( "Tag272UtcdMDEntryDate\n" +
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