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

class Enum585MassStatusReqTypeTest {
    /**
     *  Information is the same for TAGS 585
     */
    @Test
    void Enum0585Test() {
        Enum585MassStatusReqType enumType;

        /*
         *  1-8 types
         */
        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_SECURITY", enumType.toFIXNameString());
        assertEquals("1 - Status for orders for a Security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_UNDERLYING;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_UNDERLYING", enumType.toFIXNameString());
        assertEquals("2 - Status for orders for an Underlying Security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_PRODUCT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_PRODUCT", enumType.toFIXNameString());
        assertEquals("3 - Status for orders for a Product", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_CFICODE", enumType.toFIXNameString());
        assertEquals("4 - Status for orders for a CFICode", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITYTYPE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_SECURITYTYPE", enumType.toFIXNameString());
        assertEquals("5 - Status for orders for a SecurityType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_SESSION;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_SESSION", enumType.toFIXNameString());
        assertEquals("6 - Status for orders for a trading session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ALL_ORDERS;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("STATUS_ALL_ORDERS", enumType.toFIXNameString());
        assertEquals("7 - Status for all orders", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("STATUS_ORDERS_FOR_PARTYID", enumType.toFIXNameString());
        assertEquals("8 - Status for orders for a PartyID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}