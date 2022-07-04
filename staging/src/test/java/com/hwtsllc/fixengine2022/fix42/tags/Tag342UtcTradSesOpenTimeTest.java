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
 *  342
 *  TradSesOpenTime
 *  UTCTimestamp
 *  <p>
 *  Time of the opening of the trading session
 */
class Tag342UtcTradSesOpenTimeTest {
    @Test
    void FIX0342Test() {
        FIX42 fixData = FIX42.FIX342_UTC_TRAD_SES_OPEN_TIME;
        assertEquals( "342", fixData.toEnumIDString());
        assertEquals( "TRAD_SES_OPEN_TIME", fixData.toEnumNameString());
        assertEquals( "TradSesOpenTime", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0342Test() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTA_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTA_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag342UtcTradSesOpenTime tagData;
        String oneElement;

        oneElement = Tag342UtcTradSesOpenTime.TESTA_UTC_TRAD_SES_OPEN_TIME;
        tagData = new Tag342UtcTradSesOpenTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag342UtcTradSesOpenTime\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}