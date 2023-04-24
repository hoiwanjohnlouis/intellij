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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  848
 *  TargetStrategyParameters
 *  String
 *  <p></p>
 *  Deprecated in FIX.5.0
 *  <p></p>
 *  Field to allow further specification of the TargetStrategy
 *  - usage to be agreed between counterparties
 */
public class Tag848StrTargetStrategyParameters extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_TARGET_STRATEGY_PARAMETERS
            = "LisetteOropesa-Tag848StrTargetStrategyParameters";
    public final static String TESTB_STR_TARGET_STRATEGY_PARAMETERS
            = "JuneAnderson-Tag848StrTargetStrategyParameters";

    public Tag848StrTargetStrategyParameters(MyStringType dataValue) {
        setFixType( FIX44.FIX848_STR_TARGET_STRATEGY_PARAMETERS );
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
        Tag848StrTargetStrategyParameters tagData;

        tagData = new Tag848StrTargetStrategyParameters(new MyStringType( TESTA_STR_TARGET_STRATEGY_PARAMETERS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag848StrTargetStrategyParameters(new MyStringType( TESTB_STR_TARGET_STRATEGY_PARAMETERS ) );
        System.out.println(tagData.toVerboseString());
    }
}
