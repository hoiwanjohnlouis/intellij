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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  588
 *  LegSettlDate
 *  LocalMktDate
 *  <p>
 *  Refer to description for SettlDate[64]
 */
class Tag588LmdLegSettlDateTest {
    @Test
    void FIX0588Test() {
        FIX43 fixData = FIX43.FIX588_LMD_LEG_SETTL_DATE;
        assertEquals( "588", fixData.toEnumIDString());
        assertEquals( "LEG_SETTL_DATE", fixData.toEnumNameString());
        assertEquals( "LegSettlDate (formerly named LegFutSettlDate prior to FIX 4.4)", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0588Test() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTA_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag588LmdLegSettlDate.TESTB_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTA_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag588LmdLegSettlDate.TESTB_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTB_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTB_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTB_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag588LmdLegSettlDate tagData;
        String oneElement;

        oneElement = Tag588LmdLegSettlDate.TESTA_LMD_LEG_SETTL_DATE;
        tagData = new Tag588LmdLegSettlDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag588LmdLegSettlDate\n" +
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