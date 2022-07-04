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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  240
 *  RedemptionDate
 *  LocalMktDate
 *  <p>
 *  Deprecated in FIX.4.4
 *  <p>
 *  Return of investor's principal in a security.
 *  <p>
 *  Bond redemption can occur before maturity date.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
// @Deprecated
class Tag240LmdRedemptionDateTest {
    @Test
    void FIX0240Test() {
        FIX42 fixData = FIX42.FIX240_LMD_REDEMPTION_DATE;
        assertEquals( "240", fixData.toEnumIDString());
        assertEquals( "REDEMPTION_DATE", fixData.toEnumNameString());
        assertEquals( "RedemptionDate (Deprecated)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0240Test() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTA_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag240LmdRedemptionDate.TESTB_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTA_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag240LmdRedemptionDate.TESTB_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTB_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTB_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTB_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag240LmdRedemptionDate tagData;
        String oneElement;

        oneElement = Tag240LmdRedemptionDate.TESTA_LMD_REDEMPTION_DATE;
        tagData = new Tag240LmdRedemptionDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag240LmdRedemptionDate\n" +
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