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

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  117
 *  QuoteID
 *  String
 *  Unique identifier for quote
 */
class Tag117StrQuoteIDTest {
    @Test
    void FIX0117Test() {
        FIX40 fixData = FIX40.FIX117_STR_QUOTE_ID;
        assertEquals( "QUOTE_ID", fixData.toFIXNameString());
        assertEquals( "117", fixData.toFIXIDString());
        assertEquals( "QuoteID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0117Test() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType("Galadriel-117QuoteID") );
        assertEquals( "Galadriel-117QuoteID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType(Tag117StrQuoteID.TESTB_STR_QUOTE_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType(Tag117StrQuoteID.TESTB_STR_QUOTE_ID));
        assertEquals( Tag117StrQuoteID.TESTB_STR_QUOTE_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType(Tag117StrQuoteID.TESTB_STR_QUOTE_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag117StrQuoteID.TESTB_STR_QUOTE_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType(Tag117StrQuoteID.TESTB_STR_QUOTE_ID));
        assertEquals( Tag117StrQuoteID.TESTB_STR_QUOTE_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag117StrQuoteID tagData;

        tagData = new Tag117StrQuoteID(new MyStringType(Tag117StrQuoteID.TESTA_STR_QUOTE_ID));
        assertEquals( "Tag117StrQuoteID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag117StrQuoteID.TESTA_STR_QUOTE_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag117StrQuoteID.TESTA_STR_QUOTE_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}