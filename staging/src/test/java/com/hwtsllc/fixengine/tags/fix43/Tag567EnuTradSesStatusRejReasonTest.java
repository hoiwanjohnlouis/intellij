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

package com.hwtsllc.fixengine.tags.fix43;

import com.hwtsllc.fixengine.enums.fix43.Enum567TradSesStatusRejReason;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag567EnuTradSesStatusRejReasonTest {
    Tag567EnuTradSesStatusRejReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( "FIX567_ENU_TRAD_SES_STATUS_REJ_REASON", tagData.toFIXLabelString());
            assertEquals( "567", tagData.toFIXIDString());
            assertEquals( "TRAD_SES_STATUS_REJ_REASON", tagData.toFIXNameString());
            assertEquals( "TradSesStatusRejReason", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  567
         *  TradSesStatusRejReason
         *  int
         *  <p>    1 - Unknown or invalid TradingSessionID
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag567EnuTradSesStatusRejReason( Enum567TradSesStatusRejReason.UNKNOWN_TRADING_SESSION_ID );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag567EnuTradSesStatusRejReason( Enum567TradSesStatusRejReason.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            tagData = new Tag567EnuTradSesStatusRejReason(oneEnum);
            assertEquals( "Tag567EnuTradSesStatusRejReason\n" +
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