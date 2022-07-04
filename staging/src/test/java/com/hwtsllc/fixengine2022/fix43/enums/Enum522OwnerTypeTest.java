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
 *  522
 *  OwnerType
 *  int
 *  <p></p>
 *  Identifies the type of owner.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Individual Investor
 *  <p>    2 - Public Company
 *  <p>    3 - Private Company
 *  <p>    4 - Individual Trustee
 *  <p>    5 - Company Trustee
 *  <p></p>
 *  <p>    6 - Pension Plan
 *  <p>    7 - Custodian Under Gifts to Minors Act
 *  <p>    8 - Trusts
 *  <p>    9 - Fiduciaries
 *  <p>    10 - Networking Sub-account
 *  <p></p>
 *  <p>    11 - Non-profit organization
 *  <p>    12 - Corporate Body
 *  <p>    13 - Nominee
 */
class Enum522OwnerTypeTest {
    /*
     *  Information is the same for TAGS 522
     */
    @Test
    void Enum0522Test() {
        Enum522OwnerType enumType;

        /*
         * 1-13 types
         */
        enumType = Enum522OwnerType.INDIVIDUAL_INVESTOR;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("INDIVIDUAL_INVESTOR", enumType.toEnumNameString());
        assertEquals("1 - Individual Investor", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.PUBLIC_COMPANY;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("PUBLIC_COMPANY", enumType.toEnumNameString());
        assertEquals("2 - Public Company", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.PRIVATE_COMPANY;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("PRIVATE_COMPANY", enumType.toEnumNameString());
        assertEquals("3 - Private Company", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.INDIVIDUAL_TRUSTEE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("INDIVIDUAL_TRUSTEE", enumType.toEnumNameString());
        assertEquals("4 - Individual Trustee", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.COMPANY_TRUSTEE;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("COMPANY_TRUSTEE", enumType.toEnumNameString());
        assertEquals("5 - Company Trustee", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.PENSION_PLAN;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("PENSION_PLAN", enumType.toEnumNameString());
        assertEquals("6 - Pension Plan", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.CUSTODIAN_MINORS_ACT;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("CUSTODIAN_MINORS_ACT", enumType.toEnumNameString());
        assertEquals("7 - Custodian Under Gifts to Minors Act", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.TRUSTS;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("TRUSTS", enumType.toEnumNameString());
        assertEquals("8 - Trusts", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.FIDUCIARIES;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("FIDUCIARIES", enumType.toEnumNameString());
        assertEquals("9 - Fiduciaries", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.NETWORKING_SUB_ACCOUNT;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("NETWORKING_SUB_ACCOUNT", enumType.toEnumNameString());
        assertEquals("10 - Networking Sub-account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.NON_PROFIT_ORGANIZATION;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("NON_PROFIT_ORGANIZATION", enumType.toEnumNameString());
        assertEquals("11 - Non-profit organization", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.CORPORATE_BODY;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("CORPORATE_BODY", enumType.toEnumNameString());
        assertEquals("12 - Corporate Body", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum522OwnerType.NOMINEE;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("NOMINEE", enumType.toEnumNameString());
        assertEquals("13 - Nominee", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}