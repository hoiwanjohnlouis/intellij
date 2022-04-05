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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,INVALID_ACCOUNT_TYPE,1 - Invalid/unacceptable Account Type", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,INVALID_TAX_EXEMPT_TYPE,2 - Invalid/unacceptable Tax Exempt Type", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,INVALID_OWNERSHIP_TYPE,3 - Invalid/unacceptable Ownership Type", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,INVALID_NO_REG_DETAILS,4 - Invalid/unacceptable No Reg Details", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,INVALID_REG_SEQ_NO,5 - Invalid/unacceptable Reg Seq No", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_DETAILS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,INVALID_REG_DETAILS,6 - Invalid/unacceptable Reg Details", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,INVALID_MAILING_DETAILS,7 - Invalid/unacceptable Mailing Details", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,INVALID_MAILING_INSTRUCTIONS,8 - Invalid/unacceptable Mailing Instructions", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,INVALID_INVESTOR_ID,9 - Invalid/unacceptable Investor ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,INVALID_INVESTOR_ID_SOURCE,10 - Invalid/unacceptable Investor ID Source", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,INVALID_DATE_OF_BIRTH,11 - Invalid/unacceptable Date Of Birth", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,INVALID_COUNTRY_OF_RESIDENCE,12 - Invalid/unacceptable Investor Country Of Residence", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,INVALID_NO_DISTRIB_INSTNS,13 - Invalid/unacceptable No Distrib Instns", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,INVALID_DISTRIB_PERCENTAGE,14 - Invalid/unacceptable Distrib Percentage", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("15,INVALID_DISTRIB_PAYMENT_METHOD,15 - Invalid/unacceptable Distrib Payment Method", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("16,INVALID_CDA_ACCT_NAME,16 - Invalid/unacceptable Cash Distrib Agent Acct Name", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_CODE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("17,INVALID_CDA_CODE,17 - Invalid/unacceptable Cash Distrib Agent Code", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("18,INVALID_CDA_ACCT_NUM,18 - Invalid/unacceptable Cash Distrib Agent Acct Num", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  99 type
         */
        enumType = Enum507RegistRejReasonCode.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}