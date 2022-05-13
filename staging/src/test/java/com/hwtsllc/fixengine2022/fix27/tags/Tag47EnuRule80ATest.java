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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum47Rule80A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  47
 *  Rule80A(No Longer Used)
 *  char
 *  Deprecated in FIX.4.3
 *  Note that the name of this field is changing to 'OrderCapacity' as Rule80A is a
 *  very US market-specific term. Other world markets need to convey similar information,
 *  however, often a subset of the US values.
 *
 *      See the 'Rule80A (aka OrderCapacity) Usage by Market' appendix
 *      for market-specific usage of this field.
 *
 *  Valid values:
 *      A - Agency single order
 *      B - Short exempt transaction (refer to A type)
 *      C - Program order, non-index arb, for Member firm/org
 *      D - Program order, index arb, for Member firm/org
 *      E - Short Exempt Transaction for Principal
 *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
 *
 *      F - Short exempt transaction (refer to W type)
 *      H - Short exempt transaction (refer to I type)
 *      I - Individual Investor, single order
 *      J - Program Order, index arb, for individual customer
 *      K - Program Order, non-index arb, for individual customer
 *
 *      L - Short exempt transaction for member competing market-maker affliated with the firm clearing the trade
 *          (refer to P and O types)
 *      M - Program Order, index arb, for other member
 *      N - Program Order, non-index arb, for other member
 *      O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      P - Principal
 *
 *      R - Transactions for the account of a non-member compting market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      S - Specialist trades
 *      T - Transactions for the account of an unaffiliated member's competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      U - Program Order, index arb, for other agency
 *      W - All other orders as agent for other member
 *
 *      X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
 *      (refer to W and T types)
 *      Y - Program Order, non-index arb, for other agency
 *      Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
 */
// @Deprecated
class Tag47EnuRule80ATest {
    @Test
    void FIX0047Test() {
        FIX27 fixData = FIX27.FIX47_ENU_RULE_80_A;
        assertEquals( "RULE_80_A", fixData.getName());
        assertEquals( "47", fixData.getID());
        assertEquals( "Rule80A (no longer used)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0047Test() {
        Tag47EnuRule80A tagData;

        tagData = new Tag47EnuRule80A(Enum47Rule80A.AGENCY_SINGLE_ORDER);
        assertEquals( Enum47Rule80A.AGENCY_SINGLE_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}