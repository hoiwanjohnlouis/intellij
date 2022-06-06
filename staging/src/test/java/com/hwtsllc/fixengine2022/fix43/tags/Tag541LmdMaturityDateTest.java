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
 *  541
 *  MaturityDate
 *  LocalMktDate
 *  <p>
 *  Date of maturity.
 */
class Tag541LmdMaturityDateTest {
    @Test
    void FIX0541Test() {
        FIX43 fixData = FIX43.FIX541_LMD_MATURITY_DATE;
        assertEquals( "541", fixData.toFIXIDString());
        assertEquals( "MATURITY_DATE", fixData.toFIXNameString());
        assertEquals( "MaturityDate", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0541Test() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTA_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag541LmdMaturityDate.TESTB_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTA_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag541LmdMaturityDate.TESTB_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTB_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTB_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTB_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag541LmdMaturityDate tagData;
        String oneElement;

        oneElement = Tag541LmdMaturityDate.TESTA_LMD_MATURITY_DATE;
        tagData = new Tag541LmdMaturityDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag541LmdMaturityDate\n" +
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