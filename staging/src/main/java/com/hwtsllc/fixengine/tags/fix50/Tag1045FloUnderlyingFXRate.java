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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.FIX50;
import com.hwtsllc.fixengine.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine.datatypes.MyFloatType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  1045
 *  UnderlyingFXRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute UnderlyingCurrentValue (885) (or market value)
 *  from UnderlyingCurrency (318) to Currency (15).
 */
public class Tag1045FloUnderlyingFXRate extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_UNDERLYING_FX_RATE
            = 0.1045F;
    public final static float TESTB_FLO_UNDERLYING_FX_RATE
            = 0.01045F;

    public Tag1045FloUnderlyingFXRate(MyFloatType dataValue) {
        setFixType( FIX50.FIX1045_FLO_UNDERLYING_FX_RATE );
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
        Tag1045FloUnderlyingFXRate tagData;

        tagData = new Tag1045FloUnderlyingFXRate(new MyFloatType( TESTA_FLO_UNDERLYING_FX_RATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1045FloUnderlyingFXRate(new MyFloatType( TESTB_FLO_UNDERLYING_FX_RATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
