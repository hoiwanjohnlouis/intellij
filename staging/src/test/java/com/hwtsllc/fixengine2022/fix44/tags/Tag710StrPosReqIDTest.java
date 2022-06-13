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
 *  710
 *  PosReqID
 *  String
 *  <p></p>
 *  Unique identifier for the position maintenance request as assigned by the submitter
 */
class Tag710StrPosReqIDTest {
    @Test
    void FIX0710Test() {
        FIX44 fixData = FIX44.FIX710_STR_POS_REQ_ID;
        assertEquals( "710", fixData.toFIXIDString());
        assertEquals( "POS_REQ_ID", fixData.toFIXNameString());
        assertEquals( "PosReqID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0710Test() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag710StrPosReqID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

    }
    @Test
    void PrintFIXTagTest() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag710StrPosReqID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag710StrPosReqID tagData;
        String oneElement;

        oneElement = Tag710StrPosReqID.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag710StrPosReqID( new MyStringType( oneElement ) );
        assertEquals( "Tag710StrPosReqID\n" +
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