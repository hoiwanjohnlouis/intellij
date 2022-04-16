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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum635ClearingFeeIndicator;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag635EnuClearingFeeIndicator extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum635ClearingFeeIndicator dataValue;

    public final static Enum635ClearingFeeIndicator TESTA_ENU_CLEARING_FEE_INDICATOR
            = Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER;
    public final static Enum635ClearingFeeIndicator TESTB_ENU_CLEARING_FEE_INDICATOR
            = Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE;

    public Tag635EnuClearingFeeIndicator(Enum635ClearingFeeIndicator dataValue) {
        setFixType(FIX43.FIX635_ENU_CLEARING_FEE_INDICATOR);
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
        Tag635EnuClearingFeeIndicator tagData;

        tagData = new Tag635EnuClearingFeeIndicator(TESTA_ENU_CLEARING_FEE_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag635EnuClearingFeeIndicator(TESTB_ENU_CLEARING_FEE_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
