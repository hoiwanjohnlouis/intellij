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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  960
 *  StrategyParameterValue
 *  String
 *  <p>
 *  Value of the parameter
 */
public class Tag960StrStrategyParameterValue extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_STRATEGY_PARAMETER_VALUE
            = "NatalieDessay-Tag960StrStrategyParameterValue";
    public final static String TESTB_STR_STRATEGY_PARAMETER_VALUE
            = "LorraineHuntLieberson-Tag960StrStrategyParameterValue";

    public Tag960StrStrategyParameterValue(MyStringType dataValue) {
        setFixType(FIX50.FIX960_STR_STRATEGY_PARAMETER_VALUE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
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
        Tag960StrStrategyParameterValue tagData;

        tagData = new Tag960StrStrategyParameterValue(new MyStringType(TESTA_STR_STRATEGY_PARAMETER_VALUE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag960StrStrategyParameterValue(new MyStringType(TESTB_STR_STRATEGY_PARAMETER_VALUE) );
        System.out.println(tagData.toVerboseString());
    }
}
