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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  47
 *  Rule80A(No Longer Used)
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Note that the name of this field is changing to 'OrderCapacity' as Rule80A is a
 *  very US market-specific term. Other world markets need to convey similar information,
 *  however, often a subset of the US values.
 *  <p></p>
 *      See the 'Rule80A (aka OrderCapacity) Usage by Market' appendix
 *      for market-specific usage of this field.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency single order
 *  <p>    B - Short exempt transaction (refer to A type)
 *  <p>    C - Program order, non-index arb, for Member firm/org
 *  <p>    D - Program order, index arb, for Member firm/org
 *  <p>    E - Short Exempt Transaction for Principal
 *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
 *  <p></p>
 *  <p>    F - Short exempt transaction (refer to W type)
 *  <p>    H - Short exempt transaction (refer to I type)
 *  <p>    I - Individual Investor, single order
 *  <p>    J - Program Order, index arb, for individual customer
 *  <p>    K - Program Order, non-index arb, for individual customer
 *  <p></p>
 *  <p>    L - Short exempt transaction for member competing market-maker affiliated with the firm clearing the trade
 *          (refer to P and O types)
 *  <p>    M - Program Order, index arb, for other member
 *  <p>    N - Program Order, non-index arb, for other member
 *  <p>    O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    P - Principal
 *  <p></p>
 *  <p>    R - Transactions for the account of a non-member competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    S - Specialist trades
 *  <p>    T - Transactions for the account of an unaffiliated member's competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    U - Program Order, index arb, for other agency
 *  <p>    W - All other orders as agent for other member
 *  <p></p>
 *  <p>    X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
 *      (refer to W and T types)
 *  <p>    Y - Program Order, non-index arb, for other agency
 *  <p>    Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
 */
// @Deprecated
class Enum47Rule80ATest {
    @Test
    void Enum47Test() {
        Enum47Rule80A enumType;

        /*
         * A-M, O-P, R-U, W-Z msg types
         */
        enumType = Enum47Rule80A.AGENCY_SINGLE_ORDER;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("AGENCY_SINGLE_ORDER", enumType.toEnumNameString());
        assertEquals("A - Agency single order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.SHORT_EXEMPT_A;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_A", enumType.toEnumNameString());
        assertEquals("B - Short exempt transaction (refer to A type)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_MEMBER;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("PROGRAM_NON_INDEX_ARB_MEMBER", enumType.toEnumNameString());
        assertEquals("C - Program order, non-index arb, for Member firm/org", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_MEMBER;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("PROGRAM_INDEX_ARB_MEMBER", enumType.toEnumNameString());
        assertEquals("D - Program order, index arb, for Member firm/org", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.SHORT_EXEMPT_P;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_P", enumType.toEnumNameString());
        assertEquals("E - Short Exempt Transaction for Principal", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum47Rule80A.SHORT_EXEMPT_W;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_W", enumType.toEnumNameString());
        assertEquals("F - Short exempt transaction (refer to W type)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.SHORT_EXEMPT_I;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_I", enumType.toEnumNameString());
        assertEquals("H - Short exempt transaction (refer to I type)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.INDIVIDUAL_INVESTOR_SINGLE_ORDER;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("INDIVIDUAL_INVESTOR_SINGLE_ORDER", enumType.toEnumNameString());
        assertEquals("I - Individual Investor, single order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_INDIVIDUAL;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("PROGRAM_INDEX_ARB_INDIVIDUAL", enumType.toEnumNameString());
        assertEquals("J - Program Order, index arb, for individual customer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_INDIVIDUAL;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("PROGRAM_NON_INDEX_ARB_INDIVIDUAL", enumType.toEnumNameString());
        assertEquals("K - Program Order, non-index arb, for individual customer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_P_O;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_MARKET_MAKER_P_O", enumType.toEnumNameString());
        assertEquals("L - Short exempt transaction for member competing market-maker affiliated " +
                "with the firm clearing the trade (refer to P and O types)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_MEMBER;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("PROGRAM_INDEX_ARB_OTHER_MEMBER", enumType.toEnumNameString());
        assertEquals("M - Program Order, index arb, for other member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROPRIETARY_MARKET_MAKER_CLEARING;
        assertEquals("O", enumType.toFIXIDString());
        assertEquals("PROPRIETARY_MARKET_MAKER_CLEARING", enumType.toEnumNameString());
        assertEquals("O - Proprietary transactions for competing market-maker that is affiliated " +
                "with the clearing member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PRINCIPAL;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("PRINCIPAL", enumType.toEnumNameString());
        assertEquals("P - Principal", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.NON_MEMBER_MARKET_MAKER;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("NON_MEMBER_MARKET_MAKER", enumType.toEnumNameString());
        assertEquals("R - Transactions for the account of a non-member competing market-maker",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum47Rule80A.SPECIALIST_TRADES;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SPECIALIST_TRADES", enumType.toEnumNameString());
        assertEquals("S - Specialist trades", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.UNAFFILIATED_MEMBER_MARKET_MAKER;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("UNAFFILIATED_MEMBER_MARKET_MAKER", enumType.toEnumNameString());
        assertEquals("T - Transactions for the account of an unaffiliated member's competing market-maker",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_AGENCY;
        assertEquals("U", enumType.toFIXIDString());
        assertEquals("PROGRAM_INDEX_ARB_OTHER_AGENCY", enumType.toEnumNameString());
        assertEquals("U - Program Order, index arb, for other agency", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.AGENT_FOR_OTHER_MEMBER;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("AGENT_FOR_OTHER_MEMBER", enumType.toEnumNameString());
        assertEquals("W - All other orders as agent for other member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_W_T;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_MARKET_MAKER_W_T", enumType.toEnumNameString());
        assertEquals("X - Short exempt transaction for member competing market-maker not affiliated " +
                "with the firm clearing the trade (refer to W and T types)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum47Rule80A.PROGRAM_NON_INDEX_ARB_OTHER_AGENCY;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("PROGRAM_NON_INDEX_ARB_OTHER_AGENCY", enumType.toEnumNameString());
        assertEquals("Y - Program Order, non-index arb, for other agency", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum47Rule80A.SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R", enumType.toEnumNameString());
        assertEquals("Z - Short exempt transaction for non-member competing market-maker " +
                        "(refer to A and R types)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}