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
    Tag716EnuSettlSessID tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( "FIX716_ENU_SETTL_SESS_ID", tagData.toEnumLabelString());
            assertEquals( "716", tagData.toEnumIDString());
            assertEquals( "SETTL_SESS_ID", tagData.toEnumNameString());
            assertEquals( "SettlSessID", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    ITD - Intraday
         *  <p>    RTH - Regular Trading Hours
         *  <p>    ETH - Electronic Trading Hours
         *  <p>    EOD - End Of Day
         */
        tagData = new Tag716EnuSettlSessID( Enum716SettlSessID.INTRADAY );
        assertEquals( "ITD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.REGULAR_TRADING_HOURS);
        assertEquals( "RTH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.ELECTRONIC_TRADING_HOURS);
        assertEquals( "ETH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.END_OF_DAY);
        assertEquals( "EOD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( "Tag716EnuSettlSessID\n" +
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