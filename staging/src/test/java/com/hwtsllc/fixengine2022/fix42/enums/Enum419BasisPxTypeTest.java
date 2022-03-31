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

class Enum419BasisPxTypeTest {
    @Test
    void Enum0419Test() {
        Enum419BasisPxType enumType;

        /*
         * 2-9, A-D, Z msg types
         */
        enumType = Enum419BasisPxType.CLOSING_PRICE_MORNING;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.CLOSING_PRICE;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.CURRENT_PRICE;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.SQ;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_DAY;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_MORNING;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.STRIKE;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum419BasisPxType.OPEN;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
        assertEquals( "", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum419BasisPxType.OTHER;
        assertEquals( "", enumType.getID());
        assertEquals( "", enumType.getName());
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