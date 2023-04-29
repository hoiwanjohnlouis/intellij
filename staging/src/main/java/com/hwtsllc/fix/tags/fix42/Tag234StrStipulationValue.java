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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  234
 *  StipulationValue
 *  String
 *  <p></p>
 *  For Fixed Income.  Value of stipulation.
 *  <p></p>
 *  The expression can be an absolute single value or a combination of values and logical operators:
 *  <p></p>
 *  <p>     < value
 *  <p>     > value
 *  <p>     <= value
 *  <p>     >= value
 *  <p>     value
 *  <p></p>
 *  <p>     value – value2
 *  <p>     value OR value2
 *  <p>     value AND value2
 *  <p>     YES
 *  <p>     NO
 *  <p></p>
 *  <p>     Bargain conditions recognized by the London Stock Exchange –
 *          to be used when StipulationType is "BGNCON".
 *  <p>     CD = Special cum Dividend
 *  <p>     XD = Special ex Dividend
 *  <p>     CC = Special cum Coupon
 *  <p>     XC = Special ex Coupon
 *  <p>     CB = Special cum Bonus
 *  <p></p>
 *  <p>     XB = Special ex Bonus
 *  <p>     CR = Special cum Rights
 *  <p>     XR = Special ex Rights
 *  <p>     CP = Special cum Capital Repayments
 *  <p>     XP = Special ex Capital Repayments
 *  <p></p>
 *  <p>     CS = Cash Settlement
 *  <p>     SP = Special Price
 *  <p>     TR = Report for European Equity Market Securities in accordance with Chapter 8 of the Rules.
 *  <p>     GD = Guaranteed Delivery
 *  <p></p>
 *  <p>     Values for StipulationType = "PXSOURCE":
 *  <p>     BB GENERIC
 *  <p>     BB FAIRVALUE
 *  <p>     BROKERTEC
 *  <p>     ESPEED
 *  <p>     GOVPX
 *  <p></p>
 *  <p>     HILLIARD FARBER
 *  <p>     ICAP
 *  <p>     TRADEWEB
 *  <p>     TULLETT LIBERTY
 *          If a particular side of the market is wanted append /BID /OFFER or /MID.
 *  <p>     plus appropriate combinations of the above and other expressions
 *          by mutual agreement of the counterparties.
 *  <p></p>
 *  <p>     Examples: ">=60", ".25", "ORANGE OR CONTRACOSTA", etc.
 *  <p></p>
 *  <p>     (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
public class Tag234StrStipulationValue extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_STIPULATION_VALUE
            = "JudyGarland-Tag234StrStipulationValue";
    public final static String TESTB_STR_STIPULATION_VALUE
            = "FrancesEthelGumm-Tag234StrStipulationValue";

    public Tag234StrStipulationValue(MyStringType dataValue) {
        setFixType(FIX42.FIX234_STR_STIPULATION_VALUE);
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
        Tag234StrStipulationValue tagData;

        tagData = new Tag234StrStipulationValue(new MyStringType(TESTA_STR_STIPULATION_VALUE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag234StrStipulationValue(new MyStringType(TESTB_STR_STIPULATION_VALUE) );
        System.out.println(tagData.toVerboseString());
    }
}
