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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1033DeskType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1033EnuDeskTypeTest {
    Tag1033EnuDeskType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1033DeskType oneEnum : Enum1033DeskType.values()) {
            tagData = new Tag1033EnuDeskType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1033DeskType oneEnum : Enum1033DeskType.values()) {
            tagData = new Tag1033EnuDeskType(oneEnum);
            assertEquals( "FIX1033_ENU_DESK_TYPE", tagData.toFIXLabelString());
            assertEquals( "1033", tagData.toFIXIDString());
            assertEquals( "DESK_TYPE", tagData.toEnumNameString());
            assertEquals( "DeskType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1033DeskType oneEnum : Enum1033DeskType.values()) {
            tagData = new Tag1033EnuDeskType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1033
         *  DeskType
         *  String
         *  <p>    A - Agency
         *  <p>    AR - Arbitrage
         *  <p>    D - Derivatives
         *  <p>    IN - International
         *  <p>    IS - Institutional
         */
        tagData = new Tag1033EnuDeskType( Enum1033DeskType.AGENCY );
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.ARBITRAGE );
        assertEquals( "AR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.DERIVATIVES );
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.INTERNATIONAL );
        assertEquals( "IN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.INSTITUTIONAL );
        assertEquals( "IS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    O - Other
         *  <p>    PF - Preferred Trading
         *  <p>    PR - Proprietary
         *  <p>    PT - Program Trading
         *  <p>    S - Sales
         */
        tagData = new Tag1033EnuDeskType( Enum1033DeskType.OTHER );
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PREFERRED );
        assertEquals( "PF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PROPRIETARY );
        assertEquals( "PR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.PROGRAM_TRADING );
        assertEquals( "PT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1033EnuDeskType( Enum1033DeskType.SALES );
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    T - Trading
         */
        tagData = new Tag1033EnuDeskType( Enum1033DeskType.TRADING );
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1033DeskType oneEnum : Enum1033DeskType.values()) {
            tagData = new Tag1033EnuDeskType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1033DeskType oneEnum : Enum1033DeskType.values()) {
            tagData = new Tag1033EnuDeskType(oneEnum);
            assertEquals( "Tag1033EnuDeskType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}