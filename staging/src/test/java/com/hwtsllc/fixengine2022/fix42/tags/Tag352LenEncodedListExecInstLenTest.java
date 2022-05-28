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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  352
 *  EncodedListExecInstLen
 *  Length
 *  <p>
 *  Byte length of encoded (non-ASCII characters) EncodedListExecInst (353) field.
 */
class Tag352LenEncodedListExecInstLenTest {
    @Test
    void FIX0352Test() {
        FIX42 fixData = FIX42.FIX352_LEN_ENCODED_LIST_EXEC_INST_LEN;
        assertEquals( "352", fixData.toFIXIDString());
        assertEquals( "ENCODED_LIST_EXEC_INST_LEN", fixData.toFIXNameString());
        assertEquals( "EncodedListExecInstLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0352Test() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTA_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag352LenEncodedListExecInstLen.TESTB_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTA_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag352LenEncodedListExecInstLen.TESTB_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTB_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTB_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTB_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag352LenEncodedListExecInstLen tagData;
        int oneElement;

        oneElement = Tag352LenEncodedListExecInstLen.TESTA_LEN_ENCODED_LIST_EXEC_INST_LEN;
        tagData = new Tag352LenEncodedListExecInstLen( new MyLengthType( oneElement ) );
        assertEquals( "Tag352LenEncodedListExecInstLen\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}