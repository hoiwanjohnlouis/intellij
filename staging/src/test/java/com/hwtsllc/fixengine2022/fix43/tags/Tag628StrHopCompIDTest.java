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
import com.hwtsllc.fixengine2022.fix42.tags.Tag628StrHopCompID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  628
 *  HopCompID
 *  String
 *  <p>
 *  Assigned value used to identify the third party firm which delivered a specific message
 *  either from the firm which originated the message or from another third party
 *  (if multiple "hops" are performed).
 *  <p>
 *  It is recommended that this value be the SenderCompID (49) of the third party.
 *  <p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
class Tag628StrHopCompIDTest {
    @Test
    void FIX0628Test() {
        FIX43 fixData = FIX43.FIX628_STR_HOP_COMP_ID;
        assertEquals( "628", fixData.toFIXIDString());
        assertEquals( "HOP_COMP_ID", fixData.toFIXNameString());
        assertEquals( "HopCompID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0628Test() {
        Tag628StrHopCompID tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag628StrHopCompID tagData;
        String oneElement;

        oneElement = Tag628StrHopCompID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag628StrHopCompID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag628StrHopCompID tagData;
        String oneElement;

        oneElement = Tag628StrHopCompID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag628StrHopCompID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag628StrHopCompID tagData;
        String oneElement;

        oneElement = Tag628StrHopCompID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag628StrHopCompID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag628StrHopCompID tagData;
        String oneElement;

        oneElement = Tag628StrHopCompID.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag628StrHopCompID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag628StrHopCompID tagData;
        String oneElement;

        oneElement = Tag628StrHopCompID.TESTA_STR_SETTL_INST_REF_ID;
        tagData = new Tag628StrHopCompID( new MyStringType( oneElement ) );
        assertEquals( "Tag628StrHopCompID\n" +
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