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
import com.hwtsllc.fixengine2022.fix42.enums.Enum233StipulationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag233EnuStipulationTypeTest {
    @Test
    void FIX0233Test() {
        FIX42 fixData = FIX42.FIX233_ENU_STIPULATION_TYPE;
        assertEquals( "233", fixData.getID());
        assertEquals( "STIPULATION_TYPE", fixData.getName());
        assertEquals( "StipulationType", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0233Test() {
        Tag233EnuStipulationType tagData;

        /**
         *  233 StipulationType
         */
        tagData = new Tag233EnuStipulationType(Enum233StipulationType.ALTERNATIVE_MINIMUM_TAX);
        assertEquals( Enum233StipulationType.ALTERNATIVE_MINIMUM_TAX.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.AUTO_REINVESTMENT);
        assertEquals( Enum233StipulationType.AUTO_REINVESTMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.BANK_QUALIFIED);
        assertEquals( Enum233StipulationType.BANK_QUALIFIED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.BARGAIN_CONDITIONS);
        assertEquals( Enum233StipulationType.BARGAIN_CONDITIONS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.COUPON_RANGE);
        assertEquals( Enum233StipulationType.COUPON_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.ISO_CURRENCY_CODE);
        assertEquals( Enum233StipulationType.ISO_CURRENCY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.CUSTOM_START_END_DATE);
        assertEquals( Enum233StipulationType.CUSTOM_START_END_DATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( Enum233StipulationType.GEOGRAPHIC_AND_PERCENT_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.VALUATION_DISCOUNT);
        assertEquals( Enum233StipulationType.VALUATION_DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.INSURED);
        assertEquals( Enum233StipulationType.INSURED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( Enum233StipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.ISSUERS_TICKER);
        assertEquals( Enum233StipulationType.ISSUERS_TICKER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.ISSUE_SIZE_RANGE);
        assertEquals( Enum233StipulationType.ISSUE_SIZE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.LOOKBACK_DAYS);
        assertEquals( Enum233StipulationType.LOOKBACK_DAYS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( Enum233StipulationType.EXPLICIT_LOT_IDENTIFIER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.LOT_VARIANCE);
        assertEquals( Enum233StipulationType.LOT_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( Enum233StipulationType.MATURITY_YEAR_AND_MONTH.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MATURITY_RANGE);
        assertEquals( Enum233StipulationType.MATURITY_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( Enum233StipulationType.MAXIMUM_SUBSTITUTIONS_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MINIMUM_DENOMINATION);
        assertEquals( Enum233StipulationType.MINIMUM_DENOMINATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MINIMUM_INCREMENT);
        assertEquals( Enum233StipulationType.MINIMUM_INCREMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MINIMUM_QUANTITY);
        assertEquals( Enum233StipulationType.MINIMUM_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PAYMENT_FREQUENCY);
        assertEquals( Enum233StipulationType.PAYMENT_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.NUMBER_OF_PIECES);
        assertEquals( Enum233StipulationType.NUMBER_OF_PIECES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.POOLS_MAXIMUM);
        assertEquals( Enum233StipulationType.POOLS_MAXIMUM.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.POOLS_PER_LOT);
        assertEquals( Enum233StipulationType.POOLS_PER_LOT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.POOLS_PER_MILLION);
        assertEquals( Enum233StipulationType.POOLS_PER_MILLION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.POOLS_PER_TRADE);
        assertEquals( Enum233StipulationType.POOLS_PER_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PRICE_RANGE);
        assertEquals( Enum233StipulationType.PRICE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PRICING_FREQUENCY);
        assertEquals( Enum233StipulationType.PRICING_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PRODUCTION_YEAR);
        assertEquals( Enum233StipulationType.PRODUCTION_YEAR.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.CALL_PROTECTION);
        assertEquals( Enum233StipulationType.CALL_PROTECTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PURPOSE);
        assertEquals( Enum233StipulationType.PURPOSE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( Enum233StipulationType.BENCHMARK_PRICE_SOURCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( Enum233StipulationType.RATING_SOURCE_AND_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.TYPE_OF_REDEMPTION);
        assertEquals( Enum233StipulationType.TYPE_OF_REDEMPTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.RESTRICTED);
        assertEquals( Enum233StipulationType.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MARKET_SECTOR);
        assertEquals( Enum233StipulationType.MARKET_SECTOR.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.SECURITY_TYPE);
        assertEquals( Enum233StipulationType.SECURITY_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.STRUCTURE);
        assertEquals( Enum233StipulationType.STRUCTURE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( Enum233StipulationType.SUBSTITUTIONS_FREQUENCY_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( Enum233StipulationType.SUBSTITUTIONS_LEFT_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.FREEFORM_TEXT);
        assertEquals( Enum233StipulationType.FREEFORM_TEXT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.TRADE_VARIANCE);
        assertEquals( Enum233StipulationType.TRADE_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( Enum233StipulationType.WEIGHTED_AVERAGE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( Enum233StipulationType.WEIGHTED_AVERAGE_LIFE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( Enum233StipulationType.WEIGHTED_AVERAGE_LOAN_AGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( Enum233StipulationType.WEIGHTED_AVERAGE_MATURITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.WHOLE_POOL);
        assertEquals( Enum233StipulationType.WHOLE_POOL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.YIELD_RANGE);
        assertEquals( Enum233StipulationType.YIELD_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         *  Prepayment Speeds
         */
        tagData = new Tag233EnuStipulationType(Enum233StipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( Enum233StipulationType.ABSOLUTE_PREPAYMENT_SPEED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( Enum233StipulationType.CONSTANT_PREPAYMENT_PENALTY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( Enum233StipulationType.CONSTANT_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( Enum233StipulationType.CONSTANT_PREPAYMENT_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( Enum233StipulationType.FINAL_CPR_HOME_EQUITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( Enum233StipulationType.MANUFACTURED_HOUSING_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( Enum233StipulationType.MONTHLY_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( Enum233StipulationType.PERCENT_PROSPECTUS_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( Enum233StipulationType.PERCENT_BMA_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(Enum233StipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( Enum233StipulationType.SINGLE_MONTHLY_MORTALITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}