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
import com.hwtsllc.fixengine2022.fix44.enums.Enum707PosAmtType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  707
 *  PosAmtType
 *  Type of Position amount
 *  Valid values:
 *      CASH - Cash Amount (Corporate Event)
 *      CRES - Cash Residual Amount
 *      FMTM - Final Mark-to-Market Amount
 *      IMTM - Incremental Mark-to-Market Amount
 *      PREM - Premium Amount
 *      SMTM - Start-of-Day Mark-to-Market Amount
 *      TVAR - Trade Variation Amount
 *      VADJ - Value Adjusted Amount
 *      SETL - Settlement Value
 */
public class Tag707EnuPosAmtType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum707PosAmtType dataValue;

    public final static Enum707PosAmtType TESTA_ENU_POS_AMT_TYPE
            = Enum707PosAmtType.CASH_RESIDUAL_AMOUNT;
    public final static Enum707PosAmtType TESTB_ENU_POS_AMT_TYPE
            = Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT;

    public Tag707EnuPosAmtType(Enum707PosAmtType dataValue) {
        setFixType(FIX44.FIX707_ENU_POS_AMT_TYPE);
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
        Tag707EnuPosAmtType tagData;

        tagData = new Tag707EnuPosAmtType(TESTA_ENU_POS_AMT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag707EnuPosAmtType(TESTB_ENU_POS_AMT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
