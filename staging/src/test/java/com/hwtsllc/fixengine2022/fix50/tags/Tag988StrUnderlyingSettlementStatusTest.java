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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  988
 *  UnderlyingSettlementStatus
 *  String
 *  <p>
 *  Settlement status of the underlying instrument.
 *  <p>
 *  Used for derivatives that deliver into more than one underlying instrument.
 *  <p>
 *  Settlement can be delayed for an underlying instrument.
 */
class Tag988StrUnderlyingSettlementStatusTest {
    @Test
    void FIX0988Test() {
        FIX50 fixData = FIX50.FIX988_STR_UNDERLYING_SETTLEMENT_STATUS;
        assertEquals( "988", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_SETTLEMENT_STATUS", fixData.toFIXNameString());
        assertEquals( "UnderlyingSettlementStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0988Test() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTA_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTB_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTA_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTB_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTB_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTB_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTB_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag988StrUnderlyingSettlementStatus tagData;
        String oneElement;

        oneElement = Tag988StrUnderlyingSettlementStatus.TESTA_STR_UNDERLYING_SETTLEMENT_STATUS;
        tagData = new Tag988StrUnderlyingSettlementStatus( new MyStringType( oneElement ) );
        assertEquals( "Tag988StrUnderlyingSettlementStatus\n" +
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