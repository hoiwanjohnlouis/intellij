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

package com.hwtsllc.fixengine2022.fix41.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum167SecurityTypeTest {
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
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0167Test() {
        Enum167SecurityType enumType;

        /*
         * Deprecated msg types
         */
        enumType = Enum167SecurityType.DEPRECATED_FUTURE;
        assertEquals("FUT", enumType.getAction());
        assertEquals("DEPRECATED_FUTURE", enumType.getName());
        assertEquals("FUT - Future (Deprecated)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.getAction());
        assertEquals("DEPRECATED_OPTION", enumType.getName());
        assertEquals("OPT - Option (Deprecated)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.getAction());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.getName());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.getAction());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.getName());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Agency msg types
         */
        enumType = Enum167SecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.getAction());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.getAction());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.getName());
        assertEquals("FAC - Federal Agency Coupon", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.getAction());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.getName());
        assertEquals("FADN - Federal Agency Discount Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.getAction());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.getName());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.getAction());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Corporate msg types
         */
        enumType = Enum167SecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.getAction());
        assertEquals("CORPORATE_BOND", enumType.getName());
        assertEquals("CORP - Corporate Bond", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.getAction());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("CPP - Corporate Private Placement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.getAction());
        assertEquals("CONVERTIBLE_BOND", enumType.getName());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.getAction());
        assertEquals("DUAL_CURRENCY", enumType.getName());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.getAction());
        assertEquals("EURO_CORPORATE_BOND", enumType.getName());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.getAction());
        assertEquals("INDEXED_LINKED", enumType.getName());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.getAction());
        assertEquals("STRUCTURED_NOTE", enumType.getName());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.getAction());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.getName());
        assertEquals("YANK - Yankee Corporate Bond", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Currency msg types
         */
        enumType = Enum167SecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.getAction());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.getName());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Equity msg types
         */
        enumType = Enum167SecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.getAction());
        assertEquals("COMMON_STOCK", enumType.getName());
        assertEquals("CS - Common Stock (Equity)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.getAction());
        assertEquals("PREFERRED_STOCK", enumType.getName());
        assertEquals("PS - Preferred Stock (Equity)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Finance msg types
         */
        enumType = Enum167SecurityType.REPURCHASE;
        assertEquals("REPO", enumType.getAction());
        assertEquals("REPURCHASE", enumType.getName());
        assertEquals("REPO - Repurchase (Financing)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.FORWARD;
        assertEquals("FORWARD", enumType.getAction());
        assertEquals("FORWARD", enumType.getName());
        assertEquals("FORWARD - Forward (Financing)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.getAction());
        assertEquals("BUY_SELLBACK", enumType.getName());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.getAction());
        assertEquals("SECURITIES_LOAN", enumType.getName());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.getAction());
        assertEquals("SECURITIES_PLEDGE", enumType.getName());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Government msg types
         */
        enumType = Enum167SecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.getAction());
        assertEquals("BRADY_BOND", enumType.getName());
        assertEquals("BRADY - Brady Bond (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.getAction());
        assertEquals("EURO_SOVEREIGNS", enumType.getName());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.getAction());
        assertEquals("US_TREASURY_BOND", enumType.getName());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.getAction());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.getName());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.getAction());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.getName());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.getAction());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.getName());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.getAction());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.getName());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.getAction());
        assertEquals("US_TREASURY_NOTE", enumType.getName());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.getAction());
        assertEquals("US_TREASURY_BILL", enumType.getName());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Loan msg types
         */
        enumType = Enum167SecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.getAction());
        assertEquals("TERM_LOAN", enumType.getName());
        assertEquals("TERM - Term Loan", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.getAction());
        assertEquals("REVOLVER_LOAN", enumType.getName());
        assertEquals("RVLV - Revolver Loan", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.getAction());
        assertEquals("REVOLVER_TERM_LOAN", enumType.getName());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.getAction());
        assertEquals("BRIDGE_LOAN", enumType.getName());
        assertEquals("BRIDGE - Bridge Loan", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.getAction());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("LOFC - Letter Of Credit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.getAction());
        assertEquals("SWING_LINE_FACILITY", enumType.getName());
        assertEquals("SWING - Swing Line Facility", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.getAction());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.getName());
        assertEquals("DINP - Debtor In Possession", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.getAction());
        assertEquals("DEFAULTED_LOAN", enumType.getName());
        assertEquals("DEFLTED - Defaulted", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.getAction());
        assertEquals("WITHDRAWN_LOAN", enumType.getName());
        assertEquals("WITHDRN - Withdrawn", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.getAction());
        assertEquals("REPLACED_LOAN", enumType.getName());
        assertEquals("REPLACD - Replaced", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.getAction());
        assertEquals("MATURED_LOAN", enumType.getName());
        assertEquals("MATURED - Matured", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.getAction());
        assertEquals("AMENDED_AND_RESTATED", enumType.getName());
        assertEquals("AMENDED - Amended & Restated", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.getAction());
        assertEquals("RETIRED_LOAN", enumType.getName());
        assertEquals("RETIRED - Retired", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Money Market msg types
         */
        enumType = Enum167SecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.getAction());
        assertEquals("BANKERS_ACCEPTANCE", enumType.getName());
        assertEquals("BA - Bankers Acceptance", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.BANK_NOTES;
        assertEquals("BN", enumType.getAction());
        assertEquals("BANK_NOTES", enumType.getName());
        assertEquals("BN - Bank Notes", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.getAction());
        assertEquals("BILL_OF_EXCHANGES", enumType.getName());
        assertEquals("BOX - Bill Of Exchanges", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.getAction());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("CD - Certificate Of Deposit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CALL_LOANS;
        assertEquals("CL", enumType.getAction());
        assertEquals("CALL_LOANS", enumType.getName());
        assertEquals("CL - Call Loans", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.getAction());
        assertEquals("COMMERCIAL_PAPER", enumType.getName());
        assertEquals("CP - Commercial Paper", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.getAction());
        assertEquals("DEPOSIT_NOTES", enumType.getName());
        assertEquals("DN - Deposit Notes", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.getAction());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.getAction());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("EUCP - Euro Commercial Paper", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.getAction());
        assertEquals("LIQUIDITY_NOTE", enumType.getName());
        assertEquals("LQN - Liquidity Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.getAction());
        assertEquals("MEDIUM_TERM_NOTES", enumType.getName());
        assertEquals("MTN - Medium Term Notes", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.getAction());
        assertEquals("OVERNIGHT", enumType.getName());
        assertEquals("ONITE - Overnight", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.getAction());
        assertEquals("PROMISSORY_NOTE", enumType.getName());
        assertEquals("PN - Promissory Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.getAction());
        assertEquals("PLAZOS_FIJOS", enumType.getName());
        assertEquals("PZFJ - Plazos Fijos", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.getAction());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.getName());
        assertEquals("STN - Short Term Loan Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.getAction());
        assertEquals("TIME_DEPOSIT", enumType.getName());
        assertEquals("TD - Time Deposit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.getAction());
        assertEquals("EXTENDED_COMM_NOTE", enumType.getName());
        assertEquals("XCN - Extended Comm Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.getAction());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Mortgage msg types
         */
        enumType = Enum167SecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.getAction());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.getName());
        assertEquals("ABS - Asset-backed Securities", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.getAction());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.getAction());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.getName());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.getAction());
        assertEquals("IOETTE_MORTGAGE", enumType.getName());
        assertEquals("IET - IOETTE Mortgage", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.getAction());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("MBS - Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.getAction());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.getName());
        assertEquals("MIO - Mortgage Interest Only", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.getAction());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.getName());
        assertEquals("MPO - Mortgage Principal Only", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.getAction());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("MPP - Mortgage Private Placement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.getAction());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.getName());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.getAction());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("PFAND - Pfandbriefe", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.getAction());
        assertEquals("TO_BE_ANNOUNCED", enumType.getName());
        assertEquals("TBA - To Be Announced", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Municipal msg types
         */
        enumType = Enum167SecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.getAction());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.getName());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.getAction());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.getName());
        assertEquals("COFO - Certificate Of Obligation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.getAction());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.getName());
        assertEquals("COFP - Certificate Of Participation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.getAction());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.getName());
        assertEquals("GO - General Obligation Bonds", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.getAction());
        assertEquals("MANDATORY_TENDER", enumType.getName());
        assertEquals("MT - Mandatory Tender", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.getAction());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("RAN - Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.getAction());
        assertEquals("REVENUE_BONDS", enumType.getName());
        assertEquals("REV - Revenue Bonds", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.getAction());
        assertEquals("SPECIAL_ASSESSMENT", enumType.getName());
        assertEquals("SPCLA - Special Assessment", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.getAction());
        assertEquals("SPECIAL_OBLIGATION", enumType.getName());
        assertEquals("SPCLO - Special Obligation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.getAction());
        assertEquals("SPECIAL_TAX", enumType.getName());
        assertEquals("SPCLT - Special Tax", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.getAction());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TAN - Tax Anticipation Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.getAction());
        assertEquals("TAX_ALLOCATION", enumType.getName());
        assertEquals("TAXA - Tax Allocation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.getAction());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.getAction());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.getAction());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.getName());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.WARRANT;
        assertEquals("WAR", enumType.getAction());
        assertEquals("WARRANT", enumType.getName());
        assertEquals("WAR - Warrant", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * Other msg types
         */
        enumType = Enum167SecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.getAction());
        assertEquals("MUTUAL_FUND", enumType.getName());
        assertEquals("MF - Mutual Fund", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.getAction());
        assertEquals("MULTILEG_INSTRUMENT", enumType.getName());
        assertEquals("MLEG - Multileg Instrument", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.getAction());
        assertEquals("NO_SECURITY_TYPE", enumType.getName());
        assertEquals("NONE - No Security Type", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.getAction());
        assertEquals("OPTIONS_ON_FUTURES", enumType.getName());
        assertEquals("OOF - Options on Futures", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.getAction());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.getName());
        assertEquals("OOP - Options on Physical", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.getAction());
        assertEquals("WILDCARD_ENTRY", enumType.getName());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum167SecurityType.CASH;
        assertEquals("CASH", enumType.getAction());
        assertEquals("CASH", enumType.getName());
        assertEquals("CASH - Cash", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}