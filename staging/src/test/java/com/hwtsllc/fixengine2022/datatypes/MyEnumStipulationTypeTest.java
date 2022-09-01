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
        assertEquals("ALTERNATIVE_MINIMUM_TAX", enumType.toEnumNameString());
        assertEquals("AMT - Alternative Minimum Tax (Y/N)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.AUTO_REINVESTMENT;
        assertEquals("AUTOREINV", enumType.toFIXIDString());
        assertEquals("AUTO_REINVESTMENT", enumType.toEnumNameString());
        assertEquals("AUTOREINV - Auto Reinvestment at <rate> or better", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.BANK_QUALIFIED;
        assertEquals("BANKQUAL", enumType.toFIXIDString());
        assertEquals("BANK_QUALIFIED", enumType.toEnumNameString());
        assertEquals("BANKQUAL - Bank qualified (Y/N)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.BARGAIN_CONDITIONS;
        assertEquals("BGNCON", enumType.toFIXIDString());
        assertEquals("BARGAIN_CONDITIONS", enumType.toEnumNameString());
        assertEquals("BGNCON - Bargain conditions (see StipulationValue (234) for values)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.COUPON_RANGE;
        assertEquals("COUPON", enumType.toFIXIDString());
        assertEquals("COUPON_RANGE", enumType.toEnumNameString());
        assertEquals("COUPON - Coupon range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.ISO_CURRENCY_CODE;
        assertEquals("CURRENCY", enumType.toFIXIDString());
        assertEquals("ISO_CURRENCY_CODE", enumType.toEnumNameString());
        assertEquals("CURRENCY - ISO Currency Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.CUSTOM_START_END_DATE;
        assertEquals("CUSTOMDATE", enumType.toFIXIDString());
        assertEquals("CUSTOM_START_END_DATE", enumType.toEnumNameString());
        assertEquals("CUSTOMDATE - Custom start/end date", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE;
        assertEquals("GEOG", enumType.toFIXIDString());
        assertEquals("GEOGRAPHIC_AND_PERCENT_RANGE", enumType.toEnumNameString());
        assertEquals("GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.VALUATION_DISCOUNT;
        assertEquals("HAIRCUT", enumType.toFIXIDString());
        assertEquals("VALUATION_DISCOUNT", enumType.toEnumNameString());
        assertEquals("HAIRCUT - Valuation Discount", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.INSURED;
        assertEquals("INSURED", enumType.toFIXIDString());
        assertEquals("INSURED", enumType.toEnumNameString());
        assertEquals("INSURED - Insured (Y/N)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE;
        assertEquals("ISSUE", enumType.toFIXIDString());
        assertEquals("YEAR_OR_YEAR_MONTH_OF_ISSUE", enumType.toEnumNameString());
        assertEquals("ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.ISSUERS_TICKER;
        assertEquals("ISSUER", enumType.toFIXIDString());
        assertEquals("ISSUERS_TICKER", enumType.toEnumNameString());
        assertEquals("ISSUER - Issuer's ticker", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.ISSUE_SIZE_RANGE;
        assertEquals("ISSUESIZE", enumType.toFIXIDString());
        assertEquals("ISSUE_SIZE_RANGE", enumType.toEnumNameString());
        assertEquals("ISSUESIZE - issue size range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.LOOKBACK_DAYS;
        assertEquals("LOOKBACK", enumType.toFIXIDString());
        assertEquals("LOOKBACK_DAYS", enumType.toEnumNameString());
        assertEquals("LOOKBACK - Lookback Days", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER;
        assertEquals("LOT", enumType.toFIXIDString());
        assertEquals("EXPLICIT_LOT_IDENTIFIER", enumType.toEnumNameString());
        assertEquals("LOT - Explicit lot identifier", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.LOT_VARIANCE;
        assertEquals("LOTVAR", enumType.toFIXIDString());
        assertEquals("LOT_VARIANCE", enumType.toEnumNameString());
        assertEquals("LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MATURITY_YEAR_AND_MONTH;
        assertEquals("MAT", enumType.toFIXIDString());
        assertEquals("MATURITY_YEAR_AND_MONTH", enumType.toEnumNameString());
        assertEquals("MAT - Maturity Year And Month", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MATURITY_RANGE;
        assertEquals("MATURITY", enumType.toFIXIDString());
        assertEquals("MATURITY_RANGE", enumType.toEnumNameString());
        assertEquals("MATURITY - Maturity range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO;
        assertEquals("MAXSUBS", enumType.toFIXIDString());
        assertEquals("MAXIMUM_SUBSTITUTIONS_REPO", enumType.toEnumNameString());
        assertEquals("MAXSUBS - Maximum substitutions (Repo)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MINIMUM_DENOMINATION;
        assertEquals("MINDNOM", enumType.toFIXIDString());
        assertEquals("MINIMUM_DENOMINATION", enumType.toEnumNameString());
        assertEquals("MINDNOM - Minimum denomination", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.MINIMUM_INCREMENT;
        assertEquals("MININCR", enumType.toFIXIDString());
        assertEquals("MINIMUM_INCREMENT", enumType.toEnumNameString());
        assertEquals("MININCR - Minimum increment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MINIMUM_QUANTITY;
        assertEquals("MINQTY", enumType.toFIXIDString());
        assertEquals("MINIMUM_QUANTITY", enumType.toEnumNameString());
        assertEquals("MINQTY - Minimum quantity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PAYMENT_FREQUENCY;
        assertEquals("PAYFREQ", enumType.toFIXIDString());
        assertEquals("PAYMENT_FREQUENCY", enumType.toEnumNameString());
        assertEquals("PAYFREQ - Payment frequency, calendar", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.NUMBER_OF_PIECES;
        assertEquals("PIECES", enumType.toFIXIDString());
        assertEquals("NUMBER_OF_PIECES", enumType.toEnumNameString());
        assertEquals("PIECES - Number Of Pieces", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.POOLS_MAXIMUM;
        assertEquals("PMAX", enumType.toFIXIDString());
        assertEquals("POOLS_MAXIMUM", enumType.toEnumNameString());
        assertEquals("PMAX - Pools Maximum", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.POOLS_PER_LOT;
        assertEquals("PPL", enumType.toFIXIDString());
        assertEquals("POOLS_PER_LOT", enumType.toEnumNameString());
        assertEquals("PPL - Pools per Lot", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.POOLS_PER_MILLION;
        assertEquals("PPM", enumType.toFIXIDString());
        assertEquals("POOLS_PER_MILLION", enumType.toEnumNameString());
        assertEquals("PPM - Pools per Million", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.POOLS_PER_TRADE;
        assertEquals("PPT", enumType.toFIXIDString());
        assertEquals("POOLS_PER_TRADE", enumType.toEnumNameString());
        assertEquals("PPT - Pools per Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PRICE_RANGE;
        assertEquals("PRICE", enumType.toFIXIDString());
        assertEquals("PRICE_RANGE", enumType.toEnumNameString());
        assertEquals("PRICE - Price Range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PRICING_FREQUENCY;
        assertEquals("PRICEFREQ", enumType.toFIXIDString());
        assertEquals("PRICING_FREQUENCY", enumType.toEnumNameString());
        assertEquals("PRICEFREQ - Pricing frequency", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.PRODUCTION_YEAR;
        assertEquals("PROD", enumType.toFIXIDString());
        assertEquals("PRODUCTION_YEAR", enumType.toEnumNameString());
        assertEquals("PROD - Production Year", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.CALL_PROTECTION;
        assertEquals("PROTECT", enumType.toFIXIDString());
        assertEquals("CALL_PROTECTION", enumType.toEnumNameString());
        assertEquals("PROTECT - Call protection", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PURPOSE;
        assertEquals("PURPOSE", enumType.toFIXIDString());
        assertEquals("PURPOSE", enumType.toEnumNameString());
        assertEquals("PURPOSE - Purpose", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.BENCHMARK_PRICE_SOURCE;
        assertEquals("PXSOURCE", enumType.toFIXIDString());
        assertEquals("BENCHMARK_PRICE_SOURCE", enumType.toEnumNameString());
        assertEquals("PXSOURCE - Benchmark price source", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.RATING_SOURCE_AND_RANGE;
        assertEquals("RATING", enumType.toFIXIDString());
        assertEquals("RATING_SOURCE_AND_RANGE", enumType.toEnumNameString());
        assertEquals("RATING - Rating source and range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.TYPE_OF_REDEMPTION;
        assertEquals("REDEMPTION", enumType.toFIXIDString());
        assertEquals("TYPE_OF_REDEMPTION", enumType.toEnumNameString());
        assertEquals("REDEMPTION - Type Of Redemption - values are: " +
                "NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.RESTRICTED;
        assertEquals("RESTRICTED", enumType.toFIXIDString());
        assertEquals("RESTRICTED", enumType.toEnumNameString());
        assertEquals("RESTRICTED - Restricted (Y/N)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MARKET_SECTOR;
        assertEquals("SECTOR", enumType.toFIXIDString());
        assertEquals("MARKET_SECTOR", enumType.toEnumNameString());
        assertEquals("SECTOR - Market Sector", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.SECURITY_TYPE;
        assertEquals("SECTYPE", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPE", enumType.toEnumNameString());
        assertEquals("SECTYPE - Security Type included or excluded", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.STRUCTURE;
        assertEquals("STRUCT", enumType.toFIXIDString());
        assertEquals("STRUCTURE", enumType.toEnumNameString());
        assertEquals("STRUCT - Structure", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO;
        assertEquals("SUBSFREQ", enumType.toFIXIDString());
        assertEquals("SUBSTITUTIONS_FREQUENCY_REPO", enumType.toEnumNameString());
        assertEquals("SUBSFREQ - Substitutions frequency (Repo)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO;
        assertEquals("SUBSLEFT", enumType.toFIXIDString());
        assertEquals("SUBSTITUTIONS_LEFT_REPO", enumType.toEnumNameString());
        assertEquals("SUBSLEFT - Substitutions left (Repo)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.FREEFORM_TEXT;
        assertEquals("TEXT", enumType.toFIXIDString());
        assertEquals("FREEFORM_TEXT", enumType.toEnumNameString());
        assertEquals("TEXT - Freeform Text", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.TRADE_VARIANCE;
        assertEquals("TRDVAR", enumType.toFIXIDString());
        assertEquals("TRADE_VARIANCE", enumType.toEnumNameString());
        assertEquals("TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON;
        assertEquals("WAC", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_COUPON", enumType.toEnumNameString());
        assertEquals("WAC - Weighted Average Coupon - value in percent (exact or range) " +
                "plus (Gross or Net) of servicing spread (the default) " +
                "(ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON;
        assertEquals("WAL", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_LIFE_COUPON", enumType.toEnumNameString());
        assertEquals("WAL - Weighted Average Life Coupon - value in percent (exact or range)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE;
        assertEquals("WALA", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_LOAN_AGE", enumType.toEnumNameString());
        assertEquals("WALA - Weighted Average Loan Age - value in months (exact or range)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY;
        assertEquals("WAM", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_MATURITY", enumType.toEnumNameString());
        assertEquals("WAM - Weighted Average Maturity - value in months (exact or range)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.WHOLE_POOL;
        assertEquals("WHOLE", enumType.toFIXIDString());
        assertEquals("WHOLE_POOL", enumType.toEnumNameString());
        assertEquals("WHOLE - Whole Pool (Y/N)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.YIELD_RANGE;
        assertEquals("YIELD", enumType.toFIXIDString());
        assertEquals("YIELD_RANGE", enumType.toEnumNameString());
        assertEquals("YIELD - Yield Range", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  Prepayment Speeds
         */
        enumType = MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED;
        assertEquals("ABS", enumType.toFIXIDString());
        assertEquals("ABSOLUTE_PREPAYMENT_SPEED", enumType.toEnumNameString());
        assertEquals("ABS - Absolute Prepayment Speed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY;
        assertEquals("CPP", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_PENALTY", enumType.toEnumNameString());
        assertEquals("CPP - Constant Prepayment Penalty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE;
        assertEquals("CPR", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_RATE", enumType.toEnumNameString());
        assertEquals("CPR - Constant Prepayment Rate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD;
        assertEquals("CPY", enumType.toFIXIDString());
        assertEquals("CONSTANT_PREPAYMENT_YIELD", enumType.toEnumNameString());
        assertEquals("CPY - Constant Prepayment Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.FINAL_CPR_HOME_EQUITY;
        assertEquals("HEP", enumType.toFIXIDString());
        assertEquals("FINAL_CPR_HOME_EQUITY", enumType.toEnumNameString());
        assertEquals("HEP - final CPR of Home Equity Prepayment Curve", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT;
        assertEquals("MHP", enumType.toFIXIDString());
        assertEquals("MANUFACTURED_HOUSING_PREPAYMENT", enumType.toEnumNameString());
        assertEquals("MHP - Percent of Manufactured Housing Prepayment Curve", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE;
        assertEquals("MPR", enumType.toFIXIDString());
        assertEquals("MONTHLY_PREPAYMENT_RATE", enumType.toEnumNameString());
        assertEquals("MPR - Monthly Prepayment Rate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT;
        assertEquals("PPC", enumType.toFIXIDString());
        assertEquals("PERCENT_PROSPECTUS_PREPAYMENT", enumType.toEnumNameString());
        assertEquals("PPC - Percent of Prospectus Prepayment Curve", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.PERCENT_BMA_PREPAYMENT;
        assertEquals("PSA", enumType.toFIXIDString());
        assertEquals("PERCENT_BMA_PREPAYMENT", enumType.toEnumNameString());
        assertEquals("PSA - Percent of BMA Prepayment Curve", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY;
        assertEquals("SMM", enumType.toFIXIDString());
        assertEquals("SINGLE_MONTHLY_MORTALITY", enumType.toEnumNameString());
        assertEquals("SMM - Single Monthly Mortality", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}