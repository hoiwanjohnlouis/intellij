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
class Enum378ExecRestatementReasonTest {
    @Test
    void Enum0378Test() {
        Enum378ExecRestatementReason enumType;

        /*
         *  0-11, 99, msg types
         */


        /*
         *  0-11, msg types
         */
        enumType = Enum378ExecRestatementReason.GT_CORPORATE_ACTION;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "GT_CORPORATE_ACTION", enumType.toFIXNameString());
        assertEquals( "0 - GT corporate action", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "GT_RENEWAL_RESTATEMENT", enumType.toFIXNameString());
        assertEquals( "1 - GT renewal / restatement (no corporate action)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.VERBAL_CHANGE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "VERBAL_CHANGE", enumType.toFIXNameString());
        assertEquals( "2 - Verbal change", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.REPRICING_OF_ORDER;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "REPRICING_OF_ORDER", enumType.toFIXNameString());
        assertEquals( "3 - Repricing of order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.BROKER_OPTION;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "BROKER_OPTION", enumType.toFIXNameString());
        assertEquals( "4 - Broker option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "PARTIAL_DECLINE_OF_ORDER_QTY", enumType.toFIXNameString());
        assertEquals( "5 - Partial decline of Order Qty (e.g. exchange initiated partial cancel)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "CANCEL_ON_TRADING_HALT", enumType.toFIXNameString());
        assertEquals( "6 - Cancel on Trading Halt", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "CANCEL_ON_SYSTEM_FAILURE", enumType.toFIXNameString());
        assertEquals( "7 - Cancel on System Failure", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "MARKET_EXCHANGE_OPTION", enumType.toFIXNameString());
        assertEquals( "8 - Market (Exchange) option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.CANCELED_NOT_BEST;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "CANCELED_NOT_BEST", enumType.toFIXNameString());
        assertEquals( "9 - Canceled, not best", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.WAREHOUSE_RECAP;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "WAREHOUSE_RECAP", enumType.toFIXNameString());
        assertEquals( "10 - Warehouse Recap", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum378ExecRestatementReason.PEG_REFRESH;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "PEG_REFRESH", enumType.toFIXNameString());
        assertEquals( "11 - Peg Refresh", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  99, msg types
         */
        enumType = Enum378ExecRestatementReason.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other", enumType.toFIXDescriptionString());
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