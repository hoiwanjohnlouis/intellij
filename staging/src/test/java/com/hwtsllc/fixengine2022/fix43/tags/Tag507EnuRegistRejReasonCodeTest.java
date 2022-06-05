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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag507EnuRegistRejReasonCode;
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
    @Test
    void FIX0507Test() {
        FIX43 fixData = FIX43.FIX507_ENU_REGIST_REJ_REASON_CODE;
        assertEquals( "507", fixData.toFIXIDString());
        assertEquals( "REGIST_REJ_REASON_CODE", fixData.toFIXNameString());
        assertEquals( "RegistRejReasonCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0507Test() {
        Tag507EnuRegistRejReasonCode tagData;

        /*
         *  1-18, 99 types
         */


        /*
         *  1-18, types
         */
        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_ACCOUNT_TYPE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_ACCOUNT_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_TAX_EXEMPT_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_OWNERSHIP_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS );
        assertEquals( Enum507RegistRejReasonCode.INVALID_NO_REG_DETAILS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO );
        assertEquals( Enum507RegistRejReasonCode.INVALID_REG_SEQ_NO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_REG_DETAILS );
        assertEquals( Enum507RegistRejReasonCode.INVALID_REG_DETAILS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS );
        assertEquals( Enum507RegistRejReasonCode.INVALID_MAILING_DETAILS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS );
        assertEquals( Enum507RegistRejReasonCode.INVALID_MAILING_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID );
        assertEquals( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_INVESTOR_ID_SOURCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH );
        assertEquals( Enum507RegistRejReasonCode.INVALID_DATE_OF_BIRTH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_COUNTRY_OF_RESIDENCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS );
        assertEquals( Enum507RegistRejReasonCode.INVALID_NO_DISTRIB_INSTNS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_DISTRIB_PERCENTAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD );
        assertEquals( Enum507RegistRejReasonCode.INVALID_DISTRIB_PAYMENT_METHOD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME );
        assertEquals( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_CODE );
        assertEquals( Enum507RegistRejReasonCode.INVALID_CDA_CODE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM );
        assertEquals( Enum507RegistRejReasonCode.INVALID_CDA_ACCT_NUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  99 type
         */
        tagData = new Tag507EnuRegistRejReasonCode( Enum507RegistRejReasonCode.OTHER );
        assertEquals( Enum507RegistRejReasonCode.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag507EnuRegistRejReasonCode tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag507EnuRegistRejReasonCode tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag507EnuRegistRejReasonCode tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag507EnuRegistRejReasonCode tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag507EnuRegistRejReasonCode tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag507EnuRegistRejReasonCode(oneEnum);
            assertEquals( "Tag507EnuRegistRejReasonCode\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}