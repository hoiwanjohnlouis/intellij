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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  105
 *  WaveNo
 *  String
 *  <p>
 *  Deprecated in FIX.4.2
 */
// @Deprecated
class Tag105StrWaveNoTest {

    @Test
    void FIXTest() {
        FIX30 fixData = FIX30.FIX105_STR_WAVE_NO;
        assertEquals( "WAVE_NO", fixData.toEnumNameString());
        assertEquals( "105", fixData.toEnumIDString());
        assertEquals( "WaveNo", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0105Test() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = "interested in Mahlers 4th Symphony";
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ) );
        assertEquals(oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "WAVE_NO", tagData.toEnumNameString());
        assertEquals( "105", tagData.toEnumIDString());
        assertEquals( "WaveNo", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag105StrWaveNo.TESTA_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ) );
        assertEquals(oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag105StrWaveNo.TESTB_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ) );
        assertEquals(oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = Tag105StrWaveNo.TESTA_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag105StrWaveNo.TESTB_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = Tag105StrWaveNo.TESTB_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = Tag105StrWaveNo.TESTB_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = Tag105StrWaveNo.TESTB_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag105StrWaveNo tagData;
        String oneElement;

        oneElement = Tag105StrWaveNo.TESTA_STR_WAVE_NO;
        tagData = new Tag105StrWaveNo(new MyStringType( oneElement ));
        assertEquals( "Tag105StrWaveNo\n" +
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