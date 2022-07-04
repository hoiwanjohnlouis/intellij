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
import com.hwtsllc.fixengine2022.fix42.enums.Enum339TrdSesMode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  339
 *  Enu
 *  TradSesMode
 *  int
 *  <p>
 *  Trading Session Mode
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    "1 - Testing"
 *  <p>    "2 - Simulated"
 *  <p>    "3 - Production"
 */
class Tag339EnuTradSesModeTest {
    @Test
    void FIX0339Test() {
        FIX42 fixData = FIX42.FIX339_ENU_TRAD_SES_MODE;
        assertEquals( "339", fixData.toEnumIDString());
        assertEquals( "TRAD_SES_MODE", fixData.toEnumNameString());
        assertEquals( "TradSesMode", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0339Test() {
        Tag339EnuTradSesMode tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.TESTING);
        assertEquals( Enum339TrdSesMode.TESTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.SIMULATED);
        assertEquals( Enum339TrdSesMode.SIMULATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag339EnuTradSesMode(Enum339TrdSesMode.PRODUCTION);
        assertEquals( Enum339TrdSesMode.PRODUCTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag339EnuTradSesMode tagData;

        // loop around the ENUM and process
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            tagData = new Tag339EnuTradSesMode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag339EnuTradSesMode tagData;

        // loop around the ENUM and process
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            tagData = new Tag339EnuTradSesMode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag339EnuTradSesMode tagData;

        // loop around the ENUM and process
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            tagData = new Tag339EnuTradSesMode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag339EnuTradSesMode tagData;

        // loop around the ENUM and process
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            tagData = new Tag339EnuTradSesMode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag339EnuTradSesMode tagData;

        // loop around the ENUM and process
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            tagData = new Tag339EnuTradSesMode(oneEnum);
            assertEquals( "Tag339EnuTradSesMode\n" +
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