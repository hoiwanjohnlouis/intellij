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

package com.hwtsllc.fix.datatypes;

import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  200 (same as 200, 313, 610, 667, 955, )
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
public class MyMonthYearType implements LogVerboseString {
    private final String dataValue;

    public final static String TESTA_MY_MONTH_YEAR_TYPE
            = "20030323";
    public final static String TESTB_MY_MONTH_YEAR_TYPE
            = "200303w2";

    public MyMonthYearType(final String dataValue) {
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return this.dataValue;
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        MyMonthYearType dataType;

        dataType = new MyMonthYearType( TESTA_MY_MONTH_YEAR_TYPE );
        System.out.println(dataType.toVerboseString());

        dataType = new MyMonthYearType( TESTB_MY_MONTH_YEAR_TYPE );
        System.out.println(dataType.toVerboseString());
    }
}
