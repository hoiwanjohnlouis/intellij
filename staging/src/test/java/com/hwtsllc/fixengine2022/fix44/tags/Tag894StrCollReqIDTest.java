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
 *  894
 *  CollReqID
 *  String
 *  <p></p>
 *  Collateral Request Identifier
 */
class Tag894StrCollReqIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX894_STR_COLL_REQ_ID;
        assertEquals( "894", fixData.toEnumIDString());
        assertEquals( "COLL_REQ_ID", fixData.toEnumNameString());
        assertEquals( "CollReqID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0894Test() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTA_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "894", tagData.toEnumIDString());
        assertEquals( "COLL_REQ_ID", tagData.toEnumNameString());
        assertEquals( "CollReqID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag894StrCollReqID.TESTB_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTA_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag894StrCollReqID.TESTB_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTB_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTB_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTB_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag894StrCollReqID tagData;
        String oneElement;

        oneElement = Tag894StrCollReqID.TESTA_STR_COLL_REQ_ID;
        tagData = new Tag894StrCollReqID( new MyStringType( oneElement ) );
        assertEquals( "Tag894StrCollReqID\n" +
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