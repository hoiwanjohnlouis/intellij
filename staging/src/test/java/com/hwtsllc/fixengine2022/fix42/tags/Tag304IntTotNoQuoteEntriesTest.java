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

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  304
 *  TotNoQuoteEntries
 *  int
 *  <p></p>
 *  Total number of quotes for the quote set across all messages.
 *  <p></p>
 *  Should be the sum of all NoQuoteEntries (295) in each message
 *  that has repeating quotes that are part of the same quote set.
 *  <p></p>
 *  (Prior to FIX 4.4 this field was named TotQuoteEntries)
 */
class Tag304IntTotNoQuoteEntriesTest {
    @Test
    void PrintTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTA_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTA_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag304IntTotNoQuoteEntries tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag304IntTotNoQuoteEntries tagData ) {
        assertEquals( "FIX304_INT_TOT_QUOTE_ENTRIES", tagData.toEnumLabelString());
        assertEquals( "304", tagData.toEnumIDString());
        assertEquals( "TOT_QUOTE_ENTRIES", tagData.toEnumNameString());
        assertEquals( "TotQuoteEntries", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag304IntTotNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag304IntTotNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag304IntTotNoQuoteEntries tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag304IntTotNoQuoteEntries tagData ) {
        assertEquals( "Tag304IntTotNoQuoteEntries\n" +
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