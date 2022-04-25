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
import com.hwtsllc.fixengine2022.fix44.enums.Enum688LegStipulationType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  688 (same as 233, 688)
 *  LegStipulationType
 *  For Fixed Income, type of Stipulation for this leg.
 *      See StipulationType (233) for description and valid values
 *  Valid values:
 *      AMT - Alternative Minimum Tax (Y/N)
 *      AUTOREINV - Auto Reinvestment at <rate> or better
 *      BANKQUAL - Bank qualified (Y/N)
 *      BGNCON - Bargain conditions (see StipulationValue (234) for values)
 *      COUPON - Coupon range
 *      CURRENCY - ISO Currency Code
 *      CUSTOMDATE - Custom start/end date
 *      GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
 *      HAIRCUT - Valuation Discount
 *      INSURED - Insured (Y/N)
 *      ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
 *      ISSUER - Issuer's ticker
 *      ISSUESIZE - issue size range
 *      LOOKBACK - Lookback Days
 *      LOT - Explicit lot identifier
 *      LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
 *      MAT - Maturity Year And Month
 *      MATURITY - Maturity range
 *      MAXSUBS - Maximum substitutions (Repo)
 *      MINDNOM - Minimum denomination
 *      MININCR - Minimum increment
 *      MINQTY - Minimum quantity
 *      PAYFREQ - Payment frequency, calendar
 *      PIECES - Number Of Pieces
 *      PMAX - Pools Maximum
 *      PPL - Pools per Lot
 *      PPM - Pools per Million
 *      PPT - Pools per Trade
 *      PRICE - Price Range
 *      PRICEFREQ - Pricing frequency
 *      PROD - Production Year
 *      PROTECT - Call protection
 *      PURPOSE - Purpose
 *      PXSOURCE - Benchmark price source
 *      RATING - Rating source and range
 *      REDEMPTION - Type Of Redemption - values are:
 *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
 *      RESTRICTED - Restricted (Y/N)
 *      SECTOR - Market Sector
 *      SECTYPE - Security Type included or excluded
 *      STRUCT - Structure
 *      SUBSFREQ - Substitutions frequency (Repo)
 *      SUBSLEFT - Substitutions left (Repo)
 *      TEXT - Freeform Text
 *      TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *      WAC - Weighted Average Coupon - value in percent (exact or range)
 *              plus "Gross" or "Net" of servicing spread (the default)
 *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
 *      WAL - Weighted Average Life Coupon - value in percent (exact or range)
 *      WALA - Weighted Average Loan Age - value in months (exact or range)
 *      WAM - Weighted Average Maturity - value in months (exact or range)
 *      WHOLE - Whole Pool (Y/N)
 *      YIELD - Yield Range
 *
 *      Prepayment Speeds
 *      ABS - Absolute Prepayment Speed
 *      CPP - Constant Prepayment Penalty
 *      CPR - Constant Prepayment Rate
 *      CPY - Constant Prepayment Yield
 *      HEP - final CPR of Home Equity Prepayment Curve
 *      MHP - Percent of Manufactured Housing Prepayment Curve
 *      MPR - Monthly Prepayment Rate
 *      PPC - Percent of Prospectus Prepayment Curve
 *      PSA - Percent of BMA Prepayment Curve
 *      SMM - Single Monthly Mortality
 */
public class Tag688EnuLegStipulationType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum688LegStipulationType dataValue;

    public final static Enum688LegStipulationType TESTA_ENU_LEG_STIPULATION_TYPE
            = Enum688LegStipulationType.SECURITY_TYPE;
    public final static Enum688LegStipulationType TESTB_ENU_LEG_STIPULATION_TYPE
            = Enum688LegStipulationType.BANK_QUALIFIED;

    public Tag688EnuLegStipulationType(Enum688LegStipulationType dataValue) {
        setFixType(FIX44.FIX688_ENU_LEG_STIPULATION_TYPE);
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
        Tag688EnuLegStipulationType tagData;

        tagData = new Tag688EnuLegStipulationType(TESTA_ENU_LEG_STIPULATION_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag688EnuLegStipulationType(TESTB_ENU_LEG_STIPULATION_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
