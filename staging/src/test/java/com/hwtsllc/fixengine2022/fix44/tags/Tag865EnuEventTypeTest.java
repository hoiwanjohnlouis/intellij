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
import com.hwtsllc.fixengine2022.fix44.enums.Enum865EventType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  865
 *  EventType
 *  int
 *  Code to represent the type of event
 *  Valid values:
 *      1 - Put
 *      2 - Call
 *      3 - Tender
 *      4 - Sinking Fund Call
 *      5 - Activation
 *
 *      6 - Inactivation
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Tag865EnuEventTypeTest {
    @Test
    void FIX0865Test() {
        FIX44 fixData = FIX44.FIX865_ENU_EVENT_TYPE;
        assertEquals( "865", fixData.getID());
        assertEquals( "EVENT_TYPE", fixData.getName());
        assertEquals( "EventType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0865Test() {
        Log865EnuEventType tagData;

        tagData = new Log865EnuEventType( Enum865EventType.PUT );
        assertEquals( Enum865EventType.PUT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log865EnuEventType( Enum865EventType.CALL );
        assertEquals( Enum865EventType.CALL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log865EnuEventType( Enum865EventType.TENDER );
        assertEquals( Enum865EventType.TENDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log865EnuEventType( Enum865EventType.SINKING_FUND_CALL );
        assertEquals( Enum865EventType.SINKING_FUND_CALL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log865EnuEventType( Enum865EventType.ACTIVATION );
        assertEquals( Enum865EventType.ACTIVATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log865EnuEventType( Enum865EventType.INACTIVATION );
        assertEquals( Enum865EventType.INACTIVATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log865EnuEventType( Enum865EventType.OTHER );
        assertEquals( Enum865EventType.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}