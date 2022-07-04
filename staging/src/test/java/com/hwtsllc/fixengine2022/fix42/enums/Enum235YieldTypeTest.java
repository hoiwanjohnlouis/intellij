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
        assertEquals("AFTERTAX", enumType.toEnumIDString());
        assertEquals("AFTERTAX", enumType.toEnumNameString());
        assertEquals("AFTERTAX - After Tax Yield (Municipals)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.ANNUAL;
        assertEquals("ANNUAL", enumType.toEnumIDString());
        assertEquals("ANNUAL", enumType.toEnumNameString());
        assertEquals("ANNUAL - Annual Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.ATISSUE;
        assertEquals("ATISSUE", enumType.toEnumIDString());
        assertEquals("ATISSUE", enumType.toEnumNameString());
        assertEquals("ATISSUE - Yield At Issue (Municipals)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.AVGMATURITY;
        assertEquals("AVGMATURITY", enumType.toEnumIDString());
        assertEquals("AVGMATURITY", enumType.toEnumNameString());
        assertEquals("AVGMATURITY - Yield To Avg Maturity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.BOOK;
        assertEquals("BOOK", enumType.toEnumIDString());
        assertEquals("BOOK", enumType.toEnumNameString());
        assertEquals("BOOK - Book Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CALL;
        assertEquals("CALL", enumType.toEnumIDString());
        assertEquals("CALL", enumType.toEnumNameString());
        assertEquals("CALL - Yield to Next Call", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CHANGE;
        assertEquals("CHANGE", enumType.toEnumIDString());
        assertEquals("CHANGE", enumType.toEnumNameString());
        assertEquals("CHANGE - Yield Change Since Close", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CLOSE;
        assertEquals("CLOSE", enumType.toEnumIDString());
        assertEquals("CLOSE", enumType.toEnumNameString());
        assertEquals("CLOSE - Closing Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.COMPOUND;
        assertEquals("COMPOUND", enumType.toEnumIDString());
        assertEquals("COMPOUND", enumType.toEnumNameString());
        assertEquals("COMPOUND - Compound Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.CURRENT;
        assertEquals("CURRENT", enumType.toEnumIDString());
        assertEquals("CURRENT", enumType.toEnumNameString());
        assertEquals("CURRENT - Current Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.GOVTEQUIV;
        assertEquals("GOVTEQUIV", enumType.toEnumIDString());
        assertEquals("GOVTEQUIV", enumType.toEnumNameString());
        assertEquals("GOVTEQUIV - Gvnt Equivalent Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.GROSS;
        assertEquals("GROSS", enumType.toEnumIDString());
        assertEquals("GROSS", enumType.toEnumNameString());
        assertEquals("GROSS - True Gross Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.INFLATION;
        assertEquals("INFLATION", enumType.toEnumIDString());
        assertEquals("INFLATION", enumType.toEnumNameString());
        assertEquals("INFLATION - Yield with Inflation Assumption", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.INVERSEFLOATER;
        assertEquals("INVERSEFLOATER", enumType.toEnumIDString());
        assertEquals("INVERSEFLOATER", enumType.toEnumNameString());
        assertEquals("INVERSEFLOATER - Inverse Floater Bond Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTCLOSE;
        assertEquals("LASTCLOSE", enumType.toEnumIDString());
        assertEquals("LASTCLOSE", enumType.toEnumNameString());
        assertEquals("LASTCLOSE - Most Recent Closing Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTMONTH;
        assertEquals("LASTMONTH", enumType.toEnumIDString());
        assertEquals("LASTMONTH", enumType.toEnumNameString());
        assertEquals("LASTMONTH - Closing Yield Most Recent Month", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTQUARTER;
        assertEquals("LASTQUARTER", enumType.toEnumIDString());
        assertEquals("LASTQUARTER", enumType.toEnumNameString());
        assertEquals("LASTQUARTER - Closing Yield Most Recent Quarter", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LASTYEAR;
        assertEquals("LASTYEAR", enumType.toEnumIDString());
        assertEquals("LASTYEAR", enumType.toEnumNameString());
        assertEquals("LASTYEAR - Closing Yield Most Recent Year", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.LONGAVGLIFE;
        assertEquals("LONGAVGLIFE", enumType.toEnumIDString());
        assertEquals("LONGAVGLIFE", enumType.toEnumNameString());
        assertEquals("LONGAVGLIFE - Yield to Longest Average Life", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.MARK;
        assertEquals("MARK", enumType.toEnumIDString());
        assertEquals("MARK", enumType.toEnumNameString());
        assertEquals("MARK - Mark to Market Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.MATURITY;
        assertEquals("MATURITY", enumType.toEnumIDString());
        assertEquals("MATURITY", enumType.toEnumNameString());
        assertEquals("MATURITY - Yield to Maturity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.NEXTREFUND;
        assertEquals("NEXTREFUND", enumType.toEnumIDString());
        assertEquals("NEXTREFUND", enumType.toEnumNameString());
        assertEquals("NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.OPENAVG;
        assertEquals("OPENAVG", enumType.toEnumIDString());
        assertEquals("OPENAVG", enumType.toEnumNameString());
        assertEquals("OPENAVG - Open Average Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PREVCLOSE;
        assertEquals("PREVCLOSE", enumType.toEnumIDString());
        assertEquals("PREVCLOSE", enumType.toEnumNameString());
        assertEquals("PREVCLOSE - Previous Close Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PROCEEDS;
        assertEquals("PROCEEDS", enumType.toEnumIDString());
        assertEquals("PROCEEDS", enumType.toEnumNameString());
        assertEquals("PROCEEDS - Proceeds Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.PUT;
        assertEquals("PUT", enumType.toEnumIDString());
        assertEquals("PUT", enumType.toEnumNameString());
        assertEquals("PUT - Yield to Next Put", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SEMIANNUAL;
        assertEquals("SEMIANNUAL", enumType.toEnumIDString());
        assertEquals("SEMIANNUAL", enumType.toEnumNameString());
        assertEquals("SEMIANNUAL - Semi-annual Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SHORTAVGLIFE;
        assertEquals("SHORTAVGLIFE", enumType.toEnumIDString());
        assertEquals("SHORTAVGLIFE", enumType.toEnumNameString());
        assertEquals("SHORTAVGLIFE - Yield to Shortest Average Life", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.SIMPLE;
        assertEquals("SIMPLE", enumType.toEnumIDString());
        assertEquals("SIMPLE", enumType.toEnumNameString());
        assertEquals("SIMPLE - Simple Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TAXEQUIV;
        assertEquals("TAXEQUIV", enumType.toEnumIDString());
        assertEquals("TAXEQUIV", enumType.toEnumNameString());
        assertEquals("TAXEQUIV - Tax Equivalent Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TENDER;
        assertEquals("TENDER", enumType.toEnumIDString());
        assertEquals("TENDER", enumType.toEnumNameString());
        assertEquals("TENDER - Yield to Tender Date", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.TRUE;
        assertEquals("TRUE", enumType.toEnumIDString());
        assertEquals("TRUE", enumType.toEnumNameString());
        assertEquals("TRUE - True Yield", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.VALUE1_32;
        assertEquals("VALUE1_32", enumType.toEnumIDString());
        assertEquals("VALUE1_32", enumType.toEnumNameString());
        assertEquals("VALUE1_32 - Yield Value Of 1/32", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum235YieldType.WORST;
        assertEquals("WORST", enumType.toEnumIDString());
        assertEquals("WORST", enumType.toEnumNameString());
        assertEquals("WORST - Yield To Worst", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
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