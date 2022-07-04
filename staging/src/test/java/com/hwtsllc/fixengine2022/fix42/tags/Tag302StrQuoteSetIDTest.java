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
 *  302
 *  QuoteSetID
 *  String
 *  <p>
 *  Unique id for the Quote Set.
 */
class Tag302StrQuoteSetIDTest {
    @Test
    void FIX0302Test() {
        FIX42 fixData = FIX42.FIX302_STR_QUOTE_SET_ID;
        assertEquals( "302", fixData.toEnumIDString());
        assertEquals( "QUOTE_SET_ID", fixData.toEnumNameString());
        assertEquals( "QuoteSetID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0302Test() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTA_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag302StrQuoteSetID.TESTB_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTB_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTB_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTB_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTB_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag302StrQuoteSetID tagData;
        String oneElement;

        oneElement = Tag302StrQuoteSetID.TESTA_STR_QUOTE_SET_ID;
        tagData = new Tag302StrQuoteSetID( new MyStringType( oneElement ) );
        assertEquals( "Tag302StrQuoteSetID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}