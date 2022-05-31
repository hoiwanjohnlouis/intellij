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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  967
 *  StrikeMultiplier
 *  float
 *  <p>
 *  Used for derivatives.
 *  <p>
 *  Multiplier applied to the strike price for the purpose of calculating the settlement value.
 */
class Tag967FloStrikeMultiplierTest {
    @Test
    void FIX0967Test() {
        FIX50 fixData = FIX50.FIX967_FLO_STRIKE_MULTIPLIER;
        assertEquals( "967", fixData.toFIXIDString());
        assertEquals( "STRIKE_MULTIPLIER", fixData.toFIXNameString());
        assertEquals( "StrikeMultiplier", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0967Test() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTA_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag967FloStrikeMultiplier.TESTB_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTA_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag967FloStrikeMultiplier.TESTB_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTB_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTB_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTB_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag967FloStrikeMultiplier tagData;
        float oneElement;

        oneElement = Tag967FloStrikeMultiplier.TESTA_FLO_STRIKE_MULTIPLIER;
        tagData = new Tag967FloStrikeMultiplier( new MyFloatType( oneElement ) );
        assertEquals( "Tag967FloStrikeMultiplier\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}