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
            assertEquals( "FIX263_ENU_SUBSCRIPTION_REQUEST_TYPE", tagData.toEnumLabelString());
            assertEquals( "263", tagData.toEnumIDString());
            assertEquals( "SUBSCRIPTION_REQUEST_TYPE", tagData.toEnumNameString());
            assertEquals( "SubscriptionRequestType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
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

        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum263SubscriptionRequestType oneEnum : Enum263SubscriptionRequestType.values()) {
            tagData = new Tag263EnuSubscriptionRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}