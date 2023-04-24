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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  245
 *  UnderlyingRepurchaseRate
 *  Percentage
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Underlying security's RepurchaseRate.
 *  <p></p>
 *  See RepurchaseRate (227) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
// @Deprecated
public class Tag245PctUnderlyingRepurchaseRate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_UNDERLYING_REPURCHASE_RATE
            = 0.245D;
    public final static double TESTB_PCT_UNDERLYING_REPURCHASE_RATE
            = 0.0245D;

    public Tag245PctUnderlyingRepurchaseRate(MyPercentageType dataValue) {
        setFixType(FIX42.FIX245_PCT_UNDERLYING_REPURCHASE_RATE);
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
        Tag245PctUnderlyingRepurchaseRate tagData;

        tagData = new Tag245PctUnderlyingRepurchaseRate(new MyPercentageType(TESTA_PCT_UNDERLYING_REPURCHASE_RATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag245PctUnderlyingRepurchaseRate(new MyPercentageType(TESTB_PCT_UNDERLYING_REPURCHASE_RATE) );
        System.out.println(tagData.toVerboseString());
    }
}
