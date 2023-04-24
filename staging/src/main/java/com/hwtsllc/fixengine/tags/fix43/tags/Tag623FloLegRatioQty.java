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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  623
 *  LegRatioQty
 *  float
 *  <p></p>
 *  The ratio of quantity for this individual leg relative to the entire multileg security.
 */
public class Tag623FloLegRatioQty extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_LEG_RATIO_QTY
            = 0.623F;
    public final static float TESTB_FLO_LEG_RATIO_QTY
            = 0.326F;

    public Tag623FloLegRatioQty(MyFloatType dataValue) {
        setFixType(FIX43.FIX623_FLO_LEG_RATIO_QTY);
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
        Tag623FloLegRatioQty tagData;

        tagData = new Tag623FloLegRatioQty(new MyFloatType(TESTA_FLO_LEG_RATIO_QTY) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag623FloLegRatioQty(new MyFloatType(TESTB_FLO_LEG_RATIO_QTY) );
        System.out.println(tagData.toVerboseString());
    }
}
