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
 *  726
 *  ResponseDestination
 *  String
 *  <p></p>
 *  URI (Uniform Resource Identifier) for details) or other pre-arranged value.
 *  <p></p>
 *  Used in conjunction with ResponseTransportType (725) value of Out-of-Band
 *  to identify the out-of-band destination.
 *  <p></p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards"
 */
class Tag726StrResponseDestinationTest {
    @Test
    void FIX0726Test() {
        FIX44 fixData = FIX44.FIX726_STR_RESPONSE_DESTINATION;
        assertEquals( "726", fixData.toFIXIDString());
        assertEquals( "RESPONSE_DESTINATION", fixData.toFIXNameString());
        assertEquals( "ResponseDestination", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0726Test() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag726StrResponseDestination.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

    }
    @Test
    void PrintFIXTagTest() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag726StrResponseDestination.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTB_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag726StrResponseDestination tagData;
        String oneElement;

        oneElement = Tag726StrResponseDestination.TESTA_STR_SIDE_COMPLIANCE_ID;
        tagData = new Tag726StrResponseDestination( new MyStringType( oneElement ) );
        assertEquals( "Tag726StrResponseDestination\n" +
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