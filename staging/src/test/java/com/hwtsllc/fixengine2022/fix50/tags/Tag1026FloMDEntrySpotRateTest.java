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
 *  1026
 *  MDEntrySpotRate
 *  float
 *  <p>
 *  The spot rate for an FX entry
 */
class Tag1026FloMDEntrySpotRateTest {
    @Test
    void FIX1026Test() {
        FIX50 fixData = FIX50.FIX1026_FLO_MD_ENTRY_SPOT_RATE;
        assertEquals( "1026", fixData.toEnumIDString());
        assertEquals( "MD_ENTRY_SPOT_RATE", fixData.toEnumNameString());
        assertEquals( "MDEntrySpotRate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1026Test() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTA_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1026FloMDEntrySpotRate.TESTB_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTA_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1026FloMDEntrySpotRate.TESTB_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTB_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTB_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTB_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1026FloMDEntrySpotRate tagData;
        float oneElement;

        oneElement = Tag1026FloMDEntrySpotRate.TESTA_FLO_MD_ENTRY_SPOT_RATE;
        tagData = new Tag1026FloMDEntrySpotRate( new MyFloatType( oneElement ) );
        assertEquals( "Tag1026FloMDEntrySpotRate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}