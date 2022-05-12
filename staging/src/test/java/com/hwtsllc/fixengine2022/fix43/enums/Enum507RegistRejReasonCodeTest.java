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

class Enum507RegistRejReasonCodeTest {
    /**
     *  Information is the same for TAGS 507
     */
    @Test
    void Enum0507Test() {
        Enum507RegistRejReasonCode enumType;

        /*
         *  1-18, 99 types
         */


        /*
         *  1-18, types
         */
        enumType = Enum507RegistRejReasonCode.INVALID_ACCOUNT_TYPE;
        assertEquals("1", enumType.getID());
        assertEquals("INVALID_ACCOUNT_TYPE", enumType.getName());
        assertEquals("1 - Invalid/unacceptable Account Type", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE;
        assertEquals("2", enumType.getID());
        assertEquals("INVALID_TAX_EXEMPT_TYPE", enumType.getName());
        assertEquals("2 - Invalid/unacceptable Tax Exempt Type", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE;
        assertEquals("3", enumType.getID());
        assertEquals("INVALID_OWNERSHIP_TYPE", enumType.getName());
        assertEquals("3 - Invalid/unacceptable Ownership Type", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS;
        assertEquals("4", enumType.getID());
        assertEquals("INVALID_NO_REG_DETAILS", enumType.getName());
        assertEquals("4 - Invalid/unacceptable No Reg Details", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO;
        assertEquals("5", enumType.getID());
        assertEquals("INVALID_REG_SEQ_NO", enumType.getName());
        assertEquals("5 - Invalid/unacceptable Reg Seq No", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_DETAILS;
        assertEquals("6", enumType.getID());
        assertEquals("INVALID_REG_DETAILS", enumType.getName());
        assertEquals("6 - Invalid/unacceptable Reg Details", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS;
        assertEquals("7", enumType.getID());
        assertEquals("INVALID_MAILING_DETAILS", enumType.getName());
        assertEquals("7 - Invalid/unacceptable Mailing Details", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS;
        assertEquals("8", enumType.getID());
        assertEquals("INVALID_MAILING_INSTRUCTIONS", enumType.getName());
        assertEquals("8 - Invalid/unacceptable Mailing Instructions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID;
        assertEquals("9", enumType.getID());
        assertEquals("INVALID_INVESTOR_ID", enumType.getName());
        assertEquals("9 - Invalid/unacceptable Investor ID", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE;
        assertEquals("10", enumType.getID());
        assertEquals("INVALID_INVESTOR_ID_SOURCE", enumType.getName());
        assertEquals("10 - Invalid/unacceptable Investor ID Source", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH;
        assertEquals("11", enumType.getID());
        assertEquals("INVALID_DATE_OF_BIRTH", enumType.getName());
        assertEquals("11 - Invalid/unacceptable Date Of Birth", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE;
        assertEquals("12", enumType.getID());
        assertEquals("INVALID_COUNTRY_OF_RESIDENCE", enumType.getName());
        assertEquals("12 - Invalid/unacceptable Investor Country Of Residence", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS;
        assertEquals("13", enumType.getID());
        assertEquals("INVALID_NO_DISTRIB_INSTNS", enumType.getName());
        assertEquals("13 - Invalid/unacceptable No Distrib Instns", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE;
        assertEquals("14", enumType.getID());
        assertEquals("INVALID_DISTRIB_PERCENTAGE", enumType.getName());
        assertEquals("14 - Invalid/unacceptable Distrib Percentage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD;
        assertEquals("15", enumType.getID());
        assertEquals("INVALID_DISTRIB_PAYMENT_METHOD", enumType.getName());
        assertEquals("15 - Invalid/unacceptable Distrib Payment Method", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME;
        assertEquals("16", enumType.getID());
        assertEquals("INVALID_CDA_ACCT_NAME", enumType.getName());
        assertEquals("16 - Invalid/unacceptable Cash Distrib Agent Acct Name", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_CODE;
        assertEquals("17", enumType.getID());
        assertEquals("INVALID_CDA_CODE", enumType.getName());
        assertEquals("17 - Invalid/unacceptable Cash Distrib Agent Code", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM;
        assertEquals("18", enumType.getID());
        assertEquals("INVALID_CDA_ACCT_NUM", enumType.getName());
        assertEquals("18 - Invalid/unacceptable Cash Distrib Agent Acct Num", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  99 type
         */
        enumType = Enum507RegistRejReasonCode.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}