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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  735
 *  NoQuoteQualifiers
 *  NumInGroup
 *  <p></p>
 *  Number of repeating groups of QuoteQualifiers (695).
 */
class Tag735NumNoQuoteQualifiersTest {
    @Test
    void FIX0735Test() {
        FIX44 fixData = FIX44.FIX735_NUM_NO_QUOTE_QUALIFIERS;
        assertEquals( "735", fixData.toEnumIDString());
        assertEquals( "NO_QUOTE_QUALIFIERS", fixData.toEnumNameString());
        assertEquals( "NoQuoteQualifiers", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0735Test() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTA_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "735", tagData.toEnumIDString());
        assertEquals( "NO_QUOTE_QUALIFIERS", tagData.toEnumNameString());
        assertEquals( "NoQuoteQualifiers", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag735NumNoQuoteQualifiers.TESTB_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTA_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag735NumNoQuoteQualifiers.TESTB_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTB_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTB_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTB_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag735NumNoQuoteQualifiers tagData;
        int oneElement;

        oneElement = Tag735NumNoQuoteQualifiers.TESTA_NUM_NO_QUOTE_QUALIFIERS;
        tagData = new Tag735NumNoQuoteQualifiers( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag735NumNoQuoteQualifiers\n" +
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