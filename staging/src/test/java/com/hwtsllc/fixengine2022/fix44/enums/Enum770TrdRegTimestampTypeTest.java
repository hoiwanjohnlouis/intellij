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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum770TrdRegTimestampTypeTest {
    /**
     *  770
     *  TrdRegTimestampType
     *  Traded / Regulatory timestamp type.
     *  Note of Applicability:
     *      values are required in US futures markets by the CFTC to
     *      support computerized trade reconstruction.
     *      (see Volume : "Glossary" for value definitions)
     *  Valid values:
     *      1 - Execution Time
     *      2 - Time In
     *      3 - Time Out
     *      4 - Broker Receipt
     *      5 - Broker Execution
     *      6 - Desk Receipt
     */
    @Test
    void EnumTest() {
        Enum770TrdRegTimestampType enumType;

        enumType = Enum770TrdRegTimestampType.EXECUTION_TIME;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("EXECUTION_TIME", enumType.toFIXNameString());
        assertEquals("1 - Execution Time", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum770TrdRegTimestampType.TIME_IN;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("TIME_IN", enumType.toFIXNameString());
        assertEquals("2 - Time In", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum770TrdRegTimestampType.TIME_OUT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("TIME_OUT", enumType.toFIXNameString());
        assertEquals("3 - Time Out", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum770TrdRegTimestampType.BROKER_RECEIPT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("BROKER_RECEIPT", enumType.toFIXNameString());
        assertEquals("4 - Broker Receipt", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum770TrdRegTimestampType.BROKER_EXECUTION;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("BROKER_EXECUTION", enumType.toFIXNameString());
        assertEquals("5 - Broker Execution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum770TrdRegTimestampType.DESK_RECEIPT;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("DESK_RECEIPT", enumType.toFIXNameString());
        assertEquals("6 - Desk Receipt", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}