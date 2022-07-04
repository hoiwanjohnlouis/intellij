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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum567TradSesStatusRejReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  567
 *  TradSesStatusRejReason
 *  int
 *  <p></p>
 *  Indicates the reason a Trading Session Status Request was rejected.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Unknown or invalid TradingSessionID
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag567EnuTradSesStatusRejReasonTest {
    @Test
    void FIX0567Test() {
        FIX43 fixData = FIX43.FIX567_ENU_TRAD_SES_STATUS_REJ_REASON;
        assertEquals( "567", fixData.toEnumIDString());
        assertEquals( "TRAD_SES_STATUS_REJ_REASON", fixData.toEnumNameString());
        assertEquals( "TradSesStatusRejReason", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0567Test() {
        Tag567EnuTradSesStatusRejReason tagData;

        /*
         *  1, 99, type(s)
         */

        /*
         *  1, type(s)
         */
        tagData = new Tag567EnuTradSesStatusRejReason( Enum567TradSesStatusRejReason.UNKNOWN_TRADING_SESSION_ID );
        assertEquals( Enum567TradSesStatusRejReason.UNKNOWN_TRADING_SESSION_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  99, type(s)
         */
        tagData = new Tag567EnuTradSesStatusRejReason( Enum567TradSesStatusRejReason.OTHER );
        assertEquals( Enum567TradSesStatusRejReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag567EnuTradSesStatusRejReason tagData;

        // loop around the ENUM and process
        for ( Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag567EnuTradSesStatusRejReason tagData;

        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag567EnuTradSesStatusRejReason tagData;

        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag567EnuTradSesStatusRejReason tagData;

        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag567EnuTradSesStatusRejReason tagData;

        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( "Tag567EnuTradSesStatusRejReason\n" +
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