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
import com.hwtsllc.fixengine2022.fix44.enums.Enum827ExpirationCycle;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  827
 *  ExpirationCycle
 *  int
 *  <p></p>
 *  Part of trading cycle when an instrument expires. Field is applicable for derivatives.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Expire on trading session close (default)
 *  <p>    1 - Expire on trading session open
 */
class Tag827EnuExpirationCycleTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX827_ENU_EXPIRATION_CYCLE;
        assertEquals( "827", fixData.toEnumIDString());
        assertEquals( "EXPIRATION_CYCLE", fixData.toEnumNameString());
        assertEquals( "ExpirationCycle", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0827Test() {
        Tag827EnuExpirationCycle tagData;
        Enum827ExpirationCycle oneElement;

        oneElement = Enum827ExpirationCycle.EXPIRE_ON_CLOSE;
        tagData = new Tag827EnuExpirationCycle( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "827", tagData.toEnumIDString());
        assertEquals( "EXPIRATION_CYCLE", tagData.toEnumNameString());
        assertEquals( "ExpirationCycle", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag827EnuExpirationCycle( Enum827ExpirationCycle.EXPIRE_ON_OPEN );
        assertEquals( Enum827ExpirationCycle.EXPIRE_ON_OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag827EnuExpirationCycle tagData;

        // loop around the ENUM and process
        for ( Enum827ExpirationCycle oneEnum : Enum827ExpirationCycle.values()) {
            tagData = new Tag827EnuExpirationCycle(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag827EnuExpirationCycle tagData;

        // loop around the ENUM and process
        for (Enum827ExpirationCycle oneEnum : Enum827ExpirationCycle.values()) {
            tagData = new Tag827EnuExpirationCycle(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag827EnuExpirationCycle tagData;

        // loop around the ENUM and process
        for (Enum827ExpirationCycle oneEnum : Enum827ExpirationCycle.values()) {
            tagData = new Tag827EnuExpirationCycle(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag827EnuExpirationCycle tagData;

        // loop around the ENUM and process
        for (Enum827ExpirationCycle oneEnum : Enum827ExpirationCycle.values()) {
            tagData = new Tag827EnuExpirationCycle(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag827EnuExpirationCycle tagData;

        // loop around the ENUM and process
        for (Enum827ExpirationCycle oneEnum : Enum827ExpirationCycle.values()) {
            tagData = new Tag827EnuExpirationCycle(oneEnum);
            assertEquals( "Tag827EnuExpirationCycle\n" +
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