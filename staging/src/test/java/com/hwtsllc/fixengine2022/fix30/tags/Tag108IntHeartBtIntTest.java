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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  108
 *  HeartBtInt
 *  int
 *  <p>
 *  Heartbeat interval (seconds)
 */
class Tag108IntHeartBtIntTest {

    @Test
    void FIXTest() {
        FIX30 fixData = FIX30.FIX108_INT_HEART_BT_INT;
        assertEquals( "HEART_BT_INT", fixData.toEnumNameString());
        assertEquals( "108", fixData.toEnumIDString());
        assertEquals( "HeartBtInt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0108Test() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = 45;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "HEART_BT_INT", tagData.toEnumNameString());
        assertEquals( "108", tagData.toEnumIDString());
        assertEquals( "HeartBtInt", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag108IntHeartBtInt tagData;
        int oneElement;

        oneElement = Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT;
        tagData = new Tag108IntHeartBtInt( new MyIntType( oneElement ) );
        assertEquals( "Tag108IntHeartBtInt\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]", tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}