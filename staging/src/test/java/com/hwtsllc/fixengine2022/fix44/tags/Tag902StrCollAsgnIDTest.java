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
 *  902
 *  CollAsgnID
 *  String
 *  <p></p>
 *  Collateral Assignment Identifier
 */
class Tag902StrCollAsgnIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX902_STR_COLL_ASGN_ID;
        assertEquals( "902", fixData.toEnumIDString());
        assertEquals( "COLL_ASGN_ID", fixData.toEnumNameString());
        assertEquals( "CollAsgnID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0902Test() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTA_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "902", tagData.toEnumIDString());
        assertEquals( "COLL_ASGN_ID", tagData.toEnumNameString());
        assertEquals( "CollAsgnID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag902StrCollAsgnID.TESTB_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTA_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag902StrCollAsgnID.TESTB_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTB_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTB_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTB_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag902StrCollAsgnID tagData;
        String oneElement;

        oneElement = Tag902StrCollAsgnID.TESTA_STR_COLL_ASGN_ID;
        tagData = new Tag902StrCollAsgnID( new MyStringType( oneElement ) );
        assertEquals( "Tag902StrCollAsgnID\n" +
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