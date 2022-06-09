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
 *  <p></p>
 *  Code to represent the type of event
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Put
 *  <p>    2 - Call
 *  <p>    3 - Tender
 *  <p>    4 - Sinking Fund Call
 *  <p>    5 - Activation
 *  <p></p>
 *  <p>    6 - Inactivation
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag865EnuEventTypeTest {
    @Test
    void FIX0865Test() {
        FIX44 fixData = FIX44.FIX865_ENU_EVENT_TYPE;
        assertEquals( "865", fixData.toFIXIDString());
        assertEquals( "EVENT_TYPE", fixData.toFIXNameString());
        assertEquals( "EventType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0865Test() {
        Tag865EnuEventType tagData;

        tagData = new Tag865EnuEventType( Enum865EventType.PUT );
        assertEquals( Enum865EventType.PUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag865EnuEventType( Enum865EventType.CALL );
        assertEquals( Enum865EventType.CALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag865EnuEventType( Enum865EventType.TENDER );
        assertEquals( Enum865EventType.TENDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag865EnuEventType( Enum865EventType.SINKING_FUND_CALL );
        assertEquals( Enum865EventType.SINKING_FUND_CALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag865EnuEventType( Enum865EventType.ACTIVATION );
        assertEquals( Enum865EventType.ACTIVATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag865EnuEventType( Enum865EventType.INACTIVATION );
        assertEquals( Enum865EventType.INACTIVATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag865EnuEventType( Enum865EventType.OTHER );
        assertEquals( Enum865EventType.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}