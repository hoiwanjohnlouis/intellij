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
 *  246
 *  UnderlyingFactor
 *  float
 *  <p>
 *  Underlying security’s Factor.
 *  <p>
 *  See Factor (228) field for description
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
public class Tag246FloUnderlyingFactor extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_UNDERLYING_FACTOR
            = 2.46F;
    public final static float TESTB_FLO_UNDERLYING_FACTOR
            = 6.42F;

    public Tag246FloUnderlyingFactor(MyFloatType dataValue) {
        setFixType(FIX42.FIX246_FLO_UNDERLYING_FACTOR);
        this.dataValue = dataValue;
    }

    public float getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag246FloUnderlyingFactor tagData;

        tagData = new Tag246FloUnderlyingFactor(new MyFloatType(TESTA_FLO_UNDERLYING_FACTOR) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag246FloUnderlyingFactor(new MyFloatType(TESTB_FLO_UNDERLYING_FACTOR) );
        System.out.println(tagData.toVerboseString());
    }
}
