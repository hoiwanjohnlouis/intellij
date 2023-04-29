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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum263SubscriptionRequestType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag263EnuSubscriptionRequestTypeTest {
    Tag263EnuSubscriptionRequestType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( "FIX263_ENU_SUBSCRIPTION_REQUEST_TYPE", tagData.toFIXLabelString());
            assertEquals( "263", tagData.toFIXIDString());
            assertEquals( "SUBSCRIPTION_REQUEST_TYPE", tagData.toFIXNameString());
            assertEquals( "SubscriptionRequestType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  263
         *  SubscriptionRequestType
         *  char
         *  <p>    0 - Snapshot
         *  <p>    1 - Snapshot + Updates (Subscribe)
         *  <p>    2 - Disable previous Snapshot + Update Request (Unsubscribe)
         */
        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.SNAPSHOT);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.SUBSCRIBE_SNAPSHOT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.UNSUBSCRIBE_SNAPSHOT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( "Tag263EnuSubscriptionRequestType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}