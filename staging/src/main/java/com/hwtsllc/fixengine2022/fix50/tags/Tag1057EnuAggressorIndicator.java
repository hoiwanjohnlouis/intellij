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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1057AggressorIndicator;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1057
 *  AggressorIndicator
 *  Boolean
 *  <p>
 *  Used to identify whether the order initiator is an aggressor or not in the trade.
 *  <p></p>
 *  Valid values:
 *  <p> Y - Order initiator is aggressor
 *  <p> N - Order initiator is passive
 */
public class Tag1057EnuAggressorIndicator extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum1057AggressorIndicator dataValue;

    public final static Enum1057AggressorIndicator TESTA_ENU_AGGRESSOR_INDICATOR
            = Enum1057AggressorIndicator.AGGRESSOR;
    public final static Enum1057AggressorIndicator TESTB_ENU_AGGRESSOR_INDICATOR
            = Enum1057AggressorIndicator.PASSIVE;

    public Tag1057EnuAggressorIndicator(Enum1057AggressorIndicator dataValue) {
        setFixType(FIX50.FIX1057_ENU_AGGRESSOR_INDICATOR);
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
        Tag1057EnuAggressorIndicator tagData;

        tagData = new Tag1057EnuAggressorIndicator(TESTA_ENU_AGGRESSOR_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1057EnuAggressorIndicator(TESTB_ENU_AGGRESSOR_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
