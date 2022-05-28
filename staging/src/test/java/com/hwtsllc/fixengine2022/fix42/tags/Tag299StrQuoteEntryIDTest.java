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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  299
 *  QuoteEntryID
 *  String
 *  <p>
 *  Uniquely identifies the quote as part of a QuoteSet.
 */
class Tag299StrQuoteEntryIDTest {
    @Test
    void FIX0299Test() {
        FIX42 fixData = FIX42.FIX299_STR_QUOTE_ENTRY_ID;
        assertEquals( "299", fixData.toFIXIDString());
        assertEquals( "QUOTE_ENTRY_ID", fixData.toFIXNameString());
        assertEquals( "QuoteEntryID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0299Test() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTA_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag299StrQuoteEntryID.TESTB_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTB_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTB_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTB_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTB_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag299StrQuoteEntryID tagData;
        String oneElement;

        oneElement = Tag299StrQuoteEntryID.TESTA_STR_QUOTE_ENTRY_ID;
        tagData = new Tag299StrQuoteEntryID( new MyStringType( oneElement ) );
        assertEquals( "Tag299StrQuoteEntryID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}