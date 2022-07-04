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
import com.hwtsllc.fixengine2022.fix42.enums.Enum263SubscriptionRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  263
 *  SubscriptionRequestType
 *  char
 *  <p>
 *  Subscription Request Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Snapshot
 *  <p>    1 - Snapshot + Updates (Subscribe)
 *  <p>    2 - Disable previous Snapshot + Update Request (Unsubscribe)
 */
class Tag263EnuSubscriptionRequestTypeTest {
    @Test
    void FIX0263Test() {
        FIX42 fixData = FIX42.FIX263_ENU_SUBSCRIPTION_REQUEST_TYPE;
        assertEquals( "263", fixData.toEnumIDString());
        assertEquals( "SUBSCRIPTION_REQUEST_TYPE", fixData.toEnumNameString());
        assertEquals( "SubscriptionRequestType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0263Test() {
        Tag263EnuSubscriptionRequestType tagData;

        /*
         * 0-2 msg types
         */
        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.SNAPSHOT);
        assertEquals( Enum263SubscriptionRequestType.SNAPSHOT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.SUBSCRIBE_SNAPSHOT);
        assertEquals( Enum263SubscriptionRequestType.SUBSCRIBE_SNAPSHOT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag263EnuSubscriptionRequestType(Enum263SubscriptionRequestType.UNSUBSCRIBE_SNAPSHOT);
        assertEquals( Enum263SubscriptionRequestType.UNSUBSCRIBE_SNAPSHOT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag263EnuSubscriptionRequestType tagData;

        // loop around the ENUM and process
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag263EnuSubscriptionRequestType tagData;

        // loop around the ENUM and process
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag263EnuSubscriptionRequestType tagData;

        // loop around the ENUM and process
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag263EnuSubscriptionRequestType tagData;

        // loop around the ENUM and process
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag263EnuSubscriptionRequestType tagData;

        // loop around the ENUM and process
        for (Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( "Tag263EnuSubscriptionRequestType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}