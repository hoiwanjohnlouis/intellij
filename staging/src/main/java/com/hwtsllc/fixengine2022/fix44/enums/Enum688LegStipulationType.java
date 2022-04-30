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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
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
public enum Enum688LegStipulationType implements EnumAccessors, LogStringVerbose {
    /*
     *  233 StipulationType
     */
    ALTERNATIVE_MINIMUM_TAX( "AMT", "ALTERNATIVE_MINIMUM_TAX",
            "AMT - Alternative Minimum Tax (Y/N)" ),
    AUTO_REINVESTMENT( "AUTOREINV", "AUTO_REINVESTMENT",
            "AUTOREINV - Auto Reinvestment at <rate> or better" ),
    BANK_QUALIFIED( "BANKQUAL", "BANK_QUALIFIED",
            "BANKQUAL - Bank qualified (Y/N)" ),
    BARGAIN_CONDITIONS( "BGNCON", "BARGAIN_CONDITIONS",
            "BGNCON - Bargain conditions (see StipulationValue (234) for values)" ),
    COUPON_RANGE( "COUPON", "COUPON_RANGE",
            "COUPON - Coupon range" ),

    ISO_CURRENCY_CODE( "CURRENCY", "ISO_CURRENCY_CODE",
            "CURRENCY - ISO Currency Code" ),
    CUSTOM_START_END_DATE( "CUSTOMDATE", "CUSTOM_START_END_DATE",
            "CUSTOMDATE - Custom start/end date" ),
    GEOGRAPHIC_AND_PERCENT_RANGE( "GEOG", "GEOGRAPHIC_AND_PERCENT_RANGE",
            "GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])" ),
    VALUATION_DISCOUNT( "HAIRCUT", "VALUATION_DISCOUNT",
            "HAIRCUT - Valuation Discount" ),
    INSURED( "INSURED", "INSURED",
            "INSURED - Insured (Y/N)" ),

    YEAR_OR_YEAR_MONTH_OF_ISSUE( "ISSUE", "YEAR_OR_YEAR_MONTH_OF_ISSUE",
            "ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)" ),
    ISSUERS_TICKER( "ISSUER", "ISSUERS_TICKER",
            "ISSUER - Issuer's ticker" ),
    ISSUE_SIZE_RANGE( "ISSUESIZE", "ISSUE_SIZE_RANGE",
            "ISSUESIZE - issue size range" ),
    LOOKBACK_DAYS( "LOOKBACK", "LOOKBACK_DAYS",
            "LOOKBACK - Lookback Days" ),
    EXPLICIT_LOT_IDENTIFIER( "LOT", "EXPLICIT_LOT_IDENTIFIER",
            "LOT - Explicit lot identifier" ),

    LOT_VARIANCE( "LOTVAR", "LOT_VARIANCE",
            "LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)" ),
    MATURITY_YEAR_AND_MONTH( "MAT", "MATURITY_YEAR_AND_MONTH",
            "MAT - Maturity Year And Month" ),
    MATURITY_RANGE( "MATURITY", "MATURITY_RANGE",
            "MATURITY - Maturity range" ),
    MAXIMUM_SUBSTITUTIONS_REPO( "MAXSUBS", "MAXIMUM_SUBSTITUTIONS_REPO",
            "MAXSUBS - Maximum substitutions (Repo)" ),
    MINIMUM_DENOMINATION( "MINDNOM", "MINIMUM_DENOMINATION",
            "MINDNOM - Minimum denomination" ),

    MINIMUM_INCREMENT( "MININCR", "MINIMUM_INCREMENT",
            "MININCR - Minimum increment" ),
    MINIMUM_QUANTITY( "MINQTY", "MINIMUM_QUANTITY",
            "MINQTY - Minimum quantity" ),
    PAYMENT_FREQUENCY( "PAYFREQ", "PAYMENT_FREQUENCY",
            "PAYFREQ - Payment frequency, calendar" ),
    NUMBER_OF_PIECES( "PIECES", "NUMBER_OF_PIECES",
            "PIECES - Number Of Pieces" ),
    POOLS_MAXIMUM( "PMAX", "POOLS_MAXIMUM",
            "PMAX - Pools Maximum" ),

    POOLS_PER_LOT( "PPL", "POOLS_PER_LOT", "PPL - Pools per Lot" ),
    POOLS_PER_MILLION( "PPM", "POOLS_PER_MILLION", "PPM - Pools per Million" ),
    POOLS_PER_TRADE( "PPT", "POOLS_PER_TRADE", "PPT - Pools per Trade" ),
    PRICE_RANGE( "PRICE", "PRICE_RANGE", "PRICE - Price Range" ),
    PRICING_FREQUENCY( "PRICEFREQ", "PRICING_FREQUENCY", "PRICEFREQ - Pricing frequency" ),

