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

import com.hwtsllc.fixengine2022.datatypes.MyEnumAccountType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  581 (same as 581, 798)
 *  AccountType
 *  int
 *  <p>
 *  Type of account associated with an order
 *  <p></p>
 *  798 (same as 581, 798)
 *  AllocAccountType
 *  int
 *  <p>
 *  Type of account associated with a confirmation or other trade-level message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Account is carried on customer side of books
 *  <p>    2 - Account is carried on non-customer side of books
 *  <p>    3 - House trader
 *  <p>    4 - Floor trader
 *  <p>    6 - Account is carried on non-customer side of books and is cross margined
 *  <p>    7 - Account is house trader and is cross margined
 *  <p>    8 - Joint back office account (JBO)
 */
class Tag581EnuAccountTypeTest {
    Tag581EnuAccountType tagData;

    @Test
    void FIX0581Test() {
    }
    @Test
    void Tag0581Test() {
    }
    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            assertEquals( "FIX581_ENU_ACCOUNT_TYPE", tagData.toEnumLabelString());
            assertEquals( "581", tagData.toEnumIDString());
            assertEquals( "ACCOUNT_TYPE", tagData.toEnumNameString());
            assertEquals( "AccountType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  1-4, types
         */
        tagData = new Tag581EnuAccountType(MyEnumAccountType.CUSTOMER_BOOK);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag581EnuAccountType(MyEnumAccountType.NON_CUSTOMER_BOOK);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag581EnuAccountType(MyEnumAccountType.HOUSE_TRADER);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag581EnuAccountType(MyEnumAccountType.FLOOR_TRADER);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  6-8, types
         */
        tagData = new Tag581EnuAccountType(MyEnumAccountType.NON_CUSTOMER_CROSSED_MARGIN_BOOK);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag581EnuAccountType(MyEnumAccountType.HOUSE_TRADER_CROSSED_MARGIN_BOOK);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag581EnuAccountType(MyEnumAccountType.JOINT_BACK_OFFICE);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumAccountType oneEnum : MyEnumAccountType.values()) {
            tagData = new Tag581EnuAccountType(oneEnum);
            assertEquals( "Tag581EnuAccountType\n" +
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