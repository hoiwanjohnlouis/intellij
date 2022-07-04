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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  579
 *  TradeInputDevice
 *  String
 *  <p>
 *  Specific device number, terminal number or station where trade was entered
 */
class Tag579StrTradeInputDeviceTest {
    @Test
    void FIX0579Test() {
        FIX43 fixData = FIX43.FIX579_STR_TRADE_INPUT_DEVICE;
        assertEquals( "579", fixData.toEnumIDString());
        assertEquals( "TRADE_INPUT_DEVICE", fixData.toEnumNameString());
        assertEquals( "TradeInputDevice", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0579Test() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTA_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag579StrTradeInputDevice.TESTB_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTA_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag579StrTradeInputDevice.TESTB_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTB_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTB_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTB_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag579StrTradeInputDevice tagData;
        String oneElement;

        oneElement = Tag579StrTradeInputDevice.TESTA_STR_TRADE_INPUT_DEVICE;
        tagData = new Tag579StrTradeInputDevice( new MyStringType( oneElement ) );
        assertEquals( "Tag579StrTradeInputDevice\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}