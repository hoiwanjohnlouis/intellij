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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  343
 *  TradSesPreCloseTime
 *  UTCTimestamp
 *  <p>
 *  Time of the pre-closed of the trading session
 */
class Tag343UtcTradSesPreCloseTimeTest {
    @Test
    void FIX0343Test() {
        FIX42 fixData = FIX42.FIX343_UTC_TRAD_SES_PRE_CLOSE_TIME;
        assertEquals( "343", fixData.toFIXIDString());
        assertEquals( "TRAD_SES_PRE_CLOSE_TIME", fixData.toFIXNameString());
        assertEquals( "TradSesPreCloseTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0343Test() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTA_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag343UtcTradSesPreCloseTime.TESTB_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTA_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag343UtcTradSesPreCloseTime.TESTB_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTB_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTB_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTB_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag343UtcTradSesPreCloseTime tagData;
        String oneElement;

        oneElement = Tag343UtcTradSesPreCloseTime.TESTA_UTC_TRAD_SES_PRE_CLOSE_TIME;
        tagData = new Tag343UtcTradSesPreCloseTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag343UtcTradSesPreCloseTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}