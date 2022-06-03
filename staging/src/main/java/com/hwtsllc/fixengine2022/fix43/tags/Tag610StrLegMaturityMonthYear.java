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
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  610
 *  LegMaturityMonthYear
 *  month-year
 *  <p>
 *  Multileg instrument's individual  security’s MaturityMonthYear.
 *  <p>
 *  See MaturityMonthYear (200) field for description
 */
public class Tag610StrLegMaturityMonthYear extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_LEG_MATURITY_MONTH_YEAR
            = "RosaPonselle-Tag610StrLegMaturityMonthYear";
    public final static String TESTB_STR_LEG_MATURITY_MONTH_YEAR
            = "GeraldineFarrar-Tag610StrLegMaturityMonthYear";

    public Tag610StrLegMaturityMonthYear(MyStringType dataValue) {
        setFixType( FIX43.FIX610_STR_LEG_MATURITY_MONTH_YEAR );
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
        Tag610StrLegMaturityMonthYear tagData;

        tagData = new Tag610StrLegMaturityMonthYear(new MyStringType( TESTA_STR_LEG_MATURITY_MONTH_YEAR ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag610StrLegMaturityMonthYear(new MyStringType( TESTB_STR_LEG_MATURITY_MONTH_YEAR ) );
        System.out.println(tagData.toVerboseString());
    }
}
