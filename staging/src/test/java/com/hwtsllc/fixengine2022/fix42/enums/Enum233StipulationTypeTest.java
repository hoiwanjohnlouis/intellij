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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum233StipulationTypeTest {
    /**
     *  233 (same as 233, 688)
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
    @Test
    void Enum0233Test() {
        Enum233StipulationType enumType;

        /*
         *  233 StipulationType
         */
        enumType = Enum233StipulationType.ALTERNATIVE_MINIMUM_TAX;
        assertEquals("AMT", enumType.getID());
        assertEquals("ALTERNATIVE_MINIMUM_TAX", enumType.getName());
        assertEquals("AMT - Alternative Minimum Tax (Y/N)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.AUTO_REINVESTMENT;
        assertEquals("AUTOREINV", enumType.getID());
        assertEquals("AUTO_REINVESTMENT", enumType.getName());
        assertEquals("AUTOREINV - Auto Reinvestment at <rate> or better", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.BANK_QUALIFIED;
        assertEquals("BANKQUAL", enumType.getID());
        assertEquals("BANK_QUALIFIED", enumType.getName());
        assertEquals("BANKQUAL - Bank qualified (Y/N)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.BARGAIN_CONDITIONS;
        assertEquals("BGNCON", enumType.getID());
        assertEquals("BARGAIN_CONDITIONS", enumType.getName());
        assertEquals("BGNCON - Bargain conditions (see StipulationValue (234) for values)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.COUPON_RANGE;
        assertEquals("COUPON", enumType.getID());
        assertEquals("COUPON_RANGE", enumType.getName());
        assertEquals("COUPON - Coupon range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.ISO_CURRENCY_CODE;
        assertEquals("CURRENCY", enumType.getID());
        assertEquals("ISO_CURRENCY_CODE", enumType.getName());
        assertEquals("CURRENCY - ISO Currency Code", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.CUSTOM_START_END_DATE;
        assertEquals("CUSTOMDATE", enumType.getID());
        assertEquals("CUSTOM_START_END_DATE", enumType.getName());
        assertEquals("CUSTOMDATE - Custom start/end date", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.GEOGRAPHIC_AND_PERCENT_RANGE;
        assertEquals("GEOG", enumType.getID());
        assertEquals("GEOGRAPHIC_AND_PERCENT_RANGE", enumType.getName());
        assertEquals("GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.VALUATION_DISCOUNT;
        assertEquals("HAIRCUT", enumType.getID());
        assertEquals("VALUATION_DISCOUNT", enumType.getName());
        assertEquals("HAIRCUT - Valuation Discount", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.INSURED;
        assertEquals("INSURED", enumType.getID());
        assertEquals("INSURED", enumType.getName());
        assertEquals("INSURED - Insured (Y/N)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE;
        assertEquals("ISSUE", enumType.getID());
        assertEquals("YEAR_OR_YEAR_MONTH_OF_ISSUE", enumType.getName());
        assertEquals("ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.ISSUERS_TICKER;
        assertEquals("ISSUER", enumType.getID());
        assertEquals("ISSUERS_TICKER", enumType.getName());
        assertEquals("ISSUER - Issuer's ticker", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.ISSUE_SIZE_RANGE;
        assertEquals("ISSUESIZE", enumType.getID());
        assertEquals("ISSUE_SIZE_RANGE", enumType.getName());
        assertEquals("ISSUESIZE - issue size range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.LOOKBACK_DAYS;
        assertEquals("LOOKBACK", enumType.getID());
        assertEquals("LOOKBACK_DAYS", enumType.getName());
        assertEquals("LOOKBACK - Lookback Days", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.EXPLICIT_LOT_IDENTIFIER;
        assertEquals("LOT", enumType.getID());
        assertEquals("EXPLICIT_LOT_IDENTIFIER", enumType.getName());
        assertEquals("LOT - Explicit lot identifier", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.LOT_VARIANCE;
        assertEquals("LOTVAR", enumType.getID());
        assertEquals("LOT_VARIANCE", enumType.getName());
        assertEquals("LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MATURITY_YEAR_AND_MONTH;
        assertEquals("MAT", enumType.getID());
        assertEquals("MATURITY_YEAR_AND_MONTH", enumType.getName());
        assertEquals("MAT - Maturity Year And Month", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MATURITY_RANGE;
        assertEquals("MATURITY", enumType.getID());
        assertEquals("MATURITY_RANGE", enumType.getName());
        assertEquals("MATURITY - Maturity range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MAXIMUM_SUBSTITUTIONS_REPO;
        assertEquals("MAXSUBS", enumType.getID());
        assertEquals("MAXIMUM_SUBSTITUTIONS_REPO", enumType.getName());
        assertEquals("MAXSUBS - Maximum substitutions (Repo)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MINIMUM_DENOMINATION;
        assertEquals("MINDNOM", enumType.getID());
        assertEquals("MINIMUM_DENOMINATION", enumType.getName());
        assertEquals("MINDNOM - Minimum denomination", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MINIMUM_INCREMENT;
        assertEquals("MININCR", enumType.getID());
        assertEquals("MINIMUM_INCREMENT", enumType.getName());
        assertEquals("MININCR - Minimum increment", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MINIMUM_QUANTITY;
        assertEquals("MINQTY", enumType.getID());
        assertEquals("MINIMUM_QUANTITY", enumType.getName());
        assertEquals("MINQTY - Minimum quantity", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PAYMENT_FREQUENCY;
        assertEquals("PAYFREQ", enumType.getID());
        assertEquals("PAYMENT_FREQUENCY", enumType.getName());
        assertEquals("PAYFREQ - Payment frequency, calendar", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.NUMBER_OF_PIECES;
        assertEquals("PIECES", enumType.getID());
        assertEquals("NUMBER_OF_PIECES", enumType.getName());
        assertEquals("PIECES - Number Of Pieces", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.POOLS_MAXIMUM;
        assertEquals("PMAX", enumType.getID());
        assertEquals("POOLS_MAXIMUM", enumType.getName());
        assertEquals("PMAX - Pools Maximum", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.POOLS_PER_LOT;
        assertEquals("PPL", enumType.getID());
        assertEquals("POOLS_PER_LOT", enumType.getName());
        assertEquals("PPL - Pools per Lot", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.POOLS_PER_MILLION;
        assertEquals("PPM", enumType.getID());
        assertEquals("POOLS_PER_MILLION", enumType.getName());
        assertEquals("PPM - Pools per Million", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.POOLS_PER_TRADE;
        assertEquals("PPT", enumType.getID());
        assertEquals("POOLS_PER_TRADE", enumType.getName());
        assertEquals("PPT - Pools per Trade", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PRICE_RANGE;
        assertEquals("PRICE", enumType.getID());
        assertEquals("PRICE_RANGE", enumType.getName());
        assertEquals("PRICE - Price Range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PRICING_FREQUENCY;
        assertEquals("PRICEFREQ", enumType.getID());
        assertEquals("PRICING_FREQUENCY", enumType.getName());
        assertEquals("PRICEFREQ - Pricing frequency", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PRODUCTION_YEAR;
        assertEquals("PROD", enumType.getID());
        assertEquals("PRODUCTION_YEAR", enumType.getName());
        assertEquals("PROD - Production Year", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.CALL_PROTECTION;
        assertEquals("PROTECT", enumType.getID());
        assertEquals("CALL_PROTECTION", enumType.getName());
        assertEquals("PROTECT - Call protection", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PURPOSE;
        assertEquals("PURPOSE", enumType.getID());
        assertEquals("PURPOSE", enumType.getName());
        assertEquals("PURPOSE - Purpose", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.BENCHMARK_PRICE_SOURCE;
        assertEquals("PXSOURCE", enumType.getID());
        assertEquals("BENCHMARK_PRICE_SOURCE", enumType.getName());
        assertEquals("PXSOURCE - Benchmark price source", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.RATING_SOURCE_AND_RANGE;
        assertEquals("RATING", enumType.getID());
        assertEquals("RATING_SOURCE_AND_RANGE", enumType.getName());
        assertEquals("RATING - Rating source and range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.TYPE_OF_REDEMPTION;
        assertEquals("REDEMPTION", enumType.getID());
        assertEquals("TYPE_OF_REDEMPTION", enumType.getName());
        assertEquals("REDEMPTION - Type Of Redemption - values are: " +
                "NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.RESTRICTED;
        assertEquals("RESTRICTED", enumType.getID());
        assertEquals("RESTRICTED", enumType.getName());
        assertEquals("RESTRICTED - Restricted (Y/N)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MARKET_SECTOR;
        assertEquals("SECTOR", enumType.getID());
        assertEquals("MARKET_SECTOR", enumType.getName());
        assertEquals("SECTOR - Market Sector", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.SECURITY_TYPE;
        assertEquals("SECTYPE", enumType.getID());
        assertEquals("SECURITY_TYPE", enumType.getName());
        assertEquals("SECTYPE - Security Type included or excluded", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.STRUCTURE;
        assertEquals("STRUCT", enumType.getID());
        assertEquals("STRUCTURE", enumType.getName());
        assertEquals("STRUCT - Structure", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.SUBSTITUTIONS_FREQUENCY_REPO;
        assertEquals("SUBSFREQ", enumType.getID());
        assertEquals("SUBSTITUTIONS_FREQUENCY_REPO", enumType.getName());
        assertEquals("SUBSFREQ - Substitutions frequency (Repo)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.SUBSTITUTIONS_LEFT_REPO;
        assertEquals("SUBSLEFT", enumType.getID());
        assertEquals("SUBSTITUTIONS_LEFT_REPO", enumType.getName());
        assertEquals("SUBSLEFT - Substitutions left (Repo)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.FREEFORM_TEXT;
        assertEquals("TEXT", enumType.getID());
        assertEquals("FREEFORM_TEXT", enumType.getName());
        assertEquals("TEXT - Freeform Text", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.TRADE_VARIANCE;
        assertEquals("TRDVAR", enumType.getID());
        assertEquals("TRADE_VARIANCE", enumType.getName());
        assertEquals("TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_COUPON;
        assertEquals("WAC", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_COUPON", enumType.getName());
        assertEquals("WAC - Weighted Average Coupon - value in percent (exact or range) " +
                "plus (Gross or Net) of servicing spread (the default) " +
                "(ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_LIFE_COUPON;
        assertEquals("WAL", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_LIFE_COUPON", enumType.getName());
        assertEquals("WAL - Weighted Average Life Coupon - value in percent (exact or range)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_LOAN_AGE;
        assertEquals("WALA", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_LOAN_AGE", enumType.getName());
        assertEquals("WALA - Weighted Average Loan Age - value in months (exact or range)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_MATURITY;
        assertEquals("WAM", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_MATURITY", enumType.getName());
        assertEquals("WAM - Weighted Average Maturity - value in months (exact or range)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.WHOLE_POOL;
        assertEquals("WHOLE", enumType.getID());
        assertEquals("WHOLE_POOL", enumType.getName());
        assertEquals("WHOLE - Whole Pool (Y/N)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.YIELD_RANGE;
        assertEquals("YIELD", enumType.getID());
        assertEquals("YIELD_RANGE", enumType.getName());
        assertEquals("YIELD - Yield Range", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  Prepayment Speeds
         */
        enumType = Enum233StipulationType.ABSOLUTE_PREPAYMENT_SPEED;
        assertEquals("ABS", enumType.getID());
        assertEquals("ABSOLUTE_PREPAYMENT_SPEED", enumType.getName());
        assertEquals("ABS - Absolute Prepayment Speed", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_PENALTY;
        assertEquals("CPP", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_PENALTY", enumType.getName());
        assertEquals("CPP - Constant Prepayment Penalty", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_RATE;
        assertEquals("CPR", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_RATE", enumType.getName());
        assertEquals("CPR - Constant Prepayment Rate", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_YIELD;
        assertEquals("CPY", enumType.getID());
        assertEquals("CONSTANT_PREPAYMENT_YIELD", enumType.getName());
        assertEquals("CPY - Constant Prepayment Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.FINAL_CPR_HOME_EQUITY;
        assertEquals("HEP", enumType.getID());
        assertEquals("FINAL_CPR_HOME_EQUITY", enumType.getName());
        assertEquals("HEP - final CPR of Home Equity Prepayment Curve", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MANUFACTURED_HOUSING_PREPAYMENT;
        assertEquals("MHP", enumType.getID());
        assertEquals("MANUFACTURED_HOUSING_PREPAYMENT", enumType.getName());
        assertEquals("MHP - Percent of Manufactured Housing Prepayment Curve", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.MONTHLY_PREPAYMENT_RATE;
        assertEquals("MPR", enumType.getID());
        assertEquals("MONTHLY_PREPAYMENT_RATE", enumType.getName());
        assertEquals("MPR - Monthly Prepayment Rate", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PERCENT_PROSPECTUS_PREPAYMENT;
        assertEquals("PPC", enumType.getID());
        assertEquals("PERCENT_PROSPECTUS_PREPAYMENT", enumType.getName());
        assertEquals("PPC - Percent of Prospectus Prepayment Curve", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.PERCENT_BMA_PREPAYMENT;
        assertEquals("PSA", enumType.getID());
        assertEquals("PERCENT_BMA_PREPAYMENT", enumType.getName());
        assertEquals("PSA - Percent of BMA Prepayment Curve", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum233StipulationType.SINGLE_MONTHLY_MORTALITY;
        assertEquals("SMM", enumType.getID());
        assertEquals("SINGLE_MONTHLY_MORTALITY", enumType.getName());
        assertEquals("SMM - Single Monthly Mortality", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}