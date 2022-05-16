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
import com.hwtsllc.fixengine2022.fix42.enums.Enum378ExecRestatementReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag378
 *  Enu
 *  ExecRestatementReason
 *
 *      0-11, 99 msg types
 *      GT_CORPORATE_ACTION( "0", "GT_CORPORATE_ACTION", "0 - GT corporate action" ),
 *      GT_RENEWAL_RESTATEMENT( "1", "GT_RENEWAL_RESTATEMENT",
 *                          "1 - GT renewal / restatement (no corporate action)" ),
 *      VERBAL_CHANGE( "2", "VERBAL_CHANGE", "2 - Verbal change" ),
 *      REPRICING_OF_ORDER( "3", "REPRICING_OF_ORDER", "3 - Repricing of order" ),
 *      BROKER_OPTION( "4", "BROKER_OPTION", "4 - Broker option" ),
 *      PARTIAL_DECLINE_OF_ORDER_QTY( "5", "PARTIAL_DECLINE_OF_ORDER_QTY",
 *                          "5 - Partial decline of Order Qty (e.g. exchange initiated partial cancel)" ),
 *      CANCEL_ON_TRADING_HALT( "6", "CANCEL_ON_TRADING_HALT", "6 - Cancel on Trading Halt" ),
 *      CANCEL_ON_SYSTEM_FAILURE( "7", "CANCEL_ON_SYSTEM_FAILURE", "7 - Cancel on System Failure" ),
 *      MARKET_EXCHANGE_OPTION( "8", "MARKET_EXCHANGE_OPTION", "8 - Market (Exchange) option" ),
 *      CANCELED_NOT_BEST( "9", "CANCELED_NOT_BEST", "9 - Canceled, not best" ),
 *      WAREHOUSE_RECAP( "10", "WAREHOUSE_RECAP", "10 - Warehouse Recap" ),
 *      PEG_REFRESH( "11", "PEG_REFRESH", "11 - Peg Refresh" ),
 *      OTHER( "99", "OTHER", "99 - Other" ),
 */
public class Tag378EnuExecRestatementReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum378ExecRestatementReason dataValue;

    public final static Enum378ExecRestatementReason TESTA_ENU_EXEC_RESTATEMENT_REASON
            = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
    public final static Enum378ExecRestatementReason TESTB_ENU_EXEC_RESTATEMENT_REASON
            = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;

    public Tag378EnuExecRestatementReason(Enum378ExecRestatementReason dataValue) {
        setFixType(FIX42.FIX378_ENU_EXEC_RESTATEMENT_REASON);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        Tag378EnuExecRestatementReason tagData;

        tagData = new Tag378EnuExecRestatementReason(TESTA_ENU_EXEC_RESTATEMENT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag378EnuExecRestatementReason(TESTB_ENU_EXEC_RESTATEMENT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
