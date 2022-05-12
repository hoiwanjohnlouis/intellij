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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  233 (same as 233, 688, 888)
 *  StipulationType
 *  String
 *  <p>
 *  For Fixed Income.  Type of Stipulation.
 *  <p>
 *  Other types may be used by mutual agreement of the counterparties.
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  688
 *  LegStipulationType
 *  String
 *  <p>
 *  For Fixed Income, type of Stipulation for this leg.
 *  <p>
 *  See StipulationType (233) for description and valid values
 *  <p></p>
 *  888
 *  UnderlyingStipType
 *  String
 *  <p>
 *  Type of stipulation.
 *  <p>
 *  Same values as StipulationType (233)
 *  <p></p>
 *  Valid values:
 *  <p>    AMT - Alternative Minimum Tax (Y/N)
 *  <p>    AUTOREINV - Auto Reinvestment at <rate> or better
 *  <p>    BANKQUAL - Bank qualified (Y/N)
 *  <p>    BGNCON - Bargain conditions (see StipulationValue (234) for values)
 *  <p>    COUPON - Coupon range
 *  <p></p>
 *  <p>    CURRENCY - ISO Currency Code
 *  <p>    CUSTOMDATE - Custom start/end date
 *  <p>    GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
 *  <p>    HAIRCUT - Valuation Discount
 *  <p>    INSURED - Insured (Y/N)
 *  <p></p>
 *  <p>    ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
 *  <p>    ISSUER - Issuer's ticker
 *  <p>    ISSUESIZE - issue size range
 *  <p>    LOOKBACK - Lookback Days
 *  <p>    LOT - Explicit lot identifier
 *  <p></p>
 *  <p>    LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
 *  <p>    MAT - Maturity Year And Month
 *  <p>    MATURITY - Maturity range
 *  <p>    MAXSUBS - Maximum substitutions (Repo)
 *  <p>    MINDNOM - Minimum denomination
 *  <p></p>
 *  <p>    MININCR - Minimum increment
 *  <p>    MINQTY - Minimum quantity
 *  <p>    PAYFREQ - Payment frequency, calendar
 *  <p>    PIECES - Number Of Pieces
 *  <p>    PMAX - Pools Maximum
 *  <p></p>
 *  <p>    PPL - Pools per Lot
 *  <p>    PPM - Pools per Million
 *  <p>    PPT - Pools per Trade
 *  <p>    PRICE - Price Range
 *  <p>    PRICEFREQ - Pricing frequency
 *  <p></p>
 *  <p>    PROD - Production Year
 *  <p>    PROTECT - Call protection
 *  <p>    PURPOSE - Purpose
 *  <p>    PXSOURCE - Benchmark price source
 *  <p>    RATING - Rating source and range
 *  <p></p>
 *  <p>    REDEMPTION - Type Of Redemption - values are:
 *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
 *  <p>    RESTRICTED - Restricted (Y/N)
 *  <p>    SECTOR - Market Sector
 *  <p>    SECTYPE - Security Type included or excluded
 *  <p>    STRUCT - Structure
 *  <p></p>
 *      SUBSFREQ - Substitutions frequency (Repo)
 *      SUBSLEFT - Substitutions left (Repo)
 *      TEXT - Freeform Text
 *      TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *      WAC - Weighted Average Coupon - value in percent (exact or range)
 *              plus "Gross" or "Net" of servicing spread (the default)
 *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
 *  <p></p>
 *  <p>    WAL - Weighted Average Life Coupon - value in percent (exact or range)
 *  <p>    WALA - Weighted Average Loan Age - value in months (exact or range)
 *  <p>    WAM - Weighted Average Maturity - value in months (exact or range)
 *  <p>    WHOLE - Whole Pool (Y/N)
 *  <p>    YIELD - Yield Range
 *  <p></p>
 *      Prepayment Speeds
 *  <p>    ABS - Absolute Prepayment Speed
 *  <p>    CPP - Constant Prepayment Penalty
 *  <p>    CPR - Constant Prepayment Rate
 *  <p>    CPY - Constant Prepayment Yield
 *  <p>    HEP - final CPR of Home Equity Prepayment Curve
 *  <p></p>
 *  <p>    MHP - Percent of Manufactured Housing Prepayment Curve
 *  <p>    MPR - Monthly Prepayment Rate
 *  <p>    PPC - Percent of Prospectus Prepayment Curve
 *  <p>    PSA - Percent of BMA Prepayment Curve
 *  <p>    SMM - Single Monthly Mortality
 */
