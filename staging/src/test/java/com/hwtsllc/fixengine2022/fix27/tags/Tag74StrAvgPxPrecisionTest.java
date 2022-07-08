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
    void FIXTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag74StrAvgPxPrecision tagData ) {
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
    void TagGetDataValueTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag74StrAvgPxPrecision tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag74StrAvgPxPrecision tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag74StrAvgPxPrecision tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag74StrAvgPxPrecision tagData;
        String oneElement;

        oneElement = Tag74StrAvgPxPrecision.TESTA_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag74StrAvgPxPrecision.TESTB_STR_AVG_PX_PRECISION;
        tagData = new Tag74StrAvgPxPrecision(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag74StrAvgPxPrecision tagData, final String oneElement ) {
        assertEquals( "Tag74StrAvgPxPrecision\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}