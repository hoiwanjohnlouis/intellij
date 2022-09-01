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
 *  582
 *  CustOrderCapacity
 *  int
 *  <p></p>
 *  Capacity of customer placing the order
 *  <p>
 *  Primarily used by futures exchanges to indicate the CTICode (customer type indicator)
 *  as required by the US CFTC (Commodity Futures Trading Commission).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Member trading for their own account
 *  <p>    2 - Clearing Firm trading for its proprietary account
 *  <p>    3 - Member trading for another member
 *  <p>    4 - All other
 */
class Enum582CustOrderCapacityTest {
    /*
     *  Information is the same for TAGS 582
     */
    @Test
    void Enum0582Test() {
        Enum582CustOrderCapacity enumType;

        /*
         *  1-4 types
         */
        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("MEMBER_TRADING_ACCOUNT", enumType.toEnumNameString());
        assertEquals("1 - Member trading for their own account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("CLEARING_FIRM_PROPRIETARY", enumType.toEnumNameString());
        assertEquals("2 - Clearing Firm trading for its proprietary account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("MEMBER_TRADING_FOR_ANOTHER", enumType.toEnumNameString());
        assertEquals("3 - Member trading for another member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum582CustOrderCapacity.ALL_OTHER;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("ALL_OTHER", enumType.toEnumNameString());
        assertEquals("4 - All other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}