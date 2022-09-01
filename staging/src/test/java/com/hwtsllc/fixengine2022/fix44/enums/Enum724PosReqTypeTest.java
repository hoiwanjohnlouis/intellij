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

/**
 *  724
 *  PosReqType
 *  int
 *  <p></p>
 *  Used to specify the type of position request being made.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Positions
 *  <p>    1 - Trades
 *  <p>    2 - Exercises
 *  <p>    3 - Assignments
 *  <p>    4 - Settlement Activity
 *  <p></p>
 *  <p>    5 - Backout Message
 */
class Enum724PosReqTypeTest {
    @Test
    void EnumTest() {
        Enum724PosReqType enumType;

        enumType = Enum724PosReqType.POSITIONS;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "POSITIONS", enumType.toEnumNameString());
        assertEquals( "0 - Positions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum724PosReqType.TRADES;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "TRADES", enumType.toEnumNameString());
        assertEquals( "1 - Trades", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum724PosReqType.EXERCISES;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "EXERCISES", enumType.toEnumNameString());
        assertEquals( "2 - Exercises", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum724PosReqType.ASSIGNMENTS;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "ASSIGNMENTS", enumType.toEnumNameString());
        assertEquals( "3 - Assignments", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum724PosReqType.SETTLEMENT_ACTIVITY;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "SETTLEMENT_ACTIVITY", enumType.toEnumNameString());
        assertEquals( "4 - Settlement Activity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum724PosReqType.BACKOUT_MESSAGE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "BACKOUT_MESSAGE", enumType.toEnumNameString());
        assertEquals( "5 - Backout Message", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}