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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  74
 *  AvgPxPrecision
 *  int
 *  <p></p>
 *  Indicates number of decimal places to be used for average pricing.
 *  <p></p>
 *  Absence of this field indicates that default precision arranged
 *  by the broker or institution is to be used.
 */
class Tag74StrAvgPxPrecisionTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX74_STR_AVG_PX_PRECISION;
        assertEquals( "AVG_PX_PRECISION", fixData.toEnumNameString());
        assertEquals( "74", fixData.toEnumIDString());
        assertEquals( "AvgPxPrecision", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0074Test() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = "Saruman-74AvgPxPrecision";
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag74StrAvgPxPrecision tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX74_STR_AVG_PX_PRECISION", tagData.toEnumLabelString());
        assertEquals( "AVG_PX_PRECISION", tagData.toEnumNameString());
        assertEquals( "74", tagData.toEnumIDString());
        assertEquals( "AvgPxPrecision", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        assertEquals( "Tag74StrAvgPxPrecision\n" +
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