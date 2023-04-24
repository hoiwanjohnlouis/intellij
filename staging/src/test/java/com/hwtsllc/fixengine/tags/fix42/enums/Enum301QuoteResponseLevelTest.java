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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  301
 *  QuoteResponseLevel
 *  int
 *  <p>
 *  Level of Response requested from receiver of quote messages.
 *  <p></p>
 *  Valid values:
 *  <p>    0-2 msg types
 *  <p>    "0 - No Acknowledgement (default)"
 *  <p>    "1 - Acknowledge only negative or erroneous quotes"
 *  <p>    "2 - Acknowledge each quote messages"
 */
class Enum301QuoteResponseLevelTest {
    @Test
    void Enum0301Test() {
        Enum301QuoteResponseLevel enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NO_ACKNOWLEDGEMENT", enumType.toFIXNameString());
        assertEquals("0 - No Acknowledgement (default)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("ACKNOWLEDGE_NEGATIVE_OR_ERRORS", enumType.toFIXNameString());
        assertEquals("1 - Acknowledge only negative or erroneous quotes", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ACKNOWLEDGE_EACH_QUOTE", enumType.toFIXNameString());
        assertEquals("2 - Acknowledge each quote messages", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}