    PRODUCTION_YEAR( "PROD", "PRODUCTION_YEAR",
            "PROD - Production Year" ),
    CALL_PROTECTION( "PROTECT", "CALL_PROTECTION",
            "PROTECT - Call protection" ),
    PURPOSE( "PURPOSE", "PURPOSE",
            "PURPOSE - Purpose" ),
    BENCHMARK_PRICE_SOURCE( "PXSOURCE", "BENCHMARK_PRICE_SOURCE",
            "PXSOURCE - Benchmark price source" ),
    RATING_SOURCE_AND_RANGE( "RATING", "RATING_SOURCE_AND_RANGE",
            "RATING - Rating source and range" ),

    TYPE_OF_REDEMPTION( "REDEMPTION", "TYPE_OF_REDEMPTION",
            "REDEMPTION - Type Of Redemption - values are: " +
                    "NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible" ),
    RESTRICTED( "RESTRICTED", "RESTRICTED",
            "RESTRICTED - Restricted (Y/N)" ),
    MARKET_SECTOR( "SECTOR", "MARKET_SECTOR",
            "SECTOR - Market Sector" ),
    SECURITY_TYPE( "SECTYPE", "SECURITY_TYPE",
            "SECTYPE - Security Type included or excluded" ),
    STRUCTURE( "STRUCT", "STRUCTURE",
            "STRUCT - Structure" ),

    SUBSTITUTIONS_FREQUENCY_REPO( "SUBSFREQ", "SUBSTITUTIONS_FREQUENCY_REPO",
            "SUBSFREQ - Substitutions frequency (Repo)" ),
    SUBSTITUTIONS_LEFT_REPO( "SUBSLEFT", "SUBSTITUTIONS_LEFT_REPO",
            "SUBSLEFT - Substitutions left (Repo)" ),
    FREEFORM_TEXT( "TEXT", "FREEFORM_TEXT",
            "TEXT - Freeform Text" ),
    TRADE_VARIANCE( "TRDVAR", "TRADE_VARIANCE",
            "TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)" ),
    WEIGHTED_AVERAGE_COUPON( "WAC", "WEIGHTED_AVERAGE_COUPON",
            "WAC - Weighted Average Coupon - value in percent (exact or range) plus (Gross or Net) of " +
                    "servicing spread (the default) (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])" ),

    WEIGHTED_AVERAGE_LIFE_COUPON( "WAL", "WEIGHTED_AVERAGE_LIFE_COUPON",
            "WAL - Weighted Average Life Coupon - value in percent (exact or range)" ),
    WEIGHTED_AVERAGE_LOAN_AGE( "WALA", "WEIGHTED_AVERAGE_LOAN_AGE",
            "WALA - Weighted Average Loan Age - value in months (exact or range)" ),
    WEIGHTED_AVERAGE_MATURITY( "WAM", "WEIGHTED_AVERAGE_MATURITY",
            "WAM - Weighted Average Maturity - value in months (exact or range)" ),
    WHOLE_POOL( "WHOLE", "WHOLE_POOL",
            "WHOLE - Whole Pool (Y/N)" ),
    YIELD_RANGE( "YIELD", "YIELD_RANGE",
            "YIELD - Yield Range" ),

    /*
     *  Prepayment Speeds
     */
    ABSOLUTE_PREPAYMENT_SPEED( "ABS", "ABSOLUTE_PREPAYMENT_SPEED",
            "ABS - Absolute Prepayment Speed" ),
    CONSTANT_PREPAYMENT_PENALTY( "CPP", "CONSTANT_PREPAYMENT_PENALTY",
            "CPP - Constant Prepayment Penalty" ),
    CONSTANT_PREPAYMENT_RATE( "CPR", "CONSTANT_PREPAYMENT_RATE",
            "CPR - Constant Prepayment Rate" ),
    CONSTANT_PREPAYMENT_YIELD( "CPY", "CONSTANT_PREPAYMENT_YIELD",
            "CPY - Constant Prepayment Yield" ),
    FINAL_CPR_HOME_EQUITY( "HEP", "FINAL_CPR_HOME_EQUITY",
            "HEP - final CPR of Home Equity Prepayment Curve" ),

    MANUFACTURED_HOUSING_PREPAYMENT( "MHP", "MANUFACTURED_HOUSING_PREPAYMENT",
            "MHP - Percent of Manufactured Housing Prepayment Curve" ),
    MONTHLY_PREPAYMENT_RATE( "MPR", "MONTHLY_PREPAYMENT_RATE",
            "MPR - Monthly Prepayment Rate" ),
    PERCENT_PROSPECTUS_PREPAYMENT( "PPC", "PERCENT_PROSPECTUS_PREPAYMENT",
            "PPC - Percent of Prospectus Prepayment Curve" ),
    PERCENT_BMA_PREPAYMENT( "PSA", "PERCENT_BMA_PREPAYMENT",
            "PSA - Percent of BMA Prepayment Curve" ),
    SINGLE_MONTHLY_MORTALITY( "SMM", "SINGLE_MONTHLY_MORTALITY",
            "SMM - Single Monthly Mortality" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum688LegStipulationType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum688LegStipulationType oneEnum : Enum688LegStipulationType.values()) {
            System.out.println(oneEnum);
        }
    }
}
