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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  76
 *  ExecBroker
 *  String
 *  <p>
 *  Identifies executing or give-up broker.
 *  Standard NASD market-maker mnemonic is preferred.
 *  <p>
 *  Deprecated in FIX.4.2
 */
// @Deprecated
class Tag76StrExecBrokerTest {

    @Test
    void FIX0076Test() {
        FIX27 fixData = FIX27.FIX76_STR_EXEC_BROKER;
        assertEquals( "EXEC_BROKER", fixData.toFIXNameString());
        assertEquals( "76", fixData.toFIXIDString());
        assertEquals( "ExecBroker (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0076Test() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType("Denethor-76ExecBroker") );
        assertEquals( "Denethor-76ExecBroker", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType(Tag76StrExecBroker.TESTB_STR_EXEC_BROKER));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType(Tag76StrExecBroker.TESTB_STR_EXEC_BROKER));
        assertEquals( Tag76StrExecBroker.TESTB_STR_EXEC_BROKER, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType(Tag76StrExecBroker.TESTB_STR_EXEC_BROKER));
        assertEquals( tagData.toFIXIDString() + "=" + Tag76StrExecBroker.TESTB_STR_EXEC_BROKER,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType(Tag76StrExecBroker.TESTB_STR_EXEC_BROKER));
        assertEquals( Tag76StrExecBroker.TESTB_STR_EXEC_BROKER,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag76StrExecBroker tagData;

        tagData = new Tag76StrExecBroker(new MyStringType(Tag76StrExecBroker.TESTA_STR_EXEC_BROKER));
        assertEquals( "Tag76StrExecBroker\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag76StrExecBroker.TESTA_STR_EXEC_BROKER + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag76StrExecBroker.TESTA_STR_EXEC_BROKER + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}