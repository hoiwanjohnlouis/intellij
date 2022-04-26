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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag761EnuBenchmarkSecurityIDSourceTest {
    @Test
    void FIX0761Test() {
        FIX44 fixData = FIX44.FIX761_ENU_BENCHMARK_SECURITY_ID_SOURCE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  761 (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
     *  BenchmarkSecurityIDSource
     *  Identifies class or source of the BenchmarkSecurityID (699) value.
     *  Required if BenchmarkSecurityID is specified.
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
    void Tag0761Test() {
        Tag761EnuBenchmarkSecurityIDSource tagData;

    }
}