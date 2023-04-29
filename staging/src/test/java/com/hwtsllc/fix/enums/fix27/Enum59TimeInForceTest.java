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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  59
 *  TimeInForce
 *  char
 *  <p></p>
 *  Specifies how long the order remains in effect.
 *  <p></p>
 *  Absence of this field is interpreted as DAY.
 *  <p></p>
 *  NOTE not applicable to CIV Orders.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Day (or session)
 *  <p>    1 - Good Till Cancel (GTC)
 *  <p>    2 - At the Opening (OPG)
 *  <p>    3 - Immediate Or Cancel (IOC)
 *  <p>    4 - Fill Or Kill (FOK)
 *  <p></p>
 *  <p>    5 - Good Till Crossing (GTX)
 *  <p>    6 - Good Till Date (GTD)
 *  <p>    7 - At the Close
 */
class Enum59TimeInForceTest {
    @Test
    void Enum0059Test() {
        Enum59TimeInForce enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum59TimeInForce.DAY;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("DAY", enumType.toFIXNameString());
        assertEquals("0 - Day (or session)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.GOOD_TILL_CANCEL;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("GOOD_TILL_CANCEL", enumType.toFIXNameString());
        assertEquals("1 - Good Till Cancel (GTC)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.AT_THE_OPENING;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("AT_THE_OPENING", enumType.toFIXNameString());
        assertEquals("2 - At the Opening (OPG)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.IMMEDIATE_OR_CANCEL;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("IMMEDIATE_OR_CANCEL", enumType.toFIXNameString());
        assertEquals("3 - Immediate Or Cancel (IOC)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.FILL_OR_KILL;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("FILL_OR_KILL", enumType.toFIXNameString());
        assertEquals("4 - Fill Or Kill (FOK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum59TimeInForce.GOOD_TILL_CROSSING;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("GOOD_TILL_CROSSING", enumType.toFIXNameString());
        assertEquals("5 - Good Till Crossing (GTX)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.GOOD_TILL_DATE;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("GOOD_TILL_DATE", enumType.toFIXNameString());
        assertEquals("6 - Good Till Date (GTD)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum59TimeInForce.AT_THE_CLOSE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("AT_THE_CLOSE", enumType.toFIXNameString());
        assertEquals("7 - At the Close", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}