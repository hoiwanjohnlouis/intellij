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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyEnumTradeHandlingInstr;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1123 (same as 1123, 1124,)
 *  TradeHandlingInstr
 *  char
 *  <p>
 *  Specified how the Trade Capture Report should be handled by the Respondent.
 *  <p></p>
 *  1124
 *  OrigTradeHandlingInstr
 *  char
 *  <p>
 *  Optionally used with TradeHandlingInstr = 0 to relay the trade handling instruction
 *  used when reporting the trade to the marketplace.
 *  <p>
 *  Same values as TradeHandlingInstr (1123)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Trade Confirmation
 *  <p>    1 - Two-Party Report
 *  <p>    2 - One-Party Report for Matching
 *  <p>    3 - One-Party Report for Pass Through
 *  <p>    4 - Automated Floor Order Routing
 */
public class Tag1123EnuTradeHandlingInstr extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumTradeHandlingInstr dataValue;

    public final static MyEnumTradeHandlingInstr TESTA_ENU_TRADE_HANDLING_INSTR
            = MyEnumTradeHandlingInstr.TRADE_CONFIRMATION;
    public final static MyEnumTradeHandlingInstr TESTB_ENU_TRADE_HANDLING_INSTR
            = MyEnumTradeHandlingInstr.ONE_PARTY_MATCHING;

    public Tag1123EnuTradeHandlingInstr(MyEnumTradeHandlingInstr dataValue) {
        setFixType(FIX50.FIX1123_ENU_TRADE_HANDLING_INSTR);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1123EnuTradeHandlingInstr tagData;

        tagData = new Tag1123EnuTradeHandlingInstr(TESTA_ENU_TRADE_HANDLING_INSTR);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1123EnuTradeHandlingInstr(TESTB_ENU_TRADE_HANDLING_INSTR);
        System.out.println(tagData.toVerboseString());
    }
}
