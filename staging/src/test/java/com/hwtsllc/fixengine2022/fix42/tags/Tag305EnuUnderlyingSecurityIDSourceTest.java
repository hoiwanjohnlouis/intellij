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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum305UnderlyingSecurityIDSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag305EnuUnderlyingSecurityIDSourceTest {
    @Test
    void FIX0305Test() {
        FIX42 fixData = FIX42.FIX305_ENU_UNDERLYING_SECURITY_ID_SOURCE;
        assertEquals( "305", fixData.getID());
        assertEquals( "UNDERLYING_SECURITY_ID_SOURCE", fixData.getName());
        assertEquals( "UnderlyingSecurityIdSource", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  305 (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
     *  Underlying security’s SecurityIDSource.
     *              Same values as the SecurityIDSource (22) field
     *  Valid values:
     *      1 - CUSIP
     *      2 - SEDOL
     *      3 - QUIK
     *      4 - ISIN number
     *      5 - RIC code
     *      6 - ISO Currency Code
     *      7 - ISO Country Code
     *      8 - Exchange Symbol
     *      9 - Consolidated Tape Association (CTA) Symbol
     *              (SIAC CTS/CQS line format)
     *      A - Bloomberg Symbol
     *      B - Wertpapier
     *      C - Dutch
     *      D - Valoren
     *      E - Sicovam
     *      F - Belgian
     *      G - "Common" (Clearstream and Euroclear)
     *      H - Clearing House / Clearing Organization
     *      I - ISDA/FpML Product Specification
     *              (XML in EncodedSecurityDesc)
     *      J - Option Price Reporting Authority
     *      K - ISDA/FpML Product URL (URL in SecurityID)
     *      L - Letter of Credit
     */
    @Test
    void Tag0305Test() {
        Tag305EnuUnderlyingSecurityIDSource tagData;

        /**
         * 1-9 Securiy ID Source
         */
        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.CUSIP);
        assertEquals( Enum305UnderlyingSecurityIDSource.CUSIP.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.SEDOL);
        assertEquals( Enum305UnderlyingSecurityIDSource.SEDOL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.QUIK);
        assertEquals( Enum305UnderlyingSecurityIDSource.QUIK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.ISIN);
        assertEquals( Enum305UnderlyingSecurityIDSource.ISIN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.RIC);
        assertEquals( Enum305UnderlyingSecurityIDSource.RIC.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( Enum305UnderlyingSecurityIDSource.ISO_CURRENCY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( Enum305UnderlyingSecurityIDSource.ISO_COUNTRY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( Enum305UnderlyingSecurityIDSource.EXCHANGE_SYMBOL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.CTA);
        assertEquals( Enum305UnderlyingSecurityIDSource.CTA.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-L Securiy ID Source
         */
        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.BLOOMBERG);
        assertEquals( Enum305UnderlyingSecurityIDSource.BLOOMBERG.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.WERTPAPIER);
        assertEquals( Enum305UnderlyingSecurityIDSource.WERTPAPIER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.DUTCH);
        assertEquals( Enum305UnderlyingSecurityIDSource.DUTCH.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.VALOREN);
        assertEquals( Enum305UnderlyingSecurityIDSource.VALOREN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.SICOVAM);
        assertEquals( Enum305UnderlyingSecurityIDSource.BELGIAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.BELGIAN);
        assertEquals( Enum305UnderlyingSecurityIDSource.SICOVAM.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.COMMON);
        assertEquals( Enum305UnderlyingSecurityIDSource.COMMON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( Enum305UnderlyingSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_SPECIFICATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( Enum305UnderlyingSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_URL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag305EnuUnderlyingSecurityIDSource(Enum305UnderlyingSecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( Enum305UnderlyingSecurityIDSource.LETTER_OF_CREDIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}