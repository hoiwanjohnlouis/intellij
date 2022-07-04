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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  821
 *  OrderInputDevice
 *  String
 *  <p></p>
 *  Specific device number, terminal number or station where order was entered
 */
class Tag821StrOrderInputDeviceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX821_STR_ORDER_INPUT_DEVICE;
        assertEquals( "821", fixData.toEnumIDString());
        assertEquals( "ORDER_INPUT_DEVICE", fixData.toEnumNameString());
        assertEquals( "OrderInputDevice", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0821Test() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTA_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "821", tagData.toEnumIDString());
        assertEquals( "ORDER_INPUT_DEVICE", tagData.toEnumNameString());
        assertEquals( "OrderInputDevice", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag821StrOrderInputDevice.TESTB_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTA_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag821StrOrderInputDevice.TESTB_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTB_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTB_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTB_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag821StrOrderInputDevice tagData;
        String oneElement;

        oneElement = Tag821StrOrderInputDevice.TESTA_STR_ORDER_INPUT_DEVICE;
        tagData = new Tag821StrOrderInputDevice( new MyStringType( oneElement ) );
        assertEquals( "Tag821StrOrderInputDevice\n" +
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