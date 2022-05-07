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
import com.hwtsllc.fixengine2022.datatypes.MyEnumRoundDirection;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  838
 *  PegRoundDirection
 *  int
 *  If the calculated peg price is not a valid tick price, specifies
 *  whether to round the price to be more or less aggressive
 *  844
 *  DiscretionRoundDirection
 *  int
 *  If the calculated discretionary price is not a valid tick price,
 *  specifies whether to round the price to be more or less aggressive
 *  Valid values:
 *      1 - More aggressive - on a buy order round the price up to the nearest tick;
 *                  on a sell order round down to the nearest tick
 *      2 - More passive - on a buy order round down to the nearest tick;
 *                  on a sell order round up to the nearest tick
 */
public class Tag838EnuPegRoundDirection extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumRoundDirection dataValue;

    public final static MyEnumRoundDirection TESTA_ENU_PEG_ROUND_DIRECTION
            = MyEnumRoundDirection.AGGRESSIVE;
    public final static MyEnumRoundDirection TESTB_ENU_PEG_ROUND_DIRECTION
            = MyEnumRoundDirection.PASSIVE;

    public Tag838EnuPegRoundDirection(MyEnumRoundDirection dataValue) {
        setFixType(FIX44.FIX838_ENU_PEG_ROUND_DIRECTION);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
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
        Tag838EnuPegRoundDirection tagData;

        tagData = new Tag838EnuPegRoundDirection(TESTA_ENU_PEG_ROUND_DIRECTION);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag838EnuPegRoundDirection(TESTB_ENU_PEG_ROUND_DIRECTION);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
