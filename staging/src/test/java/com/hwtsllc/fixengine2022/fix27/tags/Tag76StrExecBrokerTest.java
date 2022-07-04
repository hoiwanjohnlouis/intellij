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
 *  <p></p>
 *  Identifies executing or give-up broker.
 *  <p></p>
 *  Standard NASD market-maker mnemonic is preferred.
 *  <p></p>
 *  Deprecated in FIX.4.2
 */
// @Deprecated
class Tag76StrExecBrokerTest {

    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX76_STR_EXEC_BROKER;
        assertEquals( "EXEC_BROKER", fixData.toEnumNameString());
        assertEquals( "76", fixData.toEnumIDString());
        assertEquals( "ExecBroker (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0076Test() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = "Denethor-Tag76StrExecBroker";
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag76StrExecBroker.TESTA_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag76StrExecBroker.TESTB_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag76StrExecBroker tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX76_STR_EXEC_BROKER", tagData.toEnumLabelString());
        assertEquals( "EXEC_BROKER", tagData.toEnumNameString());
        assertEquals( "76", tagData.toEnumIDString());
        assertEquals( "ExecBroker (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = Tag76StrExecBroker.TESTA_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag76StrExecBroker.TESTB_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = Tag76StrExecBroker.TESTB_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = Tag76StrExecBroker.TESTB_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = Tag76StrExecBroker.TESTB_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag76StrExecBroker tagData;
        String oneElement;

        oneElement = Tag76StrExecBroker.TESTA_STR_EXEC_BROKER;
        tagData = new Tag76StrExecBroker(new MyStringType( oneElement ) );
        assertEquals( "Tag76StrExecBroker\n" +
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