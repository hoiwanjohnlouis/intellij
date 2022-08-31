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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  436
 *  UnderlyingContractMultiplier
 *  float
 *  <p></p>
 *  Underlying security’s ContractMultiplier.
 *  <p></p>
 *  See ContractMultiplier (231) field for description
 */
public class Tag436FloUnderlyingContractMultiplier extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER
            = 0.436F;
    public final static float TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER
            = 0.0436F;

    public Tag436FloUnderlyingContractMultiplier(MyFloatType dataValue) {
        setFixType(FIX42.FIX436_FLO_UNDERLYING_CONTRACT_MULTIPLIER);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        Tag436FloUnderlyingContractMultiplier tagData;

        tagData = new Tag436FloUnderlyingContractMultiplier(new MyFloatType(TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag436FloUnderlyingContractMultiplier(new MyFloatType(TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER) );
        System.out.println(tagData.toVerboseString());
    }
}
