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
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Tag200StrMaturityMonthYear extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_MATURITY_MONTH_YEAR = "Frodo-Tag200StrMaturityMonthYear";
    public final static String TESTB_STR_MATURITY_MONTH_YEAR = "Gandalf-Tag200StrMaturityMonthYear";

    public Tag200StrMaturityMonthYear(MyStringType dataValue) {
        setFixType(FIX41.FIX200_STR_MATURITY_MONTH_YEAR);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag200StrMaturityMonthYear tagData;

        tagData = new Tag200StrMaturityMonthYear(new MyStringType(TESTA_STR_MATURITY_MONTH_YEAR) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag200StrMaturityMonthYear(new MyStringType(TESTB_STR_MATURITY_MONTH_YEAR) );
        System.out.println( tagData.toVerboseString() );
    }
}
