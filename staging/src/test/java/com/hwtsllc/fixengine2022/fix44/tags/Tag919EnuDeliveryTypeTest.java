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
import com.hwtsllc.fixengine2022.fix44.enums.Enum919DeliveryType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  919
 *  DeliveryType
 *  int
 *  <p></p>
 *  Identifies type of settlement
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Versus Payment: Deliver (if sell) or Receive (if buy) vs. (against) Payment
 *  <p>    1 - Free: Deliver (if sell) or Receive (if buy) Free
 *  <p>    2 - Tri-Party
 *  <p>    3 - Hold In Custody
 */
class Tag919EnuDeliveryTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX919_ENU_DELIVERY_TYPE;
        assertEquals( "919", fixData.toEnumIDString());
        assertEquals( "DELIVERY_TYPE", fixData.toEnumNameString());
        assertEquals( "DeliveryType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0919Test() {
        Tag919EnuDeliveryType tagData;
        Enum919DeliveryType oneElement;

        oneElement = Enum919DeliveryType.VERSUS_PAYMENT;
        tagData = new Tag919EnuDeliveryType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "919", tagData.toEnumIDString());
        assertEquals( "DELIVERY_TYPE", tagData.toEnumNameString());
        assertEquals( "DeliveryType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.FREE );
        assertEquals( Enum919DeliveryType.FREE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.TRI_PARTY );
        assertEquals( Enum919DeliveryType.TRI_PARTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag919EnuDeliveryType( Enum919DeliveryType.HOLD_IN_CUSTODY );
        assertEquals( Enum919DeliveryType.HOLD_IN_CUSTODY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag919EnuDeliveryType tagData;

        // loop around the ENUM and process
        for ( Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            tagData = new Tag919EnuDeliveryType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag919EnuDeliveryType tagData;

        // loop around the ENUM and process
        for (Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            tagData = new Tag919EnuDeliveryType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag919EnuDeliveryType tagData;

        // loop around the ENUM and process
        for (Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            tagData = new Tag919EnuDeliveryType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag919EnuDeliveryType tagData;

        // loop around the ENUM and process
        for (Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            tagData = new Tag919EnuDeliveryType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag919EnuDeliveryType tagData;

        // loop around the ENUM and process
        for (Enum919DeliveryType oneEnum : Enum919DeliveryType.values()) {
            tagData = new Tag919EnuDeliveryType(oneEnum);
            assertEquals( "Tag919EnuDeliveryType\n" +
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