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
import com.hwtsllc.fixengine2022.fix44.enums.Enum709PosTransType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  709
 *  PosTransType
 *  Identifies the type of position transaction
 *  Valid values:
 *      1 - Exercise
 *      2 - Do Not Exercise
 *      3 - Position Adjustment
 *      4 - Position Change Submission or Margin Disposition
 *      5 - Pledge
 *      6 - Large Trader Submission
 */
public class Tag709EnuPosTransType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum709PosTransType dataValue;

    public final static Enum709PosTransType TESTA_ENU_POS_TRANS_TYPE
            = Enum709PosTransType.DO_NOT_EXERCISE;
    public final static Enum709PosTransType TESTB_ENU_POS_TRANS_TYPE
            = Enum709PosTransType.MARGIN_DISPOSITION;

    public Tag709EnuPosTransType(Enum709PosTransType dataValue) {
        setFixType(FIX44.FIX709_ENU_POS_TRANS_TYPE);
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
        Tag709EnuPosTransType tagData;

        tagData = new Tag709EnuPosTransType(TESTA_ENU_POS_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag709EnuPosTransType(TESTB_ENU_POS_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
