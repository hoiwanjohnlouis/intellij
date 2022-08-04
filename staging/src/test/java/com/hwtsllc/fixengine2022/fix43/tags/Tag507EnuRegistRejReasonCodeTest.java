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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum507RegistRejReasonCode;
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
class Tag507EnuRegistRejReasonCodeTest {
    Tag507EnuRegistRejReasonCode tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( "FIX507_ENU_REGIST_REJ_REASON_CODE", tagData.toEnumLabelString());
            assertEquals( "507", tagData.toEnumIDString());
            assertEquals( "REGIST_REJ_REASON_CODE", tagData.toEnumNameString());
            assertEquals( "RegistRejReasonCode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  1-18, 99 types
         */

        /*
         *  1-18, types
         */
        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_ACCOUNT_TYPE );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_REG_DETAILS );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS );
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID );
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE );
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH );
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE );
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS );
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE );
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD );
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME );
        assertEquals( "16", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_CODE );
        assertEquals( "17", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM );
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  99 type
         */
        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.OTHER );
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum507RegistRejReasonCode oneEnum : Enum507RegistRejReasonCode.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( "Tag507EnuRegistRejReasonCode\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}