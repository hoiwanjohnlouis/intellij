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

package com.hwtsllc.fixengine2022.fix41.enums;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum156SettlCurrFxRateCalcTest {

    @Test
    void Enum0156Test() {
        Enum156SettlCurrFxRateCalc enumType;

        /*
         * M,D msg types
         */
        enumType = Enum156SettlCurrFxRateCalc.MULTIPLY;
        assertEquals("M", enumType.getID());
        assertEquals("MULTIPLY", enumType.getName());
        assertEquals("M - Multiply", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum156SettlCurrFxRateCalc.DIVIDE;
        assertEquals("D", enumType.getID());
        assertEquals("DIVIDE", enumType.getName());
        assertEquals("D - Divide", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}