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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyMonthYearType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag313MmyUnderlyingMaturityMonthYearTest {
    Tag313MmyUnderlyingMaturityMonthYear tagData;
    String [] TestArray = {
            Tag313MmyUnderlyingMaturityMonthYear.TESTA_MMY_UNDERLYING_MATURITY_MONTH_YEAR,
            Tag313MmyUnderlyingMaturityMonthYear.TESTB_MMY_UNDERLYING_MATURITY_MONTH_YEAR
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( "FIX313_MMY_UNDERLYING_MATURITY_MONTH_YEAR", tagData.toFIXLabelString());
            assertEquals( "313", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_MATURITY_MONTH_YEAR", tagData.toEnumNameString());
            assertEquals( "UnderlyingMaturityMonthYear", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  200 (same as 200, 313, 610, 667, 955, )
         *  MaturityMonthYear
         *  month-year
         *  313 (same as 200, 313, 610, 667, 955, )
         *  UnderlyingMaturityMonthYear
         *  month-year
         *  610 (same as 200, 313, 610, 667, 955, )
         *  LegMaturityMonthYear
         *  month-year
         *  667 (same as 200, 313, 610, 667, 955, )
         *  ContractSettlMonth
         *  month-year
         *  955 (same as 200, 313, 610, 667, 955, )
         *  LegContractSettlMonth
         *  month-year
         */


        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ));
            assertEquals( "Tag313MmyUnderlyingMaturityMonthYear\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}