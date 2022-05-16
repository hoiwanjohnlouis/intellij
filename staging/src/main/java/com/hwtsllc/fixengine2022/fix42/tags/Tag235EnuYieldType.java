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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum235YieldType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  235
 *  YieldType
 *  various msg types
 *      "AFTERTAX - After Tax Yield (Municipals)"
 *      "ANNUAL - Annual Yield"
 *      "ATISSUE - Yield At Issue (Municipals)"
 *      "AVGMATURITY - Yield To Avg Maturity"
 *      "BOOK - Book Yield"
 *      "CALL - Yield to Next Call"
 *      "CHANGE - Yield Change Since Close"
 *      "CLOSE - Closing Yield"
 *      "COMPOUND - Compound Yield"
 *      "CURRENT - Current Yield"
 *      "GOVTEQUIV - Gvnt Equivalent Yield"
 *      "GROSS - True Gross Yield"
 *      "INFLATION - Yield with Inflation Assumption"
 *      "INVERSEFLOATER - Inverse Floater Bond Yield"
 *      "LASTCLOSE - Most Recent Closing Yield"
 *      "LASTMONTH - Closing Yield Most Recent Month"
 *      "LASTQUARTER - Closing Yield Most Recent Quarter"
 *      "LASTYEAR - Closing Yield Most Recent Year"
 *      "LONGAVGLIFE - Yield to Longest Average Life"
 *      "MARK - Mark to Market Yield"
 *      "MATURITY - Yield to Maturity"
 *      "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)"
 *      "OPENAVG - Open Average Yield"
 *      "PREVCLOSE - Previous Close Yield"
 *      "PROCEEDS - Proceeds Yield"
 *      "PUT - Yield to Next Put"
 *      "SEMIANNUAL - Semi-annual Yield"
 *      "SHORTAVGLIFE - Yield to Shortest Average Life"
 *      "SIMPLE - Simple Yield"
 *      "TAXEQUIV - Tax Equivalent Yield"
 *      "TENDER - Yield to Tender Date"
 *      "TRUE - True Yield"
 *      "VALUE1_32 - Yield Value Of 1/32"
 *      "WORST - Yield To Worst"
 */
public class Tag235EnuYieldType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum235YieldType dataValue;

    public final static Enum235YieldType TESTA_ENU_YIELD_TYPE
            = Enum235YieldType.COMPOUND;
    public final static Enum235YieldType TESTB_ENU_YIELD_TYPE
            = Enum235YieldType.AFTERTAX;

    public Tag235EnuYieldType(Enum235YieldType dataValue) {
        setFixType(FIX42.FIX235_ENU_YIELD_TYPE);
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
        return getID()
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
        Tag235EnuYieldType tagData;

        tagData = new Tag235EnuYieldType(TESTA_ENU_YIELD_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag235EnuYieldType(TESTB_ENU_YIELD_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
