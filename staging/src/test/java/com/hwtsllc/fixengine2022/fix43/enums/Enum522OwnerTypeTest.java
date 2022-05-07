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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,INDIVIDUAL_INVESTOR,1 - Individual Investor", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PUBLIC_COMPANY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,PUBLIC_COMPANY,2 - Public Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PRIVATE_COMPANY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,PRIVATE_COMPANY,3 - Private Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.INDIVIDUAL_TRUSTEE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,INDIVIDUAL_TRUSTEE,4 - Individual Trustee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.COMPANY_TRUSTEE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,COMPANY_TRUSTEE,5 - Company Trustee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.PENSION_PLAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,PENSION_PLAN,6 - Pension Plan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.CUSTODIAN_MINORS_ACT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,CUSTODIAN_MINORS_ACT,7 - Custodian Under Gifts to Minors Act", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.TRUSTS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,TRUSTS,8 - Trusts", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.FIDUCIARIES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,FIDUCIARIES,9 - Fiduciaries", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NETWORKING_SUB_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,NETWORKING_SUB_ACCOUNT,10 - Networking Sub-account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NON_PROFIT_ORGANIZATION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,NON_PROFIT_ORGANIZATION,11 - Non-profit organization", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.CORPORATE_BODY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,CORPORATE_BODY,12 - Corporate Body", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum522OwnerType.NOMINEE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,NOMINEE,13 - Nominee", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}