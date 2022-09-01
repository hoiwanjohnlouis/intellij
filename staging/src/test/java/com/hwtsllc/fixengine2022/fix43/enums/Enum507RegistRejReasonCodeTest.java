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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("INVALID_ACCOUNT_TYPE", enumType.toFIXNameString());
        assertEquals("1 - Invalid/unacceptable Account Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INVALID_TAX_EXEMPT_TYPE", enumType.toFIXNameString());
        assertEquals("2 - Invalid/unacceptable Tax Exempt Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("INVALID_OWNERSHIP_TYPE", enumType.toFIXNameString());
        assertEquals("3 - Invalid/unacceptable Ownership Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("INVALID_NO_REG_DETAILS", enumType.toFIXNameString());
        assertEquals("4 - Invalid/unacceptable No Reg Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("INVALID_REG_SEQ_NO", enumType.toFIXNameString());
        assertEquals("5 - Invalid/unacceptable Reg Seq No", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_REG_DETAILS;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("INVALID_REG_DETAILS", enumType.toFIXNameString());
        assertEquals("6 - Invalid/unacceptable Reg Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("INVALID_MAILING_DETAILS", enumType.toFIXNameString());
        assertEquals("7 - Invalid/unacceptable Mailing Details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("INVALID_MAILING_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("8 - Invalid/unacceptable Mailing Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("INVALID_INVESTOR_ID", enumType.toFIXNameString());
        assertEquals("9 - Invalid/unacceptable Investor ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("INVALID_INVESTOR_ID_SOURCE", enumType.toFIXNameString());
        assertEquals("10 - Invalid/unacceptable Investor ID Source", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("INVALID_DATE_OF_BIRTH", enumType.toFIXNameString());
        assertEquals("11 - Invalid/unacceptable Date Of Birth", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("INVALID_COUNTRY_OF_RESIDENCE", enumType.toFIXNameString());
        assertEquals("12 - Invalid/unacceptable Investor Country Of Residence", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("INVALID_NO_DISTRIB_INSTNS", enumType.toFIXNameString());
        assertEquals("13 - Invalid/unacceptable No Distrib Instns", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("INVALID_DISTRIB_PERCENTAGE", enumType.toFIXNameString());
        assertEquals("14 - Invalid/unacceptable Distrib Percentage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("INVALID_DISTRIB_PAYMENT_METHOD", enumType.toFIXNameString());
        assertEquals("15 - Invalid/unacceptable Distrib Payment Method", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME;
        assertEquals("16", enumType.toFIXIDString());
        assertEquals("INVALID_CDA_ACCT_NAME", enumType.toFIXNameString());
        assertEquals("16 - Invalid/unacceptable Cash Distrib Agent Acct Name", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_CODE;
        assertEquals("17", enumType.toFIXIDString());
        assertEquals("INVALID_CDA_CODE", enumType.toFIXNameString());
        assertEquals("17 - Invalid/unacceptable Cash Distrib Agent Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("INVALID_CDA_ACCT_NUM", enumType.toFIXNameString());
        assertEquals("18 - Invalid/unacceptable Cash Distrib Agent Acct Num", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  99 type
         */
        enumType = Enum507RegistRejReasonCode.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}