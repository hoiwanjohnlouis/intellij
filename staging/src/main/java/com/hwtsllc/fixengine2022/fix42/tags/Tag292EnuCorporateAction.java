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
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum292CorporateAction;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Tag292EnuCorporateAction extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum292CorporateAction dataValue;

    public final static Enum292CorporateAction TESTA_ENU_CORPORATE_ACTION = Enum292CorporateAction.SPECIAL_ACTION;
    public final static Enum292CorporateAction TESTB_ENU_CORPORATE_ACTION = Enum292CorporateAction.CUSIP_OR_NAME_CHANGE;

    public Tag292EnuCorporateAction(Enum292CorporateAction dataValue) {
        setFixType(FIX42.FIX292_ENU_CORPORATE_ACTION);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag292EnuCorporateAction tagData;

        tagData = new Tag292EnuCorporateAction(TESTA_ENU_CORPORATE_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag292EnuCorporateAction(TESTB_ENU_CORPORATE_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}
