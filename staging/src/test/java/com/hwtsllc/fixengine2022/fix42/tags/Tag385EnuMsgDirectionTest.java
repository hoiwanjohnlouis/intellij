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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum385MsgDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  385
 *  MsgDirection
 *  char
 *  <p>
 *  Specifies the direction of the messsage.
 *  <p></p>
 *  Valid values:
 *  <p>    R - Receive
 *  <p>    S - Send
 */
class Tag385EnuMsgDirectionTest {
    @Test
    void FIX0385Test() {
        FIX42 fixData = FIX42.FIX385_ENU_MSG_DIRECTION;
        assertEquals( "385", fixData.toFIXIDString());
        assertEquals( "MSG_DIRECTION", fixData.toFIXNameString());
        assertEquals( "MsgDirection", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0385Test() {
        Tag385EnuMsgDirection tagData;

        /*
         * R, and S msg types
         */
        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.RECEIVE);
        assertEquals( Enum385MsgDirection.RECEIVE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.SEND);
        assertEquals( Enum385MsgDirection.SEND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}