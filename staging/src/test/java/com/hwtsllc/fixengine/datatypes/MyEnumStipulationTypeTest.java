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
 *  <p>    SUBSFREQ - Substitutions frequency (Repo)
 *  <p>    SUBSLEFT - Substitutions left (Repo)
 *  <p>    TEXT - Freeform Text
 *  <p>    TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *  <p>    WAC - Weighted Average Coupon - value in percent (exact or range)
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
    @Test
    void Enum0233Test() {
        MyEnumStipulationType enumType;

        /*
         *  233 StipulationType
         */
        enumType = MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX;
        assertEquals("AMT", enumType.toFIXIDString());
        assertEquals("ALTERNATIVE_MINIMUM_TAX", enumType.toFIXNameString());
        assertEquals("AMT - Alternative Minimum Tax (Y/N)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.AUTO_REINVESTMENT;
        assertEquals("AUTOREINV", enumType.toFIXIDString());
        assertEquals("AUTO_REINVESTMENT", enumType.toFIXNameString());
        assertEquals("AUTOREINV - Auto Reinvestment at <rate> or better", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.BANK_QUALIFIED;
        assertEquals("BANKQUAL", enumType.toFIXIDString());
        assertEquals("BANK_QUALIFIED", enumType.toFIXNameString());
        assertEquals("BANKQUAL - Bank qualified (Y/N)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.BARGAIN_CONDITIONS;
        assertEquals("BGNCON", enumType.toFIXIDString());
        assertEquals("BARGAIN_CONDITIONS", enumType.toFIXNameString());
        assertEquals("BGNCON - Bargain conditions (see StipulationValue (234) for values)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.COUPON_RANGE;
        assertEquals("COUPON", enumType.toFIXIDString());
        assertEquals("COUPON_RANGE", enumType.toFIXNameString());
        assertEquals("COUPON - Coupon range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.ISO_CURRENCY_CODE;
        assertEquals("CURRENCY", enumType.toFIXIDString());
        assertEquals("ISO_CURRENCY_CODE", enumType.toFIXNameString());
        assertEquals("CURRENCY - ISO Currency Code", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.CUSTOM_START_END_DATE;
        assertEquals("CUSTOMDATE", enumType.toFIXIDString());
        assertEquals("CUSTOM_START_END_DATE", enumType.toFIXNameString());
        assertEquals("CUSTOMDATE - Custom start/end date", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE;
        assertEquals("GEOG", enumType.toFIXIDString());
        assertEquals("GEOGRAPHIC_AND_PERCENT_RANGE", enumType.toFIXNameString());
        assertEquals("GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.VALUATION_DISCOUNT;
        assertEquals("HAIRCUT", enumType.toFIXIDString());
        assertEquals("VALUATION_DISCOUNT", enumType.toFIXNameString());
        assertEquals("HAIRCUT - Valuation Discount", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.INSURED;
        assertEquals("INSURED", enumType.toFIXIDString());
        assertEquals("INSURED", enumType.toFIXNameString());
        assertEquals("INSURED - Insured (Y/N)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE;
        assertEquals("ISSUE", enumType.toFIXIDString());
        assertEquals("YEAR_OR_YEAR_MONTH_OF_ISSUE", enumType.toFIXNameString());
        assertEquals("ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.ISSUERS_TICKER;
        assertEquals("ISSUER", enumType.toFIXIDString());
        assertEquals("ISSUERS_TICKER", enumType.toFIXNameString());
        assertEquals("ISSUER - Issuer's ticker", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.ISSUE_SIZE_RANGE;
        assertEquals("ISSUESIZE", enumType.toFIXIDString());
        assertEquals("ISSUE_SIZE_RANGE", enumType.toFIXNameString());
        assertEquals("ISSUESIZE - issue size range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.LOOKBACK_DAYS;
        assertEquals("LOOKBACK", enumType.toFIXIDString());
        assertEquals("LOOKBACK_DAYS", enumType.toFIXNameString());
        assertEquals("LOOKBACK - Lookback Days", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER;
        assertEquals("LOT", enumType.toFIXIDString());
        assertEquals("EXPLICIT_LOT_IDENTIFIER", enumType.toFIXNameString());
        assertEquals("LOT - Explicit lot identifier", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.LOT_VARIANCE;
        assertEquals("LOTVAR", enumType.toFIXIDString());
        assertEquals("LOT_VARIANCE", enumType.toFIXNameString());
        assertEquals("LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MATURITY_YEAR_AND_MONTH;
        assertEquals("MAT", enumType.toFIXIDString());
        assertEquals("MATURITY_YEAR_AND_MONTH", enumType.toFIXNameString());
        assertEquals("MAT - Maturity Year And Month", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MATURITY_RANGE;
        assertEquals("MATURITY", enumType.toFIXIDString());
        assertEquals("MATURITY_RANGE", enumType.toFIXNameString());
        assertEquals("MATURITY - Maturity range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO;
        assertEquals("MAXSUBS", enumType.toFIXIDString());
        assertEquals("MAXIMUM_SUBSTITUTIONS_REPO", enumType.toFIXNameString());
        assertEquals("MAXSUBS - Maximum substitutions (Repo)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MINIMUM_DENOMINATION;
        assertEquals("MINDNOM", enumType.toFIXIDString());
        assertEquals("MINIMUM_DENOMINATION", enumType.toFIXNameString());
        assertEquals("MINDNOM - Minimum denomination", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.MINIMUM_INCREMENT;
        assertEquals("MININCR", enumType.toFIXIDString());
        assertEquals("MINIMUM_INCREMENT", enumType.toFIXNameString());
        assertEquals("MININCR - Minimum increment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MINIMUM_QUANTITY;
        assertEquals("MINQTY", enumType.toFIXIDString());
        assertEquals("MINIMUM_QUANTITY", enumType.toFIXNameString());
        assertEquals("MINQTY - Minimum quantity", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PAYMENT_FREQUENCY;
        assertEquals("PAYFREQ", enumType.toFIXIDString());
        assertEquals("PAYMENT_FREQUENCY", enumType.toFIXNameString());
        assertEquals("PAYFREQ - Payment frequency, calendar", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.NUMBER_OF_PIECES;
        assertEquals("PIECES", enumType.toFIXIDString());
        assertEquals("NUMBER_OF_PIECES", enumType.toFIXNameString());
        assertEquals("PIECES - Number Of Pieces", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.POOLS_MAXIMUM;
        assertEquals("PMAX", enumType.toFIXIDString());
        assertEquals("POOLS_MAXIMUM", enumType.toFIXNameString());
        assertEquals("PMAX - Pools Maximum", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.POOLS_PER_LOT;
        assertEquals("PPL", enumType.toFIXIDString());
        assertEquals("POOLS_PER_LOT", enumType.toFIXNameString());
        assertEquals("PPL - Pools per Lot", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.POOLS_PER_MILLION;
        assertEquals("PPM", enumType.toFIXIDString());
        assertEquals("POOLS_PER_MILLION", enumType.toFIXNameString());
        assertEquals("PPM - Pools per Million", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.POOLS_PER_TRADE;
        assertEquals("PPT", enumType.toFIXIDString());
        assertEquals("POOLS_PER_TRADE", enumType.toFIXNameString());
        assertEquals("PPT - Pools per Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PRICE_RANGE;
        assertEquals("PRICE", enumType.toFIXIDString());
        assertEquals("PRICE_RANGE", enumType.toFIXNameString());
        assertEquals("PRICE - Price Range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PRICING_FREQUENCY;
        assertEquals("PRICEFREQ", enumType.toFIXIDString());
        assertEquals("PRICING_FREQUENCY", enumType.toFIXNameString());
        assertEquals("PRICEFREQ - Pricing frequency", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.PRODUCTION_YEAR;
        assertEquals("PROD", enumType.toFIXIDString());
        assertEquals("PRODUCTION_YEAR", enumType.toFIXNameString());
        assertEquals("PROD - Production Year", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.CALL_PROTECTION;
        assertEquals("PROTECT", enumType.toFIXIDString());
        assertEquals("CALL_PROTECTION", enumType.toFIXNameString());
        assertEquals("PROTECT - Call protection", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PURPOSE;
        assertEquals("PURPOSE", enumType.toFIXIDString());
        assertEquals("PURPOSE", enumType.toFIXNameString());
        assertEquals("PURPOSE - Purpose", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.BENCHMARK_PRICE_SOURCE;
        assertEquals("PXSOURCE", enumType.toFIXIDString());
        assertEquals("BENCHMARK_PRICE_SOURCE", enumType.toFIXNameString());
        assertEquals("PXSOURCE - Benchmark price source", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.RATING_SOURCE_AND_RANGE;
        assertEquals("RATING", enumType.toFIXIDString());
        assertEquals("RATING_SOURCE_AND_RANGE", enumType.toFIXNameString());
        assertEquals("RATING - Rating source and range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.TYPE_OF_REDEMPTION;
        assertEquals("REDEMPTION", enumType.toFIXIDString());
        assertEquals("TYPE_OF_REDEMPTION", enumType.toFIXNameString());
        assertEquals("REDEMPTION - Type Of Redemption - values are: " +
                "NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.RESTRICTED;
        assertEquals("RESTRICTED", enumType.toFIXIDString());
        assertEquals("RESTRICTED", enumType.toFIXNameString());
        assertEquals("RESTRICTED - Restricted (Y/N)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MARKET_SECTOR;
        assertEquals("SECTOR", enumType.toFIXIDString());
        assertEquals("MARKET_SECTOR", enumType.toFIXNameString());
        assertEquals("SECTOR - Market Sector", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.SECURITY_TYPE;
        assertEquals("SECTYPE", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPE", enumType.toFIXNameString());
        assertEquals("SECTYPE - Security Type included or excluded", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.STRUCTURE;
        assertEquals("STRUCT", enumType.toFIXIDString());
        assertEquals("STRUCTURE", enumType.toFIXNameString());
        assertEquals("STRUCT - Structure", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO;
        assertEquals("SUBSFREQ", enumType.toFIXIDString());
        assertEquals("SUBSTITUTIONS_FREQUENCY_REPO", enumType.toFIXNameString());
        assertEquals("SUBSFREQ - Substitutions frequency (Repo)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO;
        assertEquals("SUBSLEFT", enumType.toFIXIDString());
        assertEquals("SUBSTITUTIONS_LEFT_REPO", enumType.toFIXNameString());
        assertEquals("SUBSLEFT - Substitutions left (Repo)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.FREEFORM_TEXT;
        assertEquals("TEXT", enumType.toFIXIDString());
        assertEquals("FREEFORM_TEXT", enumType.toFIXNameString());
        assertEquals("TEXT - Freeform Text", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.TRADE_VARIANCE;
        assertEquals("TRDVAR", enumType.toFIXIDString());
        assertEquals("TRADE_VARIANCE", enumType.toFIXNameString());
        assertEquals("TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON;
        assertEquals("WAC", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_COUPON", enumType.toFIXNameString());
        assertEquals("WAC - Weighted Average Coupon - value in percent (exact or range) " +
                "plus (Gross or Net) of servicing spread (the default) " +
                "(ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON;
        assertEquals("WAL", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_LIFE_COUPON", enumType.toFIXNameString());
        assertEquals("WAL - Weighted Average Life Coupon - value in percent (exact or range)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE;
        assertEquals("WALA", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_LOAN_AGE", enumType.toFIXNameString());
        assertEquals("WALA - Weighted Average Loan Age - value in months (exact or range)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY;
        assertEquals("WAM", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_MATURITY", enumType.toFIXNameString());
        assertEquals("WAM - Weighted Average Maturity - value in months (exact or range)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.WHOLE_POOL;
        assertEquals("WHOLE", enumType.toFIXIDString());
        assertEquals("WHOLE_POOL", enumType.toFIXNameString());
        assertEquals("WHOLE - Whole Pool (Y/N)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.YIELD_RANGE;
        assertEquals("YIELD", enumType.toFIXIDString());
        assertEquals("YIELD_RANGE", enumType.toFIXNameString());
        assertEquals("YIELD - Yield Range", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  Prepayment Speeds
         */
        enumType = MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED;
        assertEquals("ABS", enumType.toFIXIDString());
        assertEquals("ABSOLUTE_PREPAYMENT_SPEED", enumType.toFIXNameString());
        assertEquals("ABS - Absolute Prepayment Speed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY;
        assertEquals("CPP", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_PENALTY", enumType.toFIXNameString());
        assertEquals("CPP - Constant Prepayment Penalty", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE;
        assertEquals("CPR", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_RATE", enumType.toFIXNameString());
        assertEquals("CPR - Constant Prepayment Rate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD;
        assertEquals("CPY", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_YIELD", enumType.toFIXNameString());
        assertEquals("CPY - Constant Prepayment Yield", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.FINAL_CPR_HOME_EQUITY;
        assertEquals("HEP", enumType.toFIXIDString());
        assertEquals("FINAL_CPR_HOME_EQUITY", enumType.toFIXNameString());
        assertEquals("HEP - final CPR of Home Equity Prepayment Curve", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT;
        assertEquals("MHP", enumType.toFIXIDString());
        assertEquals("MANUFACTURED_HOUSING_PREPAYMENT", enumType.toFIXNameString());
        assertEquals("MHP - Percent of Manufactured Housing Prepayment Curve", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE;
        assertEquals("MPR", enumType.toFIXIDString());
        assertEquals("MONTHLY_PREPAYMENT_RATE", enumType.toFIXNameString());
        assertEquals("MPR - Monthly Prepayment Rate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT;
        assertEquals("PPC", enumType.toFIXIDString());
        assertEquals("PERCENT_PROSPECTUS_PREPAYMENT", enumType.toFIXNameString());
        assertEquals("PPC - Percent of Prospectus Prepayment Curve", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.PERCENT_BMA_PREPAYMENT;
        assertEquals("PSA", enumType.toFIXIDString());
        assertEquals("PERCENT_BMA_PREPAYMENT", enumType.toFIXNameString());
        assertEquals("PSA - Percent of BMA Prepayment Curve", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY;
        assertEquals("SMM", enumType.toFIXIDString());
        assertEquals("SINGLE_MONTHLY_MORTALITY", enumType.toFIXNameString());
        assertEquals("SMM - Single Monthly Mortality", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}