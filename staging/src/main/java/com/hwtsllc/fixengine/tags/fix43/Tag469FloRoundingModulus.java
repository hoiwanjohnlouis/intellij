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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyFloatType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  469
 *  RoundingModulus
 *  float
 *  <p></p>
 *  For CIV - a float value indicating the value to which rounding is required.
 *  <p></p>
 *  i.e. 0 means round to a multiple of 0 units/shares; 0.5 means round to a multiple of 0.5 units/shares.
 *  <p></p>
 *  The default, if RoundingDirection (468) is specified without RoundingModulus, is to round to a whole unit/share.
 */
public class Tag469FloRoundingModulus extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_ROUNDING_MODULUS
            = 0.469F;
    public final static float TESTB_FLO_ROUNDING_MODULUS
            = 0.964F;

    public Tag469FloRoundingModulus(MyFloatType dataValue) {
        setFixType(FIX43.FIX469_FLO_ROUNDING_MODULUS);
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
        Tag469FloRoundingModulus tagData;

        tagData = new Tag469FloRoundingModulus(new MyFloatType(TESTA_FLO_ROUNDING_MODULUS) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag469FloRoundingModulus(new MyFloatType(TESTB_FLO_ROUNDING_MODULUS) );
        System.out.println(tagData.toVerboseString());
    }
}
