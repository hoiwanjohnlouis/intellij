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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyMonthYearType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  200
 *  MaturityMonthYear
 *  month-year
 *  <p>     Can be used with standardized derivatives vs. the MaturityDate (54) field.
 *  <p></p>
 *  313
 *  UnderlyingMaturityMonthYear
 *  month-year
 *  <p>     Underlying security’s MaturityMonthYear.
 *  <p>     Can be used with standardized derivatives vs. the UnderlyingMaturityDate (542) field.
 *  <p>     See MaturityMonthYear (200) field for description
 *  <p></p>
 *  610
 *  LegMaturityMonthYear
 *  month-year
 *  <p>     Multileg instrument's individual  security’s MaturityMonthYear.
 *  <p>     See MaturityMonthYear (200) field for description
 *  <p></p>
 *  667
 *  ContractSettlMonth
 *  month-year
 *  <p>     Specifies when the contract (i.e. MBS/TBA) will settle.
 *  <p></p>
 *  955
 *  LegContractSettlMonth
 *  month-year
 *  <p>     Specifies when the contract (i.e. MBS/TBA) will settle.
 *  <p></p>
 *  Month and Year of the maturity (used for standardized futures and options).
 *  <p>    Format:
 *  <p>    YYYYMM      (i.e. 99903)
 *  <p>    YYYYMMDD (20030323)
 *  <p>    YYYYMMwN (200303w) for week
 *  <p></p>
 *  A specific date or can be appended to the MaturityMonthYear.
 *  <p></p>
 *  For instance, if multiple standard products exist that mature in the same Year and Month,
 *  but actually mature at a different time, a value can be appended, such as "w" or "w2"
 *  to indicate week as opposed to week 2 expiration.
 *  <p></p>
 *  Likewise, the date (0-3) can be appended to indicate a specific expiration (maturity date).
 */
class Tag200MmyMaturityMonthYearTest {
    @Test
    void FIX0200Test() {
        FIX41 fixData = FIX41.FIX200_MMY_MATURITY_MONTH_YEAR;
        assertEquals( "200", fixData.toFIXIDString());
        assertEquals( "MATURITY_MONTH_YEAR", fixData.toFIXNameString());
        assertEquals( "MaturityMonthYear", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0200Test() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTA_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( Tag200MmyMaturityMonthYear.TESTA_MMY_MATURITY_MONTH_YEAR, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "200", tagData.toFIXIDString());
        assertEquals( "MATURITY_MONTH_YEAR", tagData.toFIXNameString());
        assertEquals( "MaturityMonthYear", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTA_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTB_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag200MmyMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag200MmyMaturityMonthYear.TESTA_MMY_MATURITY_MONTH_YEAR;
        tagData = new Tag200MmyMaturityMonthYear( new MyMonthYearType( oneElement ) );
        assertEquals( "Tag200MmyMaturityMonthYear\n" +
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