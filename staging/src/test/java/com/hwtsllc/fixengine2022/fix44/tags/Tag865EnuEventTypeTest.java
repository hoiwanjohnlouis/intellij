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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum865EventType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
    void FIXTest() {
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
        Enum665ConfirmStatus oneElement;

        tagData = new Tag865EnuEventType( Enum865EventType.PUT );
        assertEquals( Enum865EventType.PUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "865", fixData.toFIXIDString());
        assertEquals( "EVENT_TYPE", fixData.toFIXNameString());
        assertEquals( "EventType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

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
    @Test
    void PrintFIXTagTest() {
        Tag865EnuEventType tagData;

        // loop around the ENUM and process
        for ( Enum865EventType oneEnum : Enum865EventType.values()) {
            tagData = new Tag865EnuEventType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag865EnuEventType tagData;

        // loop around the ENUM and process
        for (Enum865EventType oneEnum : Enum865EventType.values()) {
            tagData = new Tag865EnuEventType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag865EnuEventType tagData;

        // loop around the ENUM and process
        for (Enum865EventType oneEnum : Enum865EventType.values()) {
            tagData = new Tag865EnuEventType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag865EnuEventType tagData;

        // loop around the ENUM and process
        for (Enum865EventType oneEnum : Enum865EventType.values()) {
            tagData = new Tag865EnuEventType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag865EnuEventType tagData;

        // loop around the ENUM and process
        for (Enum865EventType oneEnum : Enum865EventType.values()) {
            tagData = new Tag865EnuEventType(oneEnum);
            assertEquals( "Tag865EnuEventType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}