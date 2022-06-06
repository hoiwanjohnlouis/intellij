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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  610
 *  LegMaturityMonthYear
 *  month-year
 *  <p>
 *  Multileg instrument's individual  security’s MaturityMonthYear.
 *  <p>
 *  See MaturityMonthYear (200) field for description
 */
class Tag610StrLegMaturityMonthYearTest {
    @Test
    void FIX0610Test() {
        FIX43 fixData = FIX43.FIX610_STR_LEG_MATURITY_MONTH_YEAR;
        assertEquals( "610", fixData.toFIXIDString());
        assertEquals( "LEG_MATURITY_MONTH_YEAR", fixData.toFIXNameString());
        assertEquals( "LegMaturityMonthYear", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0610Test() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTA_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );

        oneElement = Tag610StrLegMaturityMonthYear.TESTB_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTA_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag610StrLegMaturityMonthYear.TESTB_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTA_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag610StrLegMaturityMonthYear.TESTB_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTB_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTB_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag610StrLegMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag610StrLegMaturityMonthYear.TESTA_STR_LEG_MATURITY_MONTH_YEAR;
        tagData = new Tag610StrLegMaturityMonthYear( new MyStringType( oneElement ) );
        assertEquals( "Tag610StrLegMaturityMonthYear\n" +
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