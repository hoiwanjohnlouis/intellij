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
import com.hwtsllc.fix.datatypes.MyFloatType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  850
 *  TargetStrategyPerformance
 *  float
 *  <p></p>
 *  For communication of the performance of the order versus the target strategy
 */
public class Tag850FloTargetStrategyPerformance extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_TARGET_STRATEGY_PERFORMANCE
            = 0.850F;
    public final static float TESTB_FLO_TARGET_STRATEGY_PERFORMANCE
            = 0.50F;

    public Tag850FloTargetStrategyPerformance(MyFloatType dataValue) {
        setFixType( FIX44.FIX850_FLO_TARGET_STRATEGY_PERFORMANCE );
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
        Tag850FloTargetStrategyPerformance tagData;

        tagData = new Tag850FloTargetStrategyPerformance(new MyFloatType( TESTA_FLO_TARGET_STRATEGY_PERFORMANCE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag850FloTargetStrategyPerformance(new MyFloatType( TESTB_FLO_TARGET_STRATEGY_PERFORMANCE ) );
        System.out.println(tagData.toVerboseString());
    }
}
