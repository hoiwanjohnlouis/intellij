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

package com.hwtsllc.fixengine.tags.fix41;

import com.hwtsllc.fixengine.datatypes.FIX41;
import com.hwtsllc.fixengine.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine.datatypes.MyPercentageType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  158
 *  AccruedInterestRate
 *  Percentage
 *  <p></p>
 *  The amount the buyer compensates the seller for the portion of the next coupon interest payment
 *  the seller has earned but will not receive from the issuer because the issuer will send the
 *  next coupon payment to the buyer.
 *  <p></p>
 *  Accrued Interest Rate is the annualized Accrued Interest
 *  amount divided by the purchase price of the bond.
 */
public class Tag158PctAccruedInterestRate extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_ACCRUED_INTEREST_RATE
            = 0.0158D;
    public final static double TESTB_PCT_ACCRUED_INTEREST_RATE
            = 0.0851D;

    public Tag158PctAccruedInterestRate(MyPercentageType dataValue) {
        setFixType(FIX41.FIX158_PCT_ACCRUED_INTEREST_RATE);
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
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(new MyPercentageType(TESTA_PCT_ACCRUED_INTEREST_RATE) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag158PctAccruedInterestRate(new MyPercentageType(TESTB_PCT_ACCRUED_INTEREST_RATE) );
        System.out.println( tagData.toVerboseString() );
    }
}
