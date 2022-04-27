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

class Enum235YieldTypeTest {
    @Test
    void Enum0235Test() {
        Enum235YieldType enumType;

        /**
         * various yield types
         */
        enumType = Enum235YieldType.AFTERTAX;
        assertEquals("AFTERTAX", enumType.getID());
        assertEquals("AFTERTAX", enumType.getName());
        assertEquals("AFTERTAX - After Tax Yield (Municipals)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.ANNUAL;
        assertEquals("ANNUAL", enumType.getID());
        assertEquals("ANNUAL", enumType.getName());
        assertEquals("ANNUAL - Annual Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.ATISSUE;
        assertEquals("ATISSUE", enumType.getID());
        assertEquals("ATISSUE", enumType.getName());
        assertEquals("ATISSUE - Yield At Issue (Municipals)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.AVGMATURITY;
        assertEquals("AVGMATURITY", enumType.getID());
        assertEquals("AVGMATURITY", enumType.getName());
        assertEquals("AVGMATURITY - Yield To Avg Maturity", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.BOOK;
        assertEquals("BOOK", enumType.getID());
        assertEquals("BOOK", enumType.getName());
        assertEquals("BOOK - Book Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.CALL;
        assertEquals("CALL", enumType.getID());
        assertEquals("CALL", enumType.getName());
        assertEquals("CALL - Yield to Next Call", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.CHANGE;
        assertEquals("CHANGE", enumType.getID());
        assertEquals("CHANGE", enumType.getName());
        assertEquals("CHANGE - Yield Change Since Close", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.CLOSE;
        assertEquals("CLOSE", enumType.getID());
        assertEquals("CLOSE", enumType.getName());
        assertEquals("CLOSE - Closing Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.COMPOUND;
        assertEquals("COMPOUND", enumType.getID());
        assertEquals("COMPOUND", enumType.getName());
        assertEquals("COMPOUND - Compound Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.CURRENT;
        assertEquals("CURRENT", enumType.getID());
        assertEquals("CURRENT", enumType.getName());
        assertEquals("CURRENT - Current Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.GOVTEQUIV;
        assertEquals("GOVTEQUIV", enumType.getID());
        assertEquals("GOVTEQUIV", enumType.getName());
        assertEquals("GOVTEQUIV - Gvnt Equivalent Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.GROSS;
        assertEquals("GROSS", enumType.getID());
        assertEquals("GROSS", enumType.getName());
        assertEquals("GROSS - True Gross Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.INFLATION;
        assertEquals("INFLATION", enumType.getID());
        assertEquals("INFLATION", enumType.getName());
        assertEquals("INFLATION - Yield with Inflation Assumption", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.INVERSEFLOATER;
        assertEquals("INVERSEFLOATER", enumType.getID());
        assertEquals("INVERSEFLOATER", enumType.getName());
        assertEquals("INVERSEFLOATER - Inverse Floater Bond Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.LASTCLOSE;
        assertEquals("LASTCLOSE", enumType.getID());
        assertEquals("LASTCLOSE", enumType.getName());
        assertEquals("LASTCLOSE - Most Recent Closing Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.LASTMONTH;
        assertEquals("LASTMONTH", enumType.getID());
        assertEquals("LASTMONTH", enumType.getName());
        assertEquals("LASTMONTH - Closing Yield Most Recent Month", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.LASTQUARTER;
        assertEquals("LASTQUARTER", enumType.getID());
        assertEquals("LASTQUARTER", enumType.getName());
        assertEquals("LASTQUARTER - Closing Yield Most Recent Quarter", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.LASTYEAR;
        assertEquals("LASTYEAR", enumType.getID());
        assertEquals("LASTYEAR", enumType.getName());
        assertEquals("LASTYEAR - Closing Yield Most Recent Year", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.LONGAVGLIFE;
        assertEquals("LONGAVGLIFE", enumType.getID());
        assertEquals("LONGAVGLIFE", enumType.getName());
        assertEquals("LONGAVGLIFE - Yield to Longest Average Life", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.MARK;
        assertEquals("MARK", enumType.getID());
        assertEquals("MARK", enumType.getName());
        assertEquals("MARK - Mark to Market Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.MATURITY;
        assertEquals("MATURITY", enumType.getID());
        assertEquals("MATURITY", enumType.getName());
        assertEquals("MATURITY - Yield to Maturity", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.NEXTREFUND;
        assertEquals("NEXTREFUND", enumType.getID());
        assertEquals("NEXTREFUND", enumType.getName());
        assertEquals("NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.OPENAVG;
        assertEquals("OPENAVG", enumType.getID());
        assertEquals("OPENAVG", enumType.getName());
        assertEquals("OPENAVG - Open Average Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.PREVCLOSE;
        assertEquals("PREVCLOSE", enumType.getID());
        assertEquals("PREVCLOSE", enumType.getName());
        assertEquals("PREVCLOSE - Previous Close Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.PROCEEDS;
        assertEquals("PROCEEDS", enumType.getID());
        assertEquals("PROCEEDS", enumType.getName());
        assertEquals("PROCEEDS - Proceeds Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.PUT;
        assertEquals("PUT", enumType.getID());
        assertEquals("PUT", enumType.getName());
        assertEquals("PUT - Yield to Next Put", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.SEMIANNUAL;
        assertEquals("SEMIANNUAL", enumType.getID());
        assertEquals("SEMIANNUAL", enumType.getName());
        assertEquals("SEMIANNUAL - Semi-annual Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.SHORTAVGLIFE;
        assertEquals("SHORTAVGLIFE", enumType.getID());
        assertEquals("SHORTAVGLIFE", enumType.getName());
        assertEquals("SHORTAVGLIFE - Yield to Shortest Average Life", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.SIMPLE;
        assertEquals("SIMPLE", enumType.getID());
        assertEquals("SIMPLE", enumType.getName());
        assertEquals("SIMPLE - Simple Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.TAXEQUIV;
        assertEquals("TAXEQUIV", enumType.getID());
        assertEquals("TAXEQUIV", enumType.getName());
        assertEquals("TAXEQUIV - Tax Equivalent Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.TENDER;
        assertEquals("TENDER", enumType.getID());
        assertEquals("TENDER", enumType.getName());
        assertEquals("TENDER - Yield to Tender Date", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.TRUE;
        assertEquals("TRUE", enumType.getID());
        assertEquals("TRUE", enumType.getName());
        assertEquals("TRUE - True Yield", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.VALUE1_32;
        assertEquals("VALUE1_32", enumType.getID());
        assertEquals("VALUE1_32", enumType.getName());
        assertEquals("VALUE1_32 - Yield Value Of 1/32", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum235YieldType.WORST;
        assertEquals("WORST", enumType.getID());
        assertEquals("WORST", enumType.getName());
        assertEquals("WORST - Yield To Worst", enumType.getDescription());
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