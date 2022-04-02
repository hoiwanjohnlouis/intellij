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

class Enum281MDReqRejReasonTest {
    @Test
    void Enum0281Test() {
        Enum281MDReqRejReason enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum281MDReqRejReason.UNKNOWN_SYMBOL;
        assertEquals( "0", enumType.getID());
        assertEquals( "UNKNOWN_SYMBOL", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.DUPLICATE_MDREQID;
        assertEquals( "1", enumType.getID());
        assertEquals( "DUPLICATE_MDREQID", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH;
        assertEquals( "2", enumType.getID());
        assertEquals( "INSUFFICIENT_BANDWIDTH", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS;
        assertEquals( "3", enumType.getID());
        assertEquals( "INSUFFICIENT_PERMISSIONS", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
        assertEquals( "4", enumType.getID());
        assertEquals( "UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH;
        assertEquals( "5", enumType.getID());
        assertEquals( "UNSUPPORTED_MARKETDEPTH", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE;
        assertEquals( "6", enumType.getID());
        assertEquals( "UNSUPPORTED_MDUPDATETYPE", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK;
        assertEquals( "7", enumType.getID());
        assertEquals( "UNSUPPORTED_AGGREGATEDBOOK", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE;
        assertEquals( "8", enumType.getID());
        assertEquals( "UNSUPPORTED_MDENTRYTYPE", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID;
        assertEquals( "9", enumType.getID());
        assertEquals( "UNSUPPORTED_TRADINGSESSIONID", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        /*
         * A-D msg types
         */
        enumType = Enum281MDReqRejReason.UNSUPPORTED_SCOPE;
        assertEquals( "A", enumType.getID());
        assertEquals( "UNSUPPORTED_SCOPE", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG;
        assertEquals( "B", enumType.getID());
        assertEquals( "UNSUPPORTED_OPENCLOSESETTLEFLAG", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE;
        assertEquals( "C", enumType.getID());
        assertEquals( "UNSUPPORTED_MDIMPLICITDELETE", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
        assertEquals( "D", enumType.getID());
        assertEquals( "INSUFFICIENT_CREDIT", enumType.getName());
        assertEquals( "", enumType.getDescription());
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