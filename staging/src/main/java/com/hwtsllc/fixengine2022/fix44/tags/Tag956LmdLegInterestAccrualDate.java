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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  956
 *  LegInterestAccrualDate
 *  LocalMktDate
 *  <p></p>
 *  The start date used for calculating accrued interest on debt instruments
 *  which are being sold between interest payment dates.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Dated-Date
 */
public class Tag956LmdLegInterestAccrualDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_LEG_INTEREST_ACCRUAL_DATE
            = "196611_lisa_baker-Tag956LmdLegInterestAccrualDate";
    public final static String TESTB_LMD_LEG_INTEREST_ACCRUAL_DATE
            = "196612_susan_bernard-Tag956LmdLegInterestAccrualDate";

    public Tag956LmdLegInterestAccrualDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX956_LMD_LEG_INTEREST_ACCRUAL_DATE );
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
        Tag956LmdLegInterestAccrualDate tagData;

        tagData = new Tag956LmdLegInterestAccrualDate(new MyLocalMktDateType( TESTA_LMD_LEG_INTEREST_ACCRUAL_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag956LmdLegInterestAccrualDate(new MyLocalMktDateType( TESTB_LMD_LEG_INTEREST_ACCRUAL_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
