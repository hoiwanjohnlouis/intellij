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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  Collateral Assignment Reject Reason
 *  Valid values:
 *      0 - Unknown deal (order or trade)
 *      1 - Unknown or invalid instrument
 *      2 - Unauthorized transaction
 *      3 - Insufficient collateral
 *      4 - Invalid type of collateral
 *      5 - Excessive substitution
 *      99 - Other
 *
 *  or any value conforming to the data type Reserved100Plus
 */
class Tag906EnuCollAsgnRejectReasonTest {
    @Test
    void FIX0906Test() {
        FIX44 fixData = FIX44.FIX906_ENU_COLL_ASGN_REJECT_REASON;
        assertEquals( "906", fixData.getID());
        assertEquals( "COLL_ASGN_REJECT_REASON", fixData.getName());
        assertEquals( "CollAsgnRejectReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0906Test() {
        Tag906EnuCollAsgnRejectReason tagData;

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNKNOWN_DEAL );
        assertEquals( Enum906CollAsgnRejectReason.UNKNOWN_DEAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION );
        assertEquals( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_COLLATERAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION );
        assertEquals( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.OTHER );
        assertEquals( Enum906CollAsgnRejectReason.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}