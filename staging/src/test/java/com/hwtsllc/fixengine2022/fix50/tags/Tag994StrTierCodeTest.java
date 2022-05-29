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
        assertEquals( "994", fixData.toFIXIDString());
        assertEquals( "TIER_CODE", fixData.toFIXNameString());
        assertEquals( "TierCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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