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

import com.hwtsllc.fixengine2022.fix43.enums.Enum522OwnerType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag522EnuOwnerTypeTest {
    Tag522EnuOwnerType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            tagData = new Tag522EnuOwnerType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            tagData = new Tag522EnuOwnerType(oneEnum);
            assertEquals( "FIX522_ENU_OWNER_TYPE", tagData.toFIXLabelString());
            assertEquals( "522", tagData.toFIXIDString());
            assertEquals( "OWNER_TYPE", tagData.toFIXNameString());
            assertEquals( "OwnerType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            tagData = new Tag522EnuOwnerType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  522
         *  OwnerType
         *  int
         *  <p>    1 - Individual Investor
         *  <p>    2 - Public Company
         *  <p>    3 - Private Company
         *  <p>    4 - Individual Trustee
         *  <p>    5 - Company Trustee
         */
        tagData = new Tag522EnuOwnerType( Enum522OwnerType.INDIVIDUAL_INVESTOR );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PUBLIC_COMPANY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PRIVATE_COMPANY );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.INDIVIDUAL_TRUSTEE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.COMPANY_TRUSTEE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Pension Plan
         *  <p>    7 - Custodian Under Gifts to Minors Act
         *  <p>    8 - Trusts
         *  <p>    9 - Fiduciaries
         *  <p>    10 - Networking Sub-account
         */
        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PENSION_PLAN );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.CUSTODIAN_MINORS_ACT );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.TRUSTS );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.FIDUCIARIES );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NETWORKING_SUB_ACCOUNT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Non-profit organization
         *  <p>    12 - Corporate Body
         *  <p>    13 - Nominee
         */
        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NON_PROFIT_ORGANIZATION );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.CORPORATE_BODY );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NOMINEE );
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            tagData = new Tag522EnuOwnerType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum522OwnerType oneEnum : Enum522OwnerType.values()) {
            tagData = new Tag522EnuOwnerType(oneEnum);
            assertEquals( "Tag522EnuOwnerType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}