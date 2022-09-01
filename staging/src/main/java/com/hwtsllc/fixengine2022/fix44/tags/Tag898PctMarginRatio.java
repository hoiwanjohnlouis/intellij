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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  898
 *  MarginRatio
 *  Percentage
 *  <p></p>
 *  The fraction of the cash consideration that must be collateralized,
 *  expressed as a percent.
 *  <p></p>
 *  A MarginRatio of 02% indicates that the value of the collateral
 *  (after deducting for "haircut") must exceed the cash consideration by 2%.
 */
public class Tag898PctMarginRatio extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_MARGIN_RATIO
            = 0.898D;
    public final static double TESTB_PCT_MARGIN_RATIO
            = 0.98D;

    public Tag898PctMarginRatio(MyPercentageType dataValue) {
        setFixType( FIX44.FIX898_PCT_MARGIN_RATIO );
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
        Tag898PctMarginRatio tagData;

        tagData = new Tag898PctMarginRatio(new MyPercentageType( TESTA_PCT_MARGIN_RATIO ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag898PctMarginRatio(new MyPercentageType( TESTB_PCT_MARGIN_RATIO ) );
        System.out.println(tagData.toVerboseString());
    }
}
