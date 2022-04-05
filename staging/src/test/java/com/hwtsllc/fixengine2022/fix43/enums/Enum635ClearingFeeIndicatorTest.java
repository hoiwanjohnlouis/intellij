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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum635ClearingFeeIndicatorTest {
    /**
     *  Information is the same for TAGS 635
     */
    @Test
    void Enum0635Test() {
        Enum635ClearingFeeIndicator enumType;

        /*
         *  1-5, 9, B, C, E, F, H, I, L, M, types
         */

        /*
         *  1-5, types
         */
        enumType = Enum635ClearingFeeIndicator.FIRST_YEAR_DELEGATE;
        assertEquals("1", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,FIRST_YEAR_DELEGATE,1 - 1st year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE;
        assertEquals("2", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,SECOND_YEAR_DELEGATE,2 - 2nd year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE;
        assertEquals("3", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,THIRD_YEAR_DELEGATE,3 - 3rd year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE;
        assertEquals("4", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,FOURTH_YEAR_DELEGATE,4 - 4th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE;
        assertEquals("5", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,FIFTH_YEAR_DELEGATE,5 - 5th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  9 type
         */
        enumType = Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE;
        assertEquals("9", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,SIXTH_YEAR_DELEGATE,9 - 6th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  B-C, types
         */
        enumType = Enum635ClearingFeeIndicator.CBOE_MEMBER;
        assertEquals("B", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("B,CBOE_MEMBER,B - CBOE Member", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER;
        assertEquals("C", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("C,NON_MEMBER_AND_CUSTOMER,C - Non-member and Customer", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  E-F, types
         */
        enumType = Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER;
        assertEquals("E", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("E,EQUITY_AND_CLEARING_MEMBER,E - Equity Member and Clearing Member", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR;
        assertEquals("F", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("F,FULL_AND_ASSOCIATE_AS_FLOOR,F - Full and Associate Member trading for own account and as floor brokers", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  H-I types
         */
        enumType = Enum635ClearingFeeIndicator.H_AND_J_FIRMS;
        assertEquals("H", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("H,H_AND_J_FIRMS,H - 106.H and 106.J firms", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM;
        assertEquals("I", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("I,GIM_IDEM_AND_COM,I - GIM, IDEM and COM Membership Interest Holders", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  L-M, types
         */
        enumType = Enum635ClearingFeeIndicator.F_EMPLOYEES;
        assertEquals("L", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("L,F_EMPLOYEES,L - Lessee 106.F Employees", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.ALL_OTHER;
        assertEquals("M", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("M,ALL_OTHER,M - All other ownership types", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}