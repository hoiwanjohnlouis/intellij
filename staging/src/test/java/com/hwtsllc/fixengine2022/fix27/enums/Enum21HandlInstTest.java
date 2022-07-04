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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  21
 *  HandlInst
 *  char
 *  <p></p>
 *  Instructions for order handling on Broker trading floor
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automated execution order, private, no Broker intervention
 *  <p>    2 - Automated execution order, public, Broker intervention OK
 *  <p>    3 - Manual order, best execution
 */
class Enum21HandlInstTest {
    @Test
    void Enum0021Test() {
        Enum21HandlInst enumType;

        /*
         *  1-3
         */
        enumType = Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("AUTOMATIC_EXECUTION_NO_BROKER", enumType.toEnumNameString());
        assertEquals("1 - Automated execution order, private, no Broker intervention", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("AUTOMATIC_EXECUTION_BROKER_OKAY", enumType.toEnumNameString());
        assertEquals("2 - Automated execution order, public, Broker intervention OK", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum21HandlInst.MANUAL_ORDER_BEST_EXECUTION;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("MANUAL_ORDER_BEST_EXECUTION", enumType.toEnumNameString());
        assertEquals("3 - Manual order, best execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}