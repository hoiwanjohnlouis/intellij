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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum18ExecInstTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting Enum18ExecInstTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum18ExecInstTest()");
    }

    @Test
    void Enum0018Test() {
        Enum18ExecInst enumType;

        /*
         * 0-9
         */
        enumType = Enum18ExecInst.STAY_ON_OFFER_SIDE;
        assertEquals("0", enumType.getAction());
        assertEquals("STAY_ON_OFFER_SIDE", enumType.getName());
        assertEquals("0 - Stay on offer side", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.NOT_HELD;
        assertEquals("1", enumType.getAction());
        assertEquals("NOT_HELD", enumType.getName());
        assertEquals("1 - Not held", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.WORK;
        assertEquals("2", enumType.getAction());
        assertEquals("WORK", enumType.getName());
        assertEquals("2 - Work", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.GO_ALONG;
        assertEquals("3", enumType.getAction());
        assertEquals("GO_ALONG", enumType.getName());
        assertEquals("3 - Go along", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.OVER_THE_DAY;
        assertEquals("4", enumType.getAction());
        assertEquals("OVER_THE_DAY", enumType.getName());
        assertEquals("4 - Over the day", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.HELD;
        assertEquals("5", enumType.getAction());
        assertEquals("HELD", enumType.getName());
        assertEquals("5 - Held", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.PARTICIPANT_DONT_INITIATE;
        assertEquals("6", enumType.getAction());
        assertEquals("PARTICIPANT_DONT_INITIATE", enumType.getName());
        assertEquals("6 - Participant don't initiate", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.STRICT_SCALE;
        assertEquals("7", enumType.getAction());
        assertEquals("STRICT_SCALE", enumType.getName());
        assertEquals("7 - Strict scale", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.TRY_TO_SCALE;
        assertEquals("8", enumType.getAction());
        assertEquals("TRY_TO_SCALE", enumType.getName());
        assertEquals("8 - Try to scale", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.STAY_ON_BID_SIDE;
        assertEquals("9", enumType.getAction());
        assertEquals("STAY_ON_BID_SIDE", enumType.getName());
        assertEquals("9 - Stay on bid side", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-Z
         */
        enumType = Enum18ExecInst.NO_CROSS;
        assertEquals("A", enumType.getAction());
        assertEquals("NO_CROSS", enumType.getName());
        assertEquals("A - No cross (cross is forbidden)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.OKAY_TO_CROSS;
        assertEquals("B", enumType.getAction());
        assertEquals("OKAY_TO_CROSS", enumType.getName());
        assertEquals("B - OK to cross", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.CALL_FIRST;
        assertEquals("C", enumType.getAction());
        assertEquals("CALL_FIRST", enumType.getName());
        assertEquals("C - Call first", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.PERCENT_OF_VOLUME;
        assertEquals("D", enumType.getAction());
        assertEquals("PERCENT_OF_VOLUME", enumType.getName());
        assertEquals("D - Percent of volume (indicates that the sender does not want to be all of the volume on the floor vs. a specific percentage)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.DO_NOT_INCREASE;
        assertEquals("E", enumType.getAction());
        assertEquals("DO_NOT_INCREASE", enumType.getName());
        assertEquals("E - Do not increase - DNI", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.DO_NOT_REDUCE;
        assertEquals("F", enumType.getAction());
        assertEquals("DO_NOT_REDUCE", enumType.getName());
        assertEquals("F - Do not reduce - DNR", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.ALL_OR_NONE;
        assertEquals("G", enumType.getAction());
        assertEquals("ALL_OR_NONE", enumType.getName());
        assertEquals("G - All or none - AON", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE;
        assertEquals("H", enumType.getAction());
        assertEquals("REINSTATE_ON_SYSTEM_FAILURE", enumType.getName());
        assertEquals("H - Reinstate on system failure (mutually exclusive with Q)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.INSTITUTION_ONLY;
        assertEquals("I", enumType.getAction());
        assertEquals("INSTITUTION_ONLY", enumType.getName());
        assertEquals("I - Institutions only", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.REINSTATE_ON_TRADING_HALTED;
        assertEquals("J", enumType.getAction());
        assertEquals("REINSTATE_ON_TRADING_HALTED", enumType.getName());
        assertEquals("J - Reinstate on Trading Halt (mutually exclusive with K)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_ON_TRADING_HALTED;
        assertEquals("K", enumType.getAction());
        assertEquals("CANCEL_ON_TRADING_HALTED", enumType.getName());
        assertEquals("K - Cancel on Trading Halt (mutually exclusive with J)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.LAST_PEG;
        assertEquals("L", enumType.getAction());
        assertEquals("LAST_PEG", enumType.getName());
        assertEquals("L - Last peg (last sale)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.MID_PRICE_PEG;
        assertEquals("M", enumType.getAction());
        assertEquals("MID_PRICE_PEG", enumType.getName());
        assertEquals("M - Mid-price peg (midprice of inside quote)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.NON_NEGOTIABLE;
        assertEquals("N", enumType.getAction());
        assertEquals("NON_NEGOTIABLE", enumType.getName());
        assertEquals("N - Non-negotiable", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.OPENING_PEG;
        assertEquals("O", enumType.getAction());
        assertEquals("OPENING_PEG", enumType.getName());
        assertEquals("O - Opening peg", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.MARKET_PEG;
        assertEquals("P", enumType.getAction());
        assertEquals("MARKET_PEG", enumType.getName());
        assertEquals("P - Market peg", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals("Q", enumType.getAction());
        assertEquals("CANCEL_ON_SYSTEM_FAILURE", enumType.getName());
        assertEquals("Q - Cancel on system failure (mutually exclusive with H)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.PRIMARY_PEG;
        assertEquals("R", enumType.getAction());
        assertEquals("PRIMARY_PEG", enumType.getName());
        assertEquals("R - Primary peg (primary market - buy at bid/sell at offer)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.SUSPENDED;
        assertEquals("S", enumType.getAction());
        assertEquals("SUSPENDED", enumType.getName());
        assertEquals("S - Suspended", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST;
        assertEquals("T", enumType.getAction());
        assertEquals("FIXED_PEG_TO_LOCAL_BEST", enumType.getName());
        assertEquals("T - Fixed Peg to Local best bid or offer at time of order", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION;
        assertEquals("U", enumType.getAction());
        assertEquals("CUSTOMER_DISPLAY_INSTRUCTION", enumType.getName());
        assertEquals("U - Customer Display Instruction (Rule 11Ac1-1/4)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.NETTING;
        assertEquals("V", enumType.getAction());
        assertEquals("NETTING", enumType.getName());
        assertEquals("V - Netting (for Forex)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.PEG_TO_VWAP;
        assertEquals("W", enumType.getAction());
        assertEquals("PEG_TO_VWAP", enumType.getName());
        assertEquals("W - Peg to VWAP", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.TRADE_ALONG;
        assertEquals("X", enumType.getAction());
        assertEquals("TRADE_ALONG", enumType.getName());
        assertEquals("X - Trade Along", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.TRY_TO_STOP;
        assertEquals("Y", enumType.getAction());
        assertEquals("TRY_TO_STOP", enumType.getName());
        assertEquals("Y - Try To Stop", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.CANCEL_IF_NOT_BEST;
        assertEquals("Z", enumType.getAction());
        assertEquals("CANCEL_IF_NOT_BEST", enumType.getName());
        assertEquals("Z - Cancel if not best", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * a-k
         */
        enumType = Enum18ExecInst.TRAILING_STOP_PEG;
        assertEquals("a", enumType.getAction());
        assertEquals("TRAILING_STOP_PEG", enumType.getName());
        assertEquals("a - Trailing Stop Peg", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.STRICT_LIMIT;
        assertEquals("b", enumType.getAction());
        assertEquals("STRICT_LIMIT", enumType.getName());
        assertEquals("b - Strict Limit (No price improvement)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS;
        assertEquals("c", enumType.getAction());
        assertEquals("IGNORE_PRICE_VALIDITY_CHECKS", enumType.getName());
        assertEquals("c - Ignore Price Validity Checks", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.PEG_TO_LIMIT_PRICE;
        assertEquals("d", enumType.getAction());
        assertEquals("PEG_TO_LIMIT_PRICE", enumType.getName());
        assertEquals("d - Peg to Limit Price", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.WORK_TO_TARGET_STRATEGY;
        assertEquals("e", enumType.getAction());
        assertEquals("WORK_TO_TARGET_STRATEGY", enumType.getName());
        assertEquals("e - Work to Target Strategy", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.INTERMARKET_SWEEP;
        assertEquals("f", enumType.getAction());
        assertEquals("INTERMARKET_SWEEP", enumType.getName());
        assertEquals("f - Intermarket Sweep", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED;
        assertEquals("g", enumType.getAction());
        assertEquals("EXTERNAL_ROUTING_ALLOWED", enumType.getName());
        assertEquals("g - External Routing Allowed", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED;
        assertEquals("h", enumType.getAction());
        assertEquals("EXTERNAL_ROUTING_NOT_ALLOWED", enumType.getName());
        assertEquals("h - External Routing Not Allowed", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.IMBALANCE_ONLY;
        assertEquals("i", enumType.getAction());
        assertEquals("IMBALANCE_ONLY", enumType.getName());
        assertEquals("i - Imbalance Only", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.SINGLE_EXECUTION_REQUESTED;
        assertEquals("j", enumType.getAction());
        assertEquals("SINGLE_EXECUTION_REQUESTED", enumType.getName());
        assertEquals("j - Single execution requested for block trade", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum18ExecInst.BEST_EXECUTION;
        assertEquals("k", enumType.getAction());
        assertEquals("BEST_EXECUTION", enumType.getName());
        assertEquals("k - Best Execution", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}