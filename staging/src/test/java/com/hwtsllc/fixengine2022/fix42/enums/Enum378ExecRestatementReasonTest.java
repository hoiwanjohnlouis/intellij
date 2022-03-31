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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum378ExecRestatementReasonTest {
    @Test
    void Enum0378Test() {
        Enum378ExecRestatementReason enumType;

        /*
         * 0-11, 99 msg types
         */
        enumType = Enum378ExecRestatementReason.GT_CORPORATE_ACTION;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.GT_RENEWAL_RESTATEMENT;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.VERBAL_CHANGE;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.REPRICING_OF_ORDER;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.BROKER_OPTION;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.PARTIAL_DECLINE_OF_ORDER_QTY;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_TRADING_HALT;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.MARKET_EXCHANGE_OPTION;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.CANCELED_NOT_BEST;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.WAREHOUSE_RECAP;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum378ExecRestatementReason.PEG_REFRESH;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum378ExecRestatementReason.OTHER;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}