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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum724PosReqType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  724
 *  PosReqType
 *  Used to specify the type of position request being made.
 *  Valid values:
 *      0 - Positions
 *      1 - Trades
 *      2 - Exercises
 *      3 - Assignments
 *      4 - Settlement Activity
 *      5 - Backout Message
 */
class Tag724EnuPosReqTypeTest {
    @Test
    void FIX0724Test() {
        FIX44 fixData = FIX44.FIX724_ENU_POS_REQ_TYPE;
        assertEquals( "724", fixData.toFIXIDString());
        assertEquals( "POS_REQ_TYPE", fixData.toFIXNameString());
        assertEquals( "PosReqType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0724Test() {
        Tag724EnuPosReqType tagData;

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.POSITIONS);
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.TRADES);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.EXERCISES);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.ASSIGNMENTS);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.SETTLEMENT_ACTIVITY);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag724EnuPosReqType(Enum724PosReqType.BACKOUT_MESSAGE);
        assertEquals( "5", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}