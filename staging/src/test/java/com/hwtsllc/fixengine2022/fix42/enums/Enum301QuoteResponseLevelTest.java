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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum301QuoteResponseLevelTest {
    @Test
    void Enum0301Test() {
        Enum301QuoteResponseLevel enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT;
        assertEquals("0", enumType.getID());
        assertEquals("NO_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("0 - No Acknowledgement (default)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS;
        assertEquals("1", enumType.getID());
        assertEquals("ACKNOWLEDGE_NEGATIVE_OR_ERRORS", enumType.getName());
        assertEquals("1 - Acknowledge only negative or erroneous quotes", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE;
        assertEquals("2", enumType.getID());
        assertEquals("ACKNOWLEDGE_EACH_QUOTE", enumType.getName());
        assertEquals("2 - Acknowledge each quote messages", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}