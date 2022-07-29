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

import com.hwtsllc.fixengine2022.fix42.enums.Enum292CorporateAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
    Tag292EnuCorporateAction tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( "FIX292_ENU_CORPORATE_ACTION", tagData.toEnumLabelString());
            assertEquals( "292", tagData.toEnumIDString());
            assertEquals( "CORPORATE_ACTION", tagData.toEnumNameString());
            assertEquals( "CorporateAction", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * A-V msg types
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DIVIDEND);
        assertEquals( Enum292CorporateAction.EX_DIVIDEND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DISTRIBUTION);
        assertEquals( Enum292CorporateAction.EX_DISTRIBUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_RIGHTS);
        assertEquals( Enum292CorporateAction.EX_RIGHTS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NEW);
        assertEquals( Enum292CorporateAction.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_INTEREST);
        assertEquals( Enum292CorporateAction.EX_INTEREST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CASH_DIVIDEND);
        assertEquals( Enum292CorporateAction.CASH_DIVIDEND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STOCK_DIVIDEND);
        assertEquals( Enum292CorporateAction.STOCK_DIVIDEND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.REVERSE_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.REVERSE_STOCK_SPLIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT);
        assertEquals( Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.POSITION_CONSOLIDATION);
        assertEquals( Enum292CorporateAction.POSITION_CONSOLIDATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LIQUIDATION_REORGANIZATION);
        assertEquals( Enum292CorporateAction.LIQUIDATION_REORGANIZATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.MERGER_REORGANIZATION);
        assertEquals( Enum292CorporateAction.MERGER_REORGANIZATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.RIGHTS_OFFERING);
        assertEquals( Enum292CorporateAction.RIGHTS_OFFERING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SHAREHOLDER_MEETING);
        assertEquals( Enum292CorporateAction.SHAREHOLDER_MEETING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPINOFF);
        assertEquals( Enum292CorporateAction.SPINOFF.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.TENDER_OFFER);
        assertEquals( Enum292CorporateAction.TENDER_OFFER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.WARRANT);
        assertEquals( Enum292CorporateAction.WARRANT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPECIAL_ACTION);
        assertEquals( Enum292CorporateAction.SPECIAL_ACTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SYMBOL_CONVERSION);
        assertEquals( Enum292CorporateAction.SYMBOL_CONVERSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CUSIP_OR_NAME_CHANGE);
        assertEquals( Enum292CorporateAction.CUSIP_OR_NAME_CHANGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LEAP_ROLLOVER);
        assertEquals( Enum292CorporateAction.LEAP_ROLLOVER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( "Tag292EnuCorporateAction\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}