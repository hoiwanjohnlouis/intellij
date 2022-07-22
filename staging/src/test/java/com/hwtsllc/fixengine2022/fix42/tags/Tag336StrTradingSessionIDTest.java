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
    void PrintTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag336StrTradingSessionID tagData;
        String oneElement;

        oneElement = Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID;
        tagData = new Tag336StrTradingSessionID( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag336StrTradingSessionID tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag336StrTradingSessionID tagData ) {
        assertEquals( "FIX336_STR_TRADING_SESSION_ID", tagData.toEnumLabelString());
        assertEquals( "336", tagData.toEnumIDString());
        assertEquals( "TRADING_SESSION_ID", tagData.toEnumNameString());
        assertEquals( "TradingSessionID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag336StrTradingSessionID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag336StrTradingSessionID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag336StrTradingSessionID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag336StrTradingSessionID tagData ) {
        assertEquals( "Tag336StrTradingSessionID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}