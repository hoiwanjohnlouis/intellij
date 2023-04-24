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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyFloatType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  228
 *  Factor
 *  float
 *  <p></p>
 *  For Fixed Income: Amortization Factor for deriving Current face from Original face for
 *  ABS or MBS securities, note the fraction may be greater than, equal to or less than .
 *  <p></p>
 *  In TIPS securities this is the Inflation index.
 *  <p></p>
 *  Qty * Factor * Price = Gross Trade Amount
 *  <p></p>
 *  For Derivatives: Contract Value Factor by which price must be adjusted
 *  to determine the true nominal value of one futures/options contract.
 *  <p></p>
 *  (Qty * Price) * Factor = Nominal Value
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
public class Tag228FloFactor extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_FACTOR
            = 0.228F;
    public final static float TESTB_FLO_FACTOR
            = 0.0228F;

    public Tag228FloFactor(MyFloatType dataValue) {
        setFixType(FIX42.FIX228_FLO_FACTOR);
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
        Tag228FloFactor tagData;

        tagData = new Tag228FloFactor(new MyFloatType(TESTA_FLO_FACTOR) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag228FloFactor(new MyFloatType(TESTB_FLO_FACTOR) );
        System.out.println(tagData.toVerboseString());
    }
}
