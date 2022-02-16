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

package com.hwtsllc.staging2022.fields;

@Deprecated
public enum Tag47Rule89A {

    AGENCY_SINGLE_ORDER("A",	"Agency single order"),
    SHORT_EXEMPT_A("B", "Short exempt transaction (refer to A type)"),
    PROGRAM_ORDER_NON_INDEX_ARB_MEMBER("C", "Program Order, non-index arb, for Member firm or org"),
    PROGRAM_ORDER_INDEX_ARB_MEMBER("D", "Program Order, index arb, for Member firm or org"),
    REGISTERED_EQUITY_MARKET_MAKER("E", "Registered Equity Market Maker trades"),
    SHORT_EXEMPT_W("F", "Short exempt transaction (refer to W type)"),
    SHORT_EXEMPT_I("H", "Short exempt transaction (refer to I type)"),
    INDIVIDUAL_INVESTOR_SINGLE_ORDER("I", "Individual Investor, single order"),
    PROGRAM_ORDER_INDEX_ARB_INDIVIDUAL("J", "Program Order, index arb, for individual customer"),
    PROGRAM_ORDER_NON_INDEX_ARB_INDIVIDUAL("K", "Program Order, non-index arb, for individual customer"),
    SHORT_EXEMPT_P_O("L", "Short exempt transaction for member competing market-maker affiliated with the firm clearing the trade (refer to P and O types)"),
    PROGRAM_ORDER_INDEX_ARB_OTHER_MEMBER("M", "Program Order, index arb, for other member"),
    PROGRAM_ORDER_NON_INDEX_ARB_OTHER_MEMBER("N", "Program Order, non-index arb, for other member"),
    COMPETING_DEALER_TRADES_O("O", "Competing dealer trades"),
    PRINCIPAL("P", "Principal"),
    COMPETING_DEALER_TRADES_R("R", "Competing dealer trades"),
    SPECIALIST_TRADES("S", "Specialist trades"),
    COMPETING_DEALER_TRADES_T("T", "Competing dealer trades"),
    PROGRAM_ORDER_INDEX_ARB_OTHER_AGENCY("U", "Program Order, index arb, for other agency"),
    ALL_OTHER_ORDERS_AS_AGENT("W", "All other orders as agent for other member"),
    SHORT_EXEMPT_MEMBER_W_T("X", "Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade (refer to W and T types)"),
    PROGRAM_ORDER_NON_INDEX_ARB_OTHER_AGENCY("Y", "Program Order, non-index arb, for other agency"),
    SHORT_EXEMPT_NON_MEMBER("Z", "Short exempt transaction for non-member competing market-maker (refer to A and R types)");

    private final String tag47Rule80AValue;
    private final String tag47Rule80ADescription;

    Tag47Rule89A(final String tag47Rule80AValue, final String tag47Rule80ADescription) {
        this.tag47Rule80AValue = tag47Rule80AValue;
        this.tag47Rule80ADescription = tag47Rule80ADescription;
    }

    public String getTag47Rule80AValue() {
        return tag47Rule80AValue;
    }
    public String getTag47Rule80ADescription() {
        return tag47Rule80ADescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());
        sb.append(":[");
        sb.append(getTag47Rule80AValue());
        sb.append("]");
        sb.append(":[");
        sb.append(getTag47Rule80ADescription());
        sb.append("]");

        return sb.toString();
    }

}
