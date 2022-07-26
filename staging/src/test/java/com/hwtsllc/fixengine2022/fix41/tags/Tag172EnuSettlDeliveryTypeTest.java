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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum172SettlDeliveryType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  172
 *  SettlDeliveryType
 *  int
 *  <p></p>
 *  Identifies type of settlement
 *  <p></p>
 *  Valid values:
 *  <p>    0 - "Versus. Payment": Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment
 *  <p>    1 - "Free": Deliver (if Sell) or Receive (if Buy) Free
 *  <p>    2 - Tri-Party
 *  <p>    3 - Hold In Custody
 */
class Tag172EnuSettlDeliveryTypeTest {
    Tag172EnuSettlDeliveryType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( "FIX172_ENU_SETTL_DELIVERY_TYPE", tagData.toEnumLabelString());
            assertEquals( "172", tagData.toEnumIDString());
            assertEquals( "SETTL_DELIVERY_TYPE", tagData.toEnumNameString());
            assertEquals( "SettlDeliveryType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.VERSUS);
        assertEquals( Enum172SettlDeliveryType.VERSUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.FREE);
        assertEquals( Enum172SettlDeliveryType.FREE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.TRI_PARTY);
        assertEquals( Enum172SettlDeliveryType.TRI_PARTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.HOLD_IN_CUSTODY);
        assertEquals( Enum172SettlDeliveryType.HOLD_IN_CUSTODY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( "Tag172EnuSettlDeliveryType\n" +
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