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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyLocalMktDateType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  701
 *  YieldCalcDate
 *  LocalMktDate
 *  <p></p>
 *  Include as needed to clarify yield irregularities associated with date,
 *  <p>
 *  e.g. when it falls on a non-business day.
 */
public class Tag701LmdYieldCalcDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_YIELD_CALC_DATE
            = "197106_lieko_english-Tag701LmdYieldCalcDate";
    public final static String TESTB_LMD_YIELD_CALC_DATE
            = "197912_candace_collins-Tag701LmdYieldCalcDate";

    public Tag701LmdYieldCalcDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX701_LMD_YIELD_CALC_DATE );
        this.dataValue = dataValue;
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag701LmdYieldCalcDate tagData;

        tagData = new Tag701LmdYieldCalcDate(new MyLocalMktDateType( TESTA_LMD_YIELD_CALC_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag701LmdYieldCalcDate(new MyLocalMktDateType( TESTB_LMD_YIELD_CALC_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
