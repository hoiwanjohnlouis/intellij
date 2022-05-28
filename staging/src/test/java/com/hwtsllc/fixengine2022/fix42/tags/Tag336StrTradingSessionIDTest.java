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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  336
 *  TradingSessionID
 *  String
 *  <p>
 *  Identifier for Trading Session
 *  <p>
 *  Can be used to represent a specific market trading session
 *  <p>
 *  (e.g. "PRE-OPEN", "CROSS_2", "AFTER-HOURS", "TOSTNET", "TOSTNET2", etc).
 *  <p>
 *  To specify good for session where session spans more than one calendar day,
 *  use TimeInForce = Day in conjunction with TradingSessionID.
 *  <p>
 *  Values should be bi-laterally agreed to between counterparties.
 *  <p>
 *  Firms may register Trading Session values on the FIX website
 *  <p></p>
 *  (presently a document maintained within "ECN and Exchanges" working group section).
 */
class Tag336StrTradingSessionIDTest {
    @Test
    void FIX0336Test() {
        FIX42 fixData = FIX42.FIX336_STR_TRADING_SESSION_ID;
        assertEquals( "336", fixData.toFIXIDString());
        assertEquals( "TRADING_SESSION_ID", fixData.toFIXNameString());
        assertEquals( "TradingSessionID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0336Test() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        assertEquals( "Tag336StrTradingSessionID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}