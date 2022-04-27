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

class Enum378ExecRestatementReasonTest {
    @Test
    void Enum0378Test() {
        Enum378ExecRestatementReason enumType;

        /**
         *  0-11, 99, msg types
         */


        /**
         *  0-11, msg types
         */
        enumType = Enum378ExecRestatementReason.GT_CORPORATE_ACTION;
        assertEquals( "0", enumType.getID());
        assertEquals( "GT_CORPORATE_ACTION", enumType.getName());
        assertEquals( "0 - GT corporate action", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
        assertEquals( "1", enumType.getID());
        assertEquals( "GT_RENEWAL_RESTATEMENT", enumType.getName());
        assertEquals( "1 - GT renewal / restatement (no corporate action)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.VERBAL_CHANGE;
        assertEquals( "2", enumType.getID());
        assertEquals( "VERBAL_CHANGE", enumType.getName());
        assertEquals( "2 - Verbal change", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.REPRICING_OF_ORDER;
        assertEquals( "3", enumType.getID());
        assertEquals( "REPRICING_OF_ORDER", enumType.getName());
        assertEquals( "3 - Repricing of order", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.BROKER_OPTION;
        assertEquals( "4", enumType.getID());
        assertEquals( "BROKER_OPTION", enumType.getName());
        assertEquals( "4 - Broker option", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY;
        assertEquals( "5", enumType.getID());
        assertEquals( "PARTIAL_DECLINE_OF_ORDER_QTY", enumType.getName());
        assertEquals( "5 - Partial decline of Order Qty (e.g. exchange initiated partial cancel)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT;
        assertEquals( "6", enumType.getID());
        assertEquals( "CANCEL_ON_TRADING_HALT", enumType.getName());
        assertEquals( "6 - Cancel on Trading Halt", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals( "7", enumType.getID());
        assertEquals( "CANCEL_ON_SYSTEM_FAILURE", enumType.getName());
        assertEquals( "7 - Cancel on System Failure", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION;
        assertEquals( "8", enumType.getID());
        assertEquals( "MARKET_EXCHANGE_OPTION", enumType.getName());
        assertEquals( "8 - Market (Exchange) option", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCELED_NOT_BEST;
        assertEquals( "9", enumType.getID());
        assertEquals( "CANCELED_NOT_BEST", enumType.getName());
        assertEquals( "9 - Canceled, not best", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.WAREHOUSE_RECAP;
        assertEquals( "10", enumType.getID());
        assertEquals( "WAREHOUSE_RECAP", enumType.getName());
        assertEquals( "10 - Warehouse Recap", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.PEG_REFRESH;
        assertEquals( "11", enumType.getID());
        assertEquals( "PEG_REFRESH", enumType.getName());
        assertEquals( "11 - Peg Refresh", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  99, msg types
         */
        enumType = Enum378ExecRestatementReason.OTHER;
        assertEquals( "99", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "99 - Other", enumType.getDescription());
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