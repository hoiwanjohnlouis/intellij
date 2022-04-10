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

class Enum292CorporateActionTest {
    @Test
    void Enum0292Test() {
        Enum292CorporateAction enumType;

        /*
         * A-V msg types
         */
        enumType = Enum292CorporateAction.EX_DIVIDEND;
        assertEquals( "A", enumType.getID());
        assertEquals( "EX_DIVIDEND", enumType.getName());
        assertEquals( "A - Ex-Dividend", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.EX_DISTRIBUTION;
        assertEquals( "B", enumType.getID());
        assertEquals( "EX_DISTRIBUTION", enumType.getName());
        assertEquals( "B - Ex-Distribution", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.EX_RIGHTS;
        assertEquals( "C", enumType.getID());
        assertEquals( "EX_RIGHTS", enumType.getName());
        assertEquals( "C - Ex-Rights", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.NEW;
        assertEquals( "D", enumType.getID());
        assertEquals( "NEW", enumType.getName());
        assertEquals( "D - New", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.EX_INTEREST;
        assertEquals( "E", enumType.getID());
        assertEquals( "EX_INTEREST", enumType.getName());
        assertEquals( "E - Ex-Interest", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.CASH_DIVIDEND;
        assertEquals( "F", enumType.getID());
        assertEquals( "CASH_DIVIDEND", enumType.getName());
        assertEquals( "F - Cash Dividend", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.STOCK_DIVIDEND;
        assertEquals( "G", enumType.getID());
        assertEquals( "STOCK_DIVIDEND", enumType.getName());
        assertEquals( "G - Stock Dividend", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT;
        assertEquals( "H", enumType.getID());
        assertEquals( "NON_INTEGER_STOCK_SPLIT", enumType.getName());
        assertEquals( "H - Non-Integer Stock Split", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.REVERSE_STOCK_SPLIT;
        assertEquals( "I", enumType.getID());
        assertEquals( "REVERSE_STOCK_SPLIT", enumType.getName());
        assertEquals( "I - Reverse Stock Split", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT;
        assertEquals( "J", enumType.getID());
        assertEquals( "STANDARD_INTEGER_STOCK_SPLIT", enumType.getName());
        assertEquals( "J - Standard-Integer Stock Split", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.POSITION_CONSOLIDATION;
        assertEquals( "K", enumType.getID());
        assertEquals( "POSITION_CONSOLIDATION", enumType.getName());
        assertEquals( "K - Position Consolidation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.LIQUIDATION_REORGANIZATION;
        assertEquals( "L", enumType.getID());
        assertEquals( "LIQUIDATION_REORGANIZATION", enumType.getName());
        assertEquals( "L - Liquidation Reorganization", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.MERGER_REORGANIZATION;
        assertEquals( "M", enumType.getID());
        assertEquals( "MERGER_REORGANIZATION", enumType.getName());
        assertEquals( "M - Merger Reorganization", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.RIGHTS_OFFERING;
        assertEquals( "N", enumType.getID());
        assertEquals( "RIGHTS_OFFERING", enumType.getName());
        assertEquals( "N - Rights Offering", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.SHAREHOLDER_MEETING;
        assertEquals( "O", enumType.getID());
        assertEquals( "SHAREHOLDER_MEETING", enumType.getName());
        assertEquals( "O - Shareholder Meeting", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.SPINOFF;
        assertEquals( "P", enumType.getID());
        assertEquals( "SPINOFF", enumType.getName());
        assertEquals( "P - Spinoff", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.TENDER_OFFER;
        assertEquals( "Q", enumType.getID());
        assertEquals( "TENDER_OFFER", enumType.getName());
        assertEquals( "Q - Tender Offer", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.WARRANT;
        assertEquals( "R", enumType.getID());
        assertEquals( "WARRANT", enumType.getName());
        assertEquals( "R - Warrant", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.SPECIAL_ACTION;
        assertEquals( "S", enumType.getID());
        assertEquals( "SPECIAL_ACTION", enumType.getName());
        assertEquals( "S - Special Action", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.SYMBOL_CONVERSION;
        assertEquals( "T", enumType.getID());
        assertEquals( "SYMBOL_CONVERSION", enumType.getName());
        assertEquals( "T - Symbol Conversion", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.CUSIP_OR_NAME_CHANGE;
        assertEquals( "U", enumType.getID());
        assertEquals( "CUSIP_OR_NAME_CHANGE", enumType.getName());
        assertEquals( "U - CUSIP / Name Change", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum292CorporateAction.LEAP_ROLLOVER;
        assertEquals( "V", enumType.getID());
        assertEquals( "LEAP_ROLLOVER", enumType.getName());
        assertEquals( "V - Leap Rollover", enumType.getDescription());
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