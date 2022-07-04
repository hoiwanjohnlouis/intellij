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
 *  131
 *  QuoteReqID
 *  String
 *  Unique identifier for quote request
 */
class Tag131StrQuoteReqIDTest {
    @Test
    void FIX0131Test() {
        FIX40 fixData = FIX40.FIX131_STR_QUOTE_REQ_ID;
        assertEquals( "QUOTE_REQ_ID", fixData.toEnumNameString());
        assertEquals( "131", fixData.toEnumIDString());
        assertEquals( "QuoteReqID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0131Test() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType("MoonJiIn-131QuoteReqID") );
        assertEquals( "MoonJiIn-131QuoteReqID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType(Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType(Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType(Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType(Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag131StrQuoteReqID.TESTB_STR_QUOTE_REQ_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag131StrQuoteReqID tagData;

        tagData = new Tag131StrQuoteReqID(new MyStringType(Tag131StrQuoteReqID.TESTA_STR_QUOTE_REQ_ID));
        assertEquals( "Tag131StrQuoteReqID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag131StrQuoteReqID.TESTA_STR_QUOTE_REQ_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag131StrQuoteReqID.TESTA_STR_QUOTE_REQ_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}