class MyEnumStipulationTypeTest {
    /**
     *  233 (same as 233, 688, 888)
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
    @Test
    void Enum0233Test() {
        MyEnumStipulationType enumType;

        /*
         *  233 StipulationType
         */
        enumType = MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX;
        assertEquals("AMT", enumType.getID());
        assertEquals("ALTERNATIVE_MINIMUM_TAX", enumType.getName());
        assertEquals("AMT - Alternative Minimum Tax (Y/N)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.AUTO_REINVESTMENT;
        assertEquals("AUTOREINV", enumType.getID());
        assertEquals("AUTO_REINVESTMENT", enumType.getName());
        assertEquals("AUTOREINV - Auto Reinvestment at <rate> or better", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.BANK_QUALIFIED;
        assertEquals("BANKQUAL", enumType.getID());
        assertEquals("BANK_QUALIFIED", enumType.getName());
        assertEquals("BANKQUAL - Bank qualified (Y/N)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.BARGAIN_CONDITIONS;
        assertEquals("BGNCON", enumType.getID());
        assertEquals("BARGAIN_CONDITIONS", enumType.getName());
        assertEquals("BGNCON - Bargain conditions (see StipulationValue (234) for values)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.COUPON_RANGE;
        assertEquals("COUPON", enumType.getID());
        assertEquals("COUPON_RANGE", enumType.getName());
        assertEquals("COUPON - Coupon range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.ISO_CURRENCY_CODE;
        assertEquals("CURRENCY", enumType.getID());
        assertEquals("ISO_CURRENCY_CODE", enumType.getName());
        assertEquals("CURRENCY - ISO Currency Code", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.CUSTOM_START_END_DATE;
        assertEquals("CUSTOMDATE", enumType.getID());
        assertEquals("CUSTOM_START_END_DATE", enumType.getName());
        assertEquals("CUSTOMDATE - Custom start/end date", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE;
        assertEquals("GEOG", enumType.getID());
        assertEquals("GEOGRAPHIC_AND_PERCENT_RANGE", enumType.getName());
        assertEquals("GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.VALUATION_DISCOUNT;
        assertEquals("HAIRCUT", enumType.getID());
        assertEquals("VALUATION_DISCOUNT", enumType.getName());
        assertEquals("HAIRCUT - Valuation Discount", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.INSURED;
        assertEquals("INSURED", enumType.getID());
        assertEquals("INSURED", enumType.getName());
        assertEquals("INSURED - Insured (Y/N)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE;
        assertEquals("ISSUE", enumType.getID());
        assertEquals("YEAR_OR_YEAR_MONTH_OF_ISSUE", enumType.getName());
        assertEquals("ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.ISSUERS_TICKER;
        assertEquals("ISSUER", enumType.getID());
        assertEquals("ISSUERS_TICKER", enumType.getName());
        assertEquals("ISSUER - Issuer's ticker", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.ISSUE_SIZE_RANGE;
        assertEquals("ISSUESIZE", enumType.getID());
        assertEquals("ISSUE_SIZE_RANGE", enumType.getName());
        assertEquals("ISSUESIZE - issue size range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.LOOKBACK_DAYS;
        assertEquals("LOOKBACK", enumType.getID());
        assertEquals("LOOKBACK_DAYS", enumType.getName());
        assertEquals("LOOKBACK - Lookback Days", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER;
        assertEquals("LOT", enumType.getID());
        assertEquals("EXPLICIT_LOT_IDENTIFIER", enumType.getName());
        assertEquals("LOT - Explicit lot identifier", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.LOT_VARIANCE;
        assertEquals("LOTVAR", enumType.getID());
        assertEquals("LOT_VARIANCE", enumType.getName());
        assertEquals("LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MATURITY_YEAR_AND_MONTH;
        assertEquals("MAT", enumType.getID());
        assertEquals("MATURITY_YEAR_AND_MONTH", enumType.getName());
        assertEquals("MAT - Maturity Year And Month", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MATURITY_RANGE;
        assertEquals("MATURITY", enumType.getID());
        assertEquals("MATURITY_RANGE", enumType.getName());
        assertEquals("MATURITY - Maturity range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO;
        assertEquals("MAXSUBS", enumType.getID());
        assertEquals("MAXIMUM_SUBSTITUTIONS_REPO", enumType.getName());
        assertEquals("MAXSUBS - Maximum substitutions (Repo)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MINIMUM_DENOMINATION;
        assertEquals("MINDNOM", enumType.getID());
        assertEquals("MINIMUM_DENOMINATION", enumType.getName());
        assertEquals("MINDNOM - Minimum denomination", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.MINIMUM_INCREMENT;
        assertEquals("MININCR", enumType.getID());
        assertEquals("MINIMUM_INCREMENT", enumType.getName());
        assertEquals("MININCR - Minimum increment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MINIMUM_QUANTITY;
        assertEquals("MINQTY", enumType.getID());
        assertEquals("MINIMUM_QUANTITY", enumType.getName());
        assertEquals("MINQTY - Minimum quantity", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PAYMENT_FREQUENCY;
        assertEquals("PAYFREQ", enumType.getID());
        assertEquals("PAYMENT_FREQUENCY", enumType.getName());
        assertEquals("PAYFREQ - Payment frequency, calendar", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.NUMBER_OF_PIECES;
        assertEquals("PIECES", enumType.getID());
        assertEquals("NUMBER_OF_PIECES", enumType.getName());
        assertEquals("PIECES - Number Of Pieces", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.POOLS_MAXIMUM;
        assertEquals("PMAX", enumType.getID());
        assertEquals("POOLS_MAXIMUM", enumType.getName());
        assertEquals("PMAX - Pools Maximum", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.POOLS_PER_LOT;
        assertEquals("PPL", enumType.getID());
        assertEquals("POOLS_PER_LOT", enumType.getName());
        assertEquals("PPL - Pools per Lot", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.POOLS_PER_MILLION;
        assertEquals("PPM", enumType.getID());
        assertEquals("POOLS_PER_MILLION", enumType.getName());
        assertEquals("PPM - Pools per Million", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.POOLS_PER_TRADE;
        assertEquals("PPT", enumType.getID());
        assertEquals("POOLS_PER_TRADE", enumType.getName());
        assertEquals("PPT - Pools per Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PRICE_RANGE;
        assertEquals("PRICE", enumType.getID());
        assertEquals("PRICE_RANGE", enumType.getName());
        assertEquals("PRICE - Price Range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PRICING_FREQUENCY;
        assertEquals("PRICEFREQ", enumType.getID());
        assertEquals("PRICING_FREQUENCY", enumType.getName());
        assertEquals("PRICEFREQ - Pricing frequency", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.PRODUCTION_YEAR;
        assertEquals("PROD", enumType.getID());
        assertEquals("PRODUCTION_YEAR", enumType.getName());
        assertEquals("PROD - Production Year", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.CALL_PROTECTION;
        assertEquals("PROTECT", enumType.getID());
        assertEquals("CALL_PROTECTION", enumType.getName());
        assertEquals("PROTECT - Call protection", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PURPOSE;
        assertEquals("PURPOSE", enumType.getID());
        assertEquals("PURPOSE", enumType.getName());
        assertEquals("PURPOSE - Purpose", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.BENCHMARK_PRICE_SOURCE;
        assertEquals("PXSOURCE", enumType.getID());
        assertEquals("BENCHMARK_PRICE_SOURCE", enumType.getName());
        assertEquals("PXSOURCE - Benchmark price source", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.RATING_SOURCE_AND_RANGE;
        assertEquals("RATING", enumType.getID());
        assertEquals("RATING_SOURCE_AND_RANGE", enumType.getName());
        assertEquals("RATING - Rating source and range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.TYPE_OF_REDEMPTION;
        assertEquals("REDEMPTION", enumType.getID());
        assertEquals("TYPE_OF_REDEMPTION", enumType.getName());
        assertEquals("REDEMPTION - Type Of Redemption - values are: " +
                "NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.RESTRICTED;
        assertEquals("RESTRICTED", enumType.getID());
        assertEquals("RESTRICTED", enumType.getName());
        assertEquals("RESTRICTED - Restricted (Y/N)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MARKET_SECTOR;
        assertEquals("SECTOR", enumType.getID());
        assertEquals("MARKET_SECTOR", enumType.getName());
        assertEquals("SECTOR - Market Sector", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.SECURITY_TYPE;
        assertEquals("SECTYPE", enumType.getID());
        assertEquals("SECURITY_TYPE", enumType.getName());
        assertEquals("SECTYPE - Security Type included or excluded", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.STRUCTURE;
        assertEquals("STRUCT", enumType.getID());
        assertEquals("STRUCTURE", enumType.getName());
        assertEquals("STRUCT - Structure", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO;
        assertEquals("SUBSFREQ", enumType.getID());
        assertEquals("SUBSTITUTIONS_FREQUENCY_REPO", enumType.getName());
        assertEquals("SUBSFREQ - Substitutions frequency (Repo)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO;
        assertEquals("SUBSLEFT", enumType.getID());
        assertEquals("SUBSTITUTIONS_LEFT_REPO", enumType.getName());
        assertEquals("SUBSLEFT - Substitutions left (Repo)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.FREEFORM_TEXT;
        assertEquals("TEXT", enumType.getID());
        assertEquals("FREEFORM_TEXT", enumType.getName());
        assertEquals("TEXT - Freeform Text", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.TRADE_VARIANCE;
        assertEquals("TRDVAR", enumType.getID());
        assertEquals("TRADE_VARIANCE", enumType.getName());
        assertEquals("TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON;
        assertEquals("WAC", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_COUPON", enumType.getName());
        assertEquals("WAC - Weighted Average Coupon - value in percent (exact or range) " +
                "plus (Gross or Net) of servicing spread (the default) " +
                "(ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON;
        assertEquals("WAL", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_LIFE_COUPON", enumType.getName());
        assertEquals("WAL - Weighted Average Life Coupon - value in percent (exact or range)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE;
        assertEquals("WALA", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_LOAN_AGE", enumType.getName());
        assertEquals("WALA - Weighted Average Loan Age - value in months (exact or range)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY;
        assertEquals("WAM", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_MATURITY", enumType.getName());
        assertEquals("WAM - Weighted Average Maturity - value in months (exact or range)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.WHOLE_POOL;
        assertEquals("WHOLE", enumType.getID());
        assertEquals("WHOLE_POOL", enumType.getName());
        assertEquals("WHOLE - Whole Pool (Y/N)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.YIELD_RANGE;
        assertEquals("YIELD", enumType.getID());
        assertEquals("YIELD_RANGE", enumType.getName());
        assertEquals("YIELD - Yield Range", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  Prepayment Speeds
         */
        enumType = MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED;
        assertEquals("ABS", enumType.getID());
        assertEquals("ABSOLUTE_PREPAYMENT_SPEED", enumType.getName());
        assertEquals("ABS - Absolute Prepayment Speed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY;
        assertEquals("CPP", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_PENALTY", enumType.getName());
        assertEquals("CPP - Constant Prepayment Penalty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE;
        assertEquals("CPR", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_RATE", enumType.getName());
        assertEquals("CPR - Constant Prepayment Rate", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD;
        assertEquals("CPY", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_YIELD", enumType.getName());
        assertEquals("CPY - Constant Prepayment Yield", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.FINAL_CPR_HOME_EQUITY;
        assertEquals("HEP", enumType.getID());
        assertEquals("FINAL_CPR_HOME_EQUITY", enumType.getName());
        assertEquals("HEP - final CPR of Home Equity Prepayment Curve", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT;
        assertEquals("MHP", enumType.getID());
        assertEquals("MANUFACTURED_HOUSING_PREPAYMENT", enumType.getName());
        assertEquals("MHP - Percent of Manufactured Housing Prepayment Curve", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE;
        assertEquals("MPR", enumType.getID());
        assertEquals("MONTHLY_PREPAYMENT_RATE", enumType.getName());
        assertEquals("MPR - Monthly Prepayment Rate", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT;
        assertEquals("PPC", enumType.getID());
        assertEquals("PERCENT_PROSPECTUS_PREPAYMENT", enumType.getName());
        assertEquals("PPC - Percent of Prospectus Prepayment Curve", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.PERCENT_BMA_PREPAYMENT;
        assertEquals("PSA", enumType.getID());
        assertEquals("PERCENT_BMA_PREPAYMENT", enumType.getName());
        assertEquals("PSA - Percent of BMA Prepayment Curve", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY;
        assertEquals("SMM", enumType.getID());
        assertEquals("SINGLE_MONTHLY_MORTALITY", enumType.getName());
        assertEquals("SMM - Single Monthly Mortality", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}