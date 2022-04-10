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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,STATUS_ORDERS_FOR_SECURITY,1 - Status for orders for a Security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_UNDERLYING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,STATUS_ORDERS_FOR_UNDERLYING,2 - Status for orders for an Underlying Security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_PRODUCT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,STATUS_ORDERS_FOR_PRODUCT,3 - Status for orders for a Product", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,STATUS_ORDERS_FOR_CFICODE,4 - Status for orders for a CFICode", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITYTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,STATUS_ORDERS_FOR_SECURITYTYPE,5 - Status for orders for a SecurityType", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_SESSION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,STATUS_ORDERS_FOR_SESSION,6 - Status for orders for a trading session", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ALL_ORDERS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,STATUS_ALL_ORDERS,7 - Status for all orders", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,STATUS_ORDERS_FOR_PARTYID,8 - Status for orders for a PartyID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}