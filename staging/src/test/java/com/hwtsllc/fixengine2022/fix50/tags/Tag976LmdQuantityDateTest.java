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
 *  976
 *  QuantityDate
 *  LocalMktDate
 *  <p>
 *  Date associated to the quantity that is being reported for the position.
 */
class Tag976LmdQuantityDateTest {
    @Test
    void FIX0976Test() {
        FIX50 fixData = FIX50.FIX976_QUANTITY_DATE;
        assertEquals( "976", fixData.toEnumIDString());
        assertEquals( "QUANTITY_DATE", fixData.toEnumNameString());
        assertEquals( "QuantityDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0976Test() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag976LmdQuantityDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag976LmdQuantityDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = Tag976LmdQuantityDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag976LmdQuantityDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = Tag976LmdQuantityDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = Tag976LmdQuantityDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = Tag976LmdQuantityDate.TESTB_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag976LmdQuantityDate tagData;
        String oneElement;

        oneElement = Tag976LmdQuantityDate.TESTA_LMD_UNDERLYING_SETTLEMENT_DATE;
        tagData = new Tag976LmdQuantityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag976LmdQuantityDate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}