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
class Tag313MmyUnderlyingMaturityMonthYearTest {
    @Test
    void PrintTest() {
        Tag313MmyUnderlyingMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag313MmyUnderlyingMaturityMonthYear.TESTA_MMY_UNDERLYING_MATURITY_MONTH_YEAR;
        tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag313MmyUnderlyingMaturityMonthYear.TESTB_MMY_UNDERLYING_MATURITY_MONTH_YEAR;
        tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void FIXTagTest() {
        Tag313MmyUnderlyingMaturityMonthYear tagData;
        String oneElement;

        oneElement = Tag313MmyUnderlyingMaturityMonthYear.TESTA_MMY_UNDERLYING_MATURITY_MONTH_YEAR;
        tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag313MmyUnderlyingMaturityMonthYear.TESTB_MMY_UNDERLYING_MATURITY_MONTH_YEAR;
        tagData = new Tag313MmyUnderlyingMaturityMonthYear( new MyMonthYearType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag313MmyUnderlyingMaturityMonthYear tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag313MmyUnderlyingMaturityMonthYear tagData ) {
        assertEquals( "FIX313_MMY_UNDERLYING_MATURITY_MONTH_YEAR", tagData.toEnumLabelString());
        assertEquals( "313", tagData.toEnumIDString());
        assertEquals( "UNDERLYING_MATURITY_MONTH_YEAR", tagData.toEnumNameString());
        assertEquals( "UnderlyingMaturityMonthYear", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag313MmyUnderlyingMaturityMonthYear tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag313MmyUnderlyingMaturityMonthYear tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag313MmyUnderlyingMaturityMonthYear tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag313MmyUnderlyingMaturityMonthYear tagData ) {
        assertEquals( "Tag313MmyUnderlyingMaturityMonthYear\n" +
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