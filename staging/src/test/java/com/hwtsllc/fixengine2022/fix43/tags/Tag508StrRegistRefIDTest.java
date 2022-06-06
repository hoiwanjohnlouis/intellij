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
 *  508
 *  RegistRefID
 *  String
 *  <p>
 *  Reference identifier for the RegistID (53) with Cancel and Replace RegistTransType (54) transaction types.
 */
class Tag508StrRegistRefIDTest {
    @Test
    void FIX0508Test() {
        FIX43 fixData = FIX43.FIX508_STR_REGIST_REF_ID;
        assertEquals( "508", fixData.toFIXIDString());
        assertEquals( "REGIST_REF_ID", fixData.toFIXNameString());
        assertEquals( "RegistRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0508Test() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTA_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag508StrRegistRefID.TESTB_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTA_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag508StrRegistRefID.TESTB_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTB_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTB_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTB_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag508StrRegistRefID tagData;
        String oneElement;

        oneElement = Tag508StrRegistRefID.TESTA_STR_REGIST_REF_ID;
        tagData = new Tag508StrRegistRefID( new MyStringType( oneElement ) );
        assertEquals( "Tag508StrRegistRefID\n" +
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