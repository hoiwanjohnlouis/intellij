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
            assertEquals( "FIX172_ENU_SETTL_DELIVERY_TYPE", tagData.toFIXLabelString());
            assertEquals( "172", tagData.toFIXIDString());
            assertEquals( "SETTL_DELIVERY_TYPE", tagData.toFIXNameString());
            assertEquals( "SettlDeliveryType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum172SettlDeliveryType oneEnum : Enum172SettlDeliveryType.values()) {
            tagData = new Tag172EnuSettlDeliveryType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  172
         *  SettlDeliveryType
         *  int
         *  <p>    0 - "Versus. Payment": Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment
         *  <p>    1 - "Free": Deliver (if Sell) or Receive (if Buy) Free
         *  <p>    2 - Tri-Party
         *  <p>    3 - Hold In Custody
         */
        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.VERSUS);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.FREE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.TRI_PARTY);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag172EnuSettlDeliveryType(Enum172SettlDeliveryType.HOLD_IN_CUSTODY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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