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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.enums.fix44.Enum716SettlSessID;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX716_ENU_SETTL_SESS_ID", tagData.toFIXLabelString());
            assertEquals( "716", tagData.toFIXIDString());
            assertEquals( "SETTL_SESS_ID", tagData.toFIXNameString());
            assertEquals( "SettlSessID", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            tagData = new Tag716EnuSettlSessID(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  716
         *  SettlSessID
         *  String
         *  <p>    ITD - Intraday
         *  <p>    RTH - Regular Trading Hours
         *  <p>    ETH - Electronic Trading Hours
         *  <p>    EOD - End Of Day
         */
        tagData = new Tag716EnuSettlSessID( Enum716SettlSessID.INTRADAY );
        assertEquals( "ITD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.REGULAR_TRADING_HOURS);
        assertEquals( "RTH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.ELECTRONIC_TRADING_HOURS);
        assertEquals( "ETH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag716EnuSettlSessID(Enum716SettlSessID.END_OF_DAY);
        assertEquals( "EOD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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