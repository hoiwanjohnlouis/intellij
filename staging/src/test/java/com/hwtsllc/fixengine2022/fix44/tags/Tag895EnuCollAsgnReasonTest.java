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

import com.hwtsllc.fixengine2022.fix44.enums.Enum895CollAsgnReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag895EnuCollAsgnReasonTest {
    Tag895EnuCollAsgnReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( "FIX895_ENU_COLL_ASGN_REASON", tagData.toFIXLabelString());
            assertEquals( "895", tagData.toFIXIDString());
            assertEquals( "COLL_ASGN_REASON", tagData.toFIXNameString());
            assertEquals( "CollAsgnReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  895
         *  CollAsgnReason
         *  int
         *  <p>    0 - Initial
         *  <p>    1 - Scheduled
         *  <p>    2 - Time Warning
         *  <p>    3 - Margin Deficiency
         *  <p>    4 - Margin Excess
         */
        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.INITIAL );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.SCHEDULED );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.TIME_WARNING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_DEFICIENCY );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_EXCESS );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Forward Collateral Demand
         *  <p>    6 - Event of default
         *  <p>    7 - Adverse tax event
         */
        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.EVENT_OF_DEFAULT );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.ADVERSE_TAX_EVENT );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( "Tag895EnuCollAsgnReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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