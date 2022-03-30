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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum18ExecInstTest {
    @Test
    void Enum0018Test() {
        Enum18ExecInst enumType;

        /*
         * 0-9
         */
        enumType = Enum18ExecInst.STAY_ON_OFFER_SIDE;
        assertEquals("0", enumType.getID());
        assertEquals("STAY_ON_OFFER_SIDE", enumType.getName());
        assertEquals("0 - Stay on offer side", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.NOT_HELD;
        assertEquals("1", enumType.getID());
        assertEquals("NOT_HELD", enumType.getName());
        assertEquals("1 - Not held", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.WORK;
        assertEquals("2", enumType.getID());
        assertEquals("WORK", enumType.getName());
        assertEquals("2 - Work", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.GO_ALONG;
        assertEquals("3", enumType.getID());
        assertEquals("GO_ALONG", enumType.getName());
        assertEquals("3 - Go along", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.OVER_THE_DAY;
        assertEquals("4", enumType.getID());
        assertEquals("OVER_THE_DAY", enumType.getName());
        assertEquals("4 - Over the day", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.HELD;
        assertEquals("5", enumType.getID());
        assertEquals("HELD", enumType.getName());
        assertEquals("5 - Held", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.PARTICIPANT_DONT_INITIATE;
        assertEquals("6", enumType.getID());
        assertEquals("PARTICIPANT_DONT_INITIATE", enumType.getName());
        assertEquals("6 - Participant don't initiate", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.STRICT_SCALE;
        assertEquals("7", enumType.getID());
        assertEquals("STRICT_SCALE", enumType.getName());
        assertEquals("7 - Strict scale", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.TRY_TO_SCALE;
        assertEquals("8", enumType.getID());
        assertEquals("TRY_TO_SCALE", enumType.getName());
        assertEquals("8 - Try to scale", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.STAY_ON_BID_SIDE;
        assertEquals("9", enumType.getID());
        assertEquals("STAY_ON_BID_SIDE", enumType.getName());
        assertEquals("9 - Stay on bid side", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        /*
         * A-Z
         */
        enumType = Enum18ExecInst.NO_CROSS;
        assertEquals("A", enumType.getID());
        assertEquals("NO_CROSS", enumType.getName());
        assertEquals("A - No cross (cross is forbidden)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.OKAY_TO_CROSS;
        assertEquals("B", enumType.getID());
        assertEquals("OKAY_TO_CROSS", enumType.getName());
        assertEquals("B - OK to cross", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.CALL_FIRST;
        assertEquals("C", enumType.getID());
        assertEquals("CALL_FIRST", enumType.getName());
        assertEquals("C - Call first", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.PERCENT_OF_VOLUME;
        assertEquals("D", enumType.getID());
        assertEquals("PERCENT_OF_VOLUME", enumType.getName());
        assertEquals("D - Percent of volume (indicates that the sender does not want " +
                        "to be all of the volume on the floor vs. a specific percentage)",
                enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.DO_NOT_INCREASE;
        assertEquals("E", enumType.getID());
        assertEquals("DO_NOT_INCREASE", enumType.getName());
        assertEquals("E - Do not increase - DNI", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.DO_NOT_REDUCE;
        assertEquals("F", enumType.getID());
        assertEquals("DO_NOT_REDUCE", enumType.getName());
        assertEquals("F - Do not reduce - DNR", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.ALL_OR_NONE;
        assertEquals("G", enumType.getID());
        assertEquals("ALL_OR_NONE", enumType.getName());
        assertEquals("G - All or none - AON", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE;
        assertEquals("H", enumType.getID());
        assertEquals("REINSTATE_ON_SYSTEM_FAILURE", enumType.getName());
        assertEquals("H - Reinstate on system failure (mutually exclusive with Q)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.INSTITUTION_ONLY;
        assertEquals("I", enumType.getID());
        assertEquals("INSTITUTION_ONLY", enumType.getName());
        assertEquals("I - Institutions only", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.REINSTATE_ON_TRADING_HALTED;
        assertEquals("J", enumType.getID());
        assertEquals("REINSTATE_ON_TRADING_HALTED", enumType.getName());
        assertEquals("J - Reinstate on Trading Halt (mutually exclusive with K)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_ON_TRADING_HALTED;
        assertEquals("K", enumType.getID());
        assertEquals("CANCEL_ON_TRADING_HALTED", enumType.getName());
        assertEquals("K - Cancel on Trading Halt (mutually exclusive with J)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.LAST_PEG;
        assertEquals("L", enumType.getID());
        assertEquals("LAST_PEG", enumType.getName());
        assertEquals("L - Last peg (last sale)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.MID_PRICE_PEG;
        assertEquals("M", enumType.getID());
        assertEquals("MID_PRICE_PEG", enumType.getName());
        assertEquals("M - Mid-price peg (midprice of inside quote)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.NON_NEGOTIABLE;
        assertEquals("N", enumType.getID());
        assertEquals("NON_NEGOTIABLE", enumType.getName());
        assertEquals("N - Non-negotiable", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.OPENING_PEG;
        assertEquals("O", enumType.getID());
        assertEquals("OPENING_PEG", enumType.getName());
        assertEquals("O - Opening peg", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.MARKET_PEG;
        assertEquals("P", enumType.getID());
        assertEquals("MARKET_PEG", enumType.getName());
        assertEquals("P - Market peg", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals("Q", enumType.getID());
        assertEquals("CANCEL_ON_SYSTEM_FAILURE", enumType.getName());
        assertEquals("Q - Cancel on system failure (mutually exclusive with H)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.PRIMARY_PEG;
        assertEquals("R", enumType.getID());
        assertEquals("PRIMARY_PEG", enumType.getName());
        assertEquals("R - Primary peg (primary market - buy at bid/sell at offer)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.SUSPENDED;
        assertEquals("S", enumType.getID());
        assertEquals("SUSPENDED", enumType.getName());
        assertEquals("S - Suspended", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST;
        assertEquals("T", enumType.getID());
        assertEquals("FIXED_PEG_TO_LOCAL_BEST", enumType.getName());
        assertEquals("T - Fixed Peg to Local best bid or offer at time of order", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION;
        assertEquals("U", enumType.getID());
        assertEquals("CUSTOMER_DISPLAY_INSTRUCTION", enumType.getName());
        assertEquals("U - Customer Display Instruction (Rule 11Ac1-1/4)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.NETTING;
        assertEquals("V", enumType.getID());
        assertEquals("NETTING", enumType.getName());
        assertEquals("V - Netting (for Forex)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.PEG_TO_VWAP;
        assertEquals("W", enumType.getID());
        assertEquals("PEG_TO_VWAP", enumType.getName());
        assertEquals("W - Peg to VWAP", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.TRADE_ALONG;
        assertEquals("X", enumType.getID());
        assertEquals("TRADE_ALONG", enumType.getName());
        assertEquals("X - Trade Along", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.TRY_TO_STOP;
        assertEquals("Y", enumType.getID());
        assertEquals("TRY_TO_STOP", enumType.getName());
        assertEquals("Y - Try To Stop", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_IF_NOT_BEST;
        assertEquals("Z", enumType.getID());
        assertEquals("CANCEL_IF_NOT_BEST", enumType.getName());
        assertEquals("Z - Cancel if not best", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        /*
         * a-k
         */
        enumType = Enum18ExecInst.TRAILING_STOP_PEG;
        assertEquals("a", enumType.getID());
        assertEquals("TRAILING_STOP_PEG", enumType.getName());
        assertEquals("a - Trailing Stop Peg", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.STRICT_LIMIT;
        assertEquals("b", enumType.getID());
        assertEquals("STRICT_LIMIT", enumType.getName());
        assertEquals("b - Strict Limit (No price improvement)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS;
        assertEquals("c", enumType.getID());
        assertEquals("IGNORE_PRICE_VALIDITY_CHECKS", enumType.getName());
        assertEquals("c - Ignore Price Validity Checks", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.PEG_TO_LIMIT_PRICE;
        assertEquals("d", enumType.getID());
        assertEquals("PEG_TO_LIMIT_PRICE", enumType.getName());
        assertEquals("d - Peg to Limit Price", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.WORK_TO_TARGET_STRATEGY;
        assertEquals("e", enumType.getID());
        assertEquals("WORK_TO_TARGET_STRATEGY", enumType.getName());
        assertEquals("e - Work to Target Strategy", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.INTERMARKET_SWEEP;
        assertEquals("f", enumType.getID());
        assertEquals("INTERMARKET_SWEEP", enumType.getName());
        assertEquals("f - Intermarket Sweep", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED;
        assertEquals("g", enumType.getID());
        assertEquals("EXTERNAL_ROUTING_ALLOWED", enumType.getName());
        assertEquals("g - External Routing Allowed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED;
        assertEquals("h", enumType.getID());
        assertEquals("EXTERNAL_ROUTING_NOT_ALLOWED", enumType.getName());
        assertEquals("h - External Routing Not Allowed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.IMBALANCE_ONLY;
        assertEquals("i", enumType.getID());
        assertEquals("IMBALANCE_ONLY", enumType.getName());
        assertEquals("i - Imbalance Only", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.SINGLE_EXECUTION_REQUESTED;
        assertEquals("j", enumType.getID());
        assertEquals("SINGLE_EXECUTION_REQUESTED", enumType.getName());
        assertEquals("j - Single execution requested for block trade", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum18ExecInst.BEST_EXECUTION;
        assertEquals("k", enumType.getID());
        assertEquals("BEST_EXECUTION", enumType.getName());
        assertEquals("k - Best Execution", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}