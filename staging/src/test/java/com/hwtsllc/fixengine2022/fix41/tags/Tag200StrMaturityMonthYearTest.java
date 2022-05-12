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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  200
 *  MaturityMonthYear
 *  month-year
 *  <p>
 *  Can be used with standardized derivatives vs. the MaturityDate (54) field.
 *  Month and Year of the maturity (used for standardized futures and options).
 *  <p>    Format:
 *  <p>    YYYYMM      (i.e. 99903)
 *  <p>    YYYYMMDD (20030323)
 *  <p>    YYYYMMwN (200303w) for week
 *  <p>
 *  A specific date or can be appended to the MaturityMonthYear.
 *  <p>
 *  For instance, if multiple standard products exist that mature in the same Year and Month,
 *  but actually mature at a different time, a value can be appended, such as "w" or "w2"
 *  to indicate week as opposed to week 2 expiration.
 *  <p>
 *  Likewise, the date (0-3) can be appended to indicate a specific expiration (maturity date).
 */
class Tag200StrMaturityMonthYearTest {
    @Test
    void FIX0200Test() {
        FIX41 fixData = FIX41.FIX200_STR_MATURITY_MONTH_YEAR;
        assertEquals( "200", fixData.getID());
        assertEquals( "MATURITY_MONTH_YEAR", fixData.getName());
        assertEquals( "MaturityMonthYear", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0200Test() {
        Log200StrMaturityMonthYear tagData;

        tagData = new Log200StrMaturityMonthYear(
                new MyStringType(Log200StrMaturityMonthYear.TESTA_STR_MATURITY_MONTH_YEAR));
        assertEquals( Log200StrMaturityMonthYear.TESTA_STR_MATURITY_MONTH_YEAR, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log200StrMaturityMonthYear(
                new MyStringType(Log200StrMaturityMonthYear.TESTB_STR_MATURITY_MONTH_YEAR));
        assertEquals( Log200StrMaturityMonthYear.TESTB_STR_MATURITY_MONTH_YEAR, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}