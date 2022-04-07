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
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix27.enums.Enum18ExecInst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag18EnuExecInstTest {

    @Test
    void FIX0018Test() {
        FIX27 fixData = FIX27.FIX18_ENU_EXEC_INST;
        assertEquals( "EXEC_INST", fixData.getName());
        assertEquals( "18", fixData.getID());
        assertEquals( "ExecInst", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0018Test() {
        Tag18EnuExecInst tagData;

        /*
         * 0-9 exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_OFFER_SIDE);
        assertEquals( "0", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NOT_HELD);
        assertEquals( "1", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK);
        assertEquals( "2", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.GO_ALONG);
        assertEquals( "3", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.OVER_THE_DAY);
        assertEquals( "4", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.HELD);
        assertEquals( "5", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.PARTICIPANT_DONT_INITIATE);
        assertEquals( "6", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_SCALE);
        assertEquals( "7", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_SCALE);
        assertEquals( "8", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STAY_ON_BID_SIDE);
        assertEquals( "9", tagData.getDataValue());

        /*
         * A-Z exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NO_CROSS);
        assertEquals( "A", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.OKAY_TO_CROSS);
        assertEquals( "B", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CALL_FIRST);
        assertEquals( "C", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.PERCENT_OF_VOLUME);
        assertEquals( "D", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_INCREASE);
        assertEquals( "E", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.DO_NOT_REDUCE);
        assertEquals( "F", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.ALL_OR_NONE);
        assertEquals( "G", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE);
        assertEquals( "H", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.INSTITUTION_ONLY);
        assertEquals( "I", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.REINSTATE_ON_TRADING_HALTED);
        assertEquals( "J", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_TRADING_HALTED);
        assertEquals( "K", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.LAST_PEG);
        assertEquals( "L", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.MID_PRICE_PEG);
        assertEquals( "M", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NON_NEGOTIABLE);
        assertEquals( "N", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.OPENING_PEG);
        assertEquals( "O", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.MARKET_PEG);
        assertEquals( "P", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE);
        assertEquals( "Q", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.PRIMARY_PEG);
        assertEquals( "R", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.SUSPENDED);
        assertEquals( "S", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST);
        assertEquals( "T", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION);
        assertEquals( "U", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.NETTING);
        assertEquals( "V", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_VWAP);
        assertEquals( "W", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRADE_ALONG);
        assertEquals( "X", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRY_TO_STOP);
        assertEquals( "Y", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.CANCEL_IF_NOT_BEST);
        assertEquals( "Z", tagData.getDataValue());

        /*
         * a-k exec inst types
         */
        tagData = new Tag18EnuExecInst(Enum18ExecInst.TRAILING_STOP_PEG);
        assertEquals( "a", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.STRICT_LIMIT);
        assertEquals( "b", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS);
        assertEquals( "c", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.PEG_TO_LIMIT_PRICE);
        assertEquals( "d", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.WORK_TO_TARGET_STRATEGY);
        assertEquals( "e", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.INTERMARKET_SWEEP);
        assertEquals( "f", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED);
        assertEquals( "g", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED);
        assertEquals( "h", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.IMBALANCE_ONLY);
        assertEquals( "i", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.SINGLE_EXECUTION_REQUESTED);
        assertEquals( "j", tagData.getDataValue());
        tagData = new Tag18EnuExecInst(Enum18ExecInst.BEST_EXECUTION);
        assertEquals( "k", tagData.getDataValue());

        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());
    }
}