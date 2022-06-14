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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  693
 *  QuoteRespID
 *  String
 *  <p></p>
 *  Message reference for Quote Response
 */
class Tag693StrQuoteRespIDTest {
    @Test
    void FIX0693Test() {
        FIX44 fixData = FIX44.FIX693_STR_QUOTE_RESP_ID;
        assertEquals( "693", fixData.toFIXIDString());
        assertEquals( "QUOTE_RESP_ID", fixData.toFIXNameString());
        assertEquals( "QuoteRespID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0693Test() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTA_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag693StrQuoteRespID.TESTB_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTA_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag693StrQuoteRespID.TESTB_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTB_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTB_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTB_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag693StrQuoteRespID tagData;
        String oneElement;

        oneElement = Tag693StrQuoteRespID.TESTA_STR_QUOTE_RESP_ID;
        tagData = new Tag693StrQuoteRespID( new MyStringType( oneElement ) );
        assertEquals( "Tag693StrQuoteRespID\n" +
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