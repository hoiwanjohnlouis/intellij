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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  235
 *  YieldType
 *  String
 *  <p>
 *  Type of yield. (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  Valid values:
 *  <p>    "AFTERTAX - After Tax Yield (Municipals)"
 *  <p>    "ANNUAL - Annual Yield"
 *  <p>    "ATISSUE - Yield At Issue (Municipals)"
 *  <p>    "AVGMATURITY - Yield To Avg Maturity"
 *  <p>    "BOOK - Book Yield"
 *  <p></p>
 *  <p>    "CALL - Yield to Next Call"
 *  <p>    "CHANGE - Yield Change Since Close"
 *  <p>    "CLOSE - Closing Yield"
 *  <p>    "COMPOUND - Compound Yield"
 *  <p>    "CURRENT - Current Yield"
 *  <p></p>
 *  <p>    "GOVTEQUIV - Gvnt Equivalent Yield"
 *  <p>    "GROSS - True Gross Yield"
 *  <p>    "INFLATION - Yield with Inflation Assumption"
 *  <p>    "INVERSEFLOATER - Inverse Floater Bond Yield"
 *  <p>    "LASTCLOSE - Most Recent Closing Yield"
 *  <p></p>
 *  <p>    "LASTMONTH - Closing Yield Most Recent Month"
 *  <p>    "LASTQUARTER - Closing Yield Most Recent Quarter"
 *  <p>    "LASTYEAR - Closing Yield Most Recent Year"
 *  <p>    "LONGAVGLIFE - Yield to Longest Average Life"
 *  <p>    "MARK - Mark to Market Yield"
 *  <p></p>
 *  <p>    "MATURITY - Yield to Maturity"
 *  <p>    "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)"
 *  <p>    "OPENAVG - Open Average Yield"
 *  <p>    "PREVCLOSE - Previous Close Yield"
 *  <p>    "PROCEEDS - Proceeds Yield"
 *  <p></p>
 *  <p>    "PUT - Yield to Next Put"
 *  <p>    "SEMIANNUAL - Semi-annual Yield"
 *  <p>    "SHORTAVGLIFE - Yield to Shortest Average Life"
 *  <p>    "SIMPLE - Simple Yield"
 *  <p>    "TAXEQUIV - Tax Equivalent Yield"
 *  <p></p>
 *  <p>    "TENDER - Yield to Tender Date"
 *  <p>    "TRUE - True Yield"
 *  <p>    "VALUE1_32 - Yield Value Of 1/32"
 *  <p>    "WORST - Yield To Worst"
 */
class Enum235YieldTypeTest {
    @Test
    void Enum0235Test() {
        Enum235YieldType enumType;

        /*
         * 235
         * YieldType
         * various yield types
         */
        enumType = Enum235YieldType.AFTERTAX;
        assertEquals("AFTERTAX", enumType.toFIXIDString());
        assertEquals("AFTERTAX", enumType.toFIXNameString());
        assertEquals("AFTERTAX - After Tax Yield (Municipals)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.ANNUAL;
        assertEquals("ANNUAL", enumType.toFIXIDString());
        assertEquals("ANNUAL", enumType.toFIXNameString());
        assertEquals("ANNUAL - Annual Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.ATISSUE;
        assertEquals("ATISSUE", enumType.toFIXIDString());
        assertEquals("ATISSUE", enumType.toFIXNameString());
        assertEquals("ATISSUE - Yield At Issue (Municipals)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.AVGMATURITY;
        assertEquals("AVGMATURITY", enumType.toFIXIDString());
        assertEquals("AVGMATURITY", enumType.toFIXNameString());
        assertEquals("AVGMATURITY - Yield To Avg Maturity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.BOOK;
        assertEquals("BOOK", enumType.toFIXIDString());
        assertEquals("BOOK", enumType.toFIXNameString());
        assertEquals("BOOK - Book Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CALL;
        assertEquals("CALL", enumType.toFIXIDString());
        assertEquals("CALL", enumType.toFIXNameString());
        assertEquals("CALL - Yield to Next Call", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CHANGE;
        assertEquals("CHANGE", enumType.toFIXIDString());
        assertEquals("CHANGE", enumType.toFIXNameString());
        assertEquals("CHANGE - Yield Change Since Close", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CLOSE;
        assertEquals("CLOSE", enumType.toFIXIDString());
        assertEquals("CLOSE", enumType.toFIXNameString());
        assertEquals("CLOSE - Closing Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.COMPOUND;
        assertEquals("COMPOUND", enumType.toFIXIDString());
        assertEquals("COMPOUND", enumType.toFIXNameString());
        assertEquals("COMPOUND - Compound Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CURRENT;
        assertEquals("CURRENT", enumType.toFIXIDString());
        assertEquals("CURRENT", enumType.toFIXNameString());
        assertEquals("CURRENT - Current Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.GOVTEQUIV;
        assertEquals("GOVTEQUIV", enumType.toFIXIDString());
        assertEquals("GOVTEQUIV", enumType.toFIXNameString());
        assertEquals("GOVTEQUIV - Gvnt Equivalent Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.GROSS;
        assertEquals("GROSS", enumType.toFIXIDString());
        assertEquals("GROSS", enumType.toFIXNameString());
        assertEquals("GROSS - True Gross Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.INFLATION;
        assertEquals("INFLATION", enumType.toFIXIDString());
        assertEquals("INFLATION", enumType.toFIXNameString());
        assertEquals("INFLATION - Yield with Inflation Assumption", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.INVERSEFLOATER;
        assertEquals("INVERSEFLOATER", enumType.toFIXIDString());
        assertEquals("INVERSEFLOATER", enumType.toFIXNameString());
        assertEquals("INVERSEFLOATER - Inverse Floater Bond Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTCLOSE;
        assertEquals("LASTCLOSE", enumType.toFIXIDString());
        assertEquals("LASTCLOSE", enumType.toFIXNameString());
        assertEquals("LASTCLOSE - Most Recent Closing Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTMONTH;
        assertEquals("LASTMONTH", enumType.toFIXIDString());
        assertEquals("LASTMONTH", enumType.toFIXNameString());
        assertEquals("LASTMONTH - Closing Yield Most Recent Month", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTQUARTER;
        assertEquals("LASTQUARTER", enumType.toFIXIDString());
        assertEquals("LASTQUARTER", enumType.toFIXNameString());
        assertEquals("LASTQUARTER - Closing Yield Most Recent Quarter", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTYEAR;
        assertEquals("LASTYEAR", enumType.toFIXIDString());
        assertEquals("LASTYEAR", enumType.toFIXNameString());
        assertEquals("LASTYEAR - Closing Yield Most Recent Year", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LONGAVGLIFE;
        assertEquals("LONGAVGLIFE", enumType.toFIXIDString());
        assertEquals("LONGAVGLIFE", enumType.toFIXNameString());
        assertEquals("LONGAVGLIFE - Yield to Longest Average Life", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.MARK;
        assertEquals("MARK", enumType.toFIXIDString());
        assertEquals("MARK", enumType.toFIXNameString());
        assertEquals("MARK - Mark to Market Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.MATURITY;
        assertEquals("MATURITY", enumType.toFIXIDString());
        assertEquals("MATURITY", enumType.toFIXNameString());
        assertEquals("MATURITY - Yield to Maturity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.NEXTREFUND;
        assertEquals("NEXTREFUND", enumType.toFIXIDString());
        assertEquals("NEXTREFUND", enumType.toFIXNameString());
        assertEquals("NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.OPENAVG;
        assertEquals("OPENAVG", enumType.toFIXIDString());
        assertEquals("OPENAVG", enumType.toFIXNameString());
        assertEquals("OPENAVG - Open Average Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PREVCLOSE;
        assertEquals("PREVCLOSE", enumType.toFIXIDString());
        assertEquals("PREVCLOSE", enumType.toFIXNameString());
        assertEquals("PREVCLOSE - Previous Close Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PROCEEDS;
        assertEquals("PROCEEDS", enumType.toFIXIDString());
        assertEquals("PROCEEDS", enumType.toFIXNameString());
        assertEquals("PROCEEDS - Proceeds Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PUT;
        assertEquals("PUT", enumType.toFIXIDString());
        assertEquals("PUT", enumType.toFIXNameString());
        assertEquals("PUT - Yield to Next Put", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SEMIANNUAL;
        assertEquals("SEMIANNUAL", enumType.toFIXIDString());
        assertEquals("SEMIANNUAL", enumType.toFIXNameString());
        assertEquals("SEMIANNUAL - Semi-annual Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SHORTAVGLIFE;
        assertEquals("SHORTAVGLIFE", enumType.toFIXIDString());
        assertEquals("SHORTAVGLIFE", enumType.toFIXNameString());
        assertEquals("SHORTAVGLIFE - Yield to Shortest Average Life", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SIMPLE;
        assertEquals("SIMPLE", enumType.toFIXIDString());
        assertEquals("SIMPLE", enumType.toFIXNameString());
        assertEquals("SIMPLE - Simple Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TAXEQUIV;
        assertEquals("TAXEQUIV", enumType.toFIXIDString());
        assertEquals("TAXEQUIV", enumType.toFIXNameString());
        assertEquals("TAXEQUIV - Tax Equivalent Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TENDER;
        assertEquals("TENDER", enumType.toFIXIDString());
        assertEquals("TENDER", enumType.toFIXNameString());
        assertEquals("TENDER - Yield to Tender Date", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TRUE;
        assertEquals("TRUE", enumType.toFIXIDString());
        assertEquals("TRUE", enumType.toFIXNameString());
        assertEquals("TRUE - True Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.VALUE1_32;
        assertEquals("VALUE1_32", enumType.toFIXIDString());
        assertEquals("VALUE1_32", enumType.toFIXNameString());
        assertEquals("VALUE1_32 - Yield Value Of 1/32", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.WORST;
        assertEquals("WORST", enumType.toFIXIDString());
        assertEquals("WORST", enumType.toFIXNameString());
        assertEquals("WORST - Yield To Worst", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}