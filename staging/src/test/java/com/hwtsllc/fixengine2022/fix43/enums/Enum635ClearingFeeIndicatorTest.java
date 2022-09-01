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
 *  635
 *  ClearingFeeIndicator
 *  String
 *  <p></p>
 *  Indicates type of fee being assessed of the customer
 *  for trade executions at an exchange.
 *  <p></p>
 *  Applicable for futures markets only at this time.
 *  <p></p>
 *  (Values source CBOT, CME, NYBOT, and NYMEX):
 *  Valid values:
 *  <p>    1 - 1st year delegate trading for own account
 *  <p>    2 - 2nd year delegate trading for own account
 *  <p>    3 - 3rd year delegate trading for own account
 *  <p>    4 - 4th year delegate trading for own account
 *  <p>    5 - 5th year delegate trading for own account
 *  <p></p>
 *  <p>    9 - 6th year delegate trading for own account
 *  <p>    B - CBOE Member
 *  <p>    C - Non-member and Customer
 *  <p>    E - Equity Member and Clearing Member
 *  <p>    F - Full and Associate Member trading for own account and as floor brokers
 *  <p></p>
 *  <p>    H - 106.H and 106.J firms
 *  <p>    I - GIM, IDEM and COM Membership Interest Holders
 *  <p>    L - Lessee 106.F Employees
 *  <p>    M - All other ownership types
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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("FIRST_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("1 - 1st year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("SECOND_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("2 - 2nd year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("THIRD_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("3 - 3rd year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("FOURTH_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("4 - 4th year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("FIFTH_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("5 - 5th year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  9 type
         */
        enumType = Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("SIXTH_YEAR_DELEGATE", enumType.toFIXNameString());
        assertEquals("9 - 6th year delegate trading for own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  B-C, types
         */
        enumType = Enum635ClearingFeeIndicator.CBOE_MEMBER;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("CBOE_MEMBER", enumType.toFIXNameString());
        assertEquals("B - CBOE Member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("NON_MEMBER_AND_CUSTOMER", enumType.toFIXNameString());
        assertEquals("C - Non-member and Customer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  E-F, types
         */
        enumType = Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("EQUITY_AND_CLEARING_MEMBER", enumType.toFIXNameString());
        assertEquals("E - Equity Member and Clearing Member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("FULL_AND_ASSOCIATE_AS_FLOOR", enumType.toFIXNameString());
        assertEquals("F - Full and Associate Member trading for own account and as floor brokers", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  H-I types
         */
        enumType = Enum635ClearingFeeIndicator.H_AND_J_FIRMS;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("H_AND_J_FIRMS", enumType.toFIXNameString());
        assertEquals("H - 106.H and 106.J firms", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("GIM_IDEM_AND_COM", enumType.toFIXNameString());
        assertEquals("I - GIM, IDEM and COM Membership Interest Holders", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  L-M, types
         */
        enumType = Enum635ClearingFeeIndicator.F_EMPLOYEES;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("F_EMPLOYEES", enumType.toFIXNameString());
        assertEquals("L - Lessee 106.F Employees", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum635ClearingFeeIndicator.ALL_OTHER;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("ALL_OTHER", enumType.toFIXNameString());
        assertEquals("M - All other ownership types", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}