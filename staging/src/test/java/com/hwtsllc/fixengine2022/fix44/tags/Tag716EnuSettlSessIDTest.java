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
import com.hwtsllc.fixengine2022.fix44.enums.Enum716SettlSessID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  716
 *  SettlSessID
 *  String
 *  <p></p>
 *  Identifies a specific settlement session
 *  <p></p>
 *  Valid values:
 *  <p>    ITD - Intraday
 *  <p>    RTH - Regular Trading Hours
 *  <p>    ETH - Electronic Trading Hours
 *  <p>    EOD - End Of Day
 */
class Tag716EnuSettlSessIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX716_ENU_SETTL_SESS_ID;
        assertEquals( "716", fixData.toFIXIDString());
        assertEquals( "SETTL_SESS_ID", fixData.toFIXNameString());
        assertEquals( "SettlSessID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0716Test() {
        Tag716EnuSettlSessID tagData;
        Enum716SettlSessID oneElement;

        oneElement = Enum716SettlSessID.INTRADAY;
        tagData = new Tag716EnuSettlSessID( oneElement );
        assertEquals( "ITD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "716", tagData.toFIXIDString());
        assertEquals( "SETTL_SESS_ID", tagData.toFIXNameString());
        assertEquals( "SettlSessID", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.REGULAR_TRADING_HOURS);
        assertEquals( "RTH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.ELECTRONIC_TRADING_HOURS);
        assertEquals( "ETH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.END_OF_DAY);
        assertEquals( "EOD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag716EnuSettlSessID tagData;

        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag716EnuSettlSessID tagData;

        // loop around the ENUM and process
        for (Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag716EnuSettlSessID tagData;

        // loop around the ENUM and process
        for (Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag716EnuSettlSessID tagData;

        // loop around the ENUM and process
        for (Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag716EnuSettlSessID tagData;

        // loop around the ENUM and process
        for (Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( "Tag716EnuSettlSessID\n" +
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