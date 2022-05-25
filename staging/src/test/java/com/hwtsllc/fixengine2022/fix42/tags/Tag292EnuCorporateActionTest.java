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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum292CorporateAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  292
 *  CorporateAction
 *  MultipleCharValue
 *  <p>
 *  Identifies the type of Corporate Action.
 *  <p></p>
 *  Valid values:
 *  <p>    A-V msg types
 *  <p>    EX_DIVIDEND( "A", "EX_DIVIDEND", "A - Ex-Dividend" ),
 *  <p>    EX_DISTRIBUTION( "B", "EX_DISTRIBUTION", "B - Ex-Distribution" ),
 *  <p>    EX_RIGHTS( "C", "EX_RIGHTS", "C - Ex-Rights" ),
 *  <p>    NEW( "D", "NEW", "D - New" ),
 *  <p>    EX_INTEREST( "E", "EX_INTEREST", "E - Ex-Interest" ),
 *  <p></p>
 *  <p>    CASH_DIVIDEND( "F", "CASH_DIVIDEND", "F - Cash Dividend" ),
 *  <p>    STOCK_DIVIDEND( "G", "STOCK_DIVIDEND", "G - Stock Dividend" ),
 *  <p>    NON_INTEGER_STOCK_SPLIT( "H", "NON_INTEGER_STOCK_SPLIT", "H - Non-Integer Stock Split" ),
 *  <p>    REVERSE_STOCK_SPLIT( "I", "REVERSE_STOCK_SPLIT", "I - Reverse Stock Split" ),
 *  <p>    STANDARD_INTEGER_STOCK_SPLIT( "J", "STANDARD_INTEGER_STOCK_SPLIT", "J - Standard-Integer Stock Split" ),
 *  <p></p>
 *  <p>    POSITION_CONSOLIDATION( "K", "POSITION_CONSOLIDATION", "K - Position Consolidation" ),
 *  <p>    LIQUIDATION_REORGANIZATION( "L", "LIQUIDATION_REORGANIZATION", "L - Liquidation Reorganization" ),
 *  <p>    MERGER_REORGANIZATION( "M", "MERGER_REORGANIZATION", "M - Merger Reorganization" ),
 *  <p>    RIGHTS_OFFERING( "N", "RIGHTS_OFFERING", "N - Rights Offering" ),
 *  <p>    SHAREHOLDER_MEETING( "O", "SHAREHOLDER_MEETING", "O - Shareholder Meeting" ),
 *  <p></p>
 *  <p>    SPINOFF( "P", "SPINOFF", "P - Spinoff" ),
 *  <p>    TENDER_OFFER( "Q", "TENDER_OFFER", "Q - Tender Offer" ),
 *  <p>    WARRANT( "R", "WARRANT", "R - Warrant" ),
 *  <p>    SPECIAL_ACTION( "S", "SPECIAL_ACTION", "S - Special Action" ),
 *  <p>    SYMBOL_CONVERSION( "T", "SYMBOL_CONVERSION", "T - Symbol Conversion" ),
 *  <p></p>
 *  <p>    CUSIP_OR_NAME_CHANGE( "U", "CUSIP_OR_NAME_CHANGE", "U - CUSIP / Name Change" ),
 *  <p>    LEAP_ROLLOVER( "V", "LEAP_ROLLOVER", "V - Leap Rollover" ),
 */
class Tag292EnuCorporateActionTest {
    @Test
    void FIX0292Test() {
        FIX42 fixData = FIX42.FIX292_ENU_CORPORATE_ACTION;
        assertEquals( "292", fixData.toFIXIDString());
        assertEquals( "CORPORATE_ACTION", fixData.toFIXNameString());
        assertEquals( "CorporateAction", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0292Test() {
        Tag292EnuCorporateAction tagData;

        /*
         * A-V msg types
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DIVIDEND);
        assertEquals( Enum292CorporateAction.EX_DIVIDEND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DISTRIBUTION);
        assertEquals( Enum292CorporateAction.EX_DISTRIBUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_RIGHTS);
        assertEquals( Enum292CorporateAction.EX_RIGHTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NEW);
        assertEquals( Enum292CorporateAction.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_INTEREST);
        assertEquals( Enum292CorporateAction.EX_INTEREST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CASH_DIVIDEND);
        assertEquals( Enum292CorporateAction.CASH_DIVIDEND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STOCK_DIVIDEND);
        assertEquals( Enum292CorporateAction.STOCK_DIVIDEND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.REVERSE_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.REVERSE_STOCK_SPLIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.POSITION_CONSOLIDATION);
        assertEquals( Enum292CorporateAction.POSITION_CONSOLIDATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LIQUIDATION_REORGANIZATION);
        assertEquals( Enum292CorporateAction.LIQUIDATION_REORGANIZATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.MERGER_REORGANIZATION);
        assertEquals( Enum292CorporateAction.MERGER_REORGANIZATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.RIGHTS_OFFERING);
        assertEquals( Enum292CorporateAction.RIGHTS_OFFERING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SHAREHOLDER_MEETING);
        assertEquals( Enum292CorporateAction.SHAREHOLDER_MEETING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPINOFF);
        assertEquals( Enum292CorporateAction.SPINOFF.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.TENDER_OFFER);
        assertEquals( Enum292CorporateAction.TENDER_OFFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.WARRANT);
        assertEquals( Enum292CorporateAction.WARRANT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPECIAL_ACTION);
        assertEquals( Enum292CorporateAction.SPECIAL_ACTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SYMBOL_CONVERSION);
        assertEquals( Enum292CorporateAction.SYMBOL_CONVERSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CUSIP_OR_NAME_CHANGE);
        assertEquals( Enum292CorporateAction.CUSIP_OR_NAME_CHANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LEAP_ROLLOVER);
        assertEquals( Enum292CorporateAction.LEAP_ROLLOVER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}