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
        assertEquals("CANCEL_REQUEST_REJECTED", enumType.getName());
        assertEquals("0 - Cancel Request Rejected - See MassCancelRejectReason (532)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITY;
        assertEquals("1", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_SECURITY", enumType.getName());
        assertEquals("1 - Cancel orders for a security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_UNDERLYING;
        assertEquals("2", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_UNDERLYING", enumType.getName());
        assertEquals("2 - Cancel orders for an underlying security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_PRODUCT;
        assertEquals("3", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_PRODUCT", enumType.getName());
        assertEquals("3 - Cancel orders for a Product", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_CFICODE;
        assertEquals("4", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_CFICODE", enumType.getName());
        assertEquals("4 - Cancel orders for a CFICode", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE;
        assertEquals("5", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_SECURITYTYPE", enumType.getName());
        assertEquals("5 - Cancel orders for a SecurityType", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SESSION;
        assertEquals("6", enumType.getID());
        assertEquals("CANCEL_ORDERS_FOR_SESSION", enumType.getName());
        assertEquals("6 - Cancel orders for a trading session", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum531MassCancelResponse.CANCEL_ALL_ORDERS;
        assertEquals("7", enumType.getID());
        assertEquals("CANCEL_ALL_ORDERS", enumType.getName());
        assertEquals("7 - Cancel all orders", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}