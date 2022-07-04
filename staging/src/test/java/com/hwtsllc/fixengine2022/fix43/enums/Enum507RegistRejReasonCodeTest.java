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
 *  507
 *  RegistRejReasonCode
 *  int
 *  <p></p>
 *  Reason(s) why Registration Instructions has been rejected.
 *  <p>
 *  The reason may be further amplified in the RegistRejReasonCode field.
 *  <p></p>
 *  Possible values of reason code include:
 *  <p>
 *  Valid values:
 *  <p>    1 - Invalid/unacceptable Account Type
 *  <p>    2 - Invalid/unacceptable Tax Exempt Type
 *  <p>    3 - Invalid/unacceptable Ownership Type
 *  <p>    4 - Invalid/unacceptable No Reg Details
 *  <p>    5 - Invalid/unacceptable Reg Seq No
 *  <p></p>
 *  <p>    6 - Invalid/unacceptable Reg Details
 *  <p>    7 - Invalid/unacceptable Mailing Details
 *  <p>    8 - Invalid/unacceptable Mailing Instructions
 *  <p>    9 - Invalid/unacceptable Investor ID
 *  <p>    10 - Invalid/unaceeptable Investor ID Source
 *  <p></p>
 *  <p>    11 - Invalid/unacceptable Date Of Birth
 *  <p>    12 - Invalid/unacceptable Investor Country Of Residence
 *  <p>    13 - Invalid/unacceptable No Distrib Instns
 *  <p>    14 - Invalid/unacceptable Distrib Percentage
 *  <p>    15 - Invalid/unacceptable Distrib Payment Method
 *  <p></p>
 *  <p>    16 - Invalid/unacceptable Cash Distrib Agent Acct Name
 *  <p>    17 - Invalid/unacceptable Cash Distrib Agent Code
 *  <p>    18 - Invalid/unacceptable Cash Distrib Agent Acct Num
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum507RegistRejReasonCodeTest {
    /*
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
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("INVALID_ACCOUNT_TYPE", enumType.toEnumNameString());
        assertEquals("1 - Invalid/unacceptable Account Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("INVALID_TAX_EXEMPT_TYPE", enumType.toEnumNameString());
        assertEquals("2 - Invalid/unacceptable Tax Exempt Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("INVALID_OWNERSHIP_TYPE", enumType.toEnumNameString());
        assertEquals("3 - Invalid/unacceptable Ownership Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("INVALID_NO_REG_DETAILS", enumType.toEnumNameString());
        assertEquals("4 - Invalid/unacceptable No Reg Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("INVALID_REG_SEQ_NO", enumType.toEnumNameString());
        assertEquals("5 - Invalid/unacceptable Reg Seq No", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_DETAILS;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("INVALID_REG_DETAILS", enumType.toEnumNameString());
        assertEquals("6 - Invalid/unacceptable Reg Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("INVALID_MAILING_DETAILS", enumType.toEnumNameString());
        assertEquals("7 - Invalid/unacceptable Mailing Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("INVALID_MAILING_INSTRUCTIONS", enumType.toEnumNameString());
        assertEquals("8 - Invalid/unacceptable Mailing Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("INVALID_INVESTOR_ID", enumType.toEnumNameString());
        assertEquals("9 - Invalid/unacceptable Investor ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("INVALID_INVESTOR_ID_SOURCE", enumType.toEnumNameString());
        assertEquals("10 - Invalid/unacceptable Investor ID Source", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("INVALID_DATE_OF_BIRTH", enumType.toEnumNameString());
        assertEquals("11 - Invalid/unacceptable Date Of Birth", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("INVALID_COUNTRY_OF_RESIDENCE", enumType.toEnumNameString());
        assertEquals("12 - Invalid/unacceptable Investor Country Of Residence", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("INVALID_NO_DISTRIB_INSTNS", enumType.toEnumNameString());
        assertEquals("13 - Invalid/unacceptable No Distrib Instns", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("INVALID_DISTRIB_PERCENTAGE", enumType.toEnumNameString());
        assertEquals("14 - Invalid/unacceptable Distrib Percentage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD;
        assertEquals("15", enumType.toEnumIDString());
        assertEquals("INVALID_DISTRIB_PAYMENT_METHOD", enumType.toEnumNameString());
        assertEquals("15 - Invalid/unacceptable Distrib Payment Method", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME;
        assertEquals("16", enumType.toEnumIDString());
        assertEquals("INVALID_CDA_ACCT_NAME", enumType.toEnumNameString());
        assertEquals("16 - Invalid/unacceptable Cash Distrib Agent Acct Name", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_CODE;
        assertEquals("17", enumType.toEnumIDString());
        assertEquals("INVALID_CDA_CODE", enumType.toEnumNameString());
        assertEquals("17 - Invalid/unacceptable Cash Distrib Agent Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM;
        assertEquals("18", enumType.toEnumIDString());
        assertEquals("INVALID_CDA_ACCT_NUM", enumType.toEnumNameString());
        assertEquals("18 - Invalid/unacceptable Cash Distrib Agent Acct Num", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  99 type
         */
        enumType = Enum507RegistRejReasonCode.OTHER;
        assertEquals("99", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}