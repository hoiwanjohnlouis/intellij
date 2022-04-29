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
import com.hwtsllc.fixengine2022.fix42.enums.Enum385MsgDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag385EnuMsgDirectionTest {
    @Test
    void FIX0385Test() {
        FIX42 fixData = FIX42.FIX385_ENU_MSG_DIRECTION;
        assertEquals( "385", fixData.getID());
        assertEquals( "MSG_DIRECTION", fixData.getName());
        assertEquals( "MsgDirection", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag385
     *  Enu
     *  MsgDirection
     *
     *      R, and S msg types
     *      RECEIVE( "R", "RECEIVE", "R - Receive" ),
     *      SEND( "S", "SEND", "S - Send" ),
     */
    @Test
    void Tag0385Test() {
        Tag385EnuMsgDirection tagData;

        /**
         * R, and S msg types
         */
        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.RECEIVE);
        assertEquals( Enum385MsgDirection.RECEIVE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag385EnuMsgDirection(Enum385MsgDirection.SEND);
        assertEquals( Enum385MsgDirection.SEND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}