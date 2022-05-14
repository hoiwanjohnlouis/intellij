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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Information is the same for TAGS 635
 */
class Enum635ClearingFeeIndicatorTest {
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
        assertEquals("FIRST_YEAR_DELEGATE", enumType.getName());
        assertEquals("1 - 1st year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE;
        assertEquals("2", enumType.getID());
        assertEquals("SECOND_YEAR_DELEGATE", enumType.getName());
        assertEquals("2 - 2nd year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE;
        assertEquals("3", enumType.getID());
        assertEquals("THIRD_YEAR_DELEGATE", enumType.getName());
        assertEquals("3 - 3rd year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE;
        assertEquals("4", enumType.getID());
        assertEquals("FOURTH_YEAR_DELEGATE", enumType.getName());
        assertEquals("4 - 4th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE;
        assertEquals("5", enumType.getID());
        assertEquals("FIFTH_YEAR_DELEGATE", enumType.getName());
        assertEquals("5 - 5th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  9 type
         */
        enumType = Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE;
        assertEquals("9", enumType.getID());
        assertEquals("SIXTH_YEAR_DELEGATE", enumType.getName());
        assertEquals("9 - 6th year delegate trading for own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  B-C, types
         */
        enumType = Enum635ClearingFeeIndicator.CBOE_MEMBER;
        assertEquals("B", enumType.getID());
        assertEquals("CBOE_MEMBER", enumType.getName());
        assertEquals("B - CBOE Member", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER;
        assertEquals("C", enumType.getID());
        assertEquals("NON_MEMBER_AND_CUSTOMER", enumType.getName());
        assertEquals("C - Non-member and Customer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  E-F, types
         */
        enumType = Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER;
        assertEquals("E", enumType.getID());
        assertEquals("EQUITY_AND_CLEARING_MEMBER", enumType.getName());
        assertEquals("E - Equity Member and Clearing Member", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR;
        assertEquals("F", enumType.getID());
        assertEquals("FULL_AND_ASSOCIATE_AS_FLOOR", enumType.getName());
        assertEquals("F - Full and Associate Member trading for own account and as floor brokers", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  H-I types
         */
        enumType = Enum635ClearingFeeIndicator.H_AND_J_FIRMS;
        assertEquals("H", enumType.getID());
        assertEquals("H_AND_J_FIRMS", enumType.getName());
        assertEquals("H - 106.H and 106.J firms", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM;
        assertEquals("I", enumType.getID());
        assertEquals("GIM_IDEM_AND_COM", enumType.getName());
        assertEquals("I - GIM, IDEM and COM Membership Interest Holders", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  L-M, types
         */
        enumType = Enum635ClearingFeeIndicator.F_EMPLOYEES;
        assertEquals("L", enumType.getID());
        assertEquals("F_EMPLOYEES", enumType.getName());
        assertEquals("L - Lessee 106.F Employees", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum635ClearingFeeIndicator.ALL_OTHER;
        assertEquals("M", enumType.getID());
        assertEquals("ALL_OTHER", enumType.getName());
        assertEquals("M - All other ownership types", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}