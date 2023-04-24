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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  626
 *  AllocType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation message
 *  (i.e. "Buyside Calculated")
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See 'Replaced Features and Supported Approach' ***
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Calculated (includes MiscFees and NetMoney)
 *  <p>    2 - Preliminary (without MiscFees and NetMoney)
 *  <p>    3 - Sellside Calculated Using Preliminary
 *              (includes MiscFees and NetMoney) (Replaced)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *              (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)
 *  <p>    5 - Ready-To-Book - Single Order
 *  <p></p>
 *  <p>    6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)
 *  <p>    7 - Warehouse Instruction
 *  <p>    8 - Request to Intermediary
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p></p>
 *  <p>    11 - Accept Pending
 *  <p>    12 - Incomplete Group
 *  <p>    13 - Complete Group
 *  <p>    14 - Reversal Pending
 */
class Enum626AllocTypeTest {
    /*
     *  Information is the same for TAGS 626
     */
    @Test
    void Enum0626Test() {
        Enum626AllocType enumType;

        /*
         *  1-14 types
         */
        enumType = Enum626AllocType.CALCULATED_INCLUDES_MISCFEES_NETMONEY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CALCULATED_INCLUDES_MISCFEES_NETMONEY", enumType.toFIXNameString());
        assertEquals("1 - Calculated (includes MiscFees and NetMoney)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.PRELIMINARY_WITHOUT_MISCFEES_NETMONEY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("PRELIMINARY_WITHOUT_MISCFEES_NETMONEY", enumType.toFIXNameString());
        assertEquals("2 - Preliminary (without MiscFees and NetMoney)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.SELLSIDE_USING_PRELIMINARY;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("SELLSIDE_USING_PRELIMINARY", enumType.toFIXNameString());
        assertEquals("3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney) (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.SELLSIDE_WITHOUT_PRELIMINARY;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("SELLSIDE_WITHOUT_PRELIMINARY", enumType.toFIXNameString());
        assertEquals("4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney) (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.READY_TO_BOOK_SINGLE_ORDER;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("READY_TO_BOOK_SINGLE_ORDER", enumType.toFIXNameString());
        assertEquals("5 - Ready-To-Book - Single Order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum626AllocType.BUYSIDE_READY_TO_BOOK;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("BUYSIDE_READY_TO_BOOK", enumType.toFIXNameString());
        assertEquals("6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.WAREHOUSE_INSTRUCTION;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("WAREHOUSE_INSTRUCTION", enumType.toFIXNameString());
        assertEquals("7 - Warehouse Instruction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.REQUEST_INTERMEDIARY;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("REQUEST_INTERMEDIARY", enumType.toFIXNameString());
        assertEquals("8 - Request to Intermediary", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.ACCEPT;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ACCEPT", enumType.toFIXNameString());
        assertEquals("9 - Accept", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.REJECT;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("REJECT", enumType.toFIXNameString());
        assertEquals("10 - Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum626AllocType.ACCEPT_PENDING;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("ACCEPT_PENDING", enumType.toFIXNameString());
        assertEquals("11 - Accept Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.INCOMPLETE_GROUP;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("INCOMPLETE_GROUP", enumType.toFIXNameString());
        assertEquals("12 - Incomplete Group", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.COMPLETE_GROUP;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("COMPLETE_GROUP", enumType.toFIXNameString());
        assertEquals("13 - Complete Group", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum626AllocType.REVERSAL_PENDING;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("REVERSAL_PENDING", enumType.toFIXNameString());
        assertEquals("14 - Reversal Pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}