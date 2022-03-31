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

package com.hwtsllc.fixengine2022.fix43.enums;

import org.junit.jupiter.api.Test;

class Enum525NestedPartyIDSourceTest {
    /**
     *  Information is the same for TAGS 447, 525
     */
    @Test
    void Enum0525Test() {
        Enum525NestedPartyIDSource enumType;

        /*
         * All PartyRoles
         *  B-H types
         */
        enumType = Enum525NestedPartyIDSource.BANK_IDENTIFICATION_CODE;
        enumType = Enum525NestedPartyIDSource.GENERAL_IDENTIFIER;
        enumType = Enum525NestedPartyIDSource.PROPRIETARY;
        enumType = Enum525NestedPartyIDSource.ISO_COUNTRY_CODE;
        enumType = Enum525NestedPartyIDSource.SETTLEMENT_ENTITY_LOCATION;
        enumType = Enum525NestedPartyIDSource.MARKET_IDENTIFIER_CODE;
        enumType = Enum525NestedPartyIDSource.CSD_MEMBER_CODE;

        /*
         * For PartyRole = "InvestorID" and for CIV
         * 6-9, A types
         */
        enumType = Enum525NestedPartyIDSource.UK_NATIONAL_NUMBER;
        enumType = Enum525NestedPartyIDSource.US_SOCIAL_SECURITY_NUMBER;
        enumType = Enum525NestedPartyIDSource.US_TAX_ID_NUMBER;
        enumType = Enum525NestedPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER;
        enumType = Enum525NestedPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER;

        /*
         * For PartyRole = "InvestorID" and for Equities
         * 1-5 types
         */
        enumType = Enum525NestedPartyIDSource.KOREAN_INVESTOR_ID;
        enumType = Enum525NestedPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID;
        enumType = Enum525NestedPartyIDSource.TAIWANESE_TRADING_ACCT;
        enumType = Enum525NestedPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER;
        enumType = Enum525NestedPartyIDSource.CHINESE_INVESTOR_ID;

        /*
         * For PartyRole="Broker of Credit"
         * I type
         */
        enumType = Enum525NestedPartyIDSource.DIRECTED_BROKER_ACRONYM;
    }
}