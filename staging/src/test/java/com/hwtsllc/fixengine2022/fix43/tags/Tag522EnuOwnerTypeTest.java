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
import com.hwtsllc.fixengine2022.fix43.enums.Enum522OwnerType;
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
class Tag522EnuOwnerTypeTest {
    @Test
    void FIX0522Test() {
        FIX43 fixData = FIX43.FIX522_ENU_OWNER_TYPE;
        assertEquals( "522", fixData.toFIXIDString());
        assertEquals( "OWNER_TYPE", fixData.toFIXNameString());
        assertEquals( "OwnerType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0522Test() {
        Tag522EnuOwnerType tagData;

        /*
         * 1-13 types
         */
        tagData = new Tag522EnuOwnerType( Enum522OwnerType.INDIVIDUAL_INVESTOR );
        assertEquals( Enum522OwnerType.INDIVIDUAL_INVESTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PUBLIC_COMPANY );
        assertEquals( Enum522OwnerType.PUBLIC_COMPANY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PRIVATE_COMPANY );
        assertEquals( Enum522OwnerType.PRIVATE_COMPANY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.INDIVIDUAL_TRUSTEE );
        assertEquals( Enum522OwnerType.INDIVIDUAL_TRUSTEE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.COMPANY_TRUSTEE );
        assertEquals( Enum522OwnerType.COMPANY_TRUSTEE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag522EnuOwnerType( Enum522OwnerType.PENSION_PLAN );
        assertEquals( Enum522OwnerType.PENSION_PLAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.CUSTODIAN_MINORS_ACT );
        assertEquals( Enum522OwnerType.CUSTODIAN_MINORS_ACT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.TRUSTS );
        assertEquals( Enum522OwnerType.TRUSTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.FIDUCIARIES );
        assertEquals( Enum522OwnerType.FIDUCIARIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NETWORKING_SUB_ACCOUNT );
        assertEquals( Enum522OwnerType.NETWORKING_SUB_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NON_PROFIT_ORGANIZATION );
        assertEquals( Enum522OwnerType.NON_PROFIT_ORGANIZATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.CORPORATE_BODY );
        assertEquals( Enum522OwnerType.CORPORATE_BODY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag522EnuOwnerType( Enum522OwnerType.NOMINEE );
        assertEquals( Enum522OwnerType.NOMINEE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}