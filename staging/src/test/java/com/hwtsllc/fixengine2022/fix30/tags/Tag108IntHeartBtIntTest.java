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
    void FIX0108Test() {
        FIX30 fixData = FIX30.FIX108_INT_HEART_BT_INT;
        assertEquals( "HEART_BT_INT", fixData.toFIXNameString());
        assertEquals( "108", fixData.toFIXIDString());
        assertEquals( "HeartBtInt", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0108Test() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(60) );
        assertEquals(60, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT));
        assertEquals( Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT));
        assertEquals( tagData.toFIXIDString() + "=" + Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT));
        assertEquals( String.valueOf(Tag108IntHeartBtInt.TESTB_INT_HEART_BT_INT),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag108IntHeartBtInt tagData;

        tagData = new Tag108IntHeartBtInt(new MyIntType(Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT));
        assertEquals( "Tag108IntHeartBtInt\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag108IntHeartBtInt.TESTA_INT_HEART_BT_INT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}