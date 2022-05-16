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

class Enum292CorporateActionTest {
    /**
     *  292
     *  CorporateAction
     *
     *      A-V msg types
     *      EX_DIVIDEND( "A", "EX_DIVIDEND", "A - Ex-Dividend" ),
     *      EX_DISTRIBUTION( "B", "EX_DISTRIBUTION", "B - Ex-Distribution" ),
     *      EX_RIGHTS( "C", "EX_RIGHTS", "C - Ex-Rights" ),
     *      NEW( "D", "NEW", "D - New" ),
     *      EX_INTEREST( "E", "EX_INTEREST", "E - Ex-Interest" ),
     *      CASH_DIVIDEND( "F", "CASH_DIVIDEND", "F - Cash Dividend" ),
     *      STOCK_DIVIDEND( "G", "STOCK_DIVIDEND", "G - Stock Dividend" ),
     *      NON_INTEGER_STOCK_SPLIT( "H", "NON_INTEGER_STOCK_SPLIT", "H - Non-Integer Stock Split" ),
     *      REVERSE_STOCK_SPLIT( "I", "REVERSE_STOCK_SPLIT", "I - Reverse Stock Split" ),
     *      STANDARD_INTEGER_STOCK_SPLIT( "J", "STANDARD_INTEGER_STOCK_SPLIT", "J - Standard-Integer Stock Split" ),
     *      POSITION_CONSOLIDATION( "K", "POSITION_CONSOLIDATION", "K - Position Consolidation" ),
     *      LIQUIDATION_REORGANIZATION( "L", "LIQUIDATION_REORGANIZATION", "L - Liquidation Reorganization" ),
     *      MERGER_REORGANIZATION( "M", "MERGER_REORGANIZATION", "M - Merger Reorganization" ),
     *      RIGHTS_OFFERING( "N", "RIGHTS_OFFERING", "N - Rights Offering" ),
     *      SHAREHOLDER_MEETING( "O", "SHAREHOLDER_MEETING", "O - Shareholder Meeting" ),
     *      SPINOFF( "P", "SPINOFF", "P - Spinoff" ),
     *      TENDER_OFFER( "Q", "TENDER_OFFER", "Q - Tender Offer" ),
     *      WARRANT( "R", "WARRANT", "R - Warrant" ),
     *      SPECIAL_ACTION( "S", "SPECIAL_ACTION", "S - Special Action" ),
     *      SYMBOL_CONVERSION( "T", "SYMBOL_CONVERSION", "T - Symbol Conversion" ),
     *      CUSIP_OR_NAME_CHANGE( "U", "CUSIP_OR_NAME_CHANGE", "U - CUSIP / Name Change" ),
     *      LEAP_ROLLOVER( "V", "LEAP_ROLLOVER", "V - Leap Rollover" ),
     */
    @Test
    void Enum0292Test() {
        Enum292CorporateAction enumType;

        /*
         * A-V msg types
         */
        enumType = Enum292CorporateAction.EX_DIVIDEND;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "EX_DIVIDEND", enumType.toFIXNameString());
        assertEquals( "A - Ex-Dividend", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.EX_DISTRIBUTION;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "EX_DISTRIBUTION", enumType.toFIXNameString());
        assertEquals( "B - Ex-Distribution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.EX_RIGHTS;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "EX_RIGHTS", enumType.toFIXNameString());
        assertEquals( "C - Ex-Rights", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.NEW;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "NEW", enumType.toFIXNameString());
        assertEquals( "D - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.EX_INTEREST;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "EX_INTEREST", enumType.toFIXNameString());
        assertEquals( "E - Ex-Interest", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.CASH_DIVIDEND;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "CASH_DIVIDEND", enumType.toFIXNameString());
        assertEquals( "F - Cash Dividend", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.STOCK_DIVIDEND;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "STOCK_DIVIDEND", enumType.toFIXNameString());
        assertEquals( "G - Stock Dividend", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "NON_INTEGER_STOCK_SPLIT", enumType.toFIXNameString());
        assertEquals( "H - Non-Integer Stock Split", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.REVERSE_STOCK_SPLIT;
        assertEquals( "I", enumType.toFIXIDString());
        assertEquals( "REVERSE_STOCK_SPLIT", enumType.toFIXNameString());
        assertEquals( "I - Reverse Stock Split", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "STANDARD_INTEGER_STOCK_SPLIT", enumType.toFIXNameString());
        assertEquals( "J - Standard-Integer Stock Split", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.POSITION_CONSOLIDATION;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "POSITION_CONSOLIDATION", enumType.toFIXNameString());
        assertEquals( "K - Position Consolidation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.LIQUIDATION_REORGANIZATION;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "LIQUIDATION_REORGANIZATION", enumType.toFIXNameString());
        assertEquals( "L - Liquidation Reorganization", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.MERGER_REORGANIZATION;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "MERGER_REORGANIZATION", enumType.toFIXNameString());
        assertEquals( "M - Merger Reorganization", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.RIGHTS_OFFERING;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "RIGHTS_OFFERING", enumType.toFIXNameString());
        assertEquals( "N - Rights Offering", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.SHAREHOLDER_MEETING;
        assertEquals( "O", enumType.toFIXIDString());
        assertEquals( "SHAREHOLDER_MEETING", enumType.toFIXNameString());
        assertEquals( "O - Shareholder Meeting", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.SPINOFF;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "SPINOFF", enumType.toFIXNameString());
        assertEquals( "P - Spinoff", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.TENDER_OFFER;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "TENDER_OFFER", enumType.toFIXNameString());
        assertEquals( "Q - Tender Offer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.WARRANT;
        assertEquals( "R", enumType.toFIXIDString());
        assertEquals( "WARRANT", enumType.toFIXNameString());
        assertEquals( "R - Warrant", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.SPECIAL_ACTION;
        assertEquals( "S", enumType.toFIXIDString());
        assertEquals( "SPECIAL_ACTION", enumType.toFIXNameString());
        assertEquals( "S - Special Action", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.SYMBOL_CONVERSION;
        assertEquals( "T", enumType.toFIXIDString());
        assertEquals( "SYMBOL_CONVERSION", enumType.toFIXNameString());
        assertEquals( "T - Symbol Conversion", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.CUSIP_OR_NAME_CHANGE;
        assertEquals( "U", enumType.toFIXIDString());
        assertEquals( "CUSIP_OR_NAME_CHANGE", enumType.toFIXNameString());
        assertEquals( "U - CUSIP / Name Change", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum292CorporateAction.LEAP_ROLLOVER;
        assertEquals( "V", enumType.toFIXIDString());
        assertEquals( "LEAP_ROLLOVER", enumType.toFIXNameString());
        assertEquals( "V - Leap Rollover", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
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