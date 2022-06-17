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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  917
 *  EndDate
 *  LocalMktDate
 *  <p></p>
 *  End date of a financing deal,
 *  i.e. the date the seller reimburses the buyer and takes back control of the collateral
 */
class Tag917LmdEndDateTest {
    @Test
    void FIX0917Test() {
        FIX44 fixData = FIX44.FIX917_LMD_END_DATE;
        assertEquals( "917", fixData.toFIXIDString());
        assertEquals( "END_DATE", fixData.toFIXNameString());
        assertEquals( "EndDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0917Test() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "917", tagData.toFIXIDString());
        assertEquals( "END_DATE", tagData.toFIXNameString());
        assertEquals( "EndDate", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTB_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag917LmdEndDate tagData;
        String oneElement;

        oneElement = Tag917LmdEndDate.TESTA_LMD_END_DATE;
        tagData = new Tag917LmdEndDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag917LmdEndDate\n" +
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