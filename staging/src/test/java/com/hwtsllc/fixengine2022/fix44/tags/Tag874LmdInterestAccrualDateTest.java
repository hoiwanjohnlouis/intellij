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

import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  874
 *  InterestAccrualDate
 *  LocalMktDate
 *  <p></p>
 *  The start date used for calculating accrued interest on
 *  debt instruments which are being sold between interest payment dates.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Dated Date
 */
class Tag874LmdInterestAccrualDateTest {
    Tag874LmdInterestAccrualDate tagData;
    String [] TestArray = {
            Tag874LmdInterestAccrualDate.TESTA_LMD_INTEREST_ACCRUAL_DATE,
            Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            assertEquals( "FIX874_LMD_INTEREST_ACCRUAL_DATE", tagData.toEnumLabelString());
            assertEquals( "874", tagData.toEnumIDString());
            assertEquals( "INTEREST_ACCRUAL_DATE", tagData.toEnumNameString());
            assertEquals( "InterestAccrualDate", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ));
            assertEquals( "Tag874LmdInterestAccrualDate\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}