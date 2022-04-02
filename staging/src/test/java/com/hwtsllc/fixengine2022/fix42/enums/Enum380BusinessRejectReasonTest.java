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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum380BusinessRejectReasonTest {
    @Test
    void Enum0380Test() {
        Enum380BusinessRejectReason enumType;

        /*
         * 0-6, 18 msg types
         */
        enumType = Enum380BusinessRejectReason.OTHER;
        assertEquals( "0", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "0 - Other", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.UNKNOWN_ID;
        assertEquals( "1", enumType.getID());
        assertEquals( "UNKNOWN_ID", enumType.getName());
        assertEquals( "1 - Unknown ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.UNKNOWN_SECURITY;
        assertEquals( "2", enumType.getID());
        assertEquals( "UNKNOWN_SECURITY", enumType.getName());
        assertEquals( "2 - Unknown Security", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE;
        assertEquals( "3", enumType.getID());
        assertEquals( "UNKNOWN_MESSAGE_TYPE", enumType.getName());
        assertEquals( "3 - Unknown Message Type", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE;
        assertEquals( "4", enumType.getID());
        assertEquals( "APPLICATION_NOT_AVAILABLE", enumType.getName());
        assertEquals( "4 - Application not available", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING;
        assertEquals( "5", enumType.getID());
        assertEquals( "REQUIRED_FIELD_MISSING", enumType.getName());
        assertEquals( "5 - Conditionally required field missing", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.NOT_AUTHORIZED;
        assertEquals( "6", enumType.getID());
        assertEquals( "NOT_AUTHORIZED", enumType.getName());
        assertEquals( "6 - Not Authorized", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE;
        assertEquals( "7", enumType.getID());
        assertEquals( "DELIVERTO_FIRM_NOT_AVAILABLE", enumType.getName());
        assertEquals( "7 - DeliverTo firm not available at this time", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT;
        assertEquals( "18", enumType.getID());
        assertEquals( "INVALID_PRICE_INCREMENT", enumType.getName());
        assertEquals( "18 - Invalid price increment", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}