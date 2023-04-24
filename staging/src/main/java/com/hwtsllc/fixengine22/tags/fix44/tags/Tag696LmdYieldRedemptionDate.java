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
 *  696
 *  YieldRedemptionDate
 *  LocalMktDate
 *  <p></p>
 *  Date to which the yield has been calculated
 *  <p>
 *  (i.e. maturity, par call or current call, pre-refunded date).
 */
public class Tag696LmdYieldRedemptionDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_YIELD_REDEMPTION_DATE
            = "196608_susan_denberg-Tag696LmdYieldRedemptionDate";
    public final static String TESTB_LMD_YIELD_REDEMPTION_DATE
            = "196902_lorrie_menconi-Tag696LmdYieldRedemptionDate";

    public Tag696LmdYieldRedemptionDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX696_LMD_YIELD_REDEMPTION_DATE );
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
        Tag696LmdYieldRedemptionDate tagData;

        tagData = new Tag696LmdYieldRedemptionDate(new MyLocalMktDateType( TESTA_LMD_YIELD_REDEMPTION_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag696LmdYieldRedemptionDate(new MyLocalMktDateType( TESTB_LMD_YIELD_REDEMPTION_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
