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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.MyMonthYearType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag610MmyLegMaturityMonthYearTest {
    Tag610MmyLegMaturityMonthYear tagData;
    String [] TestArray = {
            Tag610MmyLegMaturityMonthYear.TESTA_MMY_LEG_MATURITY_MONTH_YEAR,
            Tag610MmyLegMaturityMonthYear.TESTB_MMY_LEG_MATURITY_MONTH_YEAR
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag610MmyLegMaturityMonthYear( new MyMonthYearType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag610MmyLegMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( "FIX610_MMY_LEG_MATURITY_MONTH_YEAR", tagData.toFIXLabelString());
            assertEquals( "610", tagData.toFIXIDString());
            assertEquals( "LEG_MATURITY_MONTH_YEAR", tagData.toFIXNameString());
            assertEquals( "LegMaturityMonthYear", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag610MmyLegMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  610 (same as 200, 313, 610, 667, 955, )
         *  LegMaturityMonthYear
         *  month-year
         */


        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag610MmyLegMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag610MmyLegMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( "Tag610MmyLegMaturityMonthYear\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}