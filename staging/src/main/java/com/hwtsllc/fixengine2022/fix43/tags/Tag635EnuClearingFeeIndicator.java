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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  635
 *  ClearingFeeIndicator
 *  String
 *  <p></p>
 *  Indicates type of fee being assessed of the customer
 *  for trade executions at an exchange.
 *  <p></p>
 *  Applicable for futures markets only at this time.
 *  <p></p>
 *  (Values source CBOT, CME, NYBOT, and NYMEX):
 *  Valid values:
 *  <p>    1 - 1st year delegate trading for own account
 *  <p>    2 - 2nd year delegate trading for own account
 *  <p>    3 - 3rd year delegate trading for own account
 *  <p>    4 - 4th year delegate trading for own account
 *  <p>    5 - 5th year delegate trading for own account
 *  <p></p>
 *  <p>    9 - 6th year delegate trading for own account
 *  <p>    B - CBOE Member
 *  <p>    C - Non-member and Customer
 *  <p>    E - Equity Member and Clearing Member
 *  <p>    F - Full and Associate Member trading for own account and as floor brokers
 *  <p></p>
 *  <p>    H - 106.H and 106.J firms
 *  <p>    I - GIM, IDEM and COM Membership Interest Holders
 *  <p>    L - Lessee 106.F Employees
 *  <p>    M - All other ownership types
 */
public class Tag635EnuClearingFeeIndicator extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
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
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag635EnuClearingFeeIndicator(TESTB_ENU_CLEARING_FEE_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
