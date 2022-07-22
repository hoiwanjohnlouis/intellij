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
 *  295
 *  NoQuoteEntries
 *  NumInGroup
 *  <p></p>
 *  The number of quote entries for a QuoteSet.
 */
class Tag295NumNoQuoteEntriesTest {
    @Test
    void PrintTest() {
        Tag295NumNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag295NumNoQuoteEntries.TESTA_NUM_NO_QUOTE_ENTRIES;
        tagData = new Tag295NumNoQuoteEntries( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag295NumNoQuoteEntries.TESTB_NUM_NO_QUOTE_ENTRIES;
        tagData = new Tag295NumNoQuoteEntries( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag295NumNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag295NumNoQuoteEntries.TESTA_NUM_NO_QUOTE_ENTRIES;
        tagData = new Tag295NumNoQuoteEntries( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag295NumNoQuoteEntries.TESTB_NUM_NO_QUOTE_ENTRIES;
        tagData = new Tag295NumNoQuoteEntries( new MyNumInGroupType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag295NumNoQuoteEntries tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag295NumNoQuoteEntries tagData ) {
        assertEquals( "FIX295_NUM_NO_QUOTE_ENTRIES", tagData.toEnumLabelString());
        assertEquals( "295", tagData.toEnumIDString());
        assertEquals( "NO_QUOTE_ENTRIES", tagData.toEnumNameString());
        assertEquals( "NoQuoteEntries", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag295NumNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag295NumNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag295NumNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag295NumNoQuoteEntries tagData ) {
        assertEquals( "Tag295NumNoQuoteEntries\n" +
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