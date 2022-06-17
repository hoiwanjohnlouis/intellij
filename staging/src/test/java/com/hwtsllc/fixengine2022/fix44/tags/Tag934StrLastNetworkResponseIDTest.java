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
 *  934
 *  LastNetworkResponseID
 *  String
 *  <p></p>
 *  Identifier of the previous Network Response message sent to a counterparty,
 *  used to allow incremental updates.
 */
class Tag934StrLastNetworkResponseIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX934_STR_LAST_NETWORK_RESPONSE_ID;
        assertEquals( "934", fixData.toFIXIDString());
        assertEquals( "LAST_NETWORK_RESPONSE_ID", fixData.toFIXNameString());
        assertEquals( "LastNetworkResponseID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0934Test() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTA_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "934", tagData.toFIXIDString());
        assertEquals( "LAST_NETWORK_RESPONSE_ID", tagData.toFIXNameString());
        assertEquals( "LastNetworkResponseID", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag934StrLastNetworkResponseID.TESTB_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTA_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag934StrLastNetworkResponseID.TESTB_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTB_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTB_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTB_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag934StrLastNetworkResponseID tagData;
        String oneElement;

        oneElement = Tag934StrLastNetworkResponseID.TESTA_STR_LAST_NETWORK_RESPONSE_ID;
        tagData = new Tag934StrLastNetworkResponseID( new MyStringType( oneElement ) );
        assertEquals( "Tag934StrLastNetworkResponseID\n" +
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