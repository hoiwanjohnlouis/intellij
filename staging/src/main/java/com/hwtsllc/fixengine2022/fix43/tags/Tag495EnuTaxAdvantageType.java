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
import com.hwtsllc.fixengine2022.fix43.enums.Enum495TaxAdvantageType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  495
 *  TaxAdvantageType
 *  int
 *  <p></p>
 *  For CIV - a code identifying the type of tax exempt account
 *  in which purchased shares/units are to be held.
 *  <p></p>
 *  30 – 998 are reserved for future use by recognized taxation authorities
 *  <p>
 *  999=Other
 *  <p></p>
 *  values above 1000 are available for use by private agreement among counterparties
 *  Valid values:
 *  <p>    0 - None/Not Applicable (default)
 *  <p>    1 - Maxi ISA (UK)
 *  <p>    2 - TESSA (UK)
 *  <p>    3 - Mini Cash ISA (UK)
 *  <p>    4 - Mini Stocks And Shares ISA (UK)
 *  <p></p>
 *  <p>    5 - Mini Insurance ISA (UK)
 *  <p>    6 - Current Year Payment (US)
 *  <p>    7 - Prior Year Payment (US)
 *  <p>    8 - Asset Transfer (US)
 *  <p>    9 - Employee - prior year (US)
 *  <p></p>
 *  <p>    10 - Employee - current year (US)
 *  <p>    11 - Employer - prior year (US)
 *  <p>    12 - Employer - current year (US)
 *  <p>    13 - Non-fund prototype IRA (US)
 *  <p>    14 - Non-fund qualified plan (US)
 *  <p></p>
 *  <p>    15 - Defined contribution plan (US)
 *  <p>    16 - Individual Retirement Account (US)
 *  <p>    17 - Individual Retirement Account - Rollover (US)
 *  <p>    18 - KEOGH (US)
 *  <p>    19 - Profit Sharing Plan (US)
 *  <p></p>
 *  <p>    20 - 401(k) (US)
 *  <p>    21 - Self-directed IRA (US)
 *  <p>    22 - 403(b) (US)
 *  <p>    23 - 457 (US)
 *  <p>    24 - Roth IRA (Fund Prototype) (US)
 *  <p></p>
 *  <p>    25 - Roth IRA (Non-prototype) (US)
 *  <p>    26 - Roth Conversion IRA (Fund Prototype) (US)
 *  <p>    27 - Roth Conversion IRA (Non-prototype) (US)
 *  <p>    28 - Education IRA (Fund Prototype) (US)
 *  <p>    29 - Education IRA (Non-prototype) (US)
 *  <p></p>
 *  <p>    999 - Other
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public class Tag495EnuTaxAdvantageType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum495TaxAdvantageType dataValue;

    public final static Enum495TaxAdvantageType TESTA_ENU_TAX_ADVANTAGE_TYPE
            = Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE;
    public final static Enum495TaxAdvantageType TESTB_ENU_TAX_ADVANTAGE_TYPE
            = Enum495TaxAdvantageType.ASSET_TRANSFER;

    public Tag495EnuTaxAdvantageType(Enum495TaxAdvantageType dataValue) {
        setFixType(FIX43.FIX495_ENU_TAX_ADVANTAGE_TYPE);
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
        Tag495EnuTaxAdvantageType tagData;

        tagData = new Tag495EnuTaxAdvantageType(TESTA_ENU_TAX_ADVANTAGE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag495EnuTaxAdvantageType(TESTB_ENU_TAX_ADVANTAGE_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
