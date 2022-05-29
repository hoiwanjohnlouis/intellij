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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  987
 *  UnderlyingSettlementDate
 *  LocalMktDate
 *  <p>
 *  Date the underlying instrument will settle.
 *  <p>
 *  Used for derivatives that deliver into more than one underlying instrument.
 *  <p>
 *  Settlement dates can vary across underlying instruments.
 */
class Tag987LmdUnderlyingSettlementDateTest {
    @Test
    void FIX0987Test() {
        FIX50 fixData = FIX50.FIX987_LMD_UNDERLYING_SETTLEMENT_DATE;
        assertEquals( "987", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_SETTLEMENT_DATE", fixData.toFIXNameString());
        assertEquals( "UnderlyingSettlementDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0987Test() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag987LmdUnderlyingSettlementDate tagData;
        String oneElement;

        oneElement = Tag987LmdUnderlyingSettlementDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag987LmdUnderlyingSettlementDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag987LmdUnderlyingSettlementDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}