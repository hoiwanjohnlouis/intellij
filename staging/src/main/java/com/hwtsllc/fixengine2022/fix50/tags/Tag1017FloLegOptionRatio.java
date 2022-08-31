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
 *  1017
 *  LegOptionRatio
 *  float
 *  <p>
 *  Expresses the risk of an option leg
 *  <p></p>
 *  Value must be between -1 and 1.
 *  <p></p>
 *  A Call Option will require a ratio value between 0 and 1
 *  <p></p>
 *  A Put Option will require a ratio value between -1 and 0
 */
public class Tag1017FloLegOptionRatio extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_LEG_OPTION_RATIO
            = 0.1017F;
    public final static float TESTB_FLO_LEG_OPTION_RATIO
            = -0.1017F;

    public Tag1017FloLegOptionRatio(MyFloatType dataValue) {
        setFixType( FIX50.FIX1017_FLO_LEG_OPTION_RATIO );
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
        Tag1017FloLegOptionRatio tagData;

        tagData = new Tag1017FloLegOptionRatio(new MyFloatType( TESTA_FLO_LEG_OPTION_RATIO ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1017FloLegOptionRatio(new MyFloatType( TESTB_FLO_LEG_OPTION_RATIO ) );
        System.out.println(tagData.toVerboseString());
    }
}
