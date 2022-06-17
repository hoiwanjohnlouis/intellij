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
 *  931
 *  RefSubID
 *  String
 *  <p></p>
 *  Assigned value used to identify specific elements within a firm.
 */
class Tag931StrRefSubIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX931_STR_REF_SUB_ID;
        assertEquals( "931", fixData.toFIXIDString());
        assertEquals( "REF_SUB_ID", fixData.toFIXNameString());
        assertEquals( "RefSubID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0931Test() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTA_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "931", tagData.toFIXIDString());
        assertEquals( "REF_SUB_ID", tagData.toFIXNameString());
        assertEquals( "RefSubID", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag931StrRefSubID.TESTB_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTA_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag931StrRefSubID.TESTB_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTB_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTB_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTB_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag931StrRefSubID tagData;
        String oneElement;

        oneElement = Tag931StrRefSubID.TESTA_STR_REF_SUB_ID;
        tagData = new Tag931StrRefSubID( new MyStringType( oneElement ) );
        assertEquals( "Tag931StrRefSubID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}