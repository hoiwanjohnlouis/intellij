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
 *  526
 *  SecondaryClOrdID
 *  String
 *  <p>
 *  Assigned by the party which originates the order.
 *  <p>
 *  Can be used to provide the ClOrdID (11) used by an exchange or executing system.
 */
class Tag526StrSecondaryClOrdIDTest {
    @Test
    void FIX0526Test() {
        FIX43 fixData = FIX43.FIX526_STR_SECONDARY_CL_ORD_ID;
        assertEquals( "526", fixData.toFIXIDString());
        assertEquals( "SECONDARY_CL_ORD_ID", fixData.toFIXNameString());
        assertEquals( "SecondaryClOrdID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0526Test() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTA_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag526StrSecondaryClOrdID.TESTB_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTA_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag526StrSecondaryClOrdID.TESTB_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTB_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTB_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTB_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag526StrSecondaryClOrdID tagData;
        String oneElement;

        oneElement = Tag526StrSecondaryClOrdID.TESTA_STR_SECONDARY_CL_ORD_ID;
        tagData = new Tag526StrSecondaryClOrdID( new MyStringType( oneElement ) );
        assertEquals( "Tag526StrSecondaryClOrdID\n" +
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