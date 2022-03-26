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

package com.hwtsllc.fixengine2022.fix27.enums;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum59TimeInForceTest {

    @Test
    void Enum0059Test() {
        Enum59TimeInForce enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum59TimeInForce.DAY;
        assertEquals("0", enumType.getID());
        assertEquals("DAY", enumType.getName());
        assertEquals("0 - Day (or session)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.GOOD_TILL_CANCEL;
        assertEquals("1", enumType.getID());
        assertEquals("GOOD_TILL_CANCEL", enumType.getName());
        assertEquals("1 - Good Till Cancel (GTC)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.AT_THE_OPENING;
        assertEquals("2", enumType.getID());
        assertEquals("AT_THE_OPENING", enumType.getName());
        assertEquals("2 - At the Opening (OPG)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.IMMEDIATE_OR_CANCEL;
        assertEquals("3", enumType.getID());
        assertEquals("IMMEDIATE_OR_CANCEL", enumType.getName());
        assertEquals("3 - Immediate Or Cancel (IOC)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.FILL_OR_KILL;
        assertEquals("4", enumType.getID());
        assertEquals("FILL_OR_KILL", enumType.getName());
        assertEquals("4 - Fill Or Kill (FOK)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.GOOD_TILL_CROSSING;
        assertEquals("5", enumType.getID());
        assertEquals("GOOD_TILL_CROSSING", enumType.getName());
        assertEquals("5 - Good Till Crossing (GTX)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.GOOD_TILL_DATE;
        assertEquals("6", enumType.getID());
        assertEquals("GOOD_TILL_DATE", enumType.getName());
        assertEquals("6 - Good Till Date (GTD)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum59TimeInForce.AT_THE_CLOSE;
        assertEquals("7", enumType.getID());
        assertEquals("AT_THE_CLOSE", enumType.getName());
        assertEquals("7 - At the Close", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}