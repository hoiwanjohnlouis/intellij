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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.tags.fix42.enums.Enum292CorporateAction;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX292_ENU_CORPORATE_ACTION", tagData.toFIXLabelString());
            assertEquals( "292", tagData.toFIXIDString());
            assertEquals( "CORPORATE_ACTION", tagData.toFIXNameString());
            assertEquals( "CorporateAction", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum292CorporateAction oneEnum : Enum292CorporateAction.values()) {
            tagData = new Tag292EnuCorporateAction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  292
         *  CorporateAction
         *  MultipleCharValue
         *  <p>    A-V msg types
         *  <p>    EX_DIVIDEND( "A", "EX_DIVIDEND", "A - Ex-Dividend" ),
         *  <p>    EX_DISTRIBUTION( "B", "EX_DISTRIBUTION", "B - Ex-Distribution" ),
         *  <p>    EX_RIGHTS( "C", "EX_RIGHTS", "C - Ex-Rights" ),
         *  <p>    NEW( "D", "NEW", "D - New" ),
         *  <p>    EX_INTEREST( "E", "EX_INTEREST", "E - Ex-Interest" ),
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DIVIDEND);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_DISTRIBUTION);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_RIGHTS);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NEW);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.EX_INTEREST);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    CASH_DIVIDEND( "F", "CASH_DIVIDEND", "F - Cash Dividend" ),
         *  <p>    STOCK_DIVIDEND( "G", "STOCK_DIVIDEND", "G - Stock Dividend" ),
         *  <p>    NON_INTEGER_STOCK_SPLIT( "H", "NON_INTEGER_STOCK_SPLIT", "H - Non-Integer Stock Split" ),
         *  <p>    REVERSE_STOCK_SPLIT( "I", "REVERSE_STOCK_SPLIT", "I - Reverse Stock Split" ),
         *  <p>    STANDARD_INTEGER_STOCK_SPLIT( "J", "STANDARD_INTEGER_STOCK_SPLIT", "J - Standard-Integer Stock Split" ),
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CASH_DIVIDEND);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STOCK_DIVIDEND);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.NON_INTEGER_STOCK_SPLIT);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.REVERSE_STOCK_SPLIT);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.STANDARD_INTEGER_STOCK_SPLIT);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    POSITION_CONSOLIDATION( "K", "POSITION_CONSOLIDATION", "K - Position Consolidation" ),
         *  <p>    LIQUIDATION_REORGANIZATION( "L", "LIQUIDATION_REORGANIZATION", "L - Liquidation Reorganization" ),
         *  <p>    MERGER_REORGANIZATION( "M", "MERGER_REORGANIZATION", "M - Merger Reorganization" ),
         *  <p>    RIGHTS_OFFERING( "N", "RIGHTS_OFFERING", "N - Rights Offering" ),
         *  <p>    SHAREHOLDER_MEETING( "O", "SHAREHOLDER_MEETING", "O - Shareholder Meeting" ),
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.POSITION_CONSOLIDATION);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LIQUIDATION_REORGANIZATION);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.MERGER_REORGANIZATION);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.RIGHTS_OFFERING);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SHAREHOLDER_MEETING);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    SPINOFF( "P", "SPINOFF", "P - Spinoff" ),
         *  <p>    TENDER_OFFER( "Q", "TENDER_OFFER", "Q - Tender Offer" ),
         *  <p>    WARRANT( "R", "WARRANT", "R - Warrant" ),
         *  <p>    SPECIAL_ACTION( "S", "SPECIAL_ACTION", "S - Special Action" ),
         *  <p>    SYMBOL_CONVERSION( "T", "SYMBOL_CONVERSION", "T - Symbol Conversion" ),
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPINOFF);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.TENDER_OFFER);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.WARRANT);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SPECIAL_ACTION);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.SYMBOL_CONVERSION);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    CUSIP_OR_NAME_CHANGE( "U", "CUSIP_OR_NAME_CHANGE", "U - CUSIP / Name Change" ),
         *  <p>    LEAP_ROLLOVER( "V", "LEAP_ROLLOVER", "V - Leap Rollover" ),
         */
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.CUSIP_OR_NAME_CHANGE);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag292EnuCorporateAction(Enum292CorporateAction.LEAP_ROLLOVER);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}