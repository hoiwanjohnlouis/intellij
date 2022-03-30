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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum47Rule80ATest {
    @Test
    void Enum47Test() {
        Enum47Rule80A enumType;

        /*
         * A-M, O-P, R-U, W-Z msg types
         */
        enumType = Enum47Rule80A.AGENCY_SINGLE_ORDER;
        assertEquals("A", enumType.getID());
        assertEquals("AGENCY_SINGLE_ORDER", enumType.getName());
        assertEquals("A - Agency single order", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_A;
        assertEquals("B", enumType.getID());
        assertEquals("SHORT_EXEMPT_A", enumType.getName());
        assertEquals("B - Short exempt transaction (refer to A type)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_MEMBER;
        assertEquals("C", enumType.getID());
        assertEquals("PROGRAM_NON_INDEX_ARB_MEMBER", enumType.getName());
        assertEquals("C - Program order, non-index arb, for Member firm/org", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_MEMBER;
        assertEquals("D", enumType.getID());
        assertEquals("PROGRAM_INDEX_ARB_MEMBER", enumType.getName());
        assertEquals("D - Program order, index arb, for Member firm/org", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_P;
        assertEquals("E", enumType.getID());
        assertEquals("SHORT_EXEMPT_P", enumType.getName());
        assertEquals("E - Short Exempt Transaction for Principal", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_W;
        assertEquals("F", enumType.getID());
        assertEquals("SHORT_EXEMPT_W", enumType.getName());
        assertEquals("F - Short exempt transaction (refer to W type)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_I;
        assertEquals("H", enumType.getID());
        assertEquals("SHORT_EXEMPT_I", enumType.getName());
        assertEquals("H - Short exempt transaction (refer to I type)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.INDIVIDUAL_INVESTOR_SINGLE_ORDER;
        assertEquals("I", enumType.getID());
        assertEquals("INDIVIDUAL_INVESTOR_SINGLE_ORDER", enumType.getName());
        assertEquals("I - Individual Investor, single order", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_INDIVIDUAL;
        assertEquals("J", enumType.getID());
        assertEquals("PROGRAM_INDEX_ARB_INDIVIDUAL", enumType.getName());
        assertEquals("J - Program Order, index arb, for individual customer", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_INDIVIDUAL;
        assertEquals("K", enumType.getID());
        assertEquals("PROGRAM_NON_INDEX_ARB_INDIVIDUAL", enumType.getName());
        assertEquals("K - Program Order, non-index arb, for individual customer", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_P_O;
        assertEquals("L", enumType.getID());
        assertEquals("SHORT_EXEMPT_MARKET_MAKER_P_O", enumType.getName());
        assertEquals("L - Short exempt transaction for member competing market-maker affiliated " +
                "with the firm clearing the trade (refer to P and O types)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_MEMBER;
        assertEquals("M", enumType.getID());
        assertEquals("PROGRAM_INDEX_ARB_OTHER_MEMBER", enumType.getName());
        assertEquals("M - Program Order, index arb, for other member", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROPRIETARY_MARKET_MAKER_CLEARING;
        assertEquals("O", enumType.getID());
        assertEquals("PROPRIETARY_MARKET_MAKER_CLEARING", enumType.getName());
        assertEquals("O - Proprietary transactions for competing market-maker that is affiliated " +
                "with the clearing member", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PRINCIPAL;
        assertEquals("P", enumType.getID());
        assertEquals("PRINCIPAL", enumType.getName());
        assertEquals("P - Principal", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.NON_MEMBER_MARKET_MAKER;
        assertEquals("R", enumType.getID());
        assertEquals("NON_MEMBER_MARKET_MAKER", enumType.getName());
        assertEquals("R - Transactions for the account of a non-member competing market-maker",
                enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SPECIALIST_TRADES;
        assertEquals("S", enumType.getID());
        assertEquals("SPECIALIST_TRADES", enumType.getName());
        assertEquals("S - Specialist trades", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.UNAFFILIATED_MEMBER_MARKET_MAKER;
        assertEquals("T", enumType.getID());
        assertEquals("UNAFFILIATED_MEMBER_MARKET_MAKER", enumType.getName());
        assertEquals("T - Transactions for the account of an unaffiliated member's competing market-maker",
                enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_AGENCY;
        assertEquals("U", enumType.getID());
        assertEquals("PROGRAM_INDEX_ARB_OTHER_AGENCY", enumType.getName());
        assertEquals("U - Program Order, index arb, for other agency", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.AGENT_FOR_OTHER_MEMBER;
        assertEquals("W", enumType.getID());
        assertEquals("AGENT_FOR_OTHER_MEMBER", enumType.getName());
        assertEquals("W - All other orders as agent for other member", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_W_T;
        assertEquals("X", enumType.getID());
        assertEquals("SHORT_EXEMPT_MARKET_MAKER_W_T", enumType.getName());
        assertEquals("X - Short exempt transaction for member competing market-maker not affiliated " +
                "with the firm clearing the trade (refer to W and T types)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_OTHER_AGENCY;
        assertEquals("Y", enumType.getID());
        assertEquals("PROGRAM_NON_INDEX_ARB_OTHER_AGENCY", enumType.getName());
        assertEquals("Y - Program Order, non-index arb, for other agency", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum47Rule80A.SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R;
        assertEquals("Z", enumType.getID());
        assertEquals("SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R", enumType.getName());
        assertEquals("Z - Short exempt transaction for non-member competing market-maker " +
                        "(refer to A and R types)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}