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

class Enum522OwnerTypeTest {
    /**
     *  Information is the same for TAGS 522
     */
    @Test
    void Enum0522Test() {
        Enum522OwnerType enumType;

        /*
         * 1-13 types
         */
        enumType = Enum522OwnerType.INDIVIDUAL_INVESTOR;
        assertEquals("1", enumType.getID());
        assertEquals("INDIVIDUAL_INVESTOR", enumType.getName());
        assertEquals("1 - Individual Investor", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PUBLIC_COMPANY;
        assertEquals("2", enumType.getID());
        assertEquals("PUBLIC_COMPANY", enumType.getName());
        assertEquals("2 - Public Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PRIVATE_COMPANY;
        assertEquals("3", enumType.getID());
        assertEquals("PRIVATE_COMPANY", enumType.getName());
        assertEquals("3 - Private Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.INDIVIDUAL_TRUSTEE;
        assertEquals("4", enumType.getID());
        assertEquals("INDIVIDUAL_TRUSTEE", enumType.getName());
        assertEquals("4 - Individual Trustee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.COMPANY_TRUSTEE;
        assertEquals("5", enumType.getID());
        assertEquals("COMPANY_TRUSTEE", enumType.getName());
        assertEquals("5 - Company Trustee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PENSION_PLAN;
        assertEquals("6", enumType.getID());
        assertEquals("PENSION_PLAN", enumType.getName());
        assertEquals("6 - Pension Plan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.CUSTODIAN_MINORS_ACT;
        assertEquals("7", enumType.getID());
        assertEquals("CUSTODIAN_MINORS_ACT", enumType.getName());
        assertEquals("7 - Custodian Under Gifts to Minors Act", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.TRUSTS;
        assertEquals("8", enumType.getID());
        assertEquals("TRUSTS", enumType.getName());
        assertEquals("8 - Trusts", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.FIDUCIARIES;
        assertEquals("9", enumType.getID());
        assertEquals("FIDUCIARIES", enumType.getName());
        assertEquals("9 - Fiduciaries", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NETWORKING_SUB_ACCOUNT;
        assertEquals("10", enumType.getID());
        assertEquals("NETWORKING_SUB_ACCOUNT", enumType.getName());
        assertEquals("10 - Networking Sub-account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NON_PROFIT_ORGANIZATION;
        assertEquals("11", enumType.getID());
        assertEquals("NON_PROFIT_ORGANIZATION", enumType.getName());
        assertEquals("11 - Non-profit organization", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.CORPORATE_BODY;
        assertEquals("12", enumType.getID());
        assertEquals("CORPORATE_BODY", enumType.getName());
        assertEquals("12 - Corporate Body", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NOMINEE;
        assertEquals("13", enumType.getID());
        assertEquals("NOMINEE", enumType.getName());
        assertEquals("13 - Nominee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}