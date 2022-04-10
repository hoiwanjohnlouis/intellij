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

class Enum531MassCancelResponseTest {
    /**
     *  Information is the same for TAGS 531
     */
    @Test
    void Enum0531Test() {
        Enum531MassCancelResponse enumType;

        /*
         *  0-7 types
         */
        enumType = Enum531MassCancelResponse.CANCEL_REQUEST_REJECTED;
        assertEquals("0", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,CANCEL_REQUEST_REJECTED,0 - Cancel Request Rejected - See MassCancelRejectReason (532)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITY;
        assertEquals("1", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CANCEL_ORDERS_FOR_SECURITY,1 - Cancel orders for a security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_UNDERLYING;
        assertEquals("2", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("[2,CANCEL_ORDERS_FOR_UNDERLYING,2 - Cancel orders for an underlying security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_PRODUCT;
        assertEquals("3", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,CANCEL_ORDERS_FOR_PRODUCT,3 - Cancel orders for a Product", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_CFICODE;
        assertEquals("4", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,CANCEL_ORDERS_FOR_CFICODE,4 - Cancel orders for a CFICode", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE;
        assertEquals("5", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,CANCEL_ORDERS_FOR_SECURITYTYPE,5 - Cancel orders for a SecurityType", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SESSION;
        assertEquals("6", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,CANCEL_ORDERS_FOR_SESSION,6 - Cancel orders for a trading session", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ALL_ORDERS;
        assertEquals("7", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,CANCEL_ALL_ORDERS,7 - Cancel all orders", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}