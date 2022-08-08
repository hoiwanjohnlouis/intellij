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

import com.hwtsllc.fixengine2022.fix44.enums.Enum770TrdRegTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  770
 *  TrdRegTimestampType
 *  int
 *  <p></p>
 *  Traded / Regulatory timestamp type.
 *  <p></p>
 *  Note of Applicability:
 *  <p>    Values are required in US futures markets by the CFTC to
 *         support computerized trade reconstruction.
 *  <p></p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Execution Time
 *  <p>    2 - Time In
 *  <p>    3 - Time Out
 *  <p>    4 - Broker Receipt
 *  <p>    5 - Broker Execution
 *  <p></p>
 *  <p>    6 - Desk Receipt
 */
class Tag770EnuTrdRegTimestampTypeTest {
    Tag770EnuTrdRegTimestampType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( "FIX770_ENU_TRD_REG_TIMESTAMP_TYPE", tagData.toEnumLabelString());
            assertEquals( "770", tagData.toEnumIDString());
            assertEquals( "TRD_REG_TIMESTAMP_TYPE", tagData.toEnumNameString());
            assertEquals( "TrdRegTimestampType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Execution Time
         *  <p>    2 - Time In
         *  <p>    3 - Time Out
         *  <p>    4 - Broker Receipt
         *  <p>    5 - Broker Execution
         */
        tagData = new Tag770EnuTrdRegTimestampType( Enum770TrdRegTimestampType.EXECUTION_TIME );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_IN);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_OUT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_RECEIPT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_EXECUTION);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    6 - Desk Receipt
         */
        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.DESK_RECEIPT);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( "Tag770EnuTrdRegTimestampType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}