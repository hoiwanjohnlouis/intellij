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
import com.hwtsllc.fixengine.datatypes.MyPercentageType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  765
 *  AllowableOneSidednessPct
 *  Percentage
 *  <p></p>
 *  The maximum percentage that execution of
 *  <p></p>
 *  one side of a program trade can exceed execution of the other.
 */
public class Tag765PctAllowableOneSidednessPct extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT
            = 0.765D;
    public final static double TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT
            = 0.65D;

    public Tag765PctAllowableOneSidednessPct(MyPercentageType dataValue) {
        setFixType( FIX44.FIX765_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT );
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
        Tag765PctAllowableOneSidednessPct tagData;

        tagData = new Tag765PctAllowableOneSidednessPct(new MyPercentageType( TESTA_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag765PctAllowableOneSidednessPct(new MyPercentageType( TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT ) );
        System.out.println(tagData.toVerboseString());
    }
}
