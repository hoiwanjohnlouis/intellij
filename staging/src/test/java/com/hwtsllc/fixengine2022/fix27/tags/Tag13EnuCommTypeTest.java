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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum13CommType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  13
 *  CommType
 *  char
 *  Commission type
 *  Valid values:
 *      1 - Per Unit (implying shares, par, currency, etc.)
 *      2 - Percent
 *      3 - Absolute (total monetary amount)
 *      4 - Percentage waived - cash discount (for CIV buy orders)
 *      5 - Percentage waived -= enhanced units (for CIV buy orders)
 *      6 - Points per bond or contract
 *          (supply ContractMultiplier (231) in the <Instrument> component block
 *           if the object security is denominated in a size other than the
 *           industry default - 1000 par for bonds)
 */
class Tag13EnuCommTypeTest {
    @Test
    void FIX0013Test() {
        FIX27 fixData = FIX27.FIX13_ENU_COMM_TYPE;
        assertEquals( "COMM_TYPE", fixData.toFIXNameString());
        assertEquals( "13", fixData.toFIXIDString());
        assertEquals( "CommType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0013Test() {
        Tag13EnuCommType tagData;

        /*
         * 1-6 CommTypes
         */
        tagData = new Tag13EnuCommType(Enum13CommType.PER_UNIT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.ABSOLUTE);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.POINTS_PER_BOND);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}