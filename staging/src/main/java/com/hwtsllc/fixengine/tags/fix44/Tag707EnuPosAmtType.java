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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.enums.fix44.Enum707PosAmtType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  707
 *  PosAmtType
 *  String
 *  <p></p>
 *  Type of Position amount
 *  <p></p>
 *  Valid values:
 *  <p>    CASH - Cash Amount (Corporate Event)
 *  <p>    CRES - Cash Residual Amount
 *  <p>    FMTM - Final Mark-to-Market Amount
 *  <p>    IMTM - Incremental Mark-to-Market Amount
 *  <p>    PREM - Premium Amount
 *  <p></p>
 *  <p>    SMTM - Start-of-Day Mark-to-Market Amount
 *  <p>    TVAR - Trade Variation Amount
 *  <p>    VADJ - Value Adjusted Amount
 *  <p>    SETL - Settlement Value
 */
public class Tag707EnuPosAmtType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum707PosAmtType dataValue;

    public final static Enum707PosAmtType TESTA_ENU_POS_AMT_TYPE
            = Enum707PosAmtType.CASH_RESIDUAL_AMOUNT;
    public final static Enum707PosAmtType TESTB_ENU_POS_AMT_TYPE
            = Enum707PosAmtType.INCREMENTAL_MARK_TO_MARKET_AMOUNT;

    public Tag707EnuPosAmtType(Enum707PosAmtType dataValue) {
        setFixType(FIX44.FIX707_ENU_POS_AMT_TYPE);
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
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
        Tag707EnuPosAmtType tagData;

        tagData = new Tag707EnuPosAmtType(TESTA_ENU_POS_AMT_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag707EnuPosAmtType(TESTB_ENU_POS_AMT_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum707PosAmtType oneEnum : Enum707PosAmtType.values()) {
            System.out.println( new Tag707EnuPosAmtType(oneEnum).toVerboseString() );
        }
    }
}
