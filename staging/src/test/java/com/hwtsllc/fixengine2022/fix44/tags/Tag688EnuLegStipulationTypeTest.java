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
import com.hwtsllc.fixengine2022.fix44.enums.Enum688LegStipulationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag688EnuLegStipulationTypeTest {
    @Test
    void FIX0688Test() {
        FIX44 fixData = FIX44.FIX688_ENU_LEG_STIPULATION_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    @Test
    void Tag0688Test() {
        Tag688EnuLegStipulationType tagData;

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.ALTERNATIVE_MINIMUM_TAX);
        assertEquals( Enum688LegStipulationType.ALTERNATIVE_MINIMUM_TAX.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.AUTO_REINVESTMENT);
        assertEquals( Enum688LegStipulationType.AUTO_REINVESTMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.BANK_QUALIFIED);
        assertEquals( Enum688LegStipulationType.BANK_QUALIFIED.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.BARGAIN_CONDITIONS);
        assertEquals( Enum688LegStipulationType.BARGAIN_CONDITIONS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.COUPON_RANGE);
        assertEquals( Enum688LegStipulationType.COUPON_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.ISO_CURRENCY_CODE);
        assertEquals( Enum688LegStipulationType.ISO_CURRENCY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.CUSTOM_START_END_DATE);
        assertEquals( Enum688LegStipulationType.CUSTOM_START_END_DATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( Enum688LegStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.VALUATION_DISCOUNT);
        assertEquals( Enum688LegStipulationType.VALUATION_DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.INSURED);
        assertEquals( Enum688LegStipulationType.INSURED.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( Enum688LegStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.ISSUERS_TICKER);
        assertEquals( Enum688LegStipulationType.ISSUERS_TICKER.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( Enum688LegStipulationType.ISSUE_SIZE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.LOOKBACK_DAYS);
        assertEquals( Enum688LegStipulationType.LOOKBACK_DAYS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( Enum688LegStipulationType.EXPLICIT_LOT_IDENTIFIER.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.LOT_VARIANCE);
        assertEquals( Enum688LegStipulationType.LOT_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( Enum688LegStipulationType.MATURITY_YEAR_AND_MONTH.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MATURITY_RANGE);
        assertEquals( Enum688LegStipulationType.MATURITY_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( Enum688LegStipulationType.MAXIMUM_SUBSTITUTIONS_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MINIMUM_DENOMINATION);
        assertEquals( Enum688LegStipulationType.MINIMUM_DENOMINATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MINIMUM_INCREMENT);
        assertEquals( Enum688LegStipulationType.MINIMUM_INCREMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MINIMUM_QUANTITY);
        assertEquals( Enum688LegStipulationType.MINIMUM_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PAYMENT_FREQUENCY);
        assertEquals( Enum688LegStipulationType.PAYMENT_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.NUMBER_OF_PIECES);
        assertEquals( Enum688LegStipulationType.NUMBER_OF_PIECES.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.POOLS_MAXIMUM);
        assertEquals( Enum688LegStipulationType.POOLS_MAXIMUM.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.POOLS_PER_LOT);
        assertEquals( Enum688LegStipulationType.POOLS_PER_LOT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.POOLS_PER_MILLION);
        assertEquals( Enum688LegStipulationType.POOLS_PER_MILLION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.POOLS_PER_TRADE);
        assertEquals( Enum688LegStipulationType.POOLS_PER_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PRICE_RANGE);
        assertEquals( Enum688LegStipulationType.PRICE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PRICING_FREQUENCY);
        assertEquals( Enum688LegStipulationType.PRICING_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PRODUCTION_YEAR);
        assertEquals( Enum688LegStipulationType.PRODUCTION_YEAR.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.CALL_PROTECTION);
        assertEquals( Enum688LegStipulationType.CALL_PROTECTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PURPOSE);
        assertEquals( Enum688LegStipulationType.PURPOSE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( Enum688LegStipulationType.BENCHMARK_PRICE_SOURCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( Enum688LegStipulationType.RATING_SOURCE_AND_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( Enum688LegStipulationType.TYPE_OF_REDEMPTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.RESTRICTED);
        assertEquals( Enum688LegStipulationType.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MARKET_SECTOR);
        assertEquals( Enum688LegStipulationType.MARKET_SECTOR.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.SECURITY_TYPE);
        assertEquals( Enum688LegStipulationType.SECURITY_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.STRUCTURE);
        assertEquals( Enum688LegStipulationType.STRUCTURE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( Enum688LegStipulationType.SUBSTITUTIONS_FREQUENCY_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( Enum688LegStipulationType.SUBSTITUTIONS_LEFT_REPO.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.FREEFORM_TEXT);
        assertEquals( Enum688LegStipulationType.FREEFORM_TEXT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.TRADE_VARIANCE);
        assertEquals( Enum688LegStipulationType.TRADE_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( Enum688LegStipulationType.WEIGHTED_AVERAGE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( Enum688LegStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( Enum688LegStipulationType.WEIGHTED_AVERAGE_LOAN_AGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( Enum688LegStipulationType.WEIGHTED_AVERAGE_MATURITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.WHOLE_POOL);
        assertEquals( Enum688LegStipulationType.WHOLE_POOL.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.YIELD_RANGE);
        assertEquals( Enum688LegStipulationType.YIELD_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  Prepayment Speeds
         */
        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( Enum688LegStipulationType.ABSOLUTE_PREPAYMENT_SPEED.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( Enum688LegStipulationType.CONSTANT_PREPAYMENT_PENALTY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( Enum688LegStipulationType.CONSTANT_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( Enum688LegStipulationType.CONSTANT_PREPAYMENT_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( Enum688LegStipulationType.FINAL_CPR_HOME_EQUITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( Enum688LegStipulationType.MANUFACTURED_HOUSING_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( Enum688LegStipulationType.MONTHLY_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( Enum688LegStipulationType.PERCENT_PROSPECTUS_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( Enum688LegStipulationType.PERCENT_BMA_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(Enum688LegStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( Enum688LegStipulationType.SINGLE_MONTHLY_MORTALITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}