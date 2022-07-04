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
 *  69
 *  ListExecInst
 *  String
 *  <p></p>
 *  Free format text message containing list handling and execution instructions.
 */
class Tag69StrListExecInstTest {
    @Test
    void FIX0069Test() {
        FIX27 fixData = FIX27.FIX69_STR_LIST_EXEC_INST;
        assertEquals( "LIST_EXEC_INST", fixData.toEnumNameString());
        assertEquals( "69", fixData.toEnumIDString());
        assertEquals( "ListExecInst", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0069Test() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTA_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag69StrListExecInst.TESTB_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag69StrListExecInst tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX69_STR_LIST_EXEC_INST", tagData.toEnumLabelString());
        assertEquals( "LIST_EXEC_INST", tagData.toEnumNameString());
        assertEquals( "69", tagData.toEnumIDString());
        assertEquals( "ListExecInst", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTA_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag69StrListExecInst.TESTB_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTB_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTB_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTB_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag69StrListExecInst tagData;
        String oneElement;

        oneElement = Tag69StrListExecInst.TESTA_STR_LIST_EXEC_INST;
        tagData = new Tag69StrListExecInst(new MyStringType( oneElement ) );
        assertEquals( "Tag69StrListExecInst\n" +
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