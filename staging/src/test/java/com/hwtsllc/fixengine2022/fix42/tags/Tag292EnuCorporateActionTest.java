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
import com.hwtsllc.fixengine2022.fix42.enums.Enum292CorporateAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag292EnuCorporateActionTest {
    @Test
    void FIX0292Test() {
        FIX42 fixData = FIX42.FIX292_ENU_CORPORATE_ACTION;
        assertEquals( "292", fixData.getID());
        assertEquals( "CORPORATE_ACTION", fixData.getName());
        assertEquals( "CorporateAction", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0292Test() {
        Tag292EnuCorporateAction tagData;

        /**
         * A-V msg types
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DIVIDEND);
        assertEquals( Enum292CorporateAction.EX_DIVIDEND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DISTRIBUTION);
        assertEquals( Enum292CorporateAction.EX_DISTRIBUTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_RIGHTS);
        assertEquals( Enum292CorporateAction.EX_RIGHTS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NEW);
        assertEquals( Enum292CorporateAction.NEW.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_INTEREST);
        assertEquals( Enum292CorporateAction.EX_INTEREST.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CASH_DIVIDEND);
        assertEquals( Enum292CorporateAction.CASH_DIVIDEND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STOCK_DIVIDEND);
        assertEquals( Enum292CorporateAction.STOCK_DIVIDEND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.REVERSE_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.REVERSE_STOCK_SPLIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.POSITION_CONSOLIDATION);
        assertEquals( Enum292CorporateAction.POSITION_CONSOLIDATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LIQUIDATION_REORGANIZATION);
        assertEquals( Enum292CorporateAction.LIQUIDATION_REORGANIZATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.MERGER_REORGANIZATION);
        assertEquals( Enum292CorporateAction.MERGER_REORGANIZATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.RIGHTS_OFFERING);
        assertEquals( Enum292CorporateAction.RIGHTS_OFFERING.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SHAREHOLDER_MEETING);
        assertEquals( Enum292CorporateAction.SHAREHOLDER_MEETING.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPINOFF);
        assertEquals( Enum292CorporateAction.SPINOFF.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.TENDER_OFFER);
        assertEquals( Enum292CorporateAction.TENDER_OFFER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.WARRANT);
        assertEquals( Enum292CorporateAction.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPECIAL_ACTION);
        assertEquals( Enum292CorporateAction.SPECIAL_ACTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SYMBOL_CONVERSION);
        assertEquals( Enum292CorporateAction.SYMBOL_CONVERSION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CUSIP_OR_NAME_CHANGE);
        assertEquals( Enum292CorporateAction.CUSIP_OR_NAME_CHANGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LEAP_ROLLOVER);
        assertEquals( Enum292CorporateAction.LEAP_ROLLOVER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}