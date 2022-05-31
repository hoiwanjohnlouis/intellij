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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  967
 *  StrikeMultiplier
 *  float
 *  <p>
 *  Used for derivatives.
 *  <p>
 *  Multiplier applied to the strike price for the purpose of calculating the settlement value.
 */
public class Tag967FloStrikeMultiplier extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_STRIKE_MULTIPLIER
            = 0.967F;
    public final static float TESTB_FLO_STRIKE_MULTIPLIER
            = 0.0967F;

    public Tag967FloStrikeMultiplier(MyFloatType dataValue) {
        setFixType( FIX50.FIX967_FLO_STRIKE_MULTIPLIER );
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
        Tag967FloStrikeMultiplier tagData;

        tagData = new Tag967FloStrikeMultiplier(new MyFloatType( TESTA_FLO_STRIKE_MULTIPLIER ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag967FloStrikeMultiplier(new MyFloatType( TESTB_FLO_STRIKE_MULTIPLIER ) );
        System.out.println(tagData.toVerboseString());
    }
}