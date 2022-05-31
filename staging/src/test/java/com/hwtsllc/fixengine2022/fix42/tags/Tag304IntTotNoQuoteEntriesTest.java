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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  304
 *  TotNoQuoteEntries
 *  int
 *  <p>
 *  Total number of quotes for the quote set across all messages.
 *  <p>
 *  Should be the sum of all NoQuoteEntries (295) in each message
 *  that has repeating quotes that are part of the same quote set.
 *  <p></p>
 *  (Prior to FIX 4.4 this field was named TotQuoteEntries)
 */
class Tag304IntTotNoQuoteEntriesTest {
    @Test
    void FIX0304Test() {
        FIX42 fixData = FIX42.FIX304_INT_TOT_QUOTE_ENTRIES;
        assertEquals( "304", fixData.toFIXIDString());
        assertEquals( "TOT_QUOTE_ENTRIES", fixData.toFIXNameString());
        assertEquals( "TotQuoteEntries", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0304Test() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTA_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTB_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag304IntTotNoQuoteEntries tagData;
        int oneElement;

        oneElement = Tag304IntTotNoQuoteEntries.TESTA_INT_TOT_QUOTE_ENTRIES;
        tagData = new Tag304IntTotNoQuoteEntries( new MyIntType( oneElement ) );
        assertEquals( "Tag304IntTotNoQuoteEntries\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}