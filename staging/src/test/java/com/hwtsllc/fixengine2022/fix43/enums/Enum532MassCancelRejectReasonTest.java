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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum532MassCancelRejectReasonTest {
    /**
     *  Information is the same for TAGS 532
     */
    @Test
    void Enum0532Test() {
        Enum532MassCancelRejectReason enumType;

        /*
         *  0-6, 99, types
         */

        /*
         *  0-6, types
         */
        enumType = Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,MASS_CANCEL_NOT_SUPPORTED,0 - Mass Cancel Not Supported", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,UNKNOWN_SECURITY,1 - Invalid or Unknown Security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,UNKNOWN_UNDERLYING,2 - Invalid or Unknown Underlying security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_PRODUCT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,UNKNOWN_PRODUCT,3 - Invalid or Unknown Product", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_CFICODE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,UNKNOWN_CFICODE,4 - Invalid or Unknown CFICode", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,UNKNOWN_SECURITYTYPE,5 - Invalid or Unknown SecurityType", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SESSION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,UNKNOWN_SESSION,6 - Invalid or Unknown Trading Session", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  99, type
         */
        enumType = Enum532MassCancelRejectReason.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}