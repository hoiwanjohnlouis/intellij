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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  994
 *  TierCode
 *  String
 *  <p>
 *  The Tier the trade was matched by the clearing system.
 */
class Tag994StrTierCodeTest {
    @Test
    void FIX0994Test() {
        FIX50 fixData = FIX50.FIX994_STR_TIER_CODE;
        assertEquals( "994", fixData.toEnumIDString());
        assertEquals( "TIER_CODE", fixData.toEnumNameString());
        assertEquals( "TierCode", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0994Test() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag994StrTierCode( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag994StrTierCode.TESTA_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag994StrTierCode.TESTB_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = Tag994StrTierCode.TESTA_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag994StrTierCode.TESTB_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = Tag994StrTierCode.TESTB_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = Tag994StrTierCode.TESTB_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = Tag994StrTierCode.TESTB_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag994StrTierCode tagData;
        String oneElement;

        oneElement = Tag994StrTierCode.TESTA_STR_TIER_CODE;
        tagData = new Tag994StrTierCode( new MyStringType( oneElement ) );
        assertEquals( "Tag994StrTierCode\n" +
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